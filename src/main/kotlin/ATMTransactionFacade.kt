// Creating a class such as ATMTransactionFacade improves

// Improved Separation of Concerns:
//class encapsulates the responsibility of coordinating ATM transactions.
// It separates the concerns of transaction initiation from the actual transaction processing.
// This separation makes your code more organized and easier to maintain.

//Flexibility and Maintainability:
//If the underlying implementation of ATM transactions changes or if you need to add
// new types of transactions
// in the future, you can make these modifications within the ATMTransactionFacade.
// This encapsulation ensures that changes can be made in one place, reducing the risk
// of introducing bugs and making maintenance easier.

class ATMTransactionFacade() {
    lateinit var depositTransaction: DepositTransaction
    lateinit var withdrawalTransaction: WithdrawalTransaction
    lateinit var balanceRetrieval: BalanceRetrievalTransaction

    init {
        depositTransaction = DepositTransaction()
        withdrawalTransaction = WithdrawalTransaction()
        balanceRetrieval = BalanceRetrievalTransaction()
    }

    enum class TransactionOptions {
        BALANCE,
        WITHDRAWAL,
        DEPOSIT
    }

    fun processTransaction(transactionOptions: String) {
        when(transactionOptions) {
            TransactionOptions.DEPOSIT.toString() -> {
                depositTransaction.processTransaction()
            }
            TransactionOptions.WITHDRAWAL.toString() -> {
                withdrawalTransaction.processTransaction()
            }
            TransactionOptions.BALANCE.toString() -> {
                balanceRetrieval.processTransaction()
            }
        }
    }

}