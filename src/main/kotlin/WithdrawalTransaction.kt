import AccountBalanceSingleton.accountBalance

/*
Encapsulation: By encapsulating the withDrawCash method,
 the implementation details of how withdrawals are processed are hidden within the class.
  This encapsulation reduces the chances of errors and bugs when dealing with
  withdrawal-related logic.
 */

class WithdrawalTransaction: ATMTransaction {
    override fun processTransaction() {
        withDrawCash()
    }

    private fun withDrawCash() {
        println("Select Amount")
        println("$10, $20\n$30, $40\nother")

        val amountWithdraw = readln().toBigDecimal()
        accountBalance -= amountWithdraw
        println("Take your cash: $${Math.abs(accountBalance.toInt())}")
    }
}