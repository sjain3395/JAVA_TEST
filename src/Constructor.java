class Account
{
    String accNo;
    String accName;
    String accType;
    int accBalance;

    public void setAccountDetails(String acc_No, String acc_Name, String acc_Tpye, int acc_Balance)
    {
        accNo = acc_No;
        accName = acc_Name;
        accType = acc_Tpye;
        accBalance = acc_Balance;
    }

    public void getAccountDetails()
    {
        System.out.println("Account Details");
        System.out.println("----------------");
        System.out.println("Account Number : " + accNo);
        System.out.println("Account Name : " +accName);
        System.out.println("Account Type : " +accType);
        System.out.println("Account Balance : " +accBalance);
    }

}
class Constructor{
    public static void main(String [] args)
    {
        Account acc = new Account();
        acc.setAccountDetails("ABC123" ,"RAHUL","SAVING",250000);
        acc.getAccountDetails();
        System.out.println();
        acc.setAccountDetails("AAB124" , "NILESH","CURRENT",350000);
        acc.getAccountDetails();
        System.out.println();
        acc.setAccountDetails("ABC154", "NAMAN","SAVING",54000);
        System.out.println();
    }
}
