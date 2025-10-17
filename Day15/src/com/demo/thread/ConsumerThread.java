package com.demo.thread;

import com.demo.beans.MyStorage;

public class ConsumerThread extends Thread {
private MyStorage s;

public ConsumerThread(MyStorage s) {
	super();
	this.s = s;
}
public void run() {
	for(int i=0;i<=10;i++) {
		s.get();
	}
}
}
