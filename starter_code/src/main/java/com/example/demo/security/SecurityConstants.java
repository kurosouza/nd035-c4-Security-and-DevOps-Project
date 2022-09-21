package com.example.demo.security;

public class SecurityConstants {
	public static final String HEADER_STRING = "Authorization";
	
	public static final long EXPIRATION_TIME = 10 * 24 * 60 * 60 * 1000; 
	public static final String SECRET = "abcd123";
	public static final String TOKEN_PREFIX = "Bearer ";
	
	public static final String SIGN_UP_URL = "/api/user/create";
}
