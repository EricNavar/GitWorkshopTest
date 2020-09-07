import java.util.ArrayList;

class Order {
    public int totalCost = 0;
    public ArrayList<String> items = new ArrayList<String>();

    public void printOrder() {
        System.out.println("Your total is $" + totalCost);
        System.out.println("Here are your items: " + items);
    }

    public void addChickenSandwich() {
        totalCost = totalCost + 5;
        items.add("Chicken Sandwich");
        System.out.println("A chicken sandwich has been added to your order.");
    }

    public void addDrink() {
        //code
    }
}
