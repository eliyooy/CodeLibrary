/**
  * Created by eliyahudorsky on 3/1/17.
  */

def processNumbers(b:Boolean, x:Int, y:Int = 10) = if (b) x else y

processNumbers(x = 10, y = 4, b = true)

processNumbers(true, 1)