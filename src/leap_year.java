import java.util.Scanner;
public class leap_year {
    public static void main(String args[]){
        Scanner get_year = new Scanner(System.in);
        int year;
        System.out.println("Enter the Year:");
        year = get_year.nextInt();
        if(year%4==0 || (year%400==0 &&  year%100==0)){
            System.out.println("Leap Year");
        }

        else{
            System.out.println("Not A Leap Year");
        }

    }
}
