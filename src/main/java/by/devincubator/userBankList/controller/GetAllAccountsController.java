package by.devincubator.userBankList.controller;

import by.devincubator.userBankList.model.Account;
import by.devincubator.userBankList.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Controller
public class GetAllAccountsController {

    private AccountService accountService;

    @Autowired
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping(value = "/getAllAccounts")
    public String getAllAccounts(Map<String, Object> model) throws SQLException {
        List <Account> listAccount = null;
        listAccount = accountService.getAllAccounts();
        model.put("listAccount", listAccount);
        return "accounts";
    }
}
