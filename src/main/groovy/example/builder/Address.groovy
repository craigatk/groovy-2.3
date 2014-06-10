package example.builder

import groovy.transform.builder.Builder

/**
 * Builder docs http://groovy-lang.org/docs/groovy-2.3.2/html/documentation/core-metaprogramming.html#xform-Builder
 */
@Builder
class Address {
    String street
    String city
    String state
    String zip
}
