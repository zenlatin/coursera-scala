package forcomp

object w6b {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
  println("Welcome to the Scala worksheet");$skip(4); val res$0 = 
  1;System.out.println("""res0: Int(1) = """ + $show(res$0));$skip(34); val res$1 = 
  Anagrams.wordOccurrences("ate");System.out.println("""res1: forcomp.Anagrams.Occurrences = """ + $show(res$1));$skip(40); val res$2 = 
  Anagrams.combinations(List(('a', 1)));System.out.println("""res2: List[forcomp.Anagrams.Occurrences] = """ + $show(res$2));$skip(21); val res$3 = 
  Nil ::: List(1, 2);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(30); val res$4 = 
  List(1, 2) union List(2, 3);System.out.println("""res4: List[Int] = """ + $show(res$4))}
}