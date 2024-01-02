package BankTransfer;

public class Validt {
    String UserName;
    int PinCode;

    public Validt(String userName, int pinCode) {
        UserName = userName;
        PinCode = pinCode;
    }

    public String getUserName() {
        return UserName;
    }

    public int getPinCode() {
        return PinCode;
    }
}
