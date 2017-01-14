package com.fz;

import com.fz.mapper.MemberMapper;
import com.fz.model.Member;
import com.fz.mybatis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by Sir.Cui on 2017/1/12 11:00.
 */
public class Demo2 {
    @Test
    public void abc() {
        SqlSession s = MyBatisUtil.getSqlSession();
        MemberMapper m = s.getMapper(MemberMapper.class);
        Member mm = m.findbyId(2);
        System.out.println(mm);

        //AddressMapper am = s.getMapper(AddressMapper.class);
        //System.out.println(am.querybyId(1001));

        //查询所有
        //List<Map<String, Object>> ls = m.query();
        //System.out.println(ls.size());
        //for (Map<String, Object> map : ls) {
          //  System.out.println(map.get("m_name"));
           // System.out.println(map.get("a_ads"));
        //}

        s.commit();
        s.close();

    }

}
