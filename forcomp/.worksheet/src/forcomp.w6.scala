package forcomp

object w6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  println("Welcome to the Scala worksheet");$skip(143); 
  def powerSet[A](s: List[A]) =
    s.foldLeft(List(List.empty[A])) {
      (set, element) =>
        set union (set map (element :: _))
    };System.out.println("""powerSet: [A](s: List[A])List[List[A]]""");$skip(38); val res$0 = 
  Anagrams.combinations(List('a', 1));System.out.println("""res0: <error> = """ + $show(res$0))}
}