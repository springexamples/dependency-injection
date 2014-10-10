package com.springinaction.spingidol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.spingidol.performers.Performer;
import com.springinaction.spingidol.util.Auditorium;
import com.springinaction.spingidol.util.PerformanceException;
import com.springinaction.spingidol.util.Stage;
import com.springinaction.spingidol.util.Ticket;

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

		System.out.println("=-------------------");
		Performer kenny = context.getBean("kenny", Performer.class);
		try {
			kenny.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}

		System.out.println("=-------------------");
		Performer hank = context.getBean("hank", Performer.class);
		try {
			hank.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}

		System.out.println("=-------------------");
		Performer boody = context.getBean("boody", Performer.class);
		try {
			boody.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}

		context.close();
	}
}
