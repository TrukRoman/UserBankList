package by.devincubator.userBankList.controller;

import by.devincubator.userBankList.model.User;
import by.devincubator.userBankList.service.UserService;
import by.devincubator.userBankList.service.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(urlPatterns = "/theRichestUser")
public class GetTheRichestUserController extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html; charset=UTF-8");
        List<User> users = null;
        try {
            users = userService.getRichestOfUsers();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("users", users);
        RequestDispatcher dispatcher = request.getRequestDispatcher("theRichestUser.jsp");
        dispatcher.forward(request, response);
    }
}
