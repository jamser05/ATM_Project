import AccountBalanceSingleton.accountBalance
import java.lang.Math.abs
import java.math.BigDecimal

enum class TransactionOptions {
    BALANCE,
    WITHDRAWAL,
    DEPOSIT
}

fun main2() {
    welcomeClient()
    transactionProcess()
}

private fun transactionProcess() {
    when(readln().uppercase()) {
        TransactionOptions.DEPOSIT.toString() -> {
            println("Please enter the amount of cash")
            depositCash()
        }
        TransactionOptions.WITHDRAWAL.toString() -> {
            println("Select Amount")
            withDrawCash()
        }
        TransactionOptions.BALANCE.toString() -> {
            println("Current Balance: $$accountBalance")
        }

    }
}

private fun depositCash() {
    val amountDeposited = readln()

    accountBalance += amountDeposited.toBigDecimal()
    println("Total Amount inserted: $$accountBalance \nCash has been accepted")
}

private fun withDrawCash() {
    println("$10, $20\n$30, $40\nother")

    val amountWithdraw = readln().toBigDecimal()
    accountBalance -= amountWithdraw
    println("Take your cash: $${abs(accountBalance.toInt())}")
}

private fun welcomeClient() {
    println("Welcome")
    selectionTransaction()
}

private fun selectionTransaction() {
    println("Please select a transaction: \n1)Withdrawal\n2)Deposit\n3)Balance")
}