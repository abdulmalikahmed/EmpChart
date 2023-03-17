class emp(var EmpId:Int, var EmpName:String,var Empwork: String,var EmpSal:Double,var EmpDep:Int){

}


fun options(){
    println("To get the list of employees enter (0) ")
    println("To get the higher employees salary enter (1)")
    println("To get the lowest employees salary enter (2)")
    println("To add a new employees enter (3)")
    println("To get a number of employees enter (4)")
    println("To end the program enter (5)")

}
fun main(args:Array<String>) {

    var e1 = emp(1, "Nasser", "CEO", 34000.00, 1)
    var e2 = emp(2, "Khalid", "Manger", 16000.00, 1)
    var e3 = emp(3, "Mohammed", "Data Analysis", 10000.00, 1)
    var e4 = emp(4, "Abdullah", "Data base", 11000.00, 1)
    var e5 = emp(5, "Ali", "HR", 4000.00, 1)
    var e6 = emp(6, "Abdulmalik", "artificial intelligence", 28000.00, 1)

    var e = arrayListOf<emp>(e1, e2, e3, e4, e5, e6)
    println("Welcome in My Program ")
    println("______________________________________________________")
    println()
    println("To start enter 1")
    var stop = readLine()!!.toInt()
    while (stop == 1) {
        options()

        var m = readLine()!!.toInt()
        when (m) {
            0 -> {
                for (i in 0 until e.size) {
                    println("Id: ${e[i].EmpId} Name: ${e[i].EmpName} Jop: ${e[i].Empwork} Salary: ${e[i].EmpSal}$ Department: ${e[i].EmpDep}")
                    println("______________________________________________________")
                    println()
                }
            }
            1 -> {

                for (k in 0 until e.size) {
                    for (j in k + 1 until e.size)
                        if (e[k].EmpSal < e[j].EmpSal) {
                            var temp = e[k].EmpSal
                            e[k].EmpSal = e[j].EmpSal
                            e[j].EmpSal = temp
                            var temp2 = e[k].EmpId
                            e[k].EmpId = e[j].EmpId
                            e[j].EmpId = temp2
                            var temp1 = e[k].EmpName
                            e[k].EmpName = e[j].EmpName
                            e[j].EmpName = temp1
                            temp1 = e[k].Empwork
                            e[k].Empwork = e[j].Empwork
                            e[j].Empwork = temp1
                            temp2 = e[k].EmpDep
                            e[k].EmpDep = e[j].EmpDep
                            e[j].EmpDep = temp2
                        }


                }
                println("The Higher Employee Salary is: ${e[0].EmpName} ${e[0].EmpSal}$")
                println("______________________________________________________")
                println()
            }
            2 -> {
                for (k in 0 until e.size) {
                    for (j in k + 1 until e.size)
                        if (e[k].EmpSal > e[j].EmpSal) {
                            var temp = e[k].EmpSal
                            e[k].EmpSal = e[j].EmpSal
                            e[j].EmpSal = temp
                            var temp2 = e[k].EmpId
                            e[k].EmpId = e[j].EmpId
                            e[j].EmpId = temp2
                            var temp1 = e[k].EmpName
                            e[k].EmpName = e[j].EmpName
                            e[j].EmpName = temp1
                            temp1 = e[k].Empwork
                            e[k].Empwork = e[j].Empwork
                            e[j].Empwork = temp1
                            temp2 = e[k].EmpDep
                            e[k].EmpDep = e[j].EmpDep
                            e[j].EmpDep = temp2

                        }


                }
                println("The lowest Employee Salary is: ${e[0].EmpName} ${e[0].EmpSal}$")
                println("______________________________________________________")
                println()
            }
            3 -> {
                var a=1
                while (a!=0) {


                    println("Please enter the employee information with this Way Id,Name,Jop,Salary.Department ")
                    var e7=emp(readLine()!!.toInt(), readLine()!!.toString(), readLine()!!.toString(), readLine()!!.toDouble(), readLine()!!.toInt())
                    e = arrayListOf<emp>(e1, e2, e3, e4, e5, e6,e7)
                                println("______________________________________________________")
                                println()

                    println("if you finish enter 0")
                    a= readLine()!!.toInt()


                }

            }
            4->{
                println("the number of employee is: ${e.size}")
            }
            5->{
                println("Thanks for use My program 3> ")
              break
            }
        }

    }
}