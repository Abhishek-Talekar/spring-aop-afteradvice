package com.aa.beans;

public class KeyGenerator {
	public int generateKey(int bytes) {

		if (bytes <= 8) {
			System.out.println("Weak key");
		} else {
			System.out.println("Strong key");
		}
		return 8;
	}
}
