/*
 fun printFullName(firstName: String, lastName: String) {
     println(firstName + " " + lastName)
 }
 printFullName("Александр", "Денисенко")

 //2
 fun printFullName(firstName: String, lastName: String) {
     println(firstName + " " + lastName)
 printFullName(firstName = "Александр", lastName = "Денисенко")
 //3
 fun printFullName(firstName: String, lastName: String) {
     println(firstName + " " + lastName)
     fun calculateFullName(firstName: String, lastName: String): String {
         return firstName + " " + lastName
     }

     //4
     fun calculateFullNameWithLength(firstName: String, lastName: String): Pair<String, Int> {
         val fullName = firstName + " " + lastName
         return Pair(fullName, fullName.length)
     }