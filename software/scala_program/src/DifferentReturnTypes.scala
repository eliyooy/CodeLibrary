/**
  * Created by eliyahudorsky on 3/1/17.
  */

def add(x:Int, y:Int) = {
  if (x > 10) (x+y).toString
  else x + y
}

// Returns Any (common ancestor)

println(add(4,10))