import java.util.ArrayList;
import java.util.Collections;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private int idade;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Aluno(String n, int i){
        nome = n;
        idade = i;
    }


    // compareTo para String //////
    /*public int compareTo(Aluno k){
        return this.nome.compareTo(k.getNome());
    }
    */

    // compareTo para int //////
    public int compareTo(Aluno k){
        return (new Integer(idade)).compareTo(k.getIdade());
    }


    // sobreescrita do toString ////////////
    public String toString(){
        return "Nome: " + this.getNome() + ", Idade: " + this.getIdade();
    }


    // sobrescrita equals //////////
    public boolean equals(Object o){
        Aluno u = (Aluno) o;
        return this.nome.equals(u.getNome());
    }

    public static void main(String[] args) {
        ArrayList x = new ArrayList<>();
        //x.add("Casa");
        x.add(new Aluno("Gabriel", 20));
        x.add(new Aluno("Manu", 20));
        x.add(new Aluno("Rafa", 11));
        x.add(new Aluno("Joao", 35));
        System.out.println(Collections.frequency(x, new Aluno("Gabriel", 0)));   
        System.out.println(x);
        Collections.shuffle(x);
        System.out.println(x);
    }
}
