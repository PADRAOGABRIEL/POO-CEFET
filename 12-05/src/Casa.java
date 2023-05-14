import java.util.HashMap;

public class Casa {
    private String id;
    private double valor;
    public Casa(String id, double valor){
        this.id = id;
        this.valor = valor;
    }

    
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


    public static void main(String[] args) {
        HashMap x = new HashMap<>();
        Casa c  = new Casa("XY3", 1000000);
        Casa c2 = new Casa("YYK", 900000);
        Casa c3 = new Casa("UUU", 350000);
        x.put("Andre", c);
        x.put("Suzana", c2);
        x.put("Maria", c3);
        x.put("Manuela", c);
        x.remove("Manuela");

        System.out.println(x.keySet());


    }


}
