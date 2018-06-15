package multipledatasourcetest

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class AllDataSourceDomainSpec extends Specification implements DomainUnitTest<AllDataSourceDomain> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
