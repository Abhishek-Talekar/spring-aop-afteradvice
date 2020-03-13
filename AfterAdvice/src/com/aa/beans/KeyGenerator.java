package com.aa.beans;

public class KeyGenerator {
	public int generateKey(int bytes){
		if (bytes <= 8) {
			throw new IllegalArgumentException("Invalid key");
		}
		return 0;
	}
}
