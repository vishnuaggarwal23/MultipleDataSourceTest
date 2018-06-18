package multipledatasourcetest

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class SecondDataSourceServiceSpec extends Specification implements ServiceUnitTest<SecondDataSourceService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
