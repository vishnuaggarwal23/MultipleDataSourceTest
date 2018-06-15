package multipledatasourcetest

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class SecondDataSourceDomainSpec extends Specification implements DomainUnitTest<SecondDataSourceDomain> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
