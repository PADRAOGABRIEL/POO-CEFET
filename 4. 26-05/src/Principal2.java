public class Principal2 {
    public static void main(String[] args) {
        String k = "A casa é bonita";
        System.out.println(k.indexOf("asa"));
        System.out.println(k.startsWith("B"));
        System.out.println(k.endsWith("ta"));
        k = k.replaceAll("casa", "c4s4");
        System.out.println(k);
        k = k.substring(2, 4);
        System.out.println(k);
    }
}
