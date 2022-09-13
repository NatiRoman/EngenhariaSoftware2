import java.util.HashSet;  //não ordena as informações
import java.util.TreeSet; //ordena as informações

public class ExemplosConjuntos {
    public static void main(String[] args){
        TreeSet<Integer> conjunto = new TreeSet<>();
        TreeSet<String> conjuntoString = new TreeSet<>();

        conjunto.add(30);
        conjunto.add(10);
        conjunto.add(40);
        conjunto.add(50);
        conjunto.add(60);
        conjunto.add(50);
        conjunto.add(60);
        conjunto.add(20);

        for(Integer elem : conjunto){
            System.out.println(elem);
        }

        System.out.println(conjunto.contains(60));
        System.out.println(conjunto.contains(100));

        conjunto.remove(10);
        System.out.println("");

        for(Integer elem : conjunto){
            System.out.println(elem);
        }
        System.out.println("");

        conjuntoString.add("A");
        conjuntoString.add("B");
        conjuntoString.add("C");
        conjuntoString.add("D");

        for(String elem : conjuntoString){
            System.out.println(elem);
        }

        System.out.println("");

        System.out.println(conjuntoString.first());
        System.out.println(conjuntoString.last());

        System.out.println("");

        TreeSet<String> subconjunto = (TreeSet<String>) conjuntoString.subSet("A","B");

        for(String elem : subconjunto){
            System.out.println(elem);
        }
    }
}
