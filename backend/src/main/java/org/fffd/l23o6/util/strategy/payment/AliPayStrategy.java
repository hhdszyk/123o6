package org.fffd.l23o6.util.strategy.payment;

public class AliPayStrategy extends PaymentStrategy{

    public static final AliPayStrategy INSTANCE = new AliPayStrategy();

    public boolean pay(double price){
        //扣费
        boolean success = true;
        if(success){
            PaymentLogger.INSTANCE.logPayment(price);
            return true;
        }else{
            String errorMessage = "";
            PaymentLogger.INSTANCE.logPaymentFailure(price,errorMessage);
            return false;
        }
    }

    public boolean refund(double money){
        //refund
        boolean success = true;
        if(success){
            return true;
        }else{
            return false;
        }
    }
}
