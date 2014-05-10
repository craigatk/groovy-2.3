package example.builder

import spock.lang.Ignore
import spock.lang.Specification

@Ignore // Ignored until this Groovy bug is fixed http://jira.codehaus.org/browse/GROOVY-6774
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
