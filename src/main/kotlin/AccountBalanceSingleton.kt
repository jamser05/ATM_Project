import java.io.File
import java.io.IOException
import java.math.BigDecimal
import java.nio.file.Files

/*
fun saveAccountBalance() {
    With this Singleton, the accountBalance value is loaded
    from a file when the program starts, and you can update
    it as needed during program execution.

    To persist the accountBalance value between program executions, you call
    the saveAccountBalance method when you want to save the
    updated balance. You can then retrieve the balance the
    next time the program starts.
 */

object AccountBalanceSingleton {
    private val balanceFile = File("account_balance.txt")

    var accountBalance: BigDecimal = loadAccountBalance()

    private fun loadAccountBalance() : BigDecimal {
        return try {
            if(balanceFile.exists()) {
                BigDecimal(String(Files.readAllBytes(balanceFile.toPath())))
            } else {
                BigDecimal.valueOf(0)
            }
        } catch(e: IOException) {
            e.printStackTrace()
            BigDecimal.valueOf(0)
        }
    }

    fun saveAccountBalance() {
        try {
            Files.write(balanceFile.toPath(), accountBalance.toString().toByteArray())
        } catch(e: IOException) {
            e.printStackTrace()
        }
    }
}

