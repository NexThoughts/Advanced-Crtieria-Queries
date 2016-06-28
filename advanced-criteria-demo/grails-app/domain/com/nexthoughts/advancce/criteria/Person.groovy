package com.nexthoughts.advancce.criteria

class Person {
    String name
    Long age
    Date dateOfBirth

    static hasMany = [addresses: Address]

    static constraints = {

    }
}
