import javax.swing.AbstractListModel

fun main() {
// an array occupies a contiguous memory. it is fixed. while a list every element has a pointer to the next element /
//    val names = listOf("Grace", "Hopper", "Cate", "Diana")
//    val phoneNumbers = mutableListOf("0720456789", "0718558423","0718467838")
//
//    phoneNumbers.add("0724894657")
//
//    println(names)
//    println(phoneNumbers)

    val nums = mutableListOf(31, 243, 31, 32, 5, 67, 90, 21, 45, 6,)

    println(nums.count())
    println(nums.max())
    println(nums.min())
    println(nums.sum())
    println(nums.average())
    println(nums.first())
    println(nums.last())
    println(nums[6])
    println(nums.get(6))
    println(nums.indexOf(67))
    println(nums.lastIndex)
    println(nums.indexOf(31))
    println(nums.lastIndexOf(31))
//    println(nums.size)
    nums.add(100)

    nums.add(4, 11)
    println(nums)
//    ***loop
//    for each
    var sum = 0
    for (y in nums) {
        println(sum++)
        println(sum)
    }

    val sortedNums= nums. sorted()
    println(nums)
    println(sortedNums)
    nums.sort()
    println(nums)

    val sortedNumsDes= nums. sortedDescending()
    println(nums)
    println(sortedNumsDes)
    nums.sortDescending()
    println(nums)

    val sortedNumsReverse= nums. reverse()
    println(nums)
   (sortedNumsReverse)

    val evenNums = nums.filter { num -> num%2 == 0 }
    println(evenNums)


    val friends = listOf("Adam", "Hamira", "Grant","Edison","Michael")
    val longName = friends.filter { friend -> friend.length>5 }
    println( longName.size)


//    val mazda = car("Mazda", "Demio")
//    mazda.make
//    mazda.getCarMake()
//
//    println(mazda is car)
    createStudentList()
}

//class car(var make:String, var model: String){
//fun getCarMake():String {
//    return make
//}
//}

data class Student(var name: String, var age : Int)

fun createStudentList(){
    val student1 = Student("Grace", 17)
    val student2 = Student("Janet", 18)
    val student3 = Student("Mercy", 19)
    val student4 = Student("Linet", 21)

    val studentList = listOf(student1, student2, student3,student4)
    println(studentList)
    println(studentList[0])
    println(studentList[0].age)

    val sorted = studentList.sortedBy { student -> student.name }
    println(sorted)

    val sortedByAge = studentList.sortedBy { student -> student.age }
    println(sortedByAge)

val adult = studentList.filter { Student -> Student.age >18 }
    println(adult)

}