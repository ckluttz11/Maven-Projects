public class Coffeeshop {
    private String drinkName;
    private double price;
    private int orderNumber;
    private String customerName;

    public Coffeeshop (String customerName, String drinkName, double price, int orderNumber) {
        this.customerName = customerName;
        this.drinkName = drinkName;
        this.price = price;
        this.orderNumber = orderNumber;


    }

    // Getters & Setters
    public String getCustomerName() {
        return customerName;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public double getPrice() {
        return price;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

}


