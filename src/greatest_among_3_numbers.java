import java.util.Scanner;
public class greatest_among_3_numbers {
    public static void main(String args[]){
        int a,b,c;
        Scanner get_input = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a= get_input.nextInt();
        System.out.println("Enter the value of b:");
        b= get_input.nextInt();
        System.out.println("Enter the value of c:");
        c= get_input.nextInt();
        if(a>b && a>c){
            System.out.println(" a is greatest");
        }
        else if(b>a && b>c){
            System.out.println(" b is greatest");
        }
        else if(c>a && c>b){
            System.out.println(" c is greatest");
        }
        else{
            System.out.println("invalid input");
        }

    }
}
