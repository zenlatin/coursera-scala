object mapWorksheet {
type Set = Int => Booleanimport scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 

  val bound = 10;System.out.println("""bound  : Int = """ + $show(bound ));$skip(47); 
  
  println("Welcome to the Scala worksheet");$skip(48); 

  def singletonSet(elem: Int): Set = Set(elem);System.out.println("""singletonSet: (elem: Int)Int => Boolean""");$skip(54); 

  def contains(s: Set, elem: Int): Boolean = s(elem);System.out.println("""contains: (s: Int => Boolean, elem: Int)Boolean""");$skip(80); 

  def union(s: Set, t: Set): Set = (x: Int) => contains(s, x) | contains(t, x);System.out.println("""union: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""")}


}