enum class PhoneType{
    HOME,
    WORK,
    PERSONAL
}

sealed class Contact {
    data class PhoneNumber(val number: Int, val type: PhoneType) : Contact()
    data class Email(val email: String) : Contact()
    data class Messenger(val name: String, val id: Int) : Contact()
}

data class User(val contacts: List<Contact> = listOf(), val firstName: String = "",
                val lastName: String = "", val age: Int = 0)

fun main() {
    val contact1: Contact.PhoneNumber = Contact.PhoneNumber(213125123, PhoneType.HOME)
    val contact2: Contact.PhoneNumber = Contact.PhoneNumber(135123512, PhoneType.PERSONAL)
    val contact3: Contact.PhoneNumber = Contact.PhoneNumber(512355123, PhoneType.WORK)
    val contact4: Contact.Email = Contact.Email("asdasd@mail.com")
    val contact5: Contact.Messenger = Contact.Messenger("Asak", 1231241)

    val user1 = User(listOf(contact1,contact4),
        "Lesha", "Popov", 19)
    val user2 = User(listOf(contact1, contact2,contact4),
        "Afas", "Afasf", 42)
    val user3 = User(listOf(contact1,contact3))
    val user4 = User(listOf(contact5,contact4, contact3), "Tasdas")
    val user5 = User()
    val users: List<User> = listOf(user1, user2, user3, user4, user5)

    for(i in users){
        println(i)
    }
}
