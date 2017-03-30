/**
  * Created by eliyahudorsky on 2/13/17.
  */

class Employee(val firstName:String, val lastName:String) {
  require(firstName.nonEmpty, "First Name cannot be empty")
  require(lastName.nonEmpty, "Last Name cannot be empty")

  def copy(firstName:String, lastName:String) = if(firstName.toCharArray[1] = 'A')
                                                new Employee(firstName, lastName)
                                                else new Employee(firstName, lastName)
}

class Department(name:String)

class Manager(firstName:String, lastName:String, department:Department) extends Employee(firstName, lastName) {

}