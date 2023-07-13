package com.exceptions;

public class ExceptionsDemo {
	public static void main(String[] args) {

		try {
			int a[] = { 10, 20, 30, 40 };// int array
			System.out.println(a[12]); // trying to get the array out of bound exception.
			
		} catch (Exception e) {
			// it will execute when we catch the array out of bound exception.
			System.out.println("this is different exception");
		}finally {
			System.out.println("first final block");
		}
		try {

			int b = 10 / 0; // undefined value
			System.out.println(b); // trying to get arithmetic exception.

		} catch (ArithmeticException e) {
			// it will execute when we catch the arithmetic exception.
			System.out.println("this is arithmetic exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			// it will execute when we catch the array out of bound exception.
			System.out.println("this is array out of bound exception");
		} catch (Exception e) {
			// it will execute when we catch the exception.
			System.out.println("this is different exception");
		} finally {
			System.out.println("this is final block");
		}
	}
}
