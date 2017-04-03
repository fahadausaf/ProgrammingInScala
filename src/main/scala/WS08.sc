
var increase = (x: Int) => x + 1
increase(10)

increase = (x: Int) => x + 9999
increase(10)

increase = (x: Int) => {
  println("We")
  println("are")
  println("here")
  x + 1
}
increase(10)

val someNumbers = List(-11, -10, -5, 0, 5, 10)
someNumbers.foreach((x: Int) => println(x))
someNumbers.filter((x: Int) => x > 0)

someNumbers.filter((x) => x > 0)
someNumbers.filter(x => x > 0)
someNumbers.filter(_ > 0)

val f = (_: Int) + (_: Int)
f(5, 10)

someNumbers.foreach(println(_))
someNumbers.foreach(println _)

def sum(a: Int, b: Int, c: Int) = a + b + c
sum(1,2,3)

val a = sum _
a(1,2,3)
a.apply(1,2,3)

val b = sum(1, _: Int, 3)
b(2)
b(5)

someNumbers.foreach(println _)
someNumbers.foreach(println)

var more = 1
val addmore = (x: Int) => x + more
addmore(10)

more = 9999
addmore(10)

val someNumbers2 = List(-11, -10, -5, 0, 5, 10)
var sum2 = 0

someNumbers2.foreach(sum2 += _)
sum2
