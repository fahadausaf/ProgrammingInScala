import java.io.{File, PrintWriter}
/*

object FileMatcher_0 {
  private def filesHere = (new java.io.File(".")).listFiles

  def filesEnding(query: String) =
    for (file <- filesHere; if file.getName.endsWith(query))
      yield file

  def filesContaining(query: String) =
    for (file <- filesHere; if file.getName.contains(query))
      yield file

  def filesRegex(query: String) =
    for (file <- filesHere; if file.getName.matches(query))
      yield file
}

object FileMatcher_1 {
  private def filesHere = (new java.io.File(".")).listFiles

  def filesMatching(query: String, matcher: (String, String) => Boolean) = {
    for (file <- filesHere; if matcher(file.getName, query))
      yield file
  }

  def filesEnding(query: String) =
    filesMatching(query, _.endsWith(_))

  def filesContaining(query: String) =
    filesMatching(query, _.contains(_))

  def filesRegex(query: String) =
    filesMatching(query, _.matches(_))
}

object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles

  def filesMatching(matcher: String => Boolean) = {
    for (file <- filesHere; if matcher(file.getName))
      yield file
  }

  def filesEnding(query: String) =
    filesMatching(_.endsWith(query))

  def filesContaining(query: String) =
    filesMatching(_.contains(query))

  def filesRegex(query: String) =
    filesMatching(_.matches(query))
}

///////////////////////////////////////////////////////////
// 9.2 - Simplifying the code

def containsNeg_0(nums: List[Int]): Boolean = {
  var exists = false
  for (num <- nums)
    if(num < 0)
      exists = true
  exists
}

containsNeg_0(List(1,2,3,4))
containsNeg_0(List(1,2,-3,4))

def containsNeg(nums: List[Int]) = nums.exists(_ < 0)

containsNeg(List(1,2,3,4))
containsNeg(List(1,2,-3,4))
containsNeg(Nil)

def containsOdd_0(nums: List[Int]): Boolean = {
  var exists = false
  for (num <- nums)
    if(num % 2 == 1)
      exists = true
  exists
}

def containsOdd(nums: List[Int]) = nums.exists(_ % 2 == 1)

//////////////////////////////////////////////////////////
// 9.3 - Currying

def plainOldSum(x: Int, y: Int) = x + y
plainOldSum(1, 2)

def curriedSum(x: Int)(y: Int) = x + y
curriedSum(1)(2)

def first(x: Int) = (y: Int) => x + y
val second = first(1)
second(2)

val onePlus = curriedSum(1)_
onePlus(2)

//////////////////////////////////////////////////////////
// 9.4 - Writing new control structures

def twice(op: Double => Double, x: Double) = op(op(x))
twice(_ + 1, 5)

def withPrintWriter_0(file: File, op: PrintWriter => Unit): Unit = {
  val writer = new PrintWriter(file)
  try{
    op(writer)
  }
  finally {
    writer.close()
  }
}

withPrintWriter_0(
  new File("date.txt"),
  writer => writer.println(new java.util.Date)
)

def withPrintWriter(file: File)(op: PrintWriter => Unit) {
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close()
  }
}

val file = new File("date.txt")
withPrintWriter(file) {
  writer => writer.println(new java.util.Date)
}

*/

//////////////////////////////////////////////////////////
// 9.5 - By Name Parameters

var assertionsEnabled = true
def myAssert(predicate: () => Boolean) =
  if (assertionsEnabled && !predicate())
    throw new AssertionError

myAssert(() => 5 > 3)

def byNameAssert(predicate: => Boolean) =
  if (assertionsEnabled && !predicate)
    throw new AssertionError

byNameAssert(5 > 3)

