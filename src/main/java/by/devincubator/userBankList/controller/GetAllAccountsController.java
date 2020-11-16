package by.devincubator.userBankList.controller;

import by.devincubator.userBankList.model.Account;
import by.devincubator.userBankList.service.AccountService;
import by.devincubator.userBankList.service.AccountServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(urlPatterns = "/getAllAccounts")
public class GetAllAccountsController extends HttpServlet {
    private AccountService accountService = new AccountServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        List <Account> listAccount = null;
        try {
            listAccount = accountService.getAllAccounts();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        req.setAttribute("listAccount", listAccount);
        RequestDispatcher dispatcher = req.getRequestDispatcher("accounts.jsp");
        dispatcher.forward(req, resp);
    }


}
