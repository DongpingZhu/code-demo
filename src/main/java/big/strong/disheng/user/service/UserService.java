package big.strong.disheng.user.service;

import big.strong.disheng.user.model.User;

import java.util.List;

public interface UserService {

    List<User> selectAll();

    int updateByPrimaryKeySelective(User record);

}
