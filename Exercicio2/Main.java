package Exercicio2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> fib = new ArrayList<Integer>();
        fib.add(0,0);
        fib.add(1,1);
        boolean isInList = false;
        int num = 0;
        System.out.println("Descubra se um número pertence a sequência de Fibonacci");
        System.out.print("Digite um número: ");
        int x = sc.nextInt();
        for(int i = 0; i < 50 ;i++){
            if( i == 0){
                num = fib.get(i) + fib.get(1);
            }else{
                num = num + fib.get(i);
            }
            fib.add(num);
        }
        for(int i = 0; i < fib.size(); i++){
            if(fib.get(i) == x){
                isInList = true;
            }
        }
        verify(isInList,x);
        sc.close();
    }

    public static void verify(boolean isInList, int x){
        if(isInList){
            System.out.printf("O número %d está presente na sequência de Fibonacci", x);
        }else {
            System.out.printf("O número %d NÃO está presente na sequência de Fibonacci", x);
        }
    }
}
