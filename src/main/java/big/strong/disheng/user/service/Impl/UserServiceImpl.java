package big.strong.disheng.user.service.Impl;

import big.strong.disheng.user.dao.UserMapper;
import big.strong.disheng.user.model.User;
import big.strong.disheng.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() { return userMapper.selectAll(); }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

}
