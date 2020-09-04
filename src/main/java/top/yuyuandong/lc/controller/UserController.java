package top.yuyuandong.lc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.yuyuandong.lc.model.User;
import top.yuyuandong.lc.service.IUserService;

/**
 * @Date: Created in ( 2020/8/28 20:18)
 * @Author: Lumos
 * @blog: yuyuandong.top
 * @Email: 321250835@qq.com
 * @Description:
 * @Modified By:
 */
@Controller("userController")
@RequestMapping("/admin")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/regisregisterUser")
    @ResponseBody
    public String registerUser(User user){
        System.out.println("userService");
        userService.saveUser(user);
        return "success";
    }

    @RequestMapping("/test")
    public String test1(){
        return "success";
    }

}
