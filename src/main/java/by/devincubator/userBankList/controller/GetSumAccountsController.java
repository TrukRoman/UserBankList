package by.devincubator.userBankList.controller;

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

@WebServlet(urlPatterns = "/getSumAccount")
public class GetSumAccountsController extends HttpServlet {
    private AccountService accountService = new AccountServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html; charset=UTF-8");
        int sum = 0;
        try {
            sum = accountService.getSumAccounts();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("sum", sum);
        RequestDispatcher dispatcher = request.getRequestDispatcher("sumOfaccounts.jsp");
        dispatcher.forward(request, response);
    }
}
