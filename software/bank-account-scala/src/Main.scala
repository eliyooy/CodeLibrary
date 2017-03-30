import java.io.Console
import java.nio.file.{Files, Path, Paths}

/**
  * Created by eliyahudorsky on 3/9/17.
  */

object BankAccountRunner extends App {
  val menuPrompt = "Please enter in a command (Deposit, Withdraw, Balance, Exit) :"
  val console = new Console()
  val account = new Account(Paths.get("./log.html"))

  def Menu(hasExited: Boolean, input: String) {
    input match {
      case "deposit" => {
        println("Please enter an amount to deposit:")

      }
      case "balance" => {
        account.determineBalance(List(1,2,3,4))
      }
    }
  }
}


class Account(val accountPath: Path) {

  val determineBalance = (transactions:List[Double]) => transactions.sum

  val accountDonations = loadAccountDonations()

  val accountTransactions = loadAccountTransactions()

  def loadAccountDonations():List[Double] = {
    try {
      val reader = Files.newBufferedReader(accountPath)

      val htmlAccountContent = new StringBuilder

      for (x:String <- reader.lines()) {
        htmlAccountContent.append(x)
      }
    }
  }






}
