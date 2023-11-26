import java.math.BigDecimal

class ATMachine {
    fun start() {
        welcomeClient()
        processTransaction()
        AccountBalanceSingleton.saveAccountBalance()
    }

    // Since processTransaction will not be called outside of this class we can use the keyword
    // private
    // inside will will instantiate the ATMtransactionFacade object
    // through that we will use the reference to the object to call processTransaction
    // Reads a line of input from the standard input stream, take from the user
    private fun processTransaction() {
        val atmFacade = ATMTransactionFacade()
        atmFacade.processTransaction(readln().uppercase())
    }

    // Beneath we will have the weclomeCLient Function and will also use the keyword private
    // as we will not call this function, outside  this class
    private fun welcomeClient() {
        println("Welcome2")
        println("Please select a transaction: \n1)Withdrawal\n2)Deposit\n3)Balance")
    }
}