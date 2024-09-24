import java .util.Scanner;
public class prime_no_or_not {
    public static void main(String args[]){
        Scanner get_input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=get_input.nextInt();
        int f=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                f++;
            }

        }
        if(f==2){
            System.out.println("the number"+n+"is aPrime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
}
