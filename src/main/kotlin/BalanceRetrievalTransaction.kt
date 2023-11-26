/*
Single Responsibility Principle (SRP):
The BalanceRetrievalTransaction class adheres to the SRP by having a single responsibility,
 which is to retrieve and print the account balance.
  In the previous source code, this logic was mixed with other transaction types,violating the SRP.
 */
import AccountBalanceSingleton
import AccountBalanceSingleton.accountBalance

class BalanceRetrievalTransaction: ATMTransaction {

    override fun processTransaction() {
        printBalance()
    }

    private fun printBalance() {
        println("Current Balance: $$accountBalance")
    }
}