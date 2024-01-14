package HomeWork.Chapter4;


import java.util.Scanner;

/**
 *Εκτυπώνει οριζόντια n stars
 */
public class
StarHorizon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stars = 0;
        int n ='*';
        int result ='*';

        System.out.print("please insert stars");
        stars = scanner.nextInt();

         /*for (int i = n; {
          System.out.println();
        }*/


        for (int i = 1; i <= stars; i++){
            result *= stars;
            System.out.print("*");
        }

        System.out.println();
        }

    }

