class superDemoclass{
   final int a=20;
}
class Subdemoclass extends superDemoclass{
    void subc(){
        int a=40;
        System.out.println("value of a = " + a);

    }

}

class main{
    public static void main(String args[]){
        Subdemoclass sub=new Subdemoclass();
        sub.subc();
    }
}