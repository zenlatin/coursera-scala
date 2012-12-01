package streams

object wc {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  println("Welcome to the Scala worksheet");$skip(52); 
  def from(n: Int): Stream[Int] = n #:: from(n + 1);System.out.println("""from: (n: Int)Stream[Int]""");$skip(21); 
  val nats = from(0);System.out.println("""nats  : Stream[Int] = """ + $show(nats ));$skip(97); 
  def sieve(s: Stream[Int]): Stream[Int] =
    s.head #:: sieve(s.tail filter (_ % s.head != 0));System.out.println("""sieve: (s: Stream[Int])Stream[Int]""");$skip(31); 

  val primes = sieve(from(2));System.out.println("""primes  : Stream[Int] = """ + $show(primes ));$skip(26); val res$0 = 
  primes.take(100).toList;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(27); val res$1 = 
  primes.take(1000).toList;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(188); 
  def sqrtStream(x: Double): Stream[Double] = {
    def improve(guess: Double) = (guess + x / guess) / 2
    lazy val guesses: Stream[Double] = 1 #:: (guesses map improve)
    guesses
  };System.out.println("""sqrtStream: (x: Double)Stream[Double]""");$skip(33); val res$2 = 
  sqrtStream(4).take(100).toList;System.out.println("""res2: List[Double] = """ + $show(res$2));$skip(44); 

  val capacity: Vector[Int] = Vector(4, 9);System.out.println("""capacity  : Vector[Int] = """ + $show(capacity ));$skip(43); 
  val initialState = capacity map (x => 0);System.out.println("""initialState  : scala.collection.immutable.Vector[Int] = """ + $show(initialState ));$skip(108); 

  val level =
    """------
        |--ST--
        |--oo--
        |--oo--
        |------""".stripMargin;System.out.println("""level  : String = """ + $show(level ));$skip(105); 
  val levelUnstripped =
    """------
        |--ST--
        |--oo--
        |--oo--
        |------""";System.out.println("""levelUnstripped  : java.lang.String = """ + $show(levelUnstripped ));$skip(26); 
  val v = Vector(1, 2, 3);System.out.println("""v  : scala.collection.immutable.Vector[Int] = """ + $show(v ));$skip(7); val res$3 = 
  v(1);System.out.println("""res3: Int = """ + $show(res$3));$skip(9); val res$4 = 
  v.tail;System.out.println("""res4: scala.collection.immutable.Vector[Int] = """ + $show(res$4));$skip(28); val res$5 = 
  v.indexWhere(x => x == 5);System.out.println("""res5: Int = """ + $show(res$5));$skip(16); val res$6 = 
  v.indexOf(10);System.out.println("""res6: Int = """ + $show(res$6));$skip(72); 
  val v2 = Vector(Vector('S', 'T'), Vector('o', 'o'), Vector('o', 'o'));System.out.println("""v2  : scala.collection.immutable.Vector[scala.collection.immutable.Vector[Char]] = """ + $show(v2 ));$skip(35); val res$7 = 
  v2 map (row => row.indexOf('S'));System.out.println("""res7: scala.collection.immutable.Vector[Int] = """ + $show(res$7));$skip(48); val res$8 = 

  v2.indexWhere(row => row.indexOf('S') != -1);System.out.println("""res8: Int = """ + $show(res$8));$skip(36); val res$9 = 
  List((1,2),(2,3)) map (x => x._2);System.out.println("""res9: List[Int] = """ + $show(res$9));$skip(36); 
  val res = List(1,2) zip List(3,4);System.out.println("""res  : List[(Int, Int)] = """ + $show(res ));$skip(15); val res$10 = 
  res.unzip._1;System.out.println("""res10: List[Int] = """ + $show(res$10))}
 }