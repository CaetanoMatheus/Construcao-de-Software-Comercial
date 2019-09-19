public class CheckingAccount {

      private double balance;

      public CheckingAccount() {

      }

      public CheckingAccount(double balance) {
            this.balance = balance;
      }

      public boolean deposit(double amount) {
            if (amount <= 0) return false;
            _increaseBalance(amount);
            return true;
      }

      public double withdrawal(double amount){
            if (this.balance < 0 || this.balance < amount) return -1;
            _decreaseBalance(amount);
            return amount - _tax(amount);
      }

      private void _increaseBalance(double amount) {
            this.balance += amount;
      }

      private void _decreaseBalance(double amount) {
            this.balance -= amount;
      }

      private double _tax(double amount) {
            return 0.5 * amount / 100;
      }

      public double getBalance() {
            return this.balance;
      }
}