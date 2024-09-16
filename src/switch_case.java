import java.util.Scanner;
public class switch_case {
    public static void main(String args[]){
        Scanner get_input = new Scanner(System.in);
        int a,b;
        System.out.println("Enter number 1:");
        a=get_input.nextInt();
        System.out.print("Enter number 2:");
        b=get_input.nextInt();
        System.out.println("\n\t\t Calculator Start!\n\n");


        System.out.println("Select the operation you need");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int choice;
        System.out.println("Enter your choice:");
        choice=get_input.nextInt();
        switch(choice){
            case 1:
                System.out.println("1.Addition");
                System.out.println("Result:"+(a+b));
                break;
            case 2:
                System.out.println("2.Subtraction");
                System.out.println("Result:"+(a-b));
                break;
            case 3:
                System.out.println("3.Multiplication");
                System.out.println("Result:"+(a*b));
                break;
            case 4:
                System.out.println("4.Division");
                System.out.println("Result:"+(a/b));
                break;
            default:
                System.out.println("invalid input");


        }
    }
}
