package example.builder

import groovy.transform.builder.Builder
import groovy.transform.builder.ExternalStrategy

/**
 * Builder docs http://groovy-lang.org/docs/groovy-2.3.2/html/documentation/core-metaprogramming.html#xform-Builder
 */
@Builder(builderStrategy=ExternalStrategy, forClass=Address)
class AddressBuilder { }
