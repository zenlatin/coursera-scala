package streams

object wc {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def from(n: Int): Stream[Int] = n #:: from(n + 1)
                                                  //> from: (n: Int)Stream[Int]
  val nats = from(0)                              //> nats  : Stream[Int] = Stream(0, ?)
  def sieve(s: Stream[Int]): Stream[Int] =
    s.head #:: sieve(s.tail filter (_ % s.head != 0))
                                                  //> sieve: (s: Stream[Int])Stream[Int]

  val primes = sieve(from(2))                     //> primes  : Stream[Int] = Stream(2, ?)
  primes.take(100).toList                         //> res0: List[Int] = List(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 4
                                                  //| 7, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131
                                                  //| , 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211,
                                                  //|  223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 
                                                  //| 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 3
                                                  //| 97, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 48
                                                  //| 7, 491, 499, 503, 509, 521, 523, 541)
  primes.take(1000).toList                        //> res1: List[Int] = List(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 4
                                                  //| 7, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131
                                                  //| , 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211,
                                                  //|  223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 
                                                  //| 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 3
                                                  //| 97, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 48
                                                  //| 7, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593
                                                  //| , 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677,
                                                  //|  683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 
                                                  //| 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 8
                                                  //| 87, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997, 10
                                                  //| 09, 1013, 1019, 1021, 1031, 1033, 1039, 1049, 1051, 1061, 1063, 1069, 1087, 
                                                  //| 1091, 1093, 1097, 1103, 
                                                  //| Output exceeds cutoff limit.
  def sqrtStream(x: Double): Stream[Double] = {
    def improve(guess: Double) = (guess + x / guess) / 2
    lazy val guesses: Stream[Double] = 1 #:: (guesses map improve)
    guesses
  }                                               //> sqrtStream: (x: Double)Stream[Double]
  sqrtStream(4).take(100).toList                  //> res2: List[Double] = List(1.0, 2.5, 2.05, 2.000609756097561, 2.0000000929222
                                                  //| 947, 2.000000000000002, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.
                                                  //| 0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0
                                                  //| , 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0,
                                                  //|  2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 
                                                  //| 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2
                                                  //| .0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.
                                                  //| 0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0)

  val capacity: Vector[Int] = Vector(4, 9)        //> capacity  : Vector[Int] = Vector(4, 9)
  val initialState = capacity map (x => 0)        //> initialState  : scala.collection.immutable.Vector[Int] = Vector(0, 0)

  val level =
    """------
        |--ST--
        |--oo--
        |--oo--
        |------""".stripMargin                    //> level  : String = ------
                                                  //| --ST--
                                                  //| --oo--
                                                  //| --oo--
                                                  //| ------
  val levelUnstripped =
    """------
        |--ST--
        |--oo--
        |--oo--
        |------"""                                //> levelUnstripped  : java.lang.String = ------
                                                  //|         |--ST--
                                                  //|         |--oo--
                                                  //|         |--oo--
                                                  //|         |------
  val v = Vector(1, 2, 3)                         //> v  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3)
  v(1)                                            //> res3: Int = 2
  v.tail                                          //> res4: scala.collection.immutable.Vector[Int] = Vector(2, 3)
  v.indexWhere(x => x == 5)                       //> res5: Int = -1
  v.indexOf(10)                                   //> res6: Int = -1
  val v2 = Vector(Vector('S', 'T'), Vector('o', 'o'), Vector('o', 'o'))
                                                  //> v2  : scala.collection.immutable.Vector[scala.collection.immutable.Vector[C
                                                  //| har]] = Vector(Vector(S, T), Vector(o, o), Vector(o, o))
  v2 map (row => row.indexOf('S'))                //> res7: scala.collection.immutable.Vector[Int] = Vector(0, -1, -1)

  v2.indexWhere(row => row.indexOf('S') != -1)    //> res8: Int = 0
}