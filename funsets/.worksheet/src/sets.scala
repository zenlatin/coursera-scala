object sets {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  println("Welcome to the Scala worksheet")
  type Set = Int => Boolean;$skip(45); 
  val bound = 10;System.out.println("""bound  : Int = """ + $show(bound ));$skip(137); 

  def toString(s: Set): String = {
    val xs = for (i <- -bound to bound if contains(s, i)) yield i
    xs.mkString("{", ",", "}")
  };System.out.println("""toString: (s: Int => Boolean)String""");$skip(117); 

  /**
   * Prints the contents of a set on the console.
   */
  def printSet(s: Set) {
    println(toString(s))
  };System.out.println("""printSet: (s: Int => Boolean)Unit""");$skip(53); 
  def contains(s: Set, elem: Int): Boolean = s(elem);System.out.println("""contains: (s: Int => Boolean, elem: Int)Boolean""");$skip(47); 
  def singletonSet(elem: Int): Set = Set(elem);System.out.println("""singletonSet: (elem: Int)Int => Boolean""");$skip(79); 
  def union(s: Set, t: Set): Set = (x: Int) => contains(s, x) | contains(t, x);System.out.println("""union: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(51); 
  val u1 = union(singletonSet(1), singletonSet(2));System.out.println("""u1  : Int => Boolean = """ + $show(u1 ));$skip(51); 
  val u2 = union(singletonSet(1), singletonSet(3));System.out.println("""u2  : Int => Boolean = """ + $show(u2 ));$skip(79); 
  def diff(s: Set, t: Set): Set = (x: Int) => contains(s, x) & !contains(t, x);System.out.println("""diff: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(28); val res$0 = 
  contains(diff(u1, u2), 3);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(81); 
  def filter(s: Set, p: Int => Boolean): Set = (x: Int) => contains(s, x) & p(x);System.out.println("""filter: (s: Int => Boolean, p: Int => Boolean)Int => Boolean""");$skip(84); val res$1 = 
  contains(filter(union(singletonSet(1), singletonSet(-1)), (x: Int) => x > 0), -1);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(94); 
  def sum(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f)(a + 1, b);System.out.println("""sum: (f: Int => Int)(a: Int, b: Int)Int""");$skip(21); val res$2 = 
  sum(x => x)(0, 10);System.out.println("""res2: Int = """ + $show(res$2));$skip(96); 
  def prod(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1 else f(a) * prod(f)(a + 1, b);System.out.println("""prod: (f: Int => Int)(a: Int, b: Int)Int""");$skip(40); 
  def fact(n: Int) = prod(x => x)(1, n);System.out.println("""fact: (n: Int)Int""");$skip(10); val res$3 = 
  fact(5);System.out.println("""res3: Int = """ + $show(res$3));$skip(177); 
  def mapReduce(outer: (Int, Int) => Int, inner: Int => Int, zero: Int)(a: Int, b: Int): Int =
    if (a > b) zero else outer(inner(a), mapReduce(outer, inner, zero)(a + 1, b));System.out.println("""mapReduce: (outer: (Int, Int) => Int, inner: Int => Int, zero: Int)(a: Int, b: Int)Int""");$skip(46); val res$4 = 
  mapReduce((x, y) => x * y, x => x, 1)(1, 5);System.out.println("""res4: Int = """ + $show(res$4));$skip(273); 

  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
      println(a);
      if (a == 0) !s(0) || p(0)
      else if ((s(-a) && !p(-a)) || (s(a) && !p(a))) false
      else iter(a - 1)
    }
    iter(if (bound > 0) bound else -bound)
  };System.out.println("""forall: (s: Int => Boolean, p: Int => Boolean)Boolean""");$skip(32); val res$5 = 
  forall(u2, x => (x % 2 == 1));System.out.println("""res5: Boolean = """ + $show(res$5));$skip(403); 

  def map(s: Set, f: Int => Int): Set = {
    var mapResult: Set = x => false;
    def iter(a: Int) {
      println(a);
      if ((a == 0) && s(0)) mapResult = union(singletonSet(f(0)), mapResult)
      else if (s(a)) mapResult = union(singletonSet(f(a)), mapResult)
      else if (s(-a)) mapResult = union(singletonSet(f(-a)), mapResult)
      else iter(a - 1)
    }
    iter(bound)
    mapResult
  };System.out.println("""map: (s: Int => Boolean, f: Int => Int)Int => Boolean""");$skip(19); 
  println("hello");$skip(32); 
  printSet(map(u1, x => x + 1))}
}