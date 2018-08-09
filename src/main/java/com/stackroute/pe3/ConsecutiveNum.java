package com.stackroute.pe3;

public class ConsecutiveNum {
public String checkNum(String s) {
	String []str =s.split(",");
	
	String p = "Consecutive Numbers";
	int [] a = new int[str.length];
	for(int i = 0;i < str.length;i++)
		a[i] = Integer.parseInt(str[i]);
	for(int i = 0;i < a.length-1;i++) {
		if(a[0] > a[1]) {
			if(a[i+1] == (a[i]-1)) {}
			else {
				p = "Not Consecutive Numbers";
				break;
			}
		}
		if(a[0] < a[1]) {
			if(a[i] == (a[i+1]-1)) {}
			else {
				p = "Not Consecutive Numbers";
				break;
			}
		}
	}
	return p;
}



}




	 


