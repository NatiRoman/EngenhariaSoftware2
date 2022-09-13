import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Exercicio2Map {
    public static void main(String[] args) {
        TreeMap<Character, Integer> charFrase = new TreeMap<>();

        Scanner scan = new Scanner(System.in);

        String frase = scan.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            Character c = frase.charAt(i);

            if (!charFrase.containsKey(c)){
                charFrase.put(c, 1);
            } else {
                charFrase.put(c, charFrase.get(c) + 1);
            }
        }
        System.out.println(charFrase);
    }
}