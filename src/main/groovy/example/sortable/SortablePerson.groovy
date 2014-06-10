package example.sortable

import groovy.transform.Sortable

/**
 * Sortable docs http://groovy-lang.org/docs/groovy-2.3.2/html/documentation/core-metaprogramming.html#xform-Sortable
 */
@Sortable(includes = ['lastName', 'firstName', 'age'])
class SortablePerson {
    String firstName
    String lastName
    Integer age
}
