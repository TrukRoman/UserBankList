package by.devincubator.userBankList.controller;

import by.devincubator.userBankList.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.sql.SQLException;
import java.util.Map;

@Controller
public class GetSumAccountsController {

    private AccountService accountService;

    @Autowired
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping(value = "/getSumAccount")
    public String getSumAccount(Map<String, Object> model) throws SQLException {
        int sum = accountService.getSumAccounts();
        model.put("sum", sum);
        return "sumOfaccounts";
    }
}
