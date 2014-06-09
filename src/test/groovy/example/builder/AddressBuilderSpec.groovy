package example.builder

import spock.lang.Specification

class AddressBuilderSpec extends Specification {
    def 'should build address'() {
        when:
        AddressBuilder address = new AddressBuilder().street('123 Main St').city('Minneapolis').state('MN').zip('55403')

        then:
        assert address.street == '123 Main St'
        assert address.city == 'Minneapolis'
        assert address.state == 'MN'
        assert address.zip == '55403'
    }
}
