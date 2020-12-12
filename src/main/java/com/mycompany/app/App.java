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
		
		
		
		
		int n1= 2;
		int n2= 4;
		
		System.out.println(soma( n1,n2));
		System.out.println(sub( n1,n2));
		System.out.println(mult( n1,n2));
		System.out.println(div( n1,n2));
		
    }

	
	
    public static int soma(int x, int y)
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

