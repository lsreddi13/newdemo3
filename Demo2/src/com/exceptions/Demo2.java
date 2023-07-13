package com.exceptions;

import java.io.IOException;

public class Demo2 extends Demo1{
	void test2() throws IOException {
		Demo1 d1 = new Demo1();
		d1.test();
	}
}
