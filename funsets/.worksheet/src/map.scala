object map {
  type Set = Int => Booleanimport scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); ;
  val bound = 10;System.out.println("""bound  : Int = """ + $show(bound ));$skip(44); 
  println("Welcome to the Scala worksheet");$skip(79); 
  def union(s: Set, t: Set): Set = (x: Int) => contains(s, x) | contains(t, x);System.out.println("""union: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(185); 

  /**
   * Displays the contents of a set
   */
  def toString(s: Set): String = {
    val xs = for (i <- -bound to bound if contains(s, i)) yield i
    xs.mkString("{", ",", "}")
  };System.out.println("""toString: (s: Int => Boolean)String""");$skip(117); 

  /**
   * Prints the contents of a set on the console.
   */
  def printSet(s: Set) {
    println(toString(s))
  };System.out.println("""printSet: (s: Int => Boolean)Unit""");$skip(385); 

  def map(s: Set, f: Int => Int): Set = {
    var mapResult: Set = x => false;
    def iter(a: Int) {
      if ((a == 0) && s(0)) mapResult = union(singletonSet(f(0)), mapResult)
      else if (s(a)) mapResult = union(singletonSet(f(a)), mapResult)
      else if (s(-a)) mapResult = union(singletonSet(f(-a)), mapResult)
      else iter(a - 1)
    }
    iter(bound)
    mapResult
  };System.out.println("""map: (s: Int => Boolean, f: Int => Int)Int => Boolean""")}
}