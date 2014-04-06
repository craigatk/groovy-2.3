package example.sortable

import spock.lang.Specification
import spock.lang.Unroll

class SortablePersonSpec extends Specification {
    @Unroll
    def 'should sort person in scenario "#scenario"'() {
        when:
        SortablePerson person2 = new SortablePerson(
                firstName: firstName2,
                lastName: lastName2,
                age: age2
        )

        SortablePerson person1 = new SortablePerson(
                firstName: firstName1,
                lastName: lastName1,
                age: age1
        )

        then:
        assert person1 < person2

        where:
        lastName1 | firstName1  | age1 | lastName2 | firstName2 | age2 || scenario
        'Andrews' | 'Paul'      | 60   | 'Baker'   | 'Sam'      | 60   || 'sort by last name'
        'Andrews' | 'Allen'     | 40   | 'Andrews' | 'Bill'     | 40   || 'sort by first name'
        'Andrews' | 'Allen'     | 45   | 'Andrews' | 'Allen'    | 46   || 'sort by age'

    }
}
