import java.util.HashSet;
import java.util.Iterator;

public class xy {
    public static void main(String[] args) {
        HashSet x = new HashSet<>();
        x.add("casa");
        x.add("mesa");
        x.add("barco");
        System.out.println(x.add("mesa")); // Não insere e retorna false
        x.add("cadeira");
        System.out.println(x.size());
        System.out.println(x);

        double soma = 0, cont = 0;

        // calcular media dos itens do HashSet
       /*  for (Object obj : x) {
            String s = (String) obj;
            soma += s.length();
            cont ++;
        }
            
        int media = soma/cont;
        System.out.println(media);
        */

        int tamanho_lista = x.size();
        System.out.println(tamanho_lista);
        Iterator it = x.iterator();
        
        /*
        while(it.hasNext()){
            String u = (String) it.next();
            System.out.println(u);
            soma += u.length();
            cont++; 
        }

        int media = soma/cont;
        System.out.println(media);*/

        while(it.hasNext()){
            String u = (String) it.next();
            soma += 1.0/u.length();
        }
        double media_harmonica = tamanho_lista/soma;
        System.out.println(media_harmonica);
    }


    
}
