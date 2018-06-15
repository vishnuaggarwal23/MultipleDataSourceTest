package multipledatasourcetest

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ThirdDataSourceDomainSpec extends Specification implements DomainUnitTest<ThirdDataSourceDomain> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
