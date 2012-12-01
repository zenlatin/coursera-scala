package forcomp

object w {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(71); 
  println("Welcome to the Scala worksheet");$skip(41); val res$0 = 
  List(1, 2, 3).flatMap(x => List(x, 1));System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(64); val res$1 = 
  (for( element <- List(1,2,3)) yield List(element, 1)).flatten;System.out.println("""res1: List[Int] = """ + $show(res$1))}
}