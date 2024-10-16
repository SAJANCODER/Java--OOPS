import java.util.Scanner;
public class fibinoseries {
    public static void main(String args[]){
        Scanner get_input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=get_input.nextInt();
        int a=-1,b=1,c;
        for(int i=1;i<=n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}

