package com.nexthoughts.advancce.criteria

class Address {
    String locality
    String postalCode
    String city

    static belongsTo = [person: Person]

    static constraints = {
    }
}
