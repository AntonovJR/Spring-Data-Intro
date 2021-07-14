package com.example.intro.repositories;

import com.example.intro.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository extends JpaRepository<Account, Long> {


}
