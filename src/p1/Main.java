package p1;

import java.util.Scanner;
/*
Joshua Shelly
CSC164-402 Exam 1
Calculates the hypotenuse of a right triangle along with area and perimeter
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        double side1 = 0, side2 = 0;
        for(;side1 <= 0;){
            System.out.println("Enter side 1 of a right triangle ( > 0 ): ");
            side1 = input.nextDouble();
        }
        for(;side2 <= 0;){
            System.out.println("Enter side 2 of a right triangle ( > 0 ): ");
            side2 = input.nextDouble();
        }
        //Ok, I know this is long but this is the print statement for the entire thing, I kept this format because it's much more readable for me.
        //I chose to force the doubles that aren't user input into a 2 decimal format which in turn lengthened this string BUT IT WORKS.
        System.out.println("Side 1 = "+ side1+ ", Side 2 = "+ side2+ ", Hypotenuse = "+ String.format("%.2f",Hypotenuse(side1,side2))+ "\nThe perimeter of the triangle = "+ String.format("%.2f",Perimeter(side1,side2,Hypotenuse(side1,side2)))+ "\nThe area of the triangle = "+ String.format("%.2f",Area(side1,side2)));
    }
    //Simple Hypotenuse method that returns s3 I.E. side3
    public static double Hypotenuse(double s1, double s2){
        double s3;
        s3 = Math.sqrt((Math.pow(s1,2) + (Math.pow(s2,2))));
        return s3;
    }
    //Simple Perimeter method that returns perim
    public static double Perimeter(double p1, double p2, double p3){
        double perim;
        perim = p1 + p2 + p3;
        return perim;
    }
    //Simple Area method that returns area
    public static double Area(double a1, double a2){
        double area;
        area = (a1 * a2)/2;
        return area;
    }
}
