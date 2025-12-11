package ma.youhad.singleton_Builder_prototype_patterns;

import ma.youhad.singleton_Builder_prototype_patterns.model.AccountStatus;
import ma.youhad.singleton_Builder_prototype_patterns.model.AccountType;
import ma.youhad.singleton_Builder_prototype_patterns.model.BankAccount;

public class PrototypePatternDemo {
    public static void main(String[] args) {

        System.out.println("******** Prototype Pattern Demo ********");
        BankAccount account_1 = new BankAccount();
        account_1.setAccountId(1L);
        account_1.setBalance(1000);
        account_1.setCurrency("MAD");
        account_1.setType(AccountType.SAVING_ACCOUNT);
        account_1.setStatus(AccountStatus.ACTIVATED);

        System.out.println("------ Clone Using Getter and Setter ------");
        BankAccount account_2 = account_1.clone();
        account_2.setAccountId(account_1.getAccountId());
        account_2.setBalance(account_1.getBalance());
        account_2.setCurrency(account_1.getCurrency());
        account_2.setType(account_1.getType());
        account_2.setStatus(account_1.getStatus());

        System.out.println("Account 1 : "+ account_1);
        System.out.println("Account 2 : "+ account_2);


        System.out.println("------ Clone Cloneable Interface ------");
        BankAccount account_3 = account_1.clone();
        System.out.println("Account 1 : "+ account_1);
        System.out.println("Account 3 : "+ account_3);


    }
}
