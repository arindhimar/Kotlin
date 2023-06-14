import kotlin.system.exitProcess

fun menu()
{
    println("Menu")
    println("1 - Add")
    println("2 - Subtract")
    println("3 - Multiply")
    println("4 - Divide")
    println("5 - Exit")
    print("Select Menu Option        ")
}

fun main() {
    var opt:Int
    var userVar1 : Int;var userVar2:Int
    do {
        menu()
        opt = readln().toInt()

        if (opt == 5) {
            exitProcess(0)
        } else

        print("Enter First Variable     ==      ")
        userVar1 = readln().toInt()
        print("Enter Second Variable     ==      ")
        userVar2 = readln().toInt()

            when (opt) {
                1 -> {
                    println("$userVar1 + $userVar2 = ${userVar1 + userVar2}")
                }

                2 -> {
                    println("$userVar1 - $userVar2 = ${userVar1 - userVar2}")
                }

                3 -> {
                    println("$userVar1 - $userVar2 = ${userVar1 * userVar2}")
                }

                4 -> {
                    if (userVar2 == 0) {
                        println("Cant Perform the operation")
                    } else {
                        println("$userVar1 + $userVar2 = ${userVar1 + userVar2}")
                    }
                }

                else -> {
                    println("Invalid Menu Option")
                }
            }

        }while (opt!=5);

}