public class Account{
    private int AccountBalance;

    public Account(int AccountBalance){
        this.AccountBalance = AccountBalance;
        if(AccountBalance >= 0){
            this.AccountBalance = AccountBalance;
        }
        else{
            this.AccountBalance = 0;
            System.out.println("Initial balance is invalid");
        }
    }

        public int credit(int amount){
            return this.AccountBalance += amount;
        }

        public int debit(int amount){
            if (amount > AccountBalance){
                System.out.println("Debit amount exceeded account balance");
                return this.AccountBalance = AccountBalance;
            }
            else{
                return this.AccountBalance -= amount;
            }
        }

        public int getBalance(){
            return this.AccountBalance;
        }

        public static void main (String[] args){
            Account acc = new Account(80000);
            Account acc2 = new Account(60000);

            System.out.println("obj 1 "+ acc.credit(5000) + " " + acc.debit(20000000));
            System.out.println("obj 2 " + acc2.credit(3000) + " " + acc2.debit(6000));
        }
}