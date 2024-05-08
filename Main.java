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
					// Operações relacionadas a Conta
					System.out.print("Digite o CPF do cliente para procurar: ");
					String cpfConta = scanner.next();
					scanner.nextLine(); // Consome a quebra de linha

					Cliente clienteExistente = null;
					for (Cliente cliente : clientes) {
						if (cliente.getCpf().equals(cpfConta)) {
							clienteExistente = cliente;
							break;
						}
					}

					if (clienteExistente != null) {
						System.out.println("Conta já existente para este cliente.");
						// Lógica para criar ou gerenciar contas existentes
					} else {
						System.out
								.print("Cliente não encontrado. Deseja criar um novo cliente para criar a conta? (s/n): ");
						String criarNovoCliente = scanner.next();
						scanner.nextLine(); // Consome a quebra de linha

						if (criarNovoCliente.equalsIgnoreCase("s")) {
							Cliente novoCliente = new Cliente();
							clientes.add(novoCliente.criarConta());
						} else {
							System.out.println("Operação cancelada.");
						}
					}
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