import java.util.Scanner;
public class sumfornaturalno {
    public static void main(String args[]){
       int n,s;
       Scanner get_input = new Scanner(System.in) ;
       System.out.println("enter the ending value:");
       n=get_input.nextInt();

       for(int i=1;i<=n;i++){
           System.out.println(i);
       }
      float sum=0;
       for(int i=1;i<=n;i++){
           sum+=i;
       }
       System.out.println("sum:"+sum);
    }
}
