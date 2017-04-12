package cn.itcast.mybatis.service;

import java.util.List;

import cn.itcast.mybatis.dao.IStepDao;
import cn.itcast.mybatis.domain.Room;
import cn.itcast.mybatis.domain.Step;

public class StepServiceImpl implements IStepService{
	private IStepDao stepDao;
	public void setStepDao(IStepDao stepDao) {
		this.stepDao = stepDao;
	}
	public Step get(String id) {
		return stepDao.get(id);
	}
	public int insert(Step u) {
		return stepDao.insert(u);
	}
	public List<Step> list() {
		return stepDao.list();
	}
	public int update(Step u) {
		return stepDao.update(u);
	}
	public int deleteById(String id) {
		return stepDao.deleteById(id);				 
	}
	public Step getrid(String id)
	{
		return stepDao.getrid(id);	
	}
	
}
