package p3;

import java.util.Scanner;

public class Tertiary {

    public static void main(String[] args) {
        int i = 0, size;
        String color;
        char menu ='N';
        //Create Balloon array
        Balloon[] thing = new Balloon[500];
        //build balloon objects
        thing[0] = new Balloon();
        thing[1] = new Balloon(12,"Pink");
        thing[2] = new Balloon(16,"Yellow");
        thing[3] = new Balloon(3,"Green");

        Scanner input = new Scanner( System.in );
        for(;menu != 'Y';) {
            for (; menu != 'Y'; ) {
                System.out.println("Please input what Balloon register you would like to access :");
                i = input.nextInt();
                System.out.printf("Size = %d inches; Color = %s%n", thing[i].getSize(), thing[i].getColor());
                System.out.println("\nAre you sure you wish to edit this? \nY/N?");
                menu = input.next().toUpperCase().charAt(0);
            }
            System.out.println("Size = ");
            size = input.nextInt();
            System.out.println("Color = ");
            color = input.next();
            thing[i] = new Balloon(size, color);
        }
        //Print num of balloons made today
        System.out.printf("Numb of balloons made = %d%n", Balloon.getQuantity());
        //show the balloon's characteristics.
        for(Balloon each : thing)
            //If object null, don't run
            if(each != null)
                System.out.println(each);
    }
}
class Balloon {
    private int size;
    private String color;
    private static int quantity = 0;
    //Default constructor
    Balloon(){
        size = 10;
        color = "Blue";
        quantity++;
    }
    //Custom constructor
    Balloon(int arg1, String arg2){
        size = arg1;
        color = arg2;
        quantity++;
    }
    //Return color of the object
    String getColor(){return color;}
    //Return size of balloon
    int getSize(){return size;}
    //Return quantity of balloons made
    static int getQuantity(){return quantity;}
    //Create a balloon
    static int buildBalloon(){
        return 0;
    };

    @Override
    public String toString() {
        return "Balloon{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}

