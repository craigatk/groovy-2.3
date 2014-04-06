package example.trait

import spock.lang.Specification

class PersonSpec extends Specification {
    def 'should get full name'() {
        given:
        Person person = new Person(firstName: 'Jim', lastName: 'Smith')

        when:
        String fullName = person.fullName

        then:
        assert fullName == 'Jim Smith'
    }

    def 'should get full address'() {
        given:
        Person person = new Person(street: '123 Main St', city: 'St. Paul', state: 'MN', zipCode: '55113')

        when:
        String fullAddress = person.fullAddress

        then:
        assert fullAddress == '123 Main St, St. Paul, MN 55113'
    }
}
