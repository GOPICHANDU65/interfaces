package BankTransfer;

public class Transfer {
    String ToAccount;
    int AccountNo;

    public Transfer(String toAccount, int accountNo) {
        ToAccount = toAccount;
        AccountNo = accountNo;
    }

    public String getToAccount() {
        return ToAccount;
    }

    public int getAccountNo() {
        return AccountNo;
    }
}