package ma.youhad.singleton_Builder_prototype_patterns.model;

public class BankAccount implements Cloneable {
    private Long accountId;
    private double balance;
    private String currency;
    private AccountType type;
    private AccountStatus status;

    public BankAccount() {
    }


    public BankAccount(Long accountId, double balance, String currency, AccountType type, AccountStatus status) {
        this.accountId = accountId;
        this.balance = balance;
        this.currency = currency;
        this.type = type;
        this.status = status;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", Memory Address :" + "@"  + Integer.toHexString(System.identityHashCode(this)) +
                '}';
    }

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public BankAccount clone() {
        try {
            return (BankAccount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static class Builder {
        private BankAccount account = new BankAccount();
        public Builder accountId(Long accountId) {
            account.accountId = accountId;
            return this;
        }
        public Builder balance(double balance) {
            account.balance = balance;
            return this;
        }
        public Builder currency(String currency) {
            account.currency = currency;
            return this;
        }
        public Builder AccountType(AccountType type) {
            account.type = type;
            return this;
        }
        public Builder AccountStatus(AccountStatus status) {
            account.status = status;
            return this;
        }
        public BankAccount build() {
            return this.account;
        }

    }
}
