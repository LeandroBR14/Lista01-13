import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        double altura;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        altura = teclado.nextDouble();

        double pesoidealHOMEM = (72.7*altura) - 58;
        double pesoidealMULHER = (62.1*altura) - 44.7;

        System.out.print("Seu peso ideal caso seja homem é de: " +pesoidealHOMEM);
        System.out.println(" kg");
        System.out.print("Seu peso ideal caso seja mulher é de: " +pesoidealMULHER);
        System.out.println(" kg");

        teclado.close();
    }
}
