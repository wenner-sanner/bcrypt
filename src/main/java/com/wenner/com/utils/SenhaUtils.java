package com.wenner.com.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {
	
	public static String gerarBCrypt(String senha) {
		if (senha == null)  {
			return null;
		}
		
		BCryptPasswordEncoder byBCryptPasswordEncoder = new BCryptPasswordEncoder();
		
		return byBCryptPasswordEncoder.encode(senha);
	}
	
	public static boolean senhaValida(String senha, String senhaEncoded) {
		
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		
		return bCryptPasswordEncoder.matches(senha, senhaEncoded);
	}
}
