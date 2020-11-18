package by.devincubator.userBankList.controller;

import by.devincubator.userBankList.model.User;
import by.devincubator.userBankList.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLException;
import java.util.List;

@Controller
public class GetTheRichestUserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getRichestUser")
    public String getRichestUser(Model model) throws SQLException {
        List<User> richestUser = userService.getRichestOfUsers();
        model.addAttribute("users", richestUser);
        return "getRichestUser";
    }
}
