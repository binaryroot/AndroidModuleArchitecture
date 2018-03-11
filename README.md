# Android Module Architecture with Dagger2

It is the small example how to build horizontal and vertical modules structure on the Android platform.
Below represents modules dependencies. In general, they are split into three levels: 
 - Application level
 - Features level
 - Middleware level
 
Each level will be described below in more precise way.

![Alt text](http://preview.ibb.co/diGgdS/Untitled_Diagram_12.png)

 ### Key concepts
Create stand-alone modules based on [SOLID](https://en.wikipedia.org/wiki/SOLID_(object-oriented_design)) principles.
 
Increase compilation time.
 
To create reusable components or templates for them. 

To split responsibility between sub-teams.

To use different architectural patterns. Because sometimes can occur the situation when MVVM is more suitable than MVP and vice versa.

Support [instant app](https://developer.android.com/topic/instant-apps/index.html).
 
 #### Application level
 
App module has dependencies into all modules in the application. You can think about app module as the dirtiest of all the dirty components.
The app module is the ultimate detail - the [lowest-level](https://en.wikipedia.org/wiki/High-_and_low-level) policy.
The main and single responsibility of this module to build dagger dependencies graph.

```
@Component(
        modules = [
          AndroidInjectionModule::class,
          AndroidSupportInjectionModule::class,
          AppConfigurationModule::class,
          LoginFeatureModule::class,
          DashboardFeatureModule::class,
          IntentFactoryModule::class,
          DatabaseModule::class
        ]
)
```
You should avoid keeping any resources files inside the module. In the case when a resource should be shared between features BaseFeature module will be the perfect place.
 
 #### Features level
 
On this level we are going to declare your application features. The Example contains two feature:
 - Login 
 - Dashboard 
 
 Besides that at this level also exists features' contracts module. Contract modules help to avoid cyclic dependencies between features when we need to navigation from feature A to B and then from B to A.

Usually, the contract contains the single interface with the method which returns intent to launch feature what implements this module.
Also can be declared domain objects for communications.

Contract
```
interface LoginFlowIntentFactory {

    fun createIntent(context: Context) : Intent

}
```

Feature
```
class LoginIntentFactory : LoginFlowIntentFactory {
    override fun createIntent(context: Context): Intent {
        return Intent(context, LoginActivity::class.java)
    }
}

@Module
class LoginIntentFactoryModule {
    @Provides
    @Singleton
    fun provideIntentFactory(): LoginFlowIntentFactory {
        return LoginIntentFactory()
    }
}
```
After that LoginIntentFactoryModule module should be declared in dagger component. When is needed to navigate to login feature, the contract will be declared into grade file.

```
implementation project(':feature:login_flow:login_contract')
```
As module knows about the intent factory and dagger module was put into the graph. The field can be injected.

#### Middleware level
At this level, the application contains modules which will be reusable across the application. For example, good candidates will be database module, analysts or even IOT module.
Communication with Middleware modules follows [The Dependency Inversion Principle](https://en.wikipedia.org/wiki/Dependency_inversion_principle).

![Alt text](https://preview.ibb.co/g9wrTS/Untitled_Diagram_10.png)


 
  
  
#### Testability
With this approach, features can be tested independently. For this it is needed to add launch activity into feature manifest.
