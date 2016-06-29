import com.nexthoughts.advancce.criteria.Person
import com.nexthoughts.advancce.criteria.Address

class BootStrap {

    def init = { servletContext ->
        /*Person person = null
        (1..100).each {
            person = new Person(firstName: "FirstName $it", lastName: "LastName $it", age: (it * 2 + 20))
            person.save(flush: true)
        }

        Person.list().each { Person personInstance ->
            new Address(city: 'Rome',person: personInstance).save(flush: true,failOnError: true)
            new Address(city: 'Kuala Lumpur',person: personInstance).save(flush: true)
            new Address(city: 'Cuba',person: personInstance).save(flush: true)
            new Address(city: 'Durban',person: personInstance).save(flush: true)
            new Address(city: 'Qatar',person: personInstance).save(flush: true)

        }*/

    }
    def destroy = {
    }
}
