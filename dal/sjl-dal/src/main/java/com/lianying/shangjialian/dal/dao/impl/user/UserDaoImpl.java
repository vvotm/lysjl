package com.lianying.shangjialian.dal.dao.impl.user;

import com.lianying.shangjialian.dal.dao.impl.BaseDaoImpl;
import com.lianying.shangjialian.dal.dao.user.UserDao;
import com.lianying.shangjialian.dal.mapper.BaseMapper;
import com.lianying.shangjialian.dal.mapper.user.UserMapper;
import com.lianying.shangjialian.model.dataobject.user.UserDO;
import com.lianying.shangjialian.model.query.BaseQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by luowen on 2017/2/14.
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<UserDO> implements UserDao{

    @Autowired
    private UserMapper userMapper;

    @Override
    public BaseMapper<UserDO> getMapper() {
        return userMapper;
    }

    @Override
    public List<UserDO> queryByPage(BaseQuery baseQuery) {
        return userMapper.queryByPage(baseQuery);
    }

    @Override
    public Integer count(BaseQuery baseQuery) {
        return userMapper.count(baseQuery);
    }
}
