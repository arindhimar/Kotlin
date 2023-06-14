fun main() {
    var userName1 = "Arin"
    var userAge1 = 20
    var userMarks1 = 9.04

    //OR (use val for constant)

    var userName2 : String = "Ashish"
    var userAge2 : Int = 20
    var userMarks2 : Double = 9.04

    val userGrade = 'a'
    val userBoolean = true


    println("My name is "+userName1+ ". I'm "+userAge1+" years old!! Scored "+userMarks1+"and in 2 years I'll be "+(userAge1+2)+" years old!!")

    println("My name is $userName2 . I'm $userAge2 years old!! Scored $userMarks2 and in 2 years I'll be ${userAge2+2} years old!!")

    println("My name is \$userName2 . I'm \$userAge2 years old!! Scored $userMarks2 and in 2 years I'll be ${userAge2+2} years old!!")
}