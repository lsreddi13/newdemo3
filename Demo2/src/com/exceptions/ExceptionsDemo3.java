package com.exceptions;

import java.lang.Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo3 {
	public static void main(String[] args) {
		ExceptionsDemo3 ss = new ExceptionsDemo3();
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("please enter int value : ");
			int ee = scan.nextInt();

			System.out.println(ee);

//			ss.test();
		} catch (InputMismatchException e) {
			System.out.println("catch   " + e);
		} catch (ArithmeticException e) {
			System.out.println("catch   " + e);
		} catch (Exception e) {
			System.out.println("all exception   " + e);
		}
		
		  try {
		  
		  int a[] = {10,20,30,40}; 
		  System.out.println(a[12]); 
		  int b = 10/0;
		  System.out.println(b); 
		  } catch (ArithmeticException e) {
		  System.out.println("this is arithmetic exception" +e);
		  }catch (Exception e) {
		  // TODO: handle exception 
			  System.out.println("this is different exception");
		  } finally { System.out.println("ok ok"); }
		 
	}

	public void test() throws ArithmeticException {
		int b = 10 / 0;
		System.out.println(b);
	}
}
