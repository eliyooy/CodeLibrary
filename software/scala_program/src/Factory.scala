/**
  * Created by eliyahudorsky on 3/3/17.
  */
class Factory(val location:String, val factoryType:Char, val numWorkers:Int) {
      require(numWorkers > 0, "The number of workers in the factory must be greater than 0.")

      val workersDistributed:Boolean = false
      var workerRepository:Array[Employee] = new Array[Employee](numWorkers)

      def this(location:String, factoryType:Char) = this(location, factoryType, 1)

      def workerDistribution():Int = { for (a <- 1 to numWorkers) {
                                      workerRepository(a) = new Employee("Sample", "Sample")
                                      }

                                      workerRepository.length }

      def isWorkersDistributed:Boolean = if (workerRepository.length > 1) true
                                          else false



}


