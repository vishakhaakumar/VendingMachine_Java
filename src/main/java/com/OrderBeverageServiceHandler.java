package com;

import org.apache.thrift.TException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import vending_machine.*;

public class OrderBeverageServiceHandler implements OrderBeverageService.Iface {

	@Override
	public String PlaceOrder(long city) throws ServiceException, TException {
		System.out.println("handler called");
			return "The Showman Business";
	}
	
}
