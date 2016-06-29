package com.nexthoughts.advancce.criteria

class Address {

    String city

    static belongsTo = [person: Person]

    static constraints = {
    }
}
