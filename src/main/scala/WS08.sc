
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


def makeIncreaser(more: Int) = (x: Int) => x + more
val inc1 = makeIncreaser(1)
inc1(10)

val inc9999 = makeIncreaser(9999)
inc9999(10)

/////////////////////////////////////////
// REPEATED PARAMETERS///////////////////

def echo(args: String*) =
  for(arg <- args) println(arg)

echo("Syed", "Fahad", "Ausaf", "Jafri")

val arr = Array("What's", "up", "doc","?")
echo(arr: _*)


////////////////////////////////////////
//// NAMED ARGUMENTS ///////////////////

def speed(distance: Float, time: Float): Float =
distance / time

speed(100, 10)
speed(distance = 100, time = 10)
speed(time = 10, distance = 100)

////////////////////////////////////////
///////  DEFAULT PARAMETER VALUES //////

//def printTime(out: java.io.PrintStream = Console.out) =
  //out.println("time = " + System.currentTimeMillis()())

//printTime(Console.err)

////////////////////////////////////////
/////////  TAIL RECURSION

def boom(x: Int): Int =
  if (x == 0) throw new Exception("Boom!")
  else boom(x -1) + 1

//boom(5)

def bang(x: Int): Int =
  if(x == 0) throw new Exception("bang!")
  else bang(x -1)

//bang(5)

def isEven(x: Int): Boolean =
  if(x == 0) true else isOdd(x-1)

def isOdd(x: Int): Boolean =
  if(x == 0) false else isEven(x -1)

isEven(3)

val funValue = nestedFun _
def nestedFun(x: Int): Unit = {
  if (x != 0) { println(x); funValue(x -1)}
}

funValue(4)

