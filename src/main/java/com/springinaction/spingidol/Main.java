package com.springinaction.spingidol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.spingidol.performers.Performer;
import com.springinaction.spingidol.util.Auditorium;
import com.springinaction.spingidol.util.PerformanceException;
import com.springinaction.spingidol.util.Stage;
import com.springinaction.spingidol.util.Ticket;
import com.springinaction.spelcollections.User;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-idol.xml");

		Stage stage = context.getBean("stage", Stage.class);
		System.out.println("Stage: " + stage.getName());

		Performer performer = context.getBean("duck", Performer.class);
		try {
			performer.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}

		Ticket ticket1 = context.getBean("ticket", Ticket.class);
		System.out.println("Ticket: " + ticket1.getTicketNumber());

		ticket1.setTicketNumber(2);

		// if scope="prototype", then a new object returned when reference the
		// object either through wiring or getBean
		Ticket ticket2 = context.getBean("ticket", Ticket.class);
		System.out.println("Ticket: " + ticket2.getTicketNumber());

		Ticket t1 = context.getBean("t1", Ticket.class);
		t1.setTicketNumber(100);

		Ticket t2 = context.getBean("t2", Ticket.class);
		System.out.println(t2.getTicketNumber());

		context.getBean("auditorium", Auditorium.class);

		System.out.println("kenny=-------------------");
		Performer kenny = context.getBean("kenny", Performer.class);
		try {
			kenny.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}
		
		System.out.println("carl =-------------------");
		Performer carl = context.getBean("carl", Performer.class);
		try {
			carl.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}

		System.out.println("hank=-------------------");
		Performer hank = context.getBean("hank", Performer.class);
		try {
			hank.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}

		System.out.println("boody=-------------------");
		Performer boody = context.getBean("boody", Performer.class);
		try {
			boody.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}
		
		System.out.println("----------------------------------------------------------");
		User user = context.getBean("user", User.class);
		System.out.println(user.getProfileCity());
		System.out.println(user.getBigCityNames());

		System.out.println("kenny2=- Autowire byType------------------");
		Performer kenny2 = context.getBean("kenny2", Performer.class);
		try {
			kenny2.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}
		
		System.out.println("duck2=- Autowire constructor------------------");
		Performer duck2 = context.getBean("duck2", Performer.class);
		try {
			duck2.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----New User-----------------------------------------------------");
		User newUser = context.getBean("newUser", User.class);
		System.out.println(newUser.getProfileCity());
		System.out.println(newUser.getId());
		if (newUser.getInstrumentalist() != null){
			try {
				newUser.getInstrumentalist().perform();
			} catch (PerformanceException e) {
				e.printStackTrace();
			}
		}else{
			System.out.println("Null");
		}
		
		context.close();
	}
}
