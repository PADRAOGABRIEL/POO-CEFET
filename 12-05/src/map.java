import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class map {
    public static void main(String[] args) {
        HashMap x = new HashMap<>();
        x.put("Andre", 28);
        x.put("Suzana", 27);
        x.put("Suzana", 27);

        /*Iterator it = x.values().iterator();

        double soma = 0, cont = 0;

        while(it.hasNext()){
            int i = (Integer) it.next();
            soma += i;
            cont++;
        }
        double media_idade = soma/cont;
        System.out.println(media_idade);
        */

        Iterator it = x.keySet().iterator();

        double soma = 0; 
        int cont = 0;

        while(it.hasNext()){
            String str = (String) it.next();
            if (str.startsWith("a")){
                soma += (int) x.get(str);
                cont++;
            }
        }
        double media_idade = soma/cont;
        System.out.println(media_idade);
        
    }
}
