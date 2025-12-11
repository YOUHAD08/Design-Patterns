package ma.youhad.singleton_Builder_prototype_patterns;

import ma.youhad.singleton_Builder_prototype_patterns.model.AccountStatus;
import ma.youhad.singleton_Builder_prototype_patterns.model.AccountType;
import ma.youhad.singleton_Builder_prototype_patterns.model.BankAccount;
import ma.youhad.singleton_Builder_prototype_patterns.model.Customer;

public class PrototypePatternDemo {
    public static void main(String[] args) {

        System.out.println("******** Prototype Pattern Demo ********");
        BankAccount account_1 = new BankAccount();
        account_1.setAccountId(1L);
        account_1.setBalance(1000);
        account_1.setCurrency("MAD");
        account_1.setType(AccountType.SAVING_ACCOUNT);
        account_1.setStatus(AccountStatus.ACTIVATED);
        account_1.setCustomer(new Customer(1L,"null","null"));

        System.out.println("------ Clone Using Getter and Setter ------");
        BankAccount account_2 = account_1.clone();
        account_2.setAccountId(account_1.getAccountId());
        account_2.setBalance(account_1.getBalance());
        account_2.setCurrency(account_1.getCurrency());
        account_2.setType(account_1.getType());
        account_2.setStatus(account_1.getStatus());
        account_2.setCustomer(new Customer(1L,"null","null"));

        System.out.println("Account 1 : "+ account_1);
        System.out.println("Account 2 : "+ account_2);


        System.out.println("------ Clone Using Cloneable Interface ------");
        BankAccount account_3 = account_1.clone();
        System.out.println("Account 1 : "+ account_1);
        System.out.println("Account 3 : "+ account_3);

        System.out.println("------ Cloning with Composition ------");
        BankAccount account_4 = new BankAccount();
        account_4.setAccountId(1L);
        account_4.setBalance(1000);
        account_4.setCurrency("MAD");
        account_4.setType(AccountType.SAVING_ACCOUNT);
        account_4.setStatus(AccountStatus.ACTIVATED);

        System.out.println("------ Before Modification  ------");
        account_4.setCustomer(new Customer(1L,"Youhad","youhad@gmail.com"));
        BankAccount account_5 = account_4.clone();
        System.out.println("Account 4 : "+ account_4);
        System.out.println("Account 5 :" + account_5);

        System.out.println("------ after Modification  ------");
        account_4.setCustomer(new Customer(1L,"Ayoub","ayoub@gmail.com"));
        System.out.println("Account 4 : "+ account_4);
        System.out.println("Account 5 :" + account_5);



    }
}
