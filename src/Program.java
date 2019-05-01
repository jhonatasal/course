import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero de Linhas que a matriz tera:");
		int l = sc.nextInt();
		System.out.println("Digite o numero de Colunas que a matriz tera:");
		int c = sc.nextInt();
		int[][] mat = new int[l][c];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.println("Digite o elemento que ira ocupar a posição \nLinha:" + i + "\nColuna:" + j);
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Digite o numero que deseja procurar na matriz: ");
		int escolha = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (escolha == mat[i][j]) {
					System.out.println("Position : " + i + "," + j + " :");
					if (j - 1 >= 0) {
						System.out.println("Left :" + mat[i][j - 1]);
					}
					if (j + 1 <= c - 1) {
						System.out.println("Right :" + mat[i][j + 1]);
					}
					if (i + 1 <= l - 1) {
						System.out.println("Down :" + mat[i + 1][j]);
					}
					if (i - 1 >= 0) {
						System.out.println("Up :" + mat[i - 1][j]);
					}

				}

			}
		}

		sc.close();
	}
}