/**
  * Created by eliyahudorsky on 3/1/17.
  */
import scala.annotation.tailrec

@tailrec
def factorial(n:BigInt):BigInt = {
  if (n == 0 || n == 1) 1
  else n * factorial(n - 1)
}