package wsb.ni.banking;


public class Customer {

    private final String firsName;
    private final String lastName;

    final private BankAccount[] accounts = new BankAccount[10];

    private int idx = 0;

    public int getNumberOfAccounts() {
        return idx;
    }

    public void addAccount(BankAccount a) {
        accounts[idx++] = a;
    }

    public BankAccount getAccount(int i) {
        if (i >= getNumberOfAccounts()) {
            return null;
        }
        return accounts[i];
    }

    public Customer(String firsName, String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firsName='" + getFirsName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", number of accounts=" + getNumberOfAccounts() +
                '}';
    }
}
