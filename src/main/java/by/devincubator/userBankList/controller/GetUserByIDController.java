package by.devincubator.userBankList.controller;

import by.devincubator.userBankList.model.User;
import by.devincubator.userBankList.service.UserService;
import by.devincubator.userBankList.service.UserServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/getUserByID")
public class GetUserByIDController extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        User user = null;
        int id = Integer.parseInt(req.getParameter("user_id"));
        try {
            user = userService.getById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        writer.println(user);
    }
}
