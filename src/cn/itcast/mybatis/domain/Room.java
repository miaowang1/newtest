package cn.itcast.mybatis.domain;

public class Room {
	private String rid;

	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	private String player;
	
	
	@Override
	public String toString() {
	    return "Room [id=" + rid + ", player=" + player + "]";
	}
	
	
}
