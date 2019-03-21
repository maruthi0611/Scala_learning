 case class AccountInfo(val initialBalance: Double) {
    
   private var balance = initialBalance
    
    def deposit(amount: Double) = {
      if (amount > 0) {balance += amount}
      else balance 
      println(balance)
      }
    
    def withdraw(amount: Double) = { 
       if (0 < amount && amount <= balance) {
        balance -= amount 
        println(balance)
        } 
       else {
        println("insufficient funds")
        } 
    }
 }
 
 class CheckingAccount(initialBalance: Double) extends AccountInfo(initialBalance) {
    
    override def deposit(amount: Double) = {super.deposit(amount - 1) }
    
    override def withdraw(amount: Double) = { super.withdraw(amount + 1) }
}
 
 object teller extends App {
   
   var banker = new CheckingAccount(1000)
   banker.deposit(100)
   banker.withdraw(50)
 }
 

