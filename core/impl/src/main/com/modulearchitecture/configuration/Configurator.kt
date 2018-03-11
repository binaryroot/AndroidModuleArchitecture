package com.modulearchitecture.configuration

import javax.inject.Inject


class Configurator @Inject constructor(): AppConfiguration {

    override fun getServerAPIURL(): String {
        return "http://replace.url"
    }

}