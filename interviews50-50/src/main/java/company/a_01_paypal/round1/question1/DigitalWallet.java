package company.a_01_paypal.round1.question1;

public class DigitalWallet {
    private String walletId;
    private String userName;
    private String userAccessCode;

    private int walletBalance;

    public String getUsername() {
        return userName;
    }

    public String getUserAccessCode() {
        return userAccessCode;
    }

    public int getWalletBalance() {
        return walletBalance;
    }

    public DigitalWallet setWalletBalance(int walletBalance) {
        this.walletBalance = walletBalance;
        return this;
    }

    public String getWalletId() {
        return walletId;
    }

    public DigitalWallet(String walletId, String userName){
        this.walletId = walletId;
        this.userName = userName;
    }
    public DigitalWallet(String walletId, String userName, String userAccessCode){
        this(walletId,userName);
        this.userAccessCode = userAccessCode;
    }

}
