package com.stackroute.pe3;

public class ChessBoard {
	public String[][] chessPattern() {
	String [][] st=new String[8][8];
	String str1="WW|";
	String str2="BB|";

	for (int i = 0; i < 8; i++){
	    for (int j = 0; j < 8; j++){
	        if ( ((i+j) % 2) == 0 ) {
	            st[i][j]=str1;
	           System.out.println(st[0][0]);
	        } else {
	        	 st[i][j]=str2;
	        	 System.out.println(st[i][j]);
	        }
	    }
	}return st;
}
}
