public class prime_number_between_1_999 {
    public static void main(String args[]){
        System.out.println("the prime number form 1_999");
        int f=0;
        for(int n=1;n<=999;n++){
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    f++;

                }

            }
            if(f==2){
                System.out.println("the number is prime number"+n);
            }
            f=0;


        }

    }
}
