import scala.collection.mutable.Set
import scala.collection.immutable.HashSet
import scala.collection.mutable.Map
import scala.io.Source

val big  = new java.math.BigInteger("123456")

val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "World!\n"

for(i <- 0 to 2)
  print(greetStrings(i))

val names = Array("one", "two", "three")

//val oneTwoThree = List(1, 2, 3)

val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo +" and "+ threeFour +" were not mutated.")
println("Thus, "+ oneTwoThreeFour +" is a new list.")

val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree
println(oneTwoThree)

val pair = (99, "Luftballons")
println(pair._1)
println(pair._2)


var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))

val movieSet = Set("Hitch","Poltergeist")
movieSet += "Shrek"
println(movieSet)

val hashSet = HashSet("Tomatoes", "Chilies")
println(hashSet + "Coriander")

val treasureMap = Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap(2))

val romanNumeral = Map(1 -> "I",
  2 -> "II", 3 -> "III",
  4 -> "IV", 5 -> "V")
println(romanNumeral(4))

def printArgs(args: Array[String]): Unit = {
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }
}

def printArgs2(args: Array[String]): Unit = {
  for (arg <- args)
    println(arg)
}

def printArgs3(args: Array[String]): Unit = {
  args.foreach(println)
}

def formatArgs(args: Array[String]) = args.mkString("\n")

val res = formatArgs(Array("zero", "one", "two"))
assert(res == "zero\none\ntwo")

val f = "C:\\Users\\fahad\\IdeaProjects\\ProgrammingInScala\\src\\main\\scala\\test.txt"

for (line <- Source.fromFile(f).getLines())
  println(line.length +" "+ line)

val lines = Source.fromFile(f).getLines().toList