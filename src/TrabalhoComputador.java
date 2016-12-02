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

		while (dd.getPc() < i) {

			pause();

			dd.setENDEREÇO(0);
			dd.setREAD(0);
			dd.setMEMORIA(0);
			dd.setIr(dd.getMemoria(dd.getPc()));
			dd.setDADOS(0);
			dd.PCinc();
			dd.Tela();

			pause();

			switch (dd.getIr()) {
			case 0:

				dd.setA(dd.getMemoria(dd.getPc()));
				dd.setDADOS(dd.getMemoria(dd.getPc()));

				dd.PCinc();
				dd.setREAD(1);

				break;
			case 1:

				dd.setB(dd.getMemoria(dd.getPc()));
				dd.setDADOS(dd.getMemoria(dd.getPc()));

				dd.PCinc();
				dd.setREAD(1);

				break;
			case 2:
				dd.setA(dd.getB());
				break;
			case 3:
				dd.setB(dd.getA());
				break;
			case 4:
				if (dd.getMemoria(dd.getPc()) == 1) {
					if(dd.getVIDEO()!=9999){
					dd.setA(dd.getVIDEO());
					dd.setENDEREÇO(dd.getMemoria(dd.getPc()));
					dd.setMEMORIA(1);} else
						System.out.println("VIDEO VAZIO");
				} else
					System.out.println("ENDEREÇO INVALIDO");
				dd.PCinc();
				break;				
				
			case 5:
				
				if (dd.getMemoria(dd.getPc()) == 1) {
					dd.setVIDEO(dd.getA());
					dd.setENDEREÇO(dd.getMemoria(dd.getPc()));
					dd.setMEMORIA(1);
				} else
					System.out.println("ENDEREÇO INVALIDO");
				dd.PCinc();
				break;
			case 20:
				dd.setA(dd.getA() - dd.getMemoria(dd.getPc()));
				dd.setREAD(1);
				dd.setDADOS(dd.getMemoria(dd.getPc()));

				break;
			case 21:
				dd.setA(dd.getA() + dd.getMemoria(dd.getPc()));
				dd.setREAD(1);
				dd.setDADOS(dd.getMemoria(dd.getPc()));

				break;
			case 22:
				dd.setA(dd.getA() * dd.getMemoria(dd.getPc()));
				dd.setREAD(1);
				dd.setDADOS(dd.getMemoria(dd.getPc()));

				break;
			case 23:
				dd.setA(dd.getA() / dd.getMemoria(dd.getPc()));
				dd.setREAD(1);
				dd.setDADOS(dd.getMemoria(dd.getPc()));

				break;
			case 24:
				dd.setA(dd.getA() - dd.getB());
				dd.setREAD(1);
				dd.setDADOS(dd.getMemoria(dd.getPc()));

				break;
			case 25:
				dd.setA(dd.getA() + dd.getB());
				dd.setREAD(1);
				dd.setDADOS(dd.getMemoria(dd.getPc()));

				break;
			case 26:
				dd.setA(dd.getA() * dd.getB());
				dd.setREAD(1);
				dd.setDADOS(dd.getMemoria(dd.getPc()));

				break;
			case 27:
				dd.setA(dd.getA() / dd.getB());
				dd.setREAD(1);
				dd.setDADOS(dd.getMemoria(dd.getPc()));

				break;
			default:

				break;
			}

			dd.Tela();

		}
		System.out.println("Programa encerrado.");

	}

	public static void pause() {
		System.out.println("Pressione ENTER para continuar");
		Scanner teclado = new Scanner(System.in);
		teclado.nextLine();

	}
}