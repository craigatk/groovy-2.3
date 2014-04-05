package example

trait NameTrait {
    String firstName
    String lastName

    String getFullName() {
        "${firstName} ${lastName}"
    }
}
