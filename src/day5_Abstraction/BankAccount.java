package day5_Abstraction;

public class BankAccount {

        private String bankAccountNumber;
        private String accountHolder;
        private String accountType;
        private double accountBalance;
        private String mobileNumber;
        private String socialSecurityNumber;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void balanceTransfer(BankAccount fromAccount, BankAccount toAccount, int balance){
        double fromFinalBalance = fromAccount.getAccountBalance() - balance;
        double toFinalBalance = toAccount.getAccountBalance() + balance;

        fromAccount.setAccountBalance(fromFinalBalance);
        toAccount.setAccountBalance(toFinalBalance);
    }
}
