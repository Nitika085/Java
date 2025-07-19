class Account {
    private int accNo;
    private String name;
    private String address;
    private String phoneNo;
    private int balance;

    // Default Constructor
    public Account() {}

    // Constructor 1
    public Account(int accNo, String name) {
        this.accNo = accNo;
        this.name = name;
    }

    // Constructor 2
    public Account(int accNo, String name, String address, String phoneNo) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.balance = 0;
    }

    // Getters
    public int getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public int getBalance() {
        return balance;
    }

    // Setters
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends Account {
    public SavingsAccount(int accNo, String name) {
        super(accNo, name);
    }

    public int withdraw(int amount) {
        setBalance(getBalance() - amount);
        return getBalance();
    }

    public int deposit(int amount) {
        setBalance(getBalance() + amount);
        return getBalance();
    }
}

// Subclass: LoanAccount
class LoanAccount extends Account {
    public LoanAccount(int accNo, String name) {
        super(accNo, name);
    }

    public void payEMI(long amt) {
        setBalance((int)(getBalance() - amt));
    }
}

