package com.exceptions;

import java.io.IOException;

public class Demo1 {
	public void test() throws IOException {
		int b = 10 / 0;
		System.out.println(b);
	}
}
