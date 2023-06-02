import java.util.HashMap;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String[] arr = entrada.split(" ");
        HashMap y = new HashMap<>();
        int i;
        for (i =0; i < arr.length; i++){
            if(y.containsKey(arr[i])){
                y.put(arr[i], (int)y.get(arr[i])+ 1);
            } else {
                y.put(arr[i], 1);
            }
        }

        System.out.println(y);
    }
}
