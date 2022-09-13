import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ExemplosMap {
    public static void main(String[] args){
        HashMap<String,Integer> conjuntoMes = new HashMap<>();

        conjuntoMes.put("Janeiro",1);
        conjuntoMes.put("Fevereiro",2);
        conjuntoMes.put("Março",3);
        conjuntoMes.put("Abril",4);
        conjuntoMes.put("Maio",5);
        conjuntoMes.put("Junho",6);
        conjuntoMes.put("Julho",7);
        conjuntoMes.put("Agosto",8);
        conjuntoMes.put("Setembro",9);
        conjuntoMes.put("Outubro",10);
        conjuntoMes.put("Novembro",11);
        conjuntoMes.put("Dezembro",12);

        Set<String> chaves = conjuntoMes.keySet();

        for (String chave : chaves) {
            System.out.println(chave + " ==> " + conjuntoMes.get(chave));
        }

        /*Scanner scan = new Scanner(System.in);

        String mes = scan.next();
        if (conjuntoMes.containsKey(mes)){
            System.out.println(conjuntoMes.get(mes));
        } else {
            System.out.println("Chave " + mes + " inexistente no MAP");
        }*/
    }
}
