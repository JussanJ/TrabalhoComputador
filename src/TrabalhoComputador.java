import java.util.Scanner;

public class TrabalhoComputador {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Dados dd = new Dados();

		int i = 0;

		while (i < 256) {
			System.out.printf("Digite %dª instrução ou 9999 para parar: ", i + 1);
			int v = teclado.nextInt();
			if (v == 9999)
				break;
			else {
				dd.setMemoria(v, i);

			}
			i++;
		}

		dd.Tela();

		while (true) {

			pause();

			dd.setIr(dd.getMemoria(dd.getPc()));
			dd.PCinc();
			dd.Tela();

			pause();

			switch (dd.getIr()) {
			case 0:

				dd.setA(dd.getMemoria(dd.getPc()));
				dd.PCinc();
				break;
			case 1:

				dd.setB(dd.getMemoria(dd.getPc()));
				dd.PCinc();
				break;
			case 2:
				dd.setA(dd.getB());
				break;
			case 3:
				dd.setB(dd.getA());
				break;
			}

			dd.Tela();

		}

	}

	public static void pause() {
		System.out.println("Pressione ENTER para continuar");
		Scanner teclado = new Scanner(System.in);
		teclado.nextLine();

	}
}