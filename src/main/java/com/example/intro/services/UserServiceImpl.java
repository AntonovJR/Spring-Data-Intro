package com.example.intro.services;

import com.example.intro.models.Account;
import com.example.intro.models.User;
import com.example.intro.repositories.AccountRepository;
import com.example.intro.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final AccountRepository accountRepository;

    public UserServiceImpl(UserRepository userRepository, AccountRepository accountRepository) {
        this.userRepository = userRepository;
        this.accountRepository = accountRepository;
    }

    @Override
    public void register(String username, int age, BigDecimal initialAmount) {

        var user = new User();
        user.setUsername(username);
        user.setAge(age);
        this.userRepository.save(user);

        var firstAccount = new Account();
        firstAccount.setBalance(initialAmount);
        firstAccount.setUser(user);
        this.accountRepository.save(firstAccount);


    }
}
