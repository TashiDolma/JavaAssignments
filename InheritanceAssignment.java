public class InheritanceAssignment {
    public static void main(String args[]){
        Coffee coffee = new Coffee("Brown", "Espresso", 4);
        coffee.regularCoffee();
        System.out.println("--------------------------");

        Starbucks starbucks = new Starbucks("Brown", "Espresso", 4, "Double Espresso");
        starbucks.starbucksCoffee();
        System.out.println("--------------------------");

        StarbucksAdvanced advancedStarbucks = new StarbucksAdvanced("Brown", "Espresso", 4, "Double Espresso", "Cappuccino", 8);
        advancedStarbucks.advanceStarbucksCoffee();
        System.out.println("--------------------------");
    }
}

class Coffee{
    String color;
    String type ;
    int minPrice;

    Coffee(String color, String type, int minPrice){
        this.color=color;
        this.type=type;
        this.minPrice=minPrice;
    }

     void regularCoffee(){
        System.out.println("Regular Coffee has "+color+ " color and " +type+ " type, minimum cost is $"+minPrice);
    }
}

class Starbucks extends Coffee {
    String type2 = "Double Espresso";

    public Starbucks(String color, String type, int minPrice, String type2) {
        super(color, type, minPrice);
        this.type2=type2;
    }

    void starbucksCoffee(){
        super.regularCoffee();
        System.out.println("Starbucks has more variety like "+type2);
    }

}

class StarbucksAdvanced extends Starbucks{
    String type3;
    int price;

    public StarbucksAdvanced(String color, String type, int minPrice, String type2, String type3, int price) {
        super(color, type, minPrice, type2);
        this.type3=type3;
        this.price=price;
    }

    void advanceStarbucksCoffee(){
        super.starbucksCoffee();
        System.out.println("Advance Starbucks has more variety like "+type3+ " with higher price $" +price);
    }
}
