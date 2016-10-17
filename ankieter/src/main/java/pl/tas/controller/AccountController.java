package pl.tas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tas.model.Account;
import pl.tas.repository.AccountRepository;

/**
 * Created by Piotr Pliszko. All rights reserved.
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountRepository repo;

    @RequestMapping(method = RequestMethod.GET, value = "{Id}")
    public Account getAccountById(@PathVariable("Id") String Id) {
        return repo.findOne(Long.parseLong(Id));
    }

    // TODO JSON response class
    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public String create(@RequestBody Account account) {
        repo.save(account);
        return "Account created";
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{Id}")
    public String delete(@PathVariable("Id") String Id) {
        repo.delete(Long.parseLong(Id));
        return "Account deleted";
    }

    @RequestMapping(method = RequestMethod.PUT, value = "update/{Id}")
    public String update(@PathVariable("Id") String Id, @RequestBody Account account) {
        Account update = repo.findOne(Long.parseLong(Id));
        update.setLogin(account.getLogin());
        update.setPassword(account.getPassword());
        repo.save(update);
        return "Account updated";
    }
}
