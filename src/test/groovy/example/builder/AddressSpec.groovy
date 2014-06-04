package example.builder

import spock.lang.Specification

class AddressSpec extends Specification {
    def 'should build address'() {
        when:
        Address address = Address.builder()
                .street('123 Main St')
                .city('Minneapolis')
                .state('MN')
                .zip('55403')
                .build()

        then:
        assert address.street == '123 Main St'
        assert address.city == 'Minneapolis'
        assert address.state == 'MN'
        assert address.zip == '55403'
    }
}
