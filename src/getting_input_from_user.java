import java.util.Scanner;
public class getting_input_from_user {
    public static void main(String args[]){
        Scanner get_input= new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the value of a:");
        a=get_input.nextInt();
        System.out.println("enter the value of b:");
        b=get_input.nextInt();
        c=(a*a)+(b*b)+(2*a*b);
        System.out.println("Result :"+c);
    }
}
