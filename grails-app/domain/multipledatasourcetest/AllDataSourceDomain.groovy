package multipledatasourcetest

class AllDataSourceDomain {
    String name

    static constraints = {
    }

    static mapping = {
        cache true
//        datasources(['DEFAULT', 'secondSource', 'thirdSource'])
    }
}
