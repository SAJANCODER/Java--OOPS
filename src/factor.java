import java.util.Scanner;
public class factor {
    public static void main(String args[]){
        Scanner get_input= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=get_input.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+ " ");
            }

        }

    }
}
/*
the given number,when  moduls it gives 0
 */
