package test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.mybatis.domain.Room;
import cn.itcast.mybatis.domain.Step;
import cn.itcast.mybatis.service.IRoomService;
import cn.itcast.mybatis.service.IStepService;

public class Test1 {

	@Test
	public static void main(String args[]){
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		IStepService us = (IStepService) ac.getBean("stepService");
	//	IRoomService rs = (IRoomService) ac.getBean("roomService");
	//	Room room = new Room();
	//	room = rs.get("200");
		Step step3 = new Step();
		step3 = us.getrid("2");
		System.out.println(step3);
	//	System.out.println(room);
		//step3.setId("4");
	    //step3.setCla("d");
		//step3.setNum("9");
		
	    //us.deleteById("4");
		//us.insert(step3);
		//Step user2 = us.get("9");
	//	List<Step> steps = us.list();
	//	for(Step step:steps)
	//	System.out.println(step);
	}
	

	
}