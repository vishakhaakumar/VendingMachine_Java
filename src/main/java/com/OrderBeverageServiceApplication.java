package com;

import org.apache.thrift.TProcessor;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import vending_machine.OrderBeverageService;

@SpringBootApplication
public class OrderBeverageServiceApplication {

	public static void main(String[] args) {
		System.out.println("Order search demo server !!..");
        try {
        	 System.out.println("before start...");
        	TServerSocket serverTransport = new TServerSocket(9042);
        	TProcessor proc = new OrderBeverageService.Processor<>(new OrderBeverageServiceHandler());
        	System.out.println("after start.1");
        	TSimpleServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(proc));
        	
            
            System.out.println("Starting the Order search server.....!!2 ");

            server.serve();
            System.out.println("done.");
            
            
		} catch (TTransportException e) {
			// TODO Auto-generated catch block
			 System.out.println("error-------------->."+e);
			e.printStackTrace();
		}
	}

}
