/**
  * Created by eliyahudorsky on 3/1/17.
  */

def add(x:Int, y:Int) = x + y

def subtract(x:AnyVal, y:AnyVal) = x.asInstanceOf[Int] - y.asInstanceOf[Int]

println(subtract(3,2))