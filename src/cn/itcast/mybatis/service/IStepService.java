package cn.itcast.mybatis.service;

import java.util.List;

import cn.itcast.mybatis.domain.Room;
import cn.itcast.mybatis.domain.Step;

public interface IStepService {
	public List<Step> list();
	public Step get(String id);
	public int insert(Step u);
    public int update(Step u);
	public int deleteById(String id);
	public Step getrid(String id);
	
}
