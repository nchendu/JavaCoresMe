package com.nucchu.java.core;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable_Demo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable myCallable1 = new MyCallable("testString");
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Future<String> test = executor.submit(myCallable1);
		System.out.println(test.get());
	}

}

class MyCallable implements Callable<String> {
	private String myString;

	public MyCallable(String myString) {
		super();
		this.myString = myString;
	}

	public String call() throws Exception {
		// TODO Auto-generated method stub
		return this.myString.toUpperCase();
	}

}