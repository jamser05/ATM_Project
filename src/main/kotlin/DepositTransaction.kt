import AccountBalanceSingleton.accountBalance
import java.math.BigDecimal


/*
Encapsulation: By encapsulating the withDrawCash method,
 the implementation details of how withdrawals are processed are hidden within the class.
  This encapsulation reduces the chances of errors and bugs when dealing with
  withdrawal-related logic.
 */

class DepositTransaction: ATMTransaction {
    override fun processTransaction() {
        depositCash()
    }

    private fun depositCash() {
        println("Please enter the amount of cash")
        val amountDeposited = readln()
        accountBalance += amountDeposited.toBigDecimal()

        println("Total Amount inserted: $$accountBalance \nCash has been accepted")
    }
}