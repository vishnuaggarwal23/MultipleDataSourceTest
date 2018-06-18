package multipledatasourcetest

import grails.gorm.transactions.Transactional

import javax.sql.DataSource

@Transactional
class ThirdDataSourceService {

    DataSource dataSource

    def serviceMethod() {
        println dataSource?.toString()
    }
}
