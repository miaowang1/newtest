package cn.itcast.mybatis.dao;

import java.util.List;

import cn.itcast.mybatis.domain.Room;
import cn.itcast.mybatis.domain.Step;

public interface IStepDao {
	public List<Step> list();
	public Step get(String id);
	public int insert(Step u);
	public int update(Step u);
	int deleteById(String id);
	public Step getrid(String id);
}
