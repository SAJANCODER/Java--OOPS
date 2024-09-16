import java.util.Scanner;
public class nested_for {
    public static void main(String args[]){
        System.out.println("enter the length:");
        Scanner get_input = new Scanner(System.in);
        int n=get_input.nextInt();
        for (int i=1 ; i<=n ;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
