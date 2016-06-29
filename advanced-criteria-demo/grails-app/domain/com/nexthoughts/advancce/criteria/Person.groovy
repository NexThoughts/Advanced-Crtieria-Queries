package com.nexthoughts.advancce.criteria

import com.nexthoughts.NamedQueries

class Person {

    String firstName
    String lastName
    Long age

    static hasMany = [addresses: Address]

    static constraints = {

    }

    static namedQueries = {
        lastNameFilter {
            ilike('lastName', 'Next%')
        }
    }
}
