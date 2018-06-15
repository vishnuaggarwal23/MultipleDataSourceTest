package multipledatasourcetest

class SecondDataSourceDomain {
    String name

    static constraints = {
    }

    static mapping = {
        cache true
//        datasources(['secondSource'])
    }
}
