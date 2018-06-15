package multipledatasourcetest

class ThirdDataSourceDomain {
    String name

    static constraints = {
    }

    static mapping = {
        cache true
//        datasources(['thirdSource'])
    }
}
