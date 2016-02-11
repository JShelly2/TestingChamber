package p3;


public class Tertiary {

    public static void main(String[] args) {
        //Create Balloon array
        Balloon[] thing = new Balloon[500];
        //build balloon objects
        thing[0] = new Balloon();
        thing[1] = new Balloon(12,"Pink");
        thing[2] = new Balloon(16,"Yellow");
        thing[3] = new Balloon(3,"Green");
        //Print num of balloons made today
        System.out.printf("Numb of balloons made = %d%n", Balloon.getQuantity());
        //show the balloon's characteristics.
        for(Balloon each : thing)
            //If object null, don't run
            if(each != null)
                System.out.printf("size = %d inches; color = %s%n", each.getSize(), each.getColor());
    }
}
class Balloon {
    private int size;
    private String color;
    private static int quantity = 0;
    //Default constructor
    Balloon(){
        size = 10;
        color = "blue";
        quantity++;
    }
    //Custom constructor
    Balloon(int arg1, String arg2){
        size = arg1;
        color = arg2;
        quantity++;
    }
    //Return color of the object
    String getColor(){
        return color;
    }
    //Return size of balloon
    int getSize(){
        return size;
    }
    //Return quantity of balloons made
   static int getQuantity(){
        return quantity;
    }
}

