package multipledatasourcetest

import grails.gorm.transactions.Transactional

import javax.sql.DataSource

@Transactional
class SecondDataSourceService {

    DataSource dataSource
    DataSource dataSource_secondSource

    def serviceMethod() {
        println dataSource?.toString()
        println dataSource_secondSource?.toString();
    }
}
