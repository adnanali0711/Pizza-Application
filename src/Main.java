
public class Main {

    public static void main(String[] args) {
    Pizza p = new Pizza(false);
    p.addCheese();
    p.addTopping();
    p.addTakeaway();
    System.out.println(p.getBill());


    }
}