package cn.itcast.mybatis.dao;

import cn.itcast.mybatis.domain.Room;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class RoomDaoImpl extends SqlSessionDaoSupport implements IRoomDao{
	public Room get(String id) {
		return (Room) this.getSqlSession().selectOne("cn.itcast.mybatis.domain.Room.getrid", id);
	}
}
