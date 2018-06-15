package multipledatasourcetest

import grails.util.Holders

class BootStrap {

    def init = { servletContext ->

        Arrays.asList(Holders.applicationContext.getBeanDefinitionNames())?.each {
            log.info("**************Bean Injected ${it}")
        }
    }
    def destroy = {
    }
}
