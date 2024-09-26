//import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a mi verduleria");
        Map<String, Double> inventario = new TreeMap<>();


        inventario.put("Platano", 15.0);
        inventario.put("Tomate", 20.0);
        inventario.put("Fresa", 30.0);
        inventario.put("Melon", 20.0);
        inventario.put("Sandia", 90.0);
        
        System.out.println("Ëste es el inventario de frutas y verduras");

        for(String fruta : inventario.keySet()){
            System.out.println( fruta + ": $" + inventario.get(fruta));
        }

        String frutaBuscada = "Fresa";
        System.out.println("se solicita la fruta: " + frutaBuscada);

        if(inventario.containsKey(frutaBuscada)){
            System.out.println("Tenemos " + frutaBuscada);
        } else {
            System.out.println("Se nos termino la " + frutaBuscada);
        }

        String sinStock = "Fresa";
        inventario.remove(sinStock);

        System.out.println("Se a terminado la " + sinStock );


        System.out.println("Inventario actualizado: ");
        for(String fruta : inventario.keySet()){
            System.out.println( fruta + ": $" + inventario.get(fruta));
        }
System.out.println("La cantidad de frutas es: " + inventario.size());
    }
}
