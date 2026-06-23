package java_hw_8.Exercise_1;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Warehouse<String> stringWarehouse = new Warehouse<>();
        System.out.println("Is there anything in the warehouse? " + !stringWarehouse.isEmpty());
        stringWarehouse.addItem("Anton's Mercedes");
        stringWarehouse.addItem("Anton's PC");
        stringWarehouse.addItem("Anton's toy");
        System.out.println("Currently in the warehouse: " + stringWarehouse.getItemCount());
        System.out.println("Is there anything in the warehouse? " + !stringWarehouse.isEmpty());
        System.out.println("Viewing items: " + stringWarehouse.viewItems());
        System.out.println("Count after viewing: " + stringWarehouse.getItemCount());
        List<String> retrieved = stringWarehouse.retrieveAll();
        System.out.println("You have just removed from the warehouse: " + retrieved);
        System.out.println("Left in the warehouse: " + stringWarehouse.getItemCount());
        stringWarehouse.addItem("One more item");
        System.out.println("Count before clear: " + stringWarehouse.getItemCount());
        stringWarehouse.clear();
        System.out.println("Count after clear: " + stringWarehouse.getItemCount());
    }
}