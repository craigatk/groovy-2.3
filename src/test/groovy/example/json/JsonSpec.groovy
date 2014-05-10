package example.json

import example.builder.Address
import groovy.json.JsonBuilder
import groovy.json.JsonSlurper
import spock.lang.Specification

class JsonSpec extends Specification {
    def 'should serialize and de-serialize json'() {
        given:
        Address startingAddress = new Address(street: '123 Main St', city: 'Minneapolis')
        JsonBuilder builder = new JsonBuilder()
        JsonSlurper slurper = new JsonSlurper()

        builder(startingAddress)
        String jsonString = builder.toString()

        when:
        Address parsedAddress = slurper.parseText(jsonString)

        then:
        assert parsedAddress.street == startingAddress.street
        assert parsedAddress.city == startingAddress.city
    }
}
