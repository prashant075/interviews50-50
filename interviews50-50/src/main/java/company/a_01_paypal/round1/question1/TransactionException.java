package company.a_01_paypal.round1.question1;

public class TransactionException extends Exception {
    String errorCode;
    String errorMessage;
    TransactionException(String errorMessage,String errorCode){
        super(errorMessage);
        this.errorCode = errorCode;

    }
    public  String getErrorCode(){
        return errorCode;
    }
}
