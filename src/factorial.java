import java.util.Scanner;
public class factorial {
    public static void main(String args[]){
        System.out.println("enter the number to be factorial:");
        Scanner get_input = new Scanner(System.in);
        int n =get_input.nextInt();
        int f=1;
        int i;
        for( i=1 ; i<=n ; i++){

            f*=i;
        }
        System.out.println("Factorial of " +i+ " is " +f);
    }
}
