interface UPIPayment{
    void upiTransfer();
}
interface CreditCardPayment{
    void cardTrannsfer();
}
class paymentGateway implements UPIPayment,CreditCardPayment{
    public void upiTransfer(){
        System.out.println("UPI payment successfull");
    }
    public void cardTrannsfer(){
        System.out.println("Credit card paymennt successfuyll");
    }
}
public class Ques2{
    public static void main(String[] args) {
        paymentGateway p =new paymentGateway();
        p.upiTransfer();
        p.cardTrannsfer();
    }
}