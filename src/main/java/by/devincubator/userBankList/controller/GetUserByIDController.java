package by.devincubator.userBankList.controller;

import by.devincubator.userBankList.model.User;
import by.devincubator.userBankList.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;

@Controller
public class GetUserByIDController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/getUserByID")
    public String getUserByID(@RequestParam("user_id") int id, Model model) throws SQLException {
        User user = userService.getById(id);
        model.addAttribute("user", user);
        return "getUserById";
    }
}
