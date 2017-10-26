package br.jrfy.wsminhasvacinas.utils.security;

import java.security.MessageDigest;

public class ConverterToHash {
	public static String md5(String text){
		String senha = "";
		try {			
			MessageDigest algorithm;
			algorithm = MessageDigest.getInstance("MD5");
			byte messageDigest[] = algorithm.digest(text.getBytes("UTF-8"));
			
			StringBuilder hexString = new StringBuilder();
			for (byte b : messageDigest) {
			  hexString.append(String.format("%02X", 0xFF & b));
			}
			senha = hexString.toString();			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return senha;
	}
}
