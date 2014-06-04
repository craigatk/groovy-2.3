package example.builder

import groovy.transform.builder.Builder

@Builder
class Address {
    String street
    String city
    String state
    String zip
}
