import MySQL.*
import spock.lang.Specification

class DatabaseConnectionSpecification extends Specification {
    def "Connection to cardigan database should be successful" () {
        given:
        CardiganMysqlConnect dao = new CardiganMysqlConnect()

        when:
        def connection = dao.ConnectDb()

        then:
        connection != null
    }

    def "Connection to dress database should be successful" () {
        given:
        DressMysqlConnect dao = new DressMysqlConnect()

        when:
        def connection = dao.ConnectDb()

        then:
        connection != null
    }

    def "Connection to lingerie database should be successful" () {
        given:
        LingerieMysqlConnect dao = new LingerieMysqlConnect()

        when:
        def connection = dao.ConnectDb()

        then:
        connection != null
    }

    def "Connection to search database should be successful" () {
        given:
        SearchMysqlConnect dao = new SearchMysqlConnect()

        when:
        def connection = dao.ConnectDb()

        then:
        connection != null
    }

    def "Connection to shirt database should be successful" () {
        given:
        ShirtMysqlConnect dao = new ShirtMysqlConnect()

        when:
        def connection = dao.ConnectDb()

        then:
        connection != null
    }
    def "Connection to skirts database should be successful" () {
        given:
        SkirtsMysqlConnect dao = new SkirtsMysqlConnect()

        when:
        def connection = dao.ConnectDb()

        then:
        connection != null

    }
    def "Connection to trousers database should be successful" () {
        given:
        TrousersMysqlConnect dao = new TrousersMysqlConnect()

        when:
        def connection = dao.ConnectDb()

        then:
        connection != null
    }
}
