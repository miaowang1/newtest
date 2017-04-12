package cn.itcast.mybatis.domain;

public class Step {
private String num;
private String cla;
private String id; 
private Room room;

public Room getRoom() {
	return room;
}
public void setRoom(Room room) {
	this.room = room;
}
public String getNum() {
	return num;
}
public void setNum(String num) {
	this.num = num;
}
public String getCla() {
	return cla;
}
public void setCla(String cla) {
	this.cla = cla;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
@Override
public String toString() {
    return "Step [id=" + id + ", num=" + num + ", cla=" + cla +","+ room.toString()+ "]";
}
}
