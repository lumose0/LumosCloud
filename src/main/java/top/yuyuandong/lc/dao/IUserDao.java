package top.yuyuandong.lc.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.yuyuandong.lc.model.User;

/**
 * @Date: Created in ( 2020/8/28 20:13)
 * @Author: Lumos
 * @blog: yuyuandong.top
 * @Email: 321250835@qq.com
 * @Description:
 * @Modified By:
 */
@Repository("userDao")
@Mapper
public interface IUserDao {
    void saveUser(User user);
}
