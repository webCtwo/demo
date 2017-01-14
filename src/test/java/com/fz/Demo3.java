package com.fz;

import com.fz.mapper.UserMapper;
import com.fz.mybatis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by Sir.Cui on 2017/1/13 14:27.
 */
public class Demo3 {
    @Test
    public void ok(){
        SqlSession s = MyBatisUtil.getSqlSession();
        UserMapper um = s.getMapper(UserMapper.class);

        System.out.println(um.findbyId(1));
        //RoleMapper rm = s.getMapper(RoleMapper.class);
        //System.out.println(rm.byId(1));

        s.commit();
        s.close();

    }

}
