package example

trait AddressTrait {
    String street
    String city
    String state
    String zipCode

    String getFullAddress() {
        "${street}, ${city}, ${state} ${zipCode}"
    }
}
