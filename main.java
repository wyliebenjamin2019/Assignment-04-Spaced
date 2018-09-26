package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double x1= 5;
        double x2=4;
        double x3=-3;
        double y1=2;
        double y2=9;
        double y3=2;
        double z1=-5;
        double z2=2;
        double z3=6;
        double d1=Math.sqrt(Math.pow(y1-y2,2)+Math.pow(x1-x2,2)+Math.pow(z1-z2,2));
        double d2=Math.sqrt(Math.pow(y2-y3,2)+Math.pow(x2-x3,2)+Math.pow(z2-z3,2));
        double d3=Math.sqrt(Math.pow(y3-y1,2)+Math.pow(x3-x1,2)+Math.pow(z3-z1,2));
        double da = Math.max(d1,d2);
        double db = Math.max(da,d3);
        double dc = Math.min(d1,d2);
        double dd = Math.min(dc,d3);
        System.out.printf("Max distance ~%.2f",db);
        System.out.printf("\nMin distance ~%.2f",dd);

    }
}

