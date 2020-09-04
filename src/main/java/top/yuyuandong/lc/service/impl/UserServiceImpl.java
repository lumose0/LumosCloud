package top.yuyuandong.lc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.yuyuandong.lc.dao.IUserDao;
import top.yuyuandong.lc.model.User;
import top.yuyuandong.lc.service.IUserService;

/**
 * @Date: Created in ( 2020/8/28 20:16)
 * @Author: Lumos
 * @blog: yuyuandong.top
 * @Email: 321250835@qq.com
 * @Description:
 * @Modified By:
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
}
