package ma.youhad.singleton_Builder_prototype_patterns;

import ma.youhad.singleton_Builder_prototype_patterns.model.AccountStatus;
import ma.youhad.singleton_Builder_prototype_patterns.model.AccountType;
import ma.youhad.singleton_Builder_prototype_patterns.model.BankAccount;
import ma.youhad.singleton_Builder_prototype_patterns.repository.AccountRepository;
import ma.youhad.singleton_Builder_prototype_patterns.util.JSONSerializer;

import java.util.List;

public class PatternDemo {
    public static void main(String[] args) {

        System.out.println("------ Builder Design Pattern --------");

        System.out.println("***** Display All Accounts *****");
        JSONSerializer<BankAccount> bankAccountJSONSerializer = new JSONSerializer<>();
       //   AccountRepositoryImpl accountRepository = new AccountRepositoryImpl();
        System.out.println("------ Singleton Design Pattern --------");
        AccountRepositoryImpl accountRepository = AccountRepositoryImpl.getInstance();
        accountRepository.populate();
        List<BankAccount> accounts = accountRepository.findAll();
        accounts.stream().map(bankAccountJSONSerializer::toJson).forEach(System.out::println);

        System.out.println("***** Display Account By Id *****");
        accountRepository.findById(1L).ifPresent(account -> System.out.println(bankAccountJSONSerializer.toJson(account)));

        System.out.println("***** Display Account with Predicate ******");
//        List<BankAccount> bankAccounts = accountRepository.Search(new Predicate<BankAccount>() {
//            @Override
//            public boolean test(BankAccount bankAccount) {
//                return bankAccount.getType().equals(AccountType.CURRENT_ACCOUNT);
//            }
//        });
        List<BankAccount> bankAccounts = accountRepository.Search(
                bankAccount -> (
                        bankAccount.getType().equals(AccountType.CURRENT_ACCOUNT) &&
                        (bankAccount.getStatus().equals(AccountStatus.ACTIVATED))));
        bankAccounts.stream().map(bankAccountJSONSerializer::toJson).forEach(System.out::println);

    }
}
