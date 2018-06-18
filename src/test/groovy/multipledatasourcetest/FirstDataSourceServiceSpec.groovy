package multipledatasourcetest

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class FirstDataSourceServiceSpec extends Specification implements ServiceUnitTest<FirstDataSourceService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
