import java.util.Arrays;
public class acending_order_array {
    public static void main(String args[]){
        int [] a =new int[]{6,4,9,67,54,77,1};
        System.out.println("Before sort the array"+Arrays.toString(a));
        int temp;
        for(int i=0 ;i<a.length;i++){
            for(int j=i+1 ; j<a.length;j++){
                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
        System.out.println("Sorted array:"+Arrays.toString(a));
    }
}
