package forcomp

object w6c {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
  println("Welcome to the Scala worksheet");$skip(34); val res$0 = 
  Anagrams.wordOccurrences("ate");System.out.println("""res0: forcomp.Anagrams.Occurrences = """ + $show(res$0));$skip(4); val res$1 = 
  1;System.out.println("""res1: Int(1) = """ + $show(res$1));$skip(139); 
  def powerSet[A](s: Set[A]) =
    s.foldLeft(Set(Set.empty[A])) {
      (set, element) =>
        set union (set map (_ + element))
    };System.out.println("""powerSet: [A](s: Set[A])scala.collection.immutable.Set[scala.collection.immutable.Set[A]]""");$skip(25); val res$2 = 
  powerSet(Set(1, 2, 3));System.out.println("""res2: scala.collection.immutable.Set[scala.collection.immutable.Set[Int]] = """ + $show(res$2))}
}