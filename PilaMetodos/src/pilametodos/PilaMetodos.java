
package pilametodos;
import java.util.Stack;
public class PilaMetodos {

    public static void main(String[] args) {
        Stack<String> p = new Stack<String>();
     p.push("BIMBO con un precio en bolsa a un valor de: $34.48 al día 1 de Marzo \n\n");
     p.push("Cemex con un precio en bolsa a un valor de: $10.520 al día 1 de Marzo" );
     p.push("Coca Cola Femsa L con un precio en bolsa a un valor de: $112.48 al día 1 de Marzo");
     p.push("AMC Entertainment Holdings con un precio en bolsa a un valor de: $18.48 dolares al día 1 de Marzo");
     imprimir (p);
     
     if (p.empty()){
         System.out.println("La pila esta vacia");
     }
     else {
         System.out.println("La pila tiene elementos");
     }
     
    }
     public static void imprimir(Stack pilaImprimir){
        for (int i=pilaImprimir.size()-1; i>=0; i--){
            System.out.println(pilaImprimir.get(i));
        }
    }
    
}
