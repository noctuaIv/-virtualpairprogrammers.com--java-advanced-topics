package com.virtualpairprogrammers.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtualpairprogrammers.domain.Action;
import com.virtualpairprogrammers.domain.Call;
import com.virtualpairprogrammers.domain.Customer;
import com.virtualpairprogrammers.services.calls.CallHandlingService;
import com.virtualpairprogrammers.services.customers.CustomerManagementService;
import com.virtualpairprogrammers.services.customers.CustomerNotFoundException;
import com.virtualpairprogrammers.services.diary.DiaryManagementService;

public class SimpleClientTest {
	
	static Logger logger = LogManager.getLogger(SimpleClientTest.class);

	public static void main(String[] args) 
	{
		logger.error("Some error occurred");
		
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
		
		CustomerManagementService customerService = container.getBean(CustomerManagementService.class);
		CallHandlingService callService = container.getBean(CallHandlingService.class);
		DiaryManagementService diaryService = container.getBean(DiaryManagementService.class);
		
		customerService.newCustomer(new Customer("CS03939", "Acme", "Good Customer"));

		if (logger.isEnabledFor(Level.DEBUG)) {
			//get number of records from customer table
			logger.debug("The number of records was 163");
		}
		
		Call newCall = new Call("Larry Wall called from Acme Corp");
		Action action1 = new Action("Call back Larry to ask how things are going", new GregorianCalendar(2016, 0, 0), "rac");
		Action action2 = new Action("Check our sales dept to make sure Larry is being tracked", new GregorianCalendar(2016, 0, 0), "rac");		
		
		List<Action> actions = new ArrayList<Action>();
		actions.add(action1);
		actions.add(action2);
		
		try
		{
			callService.recordCall("CS03939", newCall, actions);
		}
		catch (CustomerNotFoundException e)
		{
			System.out.println("That customer doesn't exist");
		}
		
		System.out.println("Here are the outstanding actions:");
		Collection<Action> incompleteActions = diaryService.getAllIncompleteActions("rac");
		for (Action next: incompleteActions)
		{
			System.out.println(next);
		}
				
		container.close();
	}

}
