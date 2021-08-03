import com.google.gson.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try
        {
            Coffeeshop drinks[] = {new Coffeeshop("Joe Oakes", "Americano", 3.00, 1),
                    new Coffeeshop("Collin Kluttz", "Caramel Frappucino", 4.50, 2),
                    new Coffeeshop("Ryan Kluttz", "Iced Chai Tea", 4.00, 3)};

            try (FileWriter writer = new FileWriter("Coffeshop.json")){
                writer.write(new Gson().toJson(drinks));
            }

            Coffeeshop[] drinks2 = new Gson().fromJson(new FileReader("Coffeshop.json"), Coffeeshop[].class);
            for (Coffeeshop drink : drinks2){
                System.out.println("Name: " + drink.getCustomerName());
                System.out.println("Drink: " + drink.getDrinkName());
                System.out.println("Price: $" + drink.getPrice());
                System.out.println("Order Number : " + drink.getOrderNumber());
            }
        }catch(Exception e){ }
    }
}
