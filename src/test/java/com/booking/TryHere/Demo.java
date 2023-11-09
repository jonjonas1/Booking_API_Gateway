package com.booking.TryHere;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Demo {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
		String result = encoder.encode("myPassword");
		System.out.println(result);
		assertTrue(encoder.matches("myPassword", result));
		
	}
	
}
