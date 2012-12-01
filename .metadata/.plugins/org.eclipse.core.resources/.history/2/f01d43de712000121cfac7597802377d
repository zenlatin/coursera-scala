package forcomp

object w6 {
  println("Welcome to the Scala worksheet")
  def powerSet[A](s: List[A]) =
    s.foldLeft(List(List.empty[A])) {
      (set, element) =>
        set union (set map (element :: _))
    }
  Anagrams.combinations(List('a', 1))
}