abstract class Element{
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
}

class ArrayElement(const: Array[String]) extends Element{
  def contents: Array[String] = const
}

val ae_0 = new ArrayElement(Array("Hello", "World...!!!"))
ae_0.width
ae_0.height

val e: Element = new ArrayElement(Array("Hello"))

class LineElement(s: String) extends ArrayElement(Array(s)) {
  override def width = s.length
  override def height = 1
}

class UniformElement(ch: Char, override val width: Int, override val height: Int)
  extends Element {
  private val line = ch.toString * width
  def contents = Array.fill(height)(line)
}

val e1: Element = new ArrayElement(Array("Hello", "World"))
val ae: ArrayElement = new LineElement("Hello")
val e2: Element = ae
val e3: Element = new UniformElement('x',2, 3)
