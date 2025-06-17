import java.util.*;

public class bingo {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int resposta;
        Random random = new Random();
        int[][] cartela = new int[3][3];

        for (int i = 0; i < cartela.length; i++) {
            for (int j = 0; j < cartela.length; j++) {
                cartela[i][j] = random.nextInt(10, 50);
            }
        }

        for (int i = 0; i < cartela.length; i++) {
            for (int j = 0; j < cartela[i].length; j++) {
                do {
                    System.out.println();
                    System.out.print("Digite um número de 10 a 50 para o bingo: ");
                    resposta = input.nextInt();
                } while (resposta < 10 || resposta > 99);

                boolean acertou = false;

                for (int x = 0; x < cartela.length; x++) {
                    for (int y = 0; y < cartela[x].length; y++) {
                        if (resposta == cartela[x][y]) {
                            System.out.println("Acertou! \nLinha: " + (x + 1) + " \nColuna: " + (y + 1));
                            cartela[x][y] = 0;
                            acertou = true;
                        }
                    }
                }
                if (!acertou) {
                    System.out.println("Número não encontrado na cartela.");

                }

                System.out.println("\nCartela atualizada:");
                for (int x = 0; x < cartela.length; x++) {
                    for (int y = 0; y < cartela[x].length; y++) {
                        if(cartela[x][y] == 0){
                            System.out.print(resposta + "\t");
                        }else{
                            System.out.print( "X\t");
                        }
                    }
                    System.out.println();
                }

            }
        }
        System.out.println("\nFim do Bingo!!");
    }
}