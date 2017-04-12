package cn.itcast.mybatis.service;

import cn.itcast.mybatis.dao.IRoomDao;

import cn.itcast.mybatis.domain.Room;

public class RoomServiceImpl implements IRoomService {
	private IRoomDao roomDao;
	public void setRoomDao(IRoomDao roomDao) {
		this.roomDao = roomDao;
	}
	public Room get(String id) {
		return roomDao.get(id);
	}
}
