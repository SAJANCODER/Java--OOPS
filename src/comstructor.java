public class comstructor {
    String building;
    int amount_cost;

    comstructor(String building, int amount_cost) {
        System.out.println("The budget");
        this.building = building;
        this.amount_cost = amount_cost;
    }


    public static void main(String args[]) {
        comstructor obj = new comstructor("sajan_construction", 10000000);
        System.out.println("the construction owner:" + obj.building);
        System.out.println("the construction amount:" + obj.amount_cost);

    }

}
