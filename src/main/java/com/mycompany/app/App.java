package com.mycompany.app;
import java.util.*;
import java.util.Scanner;

/**
 * Calculadora
 */
public class App
{


    public App() {}

    public static void main(String[] args) {
		
		
		
		
		int num1= 25;
		int num2= 5;
		
		System.out.println(add( num1,num2));
		System.out.println(sub( num1,num2));
		System.out.println(mult( num1,num2));
		System.out.println(div( num1,num2));
		
    }

	
	
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }
}

