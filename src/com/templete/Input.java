package com.templete;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {

    public static void main(String args[]){
	InputTemplete1();
    }
    
    public static void InputTemplete1(){
	Scanner scan = null;
	try {
	    scan = new Scanner(new FileInputStream("test.txt"));
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	while(scan.hasNext()){
	   int n = scan.nextInt();
	   for(int i=0;i<n;i++){
	       double a =scan.nextDouble();
	       System.out.print(a+" ");
	   }
	   System.out.println();
	}
	
    }
}
