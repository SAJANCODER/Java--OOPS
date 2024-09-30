//strong number

import java.util.Scanner;
public class strong_number {
    public static void main(String args[]){
        Scanner get_input= new Scanner(System.in);
        int n,orginal_num,sum,rem,i;
        System.out.println("Enter the number:");
        n=get_input.nextInt();
        orginal_num=n;
        sum=0;
        while(n>0){ //145>0 14>0 1>0
            rem=n%10;
            int fact=1;  // while using this loop alway use fact inside the loop

            for(i=1;i<=rem;i++){
                fact*=i;
            }

            sum+=fact;
            n=n/10;  //14 1 0
        }
        if( sum==orginal_num){
            System.out.println("the " + orginal_num + "is a strong number");

        }
        else{
            System.out.println("not  a strong number");
        }
    }
}
