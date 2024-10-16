import java.util.Scanner;
public class factorial {
    public static void main(String args[]){
        Scanner get_input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = get_input.nextInt();
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        System.out.println("the factorial of given number"+n+" is "+f);
    }
}
