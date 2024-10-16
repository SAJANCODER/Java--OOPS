import java.util.Arrays;
public class insert_array_elements {
    public static void main(String args[]){
    int [] a={10,20,30,40,50,60,70,80,90,100};
    int index=2;
    int value=50;
    System.out.println("before insert:"+Arrays.toString(a));
    for(int i=a.length-1;i>index;i--){
        a[i]=a[i-1];
    }
    a[index]=value;
    System.out.println("after insert:"+Arrays.toString(a));
    }
}