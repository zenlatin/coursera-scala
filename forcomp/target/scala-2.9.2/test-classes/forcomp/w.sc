package forcomp

object w {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  List(1, 2, 3).flatMap(x => List(x, 1))          //> res0: List[Int] = List(1, 1, 2, 1, 3, 1)
  (for( element <- List(1,2,3)) yield List(element, 1)).flatten
                                                  //> res1: List[Int] = List(1, 1, 2, 1, 3, 1)
}