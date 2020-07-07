package com.javaex.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GuestVo;

@Repository
public class GuestDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<GuestVo> getList() {
		List<GuestVo> personList = new ArrayList<GuestVo>();

		personList = sqlSession.selectList("guestbook.getList");
		return personList;
	}
	
	public int addList(GuestVo gVo) {
		
		int count = sqlSession.insert("guestbook.insert",gVo);
		return count;
	}
	
	public int delete(int no, String inputNum) {

		Map<String, Object> delMap = new HashMap<String, Object>();
		delMap.put("no", no);
		delMap.put("password", inputNum);
		
		int count = sqlSession.delete("guestbook.delete",delMap);

		return count;
	}

}
