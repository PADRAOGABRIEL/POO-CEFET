import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class App {
    public static void media(ArrayList <String> k){
        for (int index = 0; index < k.size(); index++) {
            String u = k.get(index);
        }
    }
    public static void main(String[] args) throws Exception {
        ArrayList <String> x = new ArrayList<String>();
        double soma = 0;
        x.add("Casa");
        x.add("Cachorro");
        x.add("Gato");
        Collections.sort(x);
        System.out.println(x);

        // Map com Generics /////////

       /*  Map <String, String> m = new HashMap<String, String>();
        m.put("kyzz69h", "Gabriel");
        Set<String> z = m.keySet();
        Iterator<String> iter = z.iterator();
        
        while(iter.hasNext()){
            String key = iter.next();
            String nome = m.get(key);
            soma += nome.length();

        }

        System.out.println(soma);
        */
   
        // Com Iterator/////////
        
        /*Iterator <String> it = x.iterator();
        while (it.hasNext()) {
            String str = it.next();
            soma += str.length();
        }
        
        System.out.println(soma/x.size());
        
        */
        
        // Sem Iterator ////////
        
        /*for (int i = 0; i < x.size(); i++) {
            String s = x.get(i);
            soma += s.length();
        }
        System.out.println(soma/x.size());
        */
    }
}
