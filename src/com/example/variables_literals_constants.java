





package com.example;

public class variables_literals_constants
{
    public static void main(String[] args)
    {
        final int FIRST_NUMBER = 11;
        int secondNumber= 20;

        double average = (double)(FIRST_NUMBER+secondNumber)/2;
        System.out.println("Average : " + average);

        String name;
        String surname;
        name= "John";
        surname= "Rambo";
        System.out.println(name+ " "+ surname);

        boolean value;
        value=false;
        System.out.println(value);


    }

}
