package example.sortable

import groovy.transform.Sortable

@Sortable(includes = ['lastName', 'firstName', 'age'])
class SortablePerson {
    String firstName
    String lastName
    Integer age
}
