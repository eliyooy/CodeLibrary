/**
  * Created by eliyahudorsky on 3/1/17.
  */

def decide(b:Boolean, x:Any, y:Any):Any = if(b) x else y

println(decide(true, "A", "B"))
println(decide(false, 10, 20))
println(decide(true, 'a', 'b'))