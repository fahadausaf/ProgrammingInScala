abstract class Element{
  def demo(): Unit ={
    println("Element's implementation invoked")
  }
}

class ArrayElement extends Element{
  override def demo(): Unit ={
    println("ArrayElement's implementation invoked")
  }
}