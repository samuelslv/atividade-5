import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int opcao = 0;

		do {

			// Exibe o menu principal usando a classe Menu
			Menu mainMenu = new Menu("Menu Principal",
					Arrays.asList("Conta", "Cliente", "Realizar Operações", "Mostrar clientes", "Sair"));
			opcao = mainMenu.getSelection();

			switch (opcao) {
				case 1: // CONTA

					break;

				case 2: // CLIENTE

					break;

				case 3: // REALIZAR OPERAÇÕES

					break;

				case 4:

					break;
				case 5:

					break;

			}
		} while (opcao != 5);

	}
}