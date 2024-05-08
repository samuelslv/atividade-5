import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<>();
		int opcao = 0;
		Scanner scanner = new Scanner(System.in);

		do {

			// Exibe o menu principal usando a classe Menu
			Menu mainMenu = new Menu("Menu Principal",
					Arrays.asList("Conta", "Cliente", "Realizar Operações", "Mostrar clientes", "Sair"));
			opcao = mainMenu.getSelection();

			switch (opcao) {
				case 1: // CONTA

					break;

				case 2: // CLIENTE
					// Menu Cliente usando MenuCliente
                    MenuCliente menuCliente = new MenuCliente("Menu Cliente",
                            Arrays.asList("Criar cliente", "Excluir cliente"));
                    int escolhaCliente = menuCliente.getSelection();

                    if (escolhaCliente == 1) {
                        Cliente novoCliente = new Cliente();
                        clientes.add(novoCliente.criarConta());
                    } else if (escolhaCliente == 2) {
                        System.out.print("Digite o CPF do cliente para excluir: ");
                        String cpfExcluir = scanner.nextLine();
                        clientes.removeIf(cliente -> cliente.getCpf().equals(cpfExcluir));
                        System.out.println("Cliente excluído, se presente.");
                    }
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