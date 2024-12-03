import java.util.*;

public class LeapYearCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide year :");
        int year = sc.nextInt();

        if (year%4 !=0){
            System.out.println("Not a Leap year!");
        }
        else if(year%4==0 && year%100 !=0) {
            System.out.println("Leap year!");
        }
        else if (year%100==0 && year%400 !=0){
            System.out.println("Not a Leap year!");
         }
         else{
            System.out.println("Leap year!");
            sc.close();
       }
    }

}
