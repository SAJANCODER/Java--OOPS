import java.util.Scanner;
public class armstrong_number {
    public static void main(String args[]){
        System.out.println("enter the number:");
        Scanner get_input = new Scanner(System.in);
        int n =get_input.nextInt();
        int temp=n;
        int  digit1,digit2,digit3;
        digit3=temp%10;
        temp=temp/10;

        digit2=temp%10;
        temp=temp/10;

        digit1=temp%10;
        int result= (digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
        if (result==n){
            System.out.println("The given number is a armstron number");
        }
        else{
            System.out.println("The given number is not a armstron number");
        }



    }
}
