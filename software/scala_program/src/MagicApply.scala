/**
  * Created by eliyahudorsky on 3/5/17.
  */

class Sample(x:Int) {
  def add(y:Int) = x + y

  def apply(y:Int) = x + y
}

object MagicApply extends App {
  val sampler = new Sample(10)
  println(sampler.add(20))
  println(sampler(20))
}