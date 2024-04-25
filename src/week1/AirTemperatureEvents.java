package week1;

// ----------air temperature effectiveness-----------


import java.util.Scanner;
public class AirTemperatureEvents {
    public static void main(String[] args) {
        // variable
        int heat;

        // input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature value : ");
        heat = input.nextInt();

        // if-else
        if (heat<5) {
            System.out.println("You can ski today");
        } if (heat >=5 && heat <=15 ){
            System.out.println("You can go to the cinema today ");
        } else if (heat>15 && heat<25) {
            System.out.println("You can hava a picnic today ");
            if(heat < 25){
                System.out.println("If you wish, you can ski or go to the cinema during the day.");
            }
        } else if (heat >= 25) {
            System.out.println("You can swim in the outdoor pool today");
        } else {
            System.out.println("Event is over ! ");
        }



    }
}

