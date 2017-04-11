scala.collection.mutable.Map

class ChecksumAccumulator1{
  var sum = 0
}

new ChecksumAccumulator1

val acc = new ChecksumAccumulator1
val csa = new ChecksumAccumulator1

acc.sum = 3



class ChecksumAccumulator2 {
  private var sum = 0
  def add(b: Byte): Unit = {
    sum += b
  }
  def checksum(): Int = {
    return ~(sum & 0xFF) + 1
  }
}

class ChecksumAccumulator3 {
  private var sum = 0
  def add(b: Byte): Unit = sum += b
  def checksum(): Int = ~(sum & 0xFF) + 1
}

class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte) { sum += b }
  def checksum(): Int = ~(sum & 0xFF) + 1
}

def f(): Unit = "This string gets lost"

def g(){ "This string gets lost too"}

def h() = { "this String gets returned!" }

object ChecksumAccumulator {
  private val cache = Map[String, Int]()
  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}