public class Capitalize {
    public static void main(String args[]){
        StringBuilder a =new StringBuilder("d sAJan progrAmMEr");
        System.out.println("Orginal String :"+a);
        if (a.charAt(0)>=97 && a.charAt(0)<=122){
            int c= (int) a.charAt(0)-32;
            a.setCharAt(0,(char)c);
        }
        for(int i=1;i<a.length();i++){
            if(a.charAt(i)==32){
                i++;
                if(a.charAt(i)>=97 && a.charAt(i)<=122){
                    int c=(int) a.charAt(i)-32;
                    a.setCharAt(i,(char)c);
                }
            }
            else{
                if(a.charAt(i)>=65 && a.charAt(i)<=90){
                    int c=(int) a.charAt(i)+32;
                    a.setCharAt(i,(char)c);
                }
            }

        }
        System.out.println("after convertion :"+a);
    }
}
