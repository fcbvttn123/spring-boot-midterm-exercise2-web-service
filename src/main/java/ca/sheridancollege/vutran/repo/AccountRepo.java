package ca.sheridancollege.vutran.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.vutran.bean.Account;

public interface AccountRepo extends JpaRepository<Account, Long> {

}
