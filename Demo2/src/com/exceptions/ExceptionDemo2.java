package com.exceptions;

public class ExceptionDemo2 {
	
public static void main(String[] args) {
	int a[] = {10,20,30,40};
	try {
		System.out.println("ddd" + a[12]);
		System.out.println("Testing");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	finally {
		System.out.println(a[1]);
		System.out.println("execured");
	}
}
}
