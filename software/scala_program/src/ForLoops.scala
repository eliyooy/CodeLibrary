/**
  * Created by eliyahudorsky on 2/20/17.
  */

var result = ""

for (a <- 1 to 100) {
  result = result + a
  if (a < 100) result = result + ","
}

println(result)

val xs = List(1,2,3,4)
var results = List[Int]()

for (a <- xs) {
  results = results :+ (a + 1)
}

println(results)

val listed = List(1,2,3,4)
val resultant = for (a <- listed) yield (a + 1)
println(resultant)