package ma.youhad.singleton_Builder_prototype_patterns;

import ma.youhad.singleton_Builder_prototype_patterns.model.AccountStatus;
import ma.youhad.singleton_Builder_prototype_patterns.model.AccountType;
import ma.youhad.singleton_Builder_prototype_patterns.model.BankAccount;
import ma.youhad.singleton_Builder_prototype_patterns.repository.AccountRepository;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AccountRepositoryImpl implements AccountRepository {

    private Map<Long, BankAccount> accounts = new HashMap<>();
    private long accountId = 0;
    @Override
    public BankAccount save(BankAccount account) {
        account.setAccountId(++accountId);
        accounts.put(accountId, account);
        return account;
    }

    @Override
    public List<BankAccount> findAll() {
        return accounts.values().stream().toList();
    }

    @Override
    public Optional<BankAccount> findById(Long id) {
        BankAccount account = accounts.get(id);
        if (account == null) {
            return Optional.empty();
        }
        else return Optional.of(account);

    }

    @Override
    public List<BankAccount> Search(Predicate<BankAccount> predicate) {
        return accounts.values().stream().filter(predicate).collect(Collectors.toList());
    }

    @Override
    public BankAccount update(BankAccount account) {
        accounts.put(account.getAccountId(), account);
        return account;
    }

    @Override
    public void deleteById(Long id) {
        accounts.remove(id);
    }
    public void populate() {
        for (int i = 0; i < 10; i++) {
            BankAccount account = Director.accountBuilder()
                    .accountId(++accountId)
                    .balance(1000+ Math.random()*90000)
                    .AccountType(Math.random()>0.5?AccountType.SAVING_ACCOUNT: AccountType.CURRENT_ACCOUNT)
                    .AccountStatus(Math.random()>0.5? AccountStatus.CREATED: AccountStatus.ACTIVATED)
                    .build();
            save(account);
        }

    }
}
