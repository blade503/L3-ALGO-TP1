
import java.util.Scanner;

public class Moyenne {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
      /*   System.out.println("Saisissez 5 nombres pour en faire la moyenne");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        moyenneACinq(a, b, c, d, e);

        //Moyenne n premier chiffres pair
        System.out.println("Veuillez saisir le nombre de chiffre pair dont vous voulez la moyenne ?");
        int n = sc.nextInt();
        int n2 = moyennePair(n);
        System.out.println("La moyenne des " + n + " premiers chiffres pair vaut " + n2);
*/
        //Fibonacci
        System.out.println("Veuillez saisir le terme de la suite de fibonacci que vous désirez");
        int fibo = sc.nextInt();
        int fibo2 = fibonacci(fibo);
        System.out.println("Voici le " + fibo + "-ième terme de la suite de fibonacci " + fibo2);
    }

    public static void moyenneACinq(double i, double j, double k, double g, double f) {
        double moyenne = (i + j + k + g + f) / 5;
        System.out.println("la moyenne est de " + moyenne);
    }

    public static int moyennePair(int n) {
        int somme = 0;
        for (int i = 0; i <= n * 2; i++) {
            if (i % 2 == 0) {
                somme = somme + i;
            }
        }
        return somme / n;
    }

    static int fibonacci(int n) {
        int a = 0, b = 1, c = a + b;
        for (int i = 0; i < n - 1; i++) {
            c = a + b;
            a = b;
            b = c;
            if (i == n - 2) {
                return c;
            }
        }
        return 0;
    }

}
