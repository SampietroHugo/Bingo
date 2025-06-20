import java.util.*;

public class bingo {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int resposta;
        Random random = new Random();
        int[][] cartela = new int[3][3];
        int[][] cartelaOculta = new int[3][3];

        for (int i = 0; i < cartela.length; i++) {
            for (int j = 0; j < cartela[i].length; j++) {
                cartela[i][j] = random.nextInt(10, 51);
            }
        }

        while (!cartelaCompleta(cartela)) {
            do {
                System.out.print("\nDigite um número de 10 a 50 para o bingo: ");
                resposta = input.nextInt();
            } while (resposta < 10 || resposta > 50);

            boolean acertou = false;

            for (int i = 0; i < cartela.length; i++) {
                for (int j = 0; j < cartela[i].length; j++) {
                    if (resposta == cartela[i][j]) {
                        System.out.println("Acertou! Linha: " + (i + 1) + " | Coluna: " + (j + 1));
                        cartelaOculta[i][j] = cartela[i][j]; 
                        cartela[i][j] = 0; 
                        acertou = true;
                    }
                }
            }

            if (!acertou) {
                System.out.println("Número não encontrado na cartela.");
            }

            System.out.println("\nCartela atualizada:");
            for (int i = 0; i < cartelaOculta.length; i++) {
                for (int j = 0; j < cartelaOculta[i].length; j++) {
                    if (cartelaOculta[i][j] != 0) {
                        System.out.print(cartelaOculta[i][j] + "\t");
                    } else {
                        System.out.print("X\t");
                    }
                }
                System.out.println();
            }
        }

        System.out.println("\nBINGO! Você acertou todos os números!");
    }

    public static boolean cartelaCompleta(int[][] cartela) {
        for (int i = 0; i < cartela.length; i++) {
            for (int j = 0; j < cartela[i].length; j++) {
                if (cartela[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}