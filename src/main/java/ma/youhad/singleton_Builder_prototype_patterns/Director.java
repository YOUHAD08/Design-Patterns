package ma.youhad.singleton_Builder_prototype_patterns;

import ma.youhad.singleton_Builder_prototype_patterns.model.BankAccount;

public class Director {
    public static BankAccount.Builder accountBuilder(){
        return new BankAccount.Builder();
    }
}
