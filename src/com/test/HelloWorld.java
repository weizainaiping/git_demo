package com.test;

public class HelloWorld {
	
	public static byte[] charToByte(char c) {   
        byte[] b = new byte[2];   
        b[0] = (byte) ((c & 0xFF00) >> 8);   
        b[1] = (byte) (c & 0xFF);   
        return b;   
    }  
	
	public static void main(String[] args){
		char c='жа';
		byte[] bytes=charToByte(c);
		System.out.println(bytes.length);
		
	}
}
