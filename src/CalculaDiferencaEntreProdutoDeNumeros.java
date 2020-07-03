import java.util.Scanner;

public class CalculaDiferencaEntreProdutoDeNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de a:");
        int a = teclado.nextInt();
        System.out.println("Digite o valor de b:");
        int b = teclado.nextInt();
        System.out.println("Digite o valor de c:");
        int c = teclado.nextInt();
        System.out.println("Por último, digite o valor de d:");
        int d = teclado.nextInt();
        int diferencaEntreProdutos = ((a*b) - (c*d));
        System.out.println("A diferença entre os produtos é: "+diferencaEntreProdutos);
    }
}
