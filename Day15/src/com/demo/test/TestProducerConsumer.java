package com.demo.test;
import com.demo.beans.*;
import com.demo.thread.*;
public class TestProducerConsumer {

	public static void main(String[] args) {
		MyStorage s = new MyStorage();
		
		ProducerThread p1 = new ProducerThread(s);
		ConsumerThread p2 = new ConsumerThread(s);
		p1.start();
		p2.start();
		
		}

	

}
