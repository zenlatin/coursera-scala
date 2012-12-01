package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  val triangle = pascalStream(List(1));

  def pascalStream(row: List[Int]): Stream[List[Int]] = {
    Stream.cons(row, pascalStream((row ::: List(0)) zip (0 :: row) map { case (a, b) => a + b }))
  }

  def pascal(c: Int, r: Int): Int = triangle(r)(c)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = (0 /: chars) {
    case (0, ')') => return false
    case (x, ')') => x - 1
    case (x, '(') => x + 1
    case (x, _) => x
  } == 0

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = (money, coins.sorted) match {
    case (0, _) => 1
    case (x, List(h)) => if(x % h == 0) 1 else 0
    case (x, h :: t) if (x >= h) => ( 0 /: List.range(0, x/h + 1)) { case(sum, i) => sum + countChange(x - i*h, t) }
    case (_, _) => 0
  }
}
