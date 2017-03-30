/**
  * Created by eliyahudorsky on 3/1/17.
  */

def add(x:Int, y:Int):Int = x + y

def numberStatus(a:Int) =
  if(a < 10) "Less than 10"
  else if (a > 10) "Greater than 10"
  else "It is 10!"


println(add(6,7))