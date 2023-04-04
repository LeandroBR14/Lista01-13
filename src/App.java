import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite (M) caso seja mulher e (H) caso seja homem.");
        String sexo = teclado.next();
        System.out.println("Digite sua altura: ");
        double altura = teclado.nextDouble();

        double pesoidealHOMEM = (72.7*altura) - 58;
        double pesoidealMULHER = (62.1*altura) - 44.7;

        if (sexo.equals("H")) {
            System.out.printf("Seu peso ideal é de: %.2f kg", pesoidealHOMEM);
        } else if (sexo.equals("M")) {
            System.out.printf("Seu peso ideal é de: %.2f kg", pesoidealMULHER);
        } else {
            System.out.println("Sexo inválido, tente novamente.");
        }
        
        teclado.close();
    }
}
