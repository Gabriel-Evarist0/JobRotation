package Exercicio5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        for(int i = frase.length(); i > 0; i--){
            System.out.print(frase.charAt(i-1));
        }
    }

}
