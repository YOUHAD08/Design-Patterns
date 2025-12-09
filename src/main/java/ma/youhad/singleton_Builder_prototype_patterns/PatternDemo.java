package ma.youhad.singleton_Builder_prototype_patterns;

import ma.youhad.singleton_Builder_prototype_patterns.model.AccountStatus;
import ma.youhad.singleton_Builder_prototype_patterns.model.AccountType;
import ma.youhad.singleton_Builder_prototype_patterns.model.BankAccount;

public class PatternDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = Director.accountBuilder()
                .accountId(1L)
                .currency("MAD")
                .balance(500.0)
                .AccountStatus(AccountStatus.CREATED)
                .AccountType(AccountType.CURRENT_ACCOUNT)
                .build();
    }
}
