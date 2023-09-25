import java.util.*;

public class CalculaMedia {
    public static void main(String[] args) {
        int vet[] = new int[10];
        int soma = 0;
        int media = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o  valor: ");
            vet[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            soma += vet[i];
        }
        media = soma / 10;
        for (int i = 0; i < 10; i++) {
            if(vet[i]>media){
            System.out.println("O valor "+vet[i]+" esta acima da media.");
            }else{
                System.out.println("Nenhum valor esta acima da média.");
            }
        }
        sc.close();
    }
}
