package com.gl4.tp2

class Student(val firstName: String, val lastName: String, val gender: Gender, val subject: Subject) {
    enum class Gender {
        MAN,
        WOMAN
    }
    enum class Subject {
        TP,
        Cours
    }
}

