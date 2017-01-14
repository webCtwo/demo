package com.fz;

import com.fz.mapper.StudentMapper;
import com.fz.model.Student;
import com.fz.mybatis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/1/11.
 */
public class Demo {
    @Test
    public void abc(){
       // System.out.println("ok");
        SqlSession s = MyBatisUtil.getSqlSession();
        StudentMapper sm = s.getMapper(StudentMapper.class);
        Student stu  = new Student();
        //System.out.println(sm.insert("周三","北京"));

        //List<Student> ls = sm.query();
        //for (Student ss:ls){
         //   System.out.println(ss.getName()+" "+ss.getAddress());
        //}
        //查找姓名
        //List<String> li = sm.queryNames();
        //for (String ss:li){
          //  System.out.println(ss);
        //}
        List<Map<String,Object>> lm = sm.queryName("%北京%");
        for (Map<String,Object> map:lm){
            System.out.println(map.get("name"));
            System.out.print(map.get("address"));
        }
        s.commit();
        s.close();
    }
}
