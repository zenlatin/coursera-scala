package forcomp

object w6c {
  println("Welcome to the Scala worksheet")
  Anagrams.wordOccurrences("ate")
  1
  def powerSet[A](s: Set[A]) =
    s.foldLeft(Set(Set.empty[A])) {
      (set, element) =>
        set union (set map (_ + element))
    }
  powerSet(Set(1, 2, 3))
}