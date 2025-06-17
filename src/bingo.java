import java.util.*;

public class bingo{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Random random = new Random();
        int [][] cartela = new int [5][5];

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                cartela[i][j] = i + j;
            }
        }
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(cartela[i][j] + " ");
            }
            System.out.println();
        }

    }
}