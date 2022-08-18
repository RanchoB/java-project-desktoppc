package day5_Abstraction;

public class BankApp<balanceTransfer> {

    public static void main(String[] args) {
        BankAccount sitaAccount = new BankAccount();
        sitaAccount.setBankAccountNumber("976464976467");
        sitaAccount.setAccountHolder("Sita");
        sitaAccount.setAccountType("Saving");
        sitaAccount.setMobileNumber("9811115555");
        sitaAccount.setAccountBalance(40000);

        /*
        System.out.println(sitaAccount.getAccountHolder());
        System.out.println(sitaAccount.getAccountType());
        System.out.println(sitaAccount.getMobileNumber());
        System.out.println(sitaAccount.getAccountBalance());
        */


        BankAccount gitaAccount = new BankAccount();
        gitaAccount.setBankAccountNumber("11199992223554");
        gitaAccount.setAccountHolder("Gita");
        gitaAccount.setAccountType("Checking");
        gitaAccount.setMobileNumber("9822200000");
        gitaAccount.setAccountBalance(10000);


        BankAccount ramAccount = new BankAccount();
        ramAccount.setAccountBalance(80000);


        BankAccount samAccount = new BankAccount();
        samAccount.setAccountBalance(55000);


        /*
        System.out.println(gitaAccount.getAccountHolder());
        System.out.println(gitaAccount.getAccountType());
        System.out.println(gitaAccount.getMobileNumber());
        System.out.println(gitaAccount.getAccountBalance());
        */


        BankAccount testAccount = new BankAccount();
        testAccount.balanceTransfer(ramAccount, samAccount, 5000);

        //double sitaFinalBalance = sitaAccount.getAccountBalance() - 5000;
        //double gitaFinalBalance = gitaAccount.getAccountBalance() + 5000;

        System.out.println(ramAccount.getAccountBalance());
        System.out.println(samAccount.getAccountBalance());
    }



}
