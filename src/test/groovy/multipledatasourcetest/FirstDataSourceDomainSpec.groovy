package multipledatasourcetest

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class FirstDataSourceDomainSpec extends Specification implements DomainUnitTest<FirstDataSourceDomain> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
