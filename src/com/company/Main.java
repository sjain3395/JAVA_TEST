package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10 - i; j++) {
                    System.out.print("*"+" ");
                }

                System.out.println();
            }
        }
        {
            for (int i =0; i < 10; i++ )
            {
                for(int j=0; j<10-i; j++)
                {
                    System.out.print((10-j) +" ");
                }
                System.out.println();
            }
        }
        {
            for (int i =0; i < 10; i++ )
            {
                for(int j=0; j<10-i; j++)
                {
                    System.out.print((char)(65+j) +" ");
                }
                System.out.println();
            }
        }
    }
    }



