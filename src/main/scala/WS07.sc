import java.io.File
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

val g = gcdLoop(28, 70)


/*var line = ""
do {
  line = readLine()
  println("Read: "+ line)
} while (line != "")
*/

def greet() = { println("hi")}

greet() == ()

def gcd(x: Long, y: Long): Long =
  if(y == 0) x else gcd(y, x % y)

gcd(35, 105)

/*
val filesHere = (new File(".")).listFiles

for(file <- filesHere)
  println(file)
*/

for(i <- 1 to 4)
  println("Iteration" + i)

for(i <- 1 until 4)
  println("Iteration "+ i)

val filesHere = (new File(".")).listFiles

for(file <- filesHere if file.getName.endsWith(".scala"))
  println(file)

for(file <- filesHere)
  if(file.getName.endsWith(".scala"))
    println(file)

for(
  file <-filesHere
  if file.isFile
  if file.getName.endsWith(".scala")
) println(file)

def fileLines(file: File) =
  scala.io.Source.fromFile(file).getLines().toList

def grep(pattern: String) =
  for(
    file <- filesHere
    if file.getName.endsWith(".scala");
    line <- fileLines(file)
    if line.trim.matches(pattern)
  ) println(file + ": " + line.trim)
grep(".*gcd.*")


def grep2(pattern: String) =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(pattern)
  } println(file +": "+ trimmed)
grep2(".*gcd.*")

def scalaFiles =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file

val forLineLengths =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(".*for.*")
  } yield trimmed.length


def half(n: Int) =
  if (n % 2 == 0)
    n / 2
  else
    throw new RuntimeException("n must be even")

half(2)
//half(3)

try {
  val f = new FileReader("input.txt")
  // Use and close file
} catch {
  case ex: FileNotFoundException => { println("File Not Found Exception") }// Handle missing file
  case ex: IOException => { println("IO Exception") } // Handle other I/O error
}



