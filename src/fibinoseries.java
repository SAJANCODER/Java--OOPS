import java.util.Scanner;
public class fibinoseries {
    public static void main(String args[]){
        System.out.println("enter a number:");
        Scanner get_input = new Scanner(System.in);
        int n= get_input.nextInt();
        int a=-1,b=1,c;
        for ( int i=1;i<=n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

    }
}
