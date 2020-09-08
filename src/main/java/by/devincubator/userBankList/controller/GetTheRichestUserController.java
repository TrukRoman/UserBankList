package by.devincubator.userBankList.controller;

import by.devincubator.userBankList.model.User;
import by.devincubator.userBankList.service.UserService;
import by.devincubator.userBankList.service.UserServiceImpl;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

public class GetTheRichestUserController extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = response.getWriter();
        List<User> users = null;
        try {
            users = userService.getRichestOfUsers();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        writer.println(users);
    }
}
