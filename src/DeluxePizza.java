public class DeluxePizza extends Pizza {
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        super.addCheese();
        super.addTopping();
        super.addTakeaway();
        super.getBill();
        super.getPrice();

    }
}
