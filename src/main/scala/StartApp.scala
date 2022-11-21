import scala.io.StdIn
import scala.util.control.Breaks._
object Home {
  def main(args: Array[String]) {
    a_work()
    b_work()
    c_work()
    var list_pay: Array[Double] = d_work()
    list_pay +:= 350
    list_pay +:= 90
    list_pay = e_work(list_pay)
    f_work(list_pay)
    list_pay +:=130
    g_work(list_pay)
    h_work(list_pay)

  }

  def a_work(): Unit = {
    var Hello_string = "Hello, Scala!"
    println(Hello_string)
    println(Hello_string.reverse)
    println(Hello_string.toLowerCase())
    println(Hello_string.replace("!", ""))
    println(Hello_string + "and goodbye python!")
  }

  def b_work(): Unit = {
    println("Enter yearpay: ")
    var yearpay = StdIn.readInt()
    println("Bonus size:")
    var bonus = StdIn.readFloat()
    println("Food compensation")
    var food_comp = StdIn.readInt()
    print("Pay month ")
    println((yearpay + yearpay * bonus + food_comp) * 0.87 / 12)
  }

  def c_work(): Unit = {
    println("Enter yearpay: ")
    var yearpay = StdIn.readInt()
    println("Bonus size:")
    var bonus = StdIn.readFloat()
    println("Food compensation")
    var food_comp = StdIn.readInt()
    var pay_month = (yearpay + yearpay * bonus + food_comp) * 0.87 / 12
    println("Enter pays with space")
    var list_pay: Array[Int] = StdIn.readLine().split(" ").map(_.toInt)
    var means = 0.0
    for (x <- list_pay) {
      means += x
    }
    means = means / list_pay.length
    for (x <- list_pay) {
      println((x - means) * 100 / means)
    }
  }

  def d_work(): Array[Double] = {
    println("Enter yearpay: ")
    var yearpay = StdIn.readInt()
    println("Bonus size:")
    var bonus = StdIn.readFloat()
    println("Food compensation")
    var food_comp = StdIn.readInt()
    var pay_month = (yearpay + yearpay * bonus + food_comp) * 0.87 / 12
    println("Enter pays with space")
    var list_pay: Array[Double] = StdIn.readLine().split(" ").map(_.toInt)
    var means = 0.0
    for (x <- list_pay) {
      means += x
    }
    means = means / list_pay.length
    list_pay +:= list_pay(0) + means
    println(list_pay(0), "Max ", list_pay.max, "Min ", list_pay.min)
    return list_pay
  }

  def e_work(dd: Array[Double]): Array[Double] = {
    println("Sorted array")
    scala.util.Sorting.quickSort(dd)
    for (x <- dd) {
      print(x)
      print(" ")
    }
    println()
    return dd
  }
  def f_work(dd: Array[Double]): Unit = {
    var count:Int = 0
    print("Insert 130 in to list ")
    for (x<-dd){
      count+=1
      if (x>130){
        println(count)
      }
    }

  }
  def g_work(dd: Array[Double]): Unit = {
    print("Vvedi vilku zarplat ")
    var count: Int = 0
    var part: String = StdIn.readLine()
    val List(part1, part2) = part.split(" ").map(_.toInt).toList
    for (x <- dd) {
      if (x > part1 & x < part2) {
        print("Number middle ")
        count += 1
        println(count)
      }
    }
  }
    def h_work(dd: Array[Double]): Unit = {
      print("Indexcacia 7% ")
      for (x <- dd) {
        print(x)
        print(" -> ")
        println(1.07*x)
        }
      }


}
