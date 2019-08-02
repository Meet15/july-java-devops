package com.flexon.project;

public class Testapp {
	public static Integer Sum(Integer x,Integer y) {
		if( x == null || y == null)
			return null;
		return x+ y;
		
	}
	public static Integer Sub(Integer x,Integer y) {
		if( x == null || y == null)
			return null;
		return x- y;
	
	}
	public static Integer Mul(Integer x,Integer y) {
		if( x == null || y == null)
			return null;
		return x* y;
	}
	public static Integer Div(Integer x,Integer y) {
		if( x == null || y == null)
			return null;
		return x/ y;
	}
}
