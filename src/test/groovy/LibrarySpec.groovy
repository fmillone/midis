import spock.lang.Specification

/**
 * Created by frank on 7/11/2016.
 */
class LibrarySpec extends Specification {
    def "SomeLibraryMethod"() {
        expect:
            new Library().someLibraryMethod()
    }
}
