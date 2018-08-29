package com.teamsankya.calculatortest;

import com.teamsankya.calculator11.Addition;
import com.teamsankya.calculator11.Division;
import com.teamsankya.calculator11.Multiplication;
import com.teamsankya.calculator11.Subtraction;


public class App 
{
    public static void main( String[] args )
    {
    	int sum = Addition.add(10,20);
        System.out.println( sum );
        
        long sum2 = Addition.add(10,40);
        System.out.println( sum2 );
        
        
        int sub = Subtraction.subtract(20, 10);
        System.out.println( sub );
        
        int mul = Multiplication.multiply(25, 5);
        System.out.println( mul );
         
        int div = Division.division(12, 6);
        System.out.println( div );
    }
}
