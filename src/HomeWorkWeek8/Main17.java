package HomeWorkWeek8;

public class Main17
{

    public static void main(String[] args) {
        // testing
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total = " +calculator.getTotalCost()); // 38,5

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total = " +calculator.getTotalCost()); // 36,45
    }


}
