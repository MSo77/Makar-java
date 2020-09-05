package ru.capchik.java2020;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        double variable = Math.random()*100;
        String message = String.format('My message: '2f", variable);
        System.out.println(message);

        Random random = new Random( 1234 );

        variable = random.nextDouble()*100;
        message = String.format("My message: '2f",variable);
        System.out.println(message);
        }

    }

    public static void main(String[] args) {
        // Задание 1
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        sum = 0;
    }

 public static void main(String[] args);{
        boolean variable=false;
        System.out.println(variable);
        int i=0;
        while(i< 5);
        {
        i++;
        System.out.println(i);
        }
        }