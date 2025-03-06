public class Ques3{
    String accountHolder;
    int accountNumber;
    double balance;

    public Ques3(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void show(){
        System.out.println("accountHolder: "+accountHolder);
        System.out.println("accountNumber: "+accountNumber);
        System.out.println("balance: "+balance);
    }
    void deposite(int a){
        if(a<=0){
            System.out.println("invalid number you have entered");
        }
        else{
        balance=balance + a;
        System.out.println("Depositing: "+a);
        System.out.println("New balance: "+balance);
        }
    }
    void withdraw(int a){
        if(a<=0){
            System.out.println("invalid number you have entered");
        }
        else if(balance<a){
            System.out.println("you have no sufficient balance");
        }
        else{
        balance=balance - a;
        System.out.println("withdrawing: "+a);
        System.out.println("New balance: "+balance);
        }
    }

    public static void main(String[] args) {
        Ques3 obj = new Ques3("khalid",123,50000);
        obj.show();
        obj.deposite(1500);
        obj.withdraw(200000);
        obj.show();
    }
}