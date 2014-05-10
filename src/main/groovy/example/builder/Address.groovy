package example.builder
/**
 * Builder docs http://beta.groovy-lang.org/docs/groovy-2.3.0/html/documentation/core-metaprogramming.html#xform-Builder
 *
 * Bug in @Builder will cause compilation to fail in Gradle http://jira.codehaus.org/browse/GROOVY-6774
 */
//@Builder
class Address {
    String street
    String city
    String state
    String zip
}
