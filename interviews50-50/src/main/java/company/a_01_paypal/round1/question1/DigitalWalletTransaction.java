package company.a_01_paypal.round1.question1;

public class DigitalWalletTransaction {
    public void addMoney(DigitalWallet digitalWallet, int amount) throws TransactionException {
        if(digitalWallet.getUserAccessCode() ==null){
            throw  new TransactionException("User Not Found", "USER_NOT_FOUND");
        }else if(amount <=0){
            throw   new TransactionException("Invalid Amount", "INVALID_AMOUNT");
        }else{
            digitalWallet.setWalletBalance(digitalWallet.getWalletBalance()+amount);
        }

    }
    public void payMoney(DigitalWallet digitalWallet, int amount) throws TransactionException{
        if(digitalWallet.getUserAccessCode() ==null){
            throw  new TransactionException("User Not Found", "USER_NOT_FOUND");
        }else if(digitalWallet.getWalletBalance()<amount){
            throw   new TransactionException("Insufficient Balance", "INSUFFICIENT_AMOUNT");
        }
        else if(amount <=0){
            throw   new TransactionException("Invalid Amount", "INVALID_AMOUNT");
        }else{
            digitalWallet.setWalletBalance(digitalWallet.getWalletBalance()-amount);
        }
    }
}
