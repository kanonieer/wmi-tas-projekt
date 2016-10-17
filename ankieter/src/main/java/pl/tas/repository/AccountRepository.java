package pl.tas.repository;

import org.springframework.data.repository.CrudRepository;
import pl.tas.model.Account;

/**
 * Created by Piotr Pliszko. All rights reserved.
 */
public interface AccountRepository extends CrudRepository<Account, Long> {
    public Account getAccountById(String Id);
}
