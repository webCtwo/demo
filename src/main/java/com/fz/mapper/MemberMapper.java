package com.fz.mapper;

import com.fz.model.Member;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/1/11.
 */
public interface MemberMapper {
 public Member byId(int id);

 public Member findbyId(int id);

 public List<Map<String,Object>> query();

 public List<Map<String,Object>> queryAll();
}
