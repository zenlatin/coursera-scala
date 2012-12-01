import forcomp._

object w6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
  println("Welcome to the Scala worksheet");$skip(56); 
  val l1 = List(('a', 1), ('d', 1), ('l', 1), ('r', 1));System.out.println("""l1  : List[(Char, Int)] = """ + $show(l1 ));$skip(26); 
  val l2 = List(('r', 1));System.out.println("""l2  : List[(Char, Int)] = """ + $show(l2 ));$skip(71); val res$0 = 
  // Anagrams.subtract(l1, l2)
  (l1 ::: l2).groupBy(_._1).map(x => x);System.out.println("""res0: scala.collection.immutable.Map[Char,List[(Char, Int)]] = """ + $show(res$0))}
}