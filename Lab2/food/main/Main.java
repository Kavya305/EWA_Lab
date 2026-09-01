package food.main;
import food.model.FoodOrder;
import food.model.RegularOrder;
import food.model.PremiumOrder;
import food.utility.OrderUtility;

public class Main{
    public static void main(String[] args){
        FoodOrder[] orders = new FoodOrder[6];
        orders[0] = new RegularOrder(101,"Kavya",400);
        orders[1] = new PremiumOrder(102,"Ruchika",4000);
        orders[2] = new RegularOrder(103, "Simran", 750);
        orders[3] = new PremiumOrder(104, "Aman", 1200);
        orders[4] = new RegularOrder(105, "Priya", 600);
        orders[5] = new PremiumOrder(106, "Rohan", 900);

        for (FoodOrder order : orders) {
            if (OrderUtility.validateAmount(order.getAmount()) && OrderUtility.validateCustomerName(order.getCustomerName())) {
                OrderUtility.generateSummary(order);
            } else {
                System.out.println("Invalid order amount or customer name !");
            }
        }

        FoodOrder.displayTotalOrders();

    }
}