package cn.itcast.mybatis.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.itcast.mybatis.domain.Room;
import cn.itcast.mybatis.domain.Step;

public class StepDaoImpl extends SqlSessionDaoSupport implements IStepDao{

	public int deleteById(String id) {
			return this.getSqlSession().delete("cn.itcast.mybatis.domain.Step.delete",id);
		}

		public Step get(String id) {
			return (Step) this.getSqlSession().selectOne("cn.itcast.mybatis.domain.Step.get", id);
		}
		public int insert(Step u) {
			return this.getSqlSession().insert("cn.itcast.mybatis.domain.Step.create", u);
		}
		public List<Step> list() {
			return this.getSqlSession().selectList("cn.itcast.mybatis.domain.Step.listAll");
		}
		public int update(Step u) {
			return this.getSqlSession().update("cn.itcast.mybatis.domain.Step.update",u);
		}
		public Step getrid(String id)
		{
			return (Step) this.getSqlSession().selectOne("cn.itcast.mybatis.domain.Step.getrid", id);
		}
}
