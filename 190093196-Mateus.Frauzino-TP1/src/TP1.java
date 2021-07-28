import java.util.Scanner;


public class TP1 {

	public static void main(String[] args) {
		int selecao = 0,  quantidadeClientes = 15, quantidadeProdutos = 15, t = 0, clientesCadastrados = 10, produtosCadastrados = 10;
		int i = 0, selecaoCliente = 0, selecaoProduto = 0, vendaProduto = 0;
		String buscaCliente = new String(), buscaProduto = new String();
		char answer;
		Scanner sc = new Scanner(System.in);
		
		String[] nome = new String[15];
		String[] endereco = new String[15];
		String[] telefone = new String[15];
		
		String[] nomeProduto = new String[15];
		String[] descricaoProduto = new String[15];
		String[] valorProduto = new String[15];
		String[] lucroProduto = new String[15];
		int[] estoqueProduto = new int[15];
		
		// Tests
		nome[0] = "João"; nome[1] = "Maria"; nome[2] = "Mateus"; nome[3] = "Mariana"; nome[4] = "Bruna"; nome[5] = "Bruno"; 
		nome[6] = "José"; nome[7] = "Carlos"; nome[8] = "Josefina"; nome[9] = "Cadu";
		endereco[0] = "Casa"; endereco[1] = "Apartamento"; endereco[2] = "Casa"; endereco[3] = "Apartamento"; endereco[4] = "Casa";
		endereco[5] = "Apartamento"; endereco[6] = "Casa"; endereco[7] = "Apartamento"; endereco[8] = "Casa"; endereco[9] = "Casa";
		telefone[0] = "01"; telefone[1] = "02"; telefone[2] = "03"; telefone[3] = "04"; telefone[4] = "05"; telefone[5] = "06";
		telefone[6] = "07"; telefone[7] = "08"; telefone[8] = "09"; telefone[9] = "10";
		nomeProduto[0] = "Lápis"; nomeProduto[1] = "Borracha"; nomeProduto[2] = "Papel"; nomeProduto[3] = "Apontador"; 
		nomeProduto[4] = "Tesoura"; nomeProduto[5] = "Cola"; nomeProduto[6] = "Caneta"; nomeProduto[7] = "Lapiseira"; 
		nomeProduto[8] = "Marcador"; nomeProduto[9] = "Lixeira";
		descricaoProduto[0] = "Lápis"; descricaoProduto[1] = "Borracha"; descricaoProduto[2] = "Papel"; descricaoProduto[3] = "Apontador"; 
		descricaoProduto[4] = "Tesoura"; descricaoProduto[5] = "Cola"; descricaoProduto[6] = "Caneta"; descricaoProduto[7] = "Lapiseira"; 
		descricaoProduto[8] = "Marcador"; descricaoProduto[9] = "Lixeira";
		valorProduto[0] = "R$ 1,00"; valorProduto[1] = "R$ 2,00"; valorProduto[2] = "R$ 3,00"; valorProduto[3] = "R$ 4,00";
		valorProduto[4] = "R$ 5,00"; valorProduto[5] = "R$ 6,00"; valorProduto[6] = "R$ 7,00"; valorProduto[7] = "R$ 8,00";
		valorProduto[8] = "R$ 9,00"; valorProduto[9] = "R$ 10,00"; 
		lucroProduto[0] = "2"; lucroProduto[1] = "4"; lucroProduto[2] = "6"; lucroProduto[3] = "8"; lucroProduto[4] = "10";
		lucroProduto[5] = "12"; lucroProduto[6] = "14"; lucroProduto[7] = "16"; lucroProduto[8] = "18"; lucroProduto[9] = "20";
		estoqueProduto[0] = 5; estoqueProduto[1] = 10; estoqueProduto[2] = 15; estoqueProduto[3] = 20; estoqueProduto[4] = 25;
		estoqueProduto[5] = 30; estoqueProduto[6] = 35; estoqueProduto[7] = 40; estoqueProduto[8] = 45; estoqueProduto[9] = 50;
		
		do {
		System.out.println("Digite o número da opção desejada:\n1. Cadastro de novo cliente.\n"
						   + "2. Busca por cliente.\n3. Cadastro de novo produto.\n4. Busca por produto.\n"
						   + "5. Cadastro de venda.\n6. Mostrar produtos em estoque.\n7. Sair");
		selecao = sc.nextInt(); // Case selection
		
		
			switch(selecao) {
			case 1: // New customer
					System.out.println("Digite a quantidade de clientes a serem cadastrados(máx: 5): ");
					quantidadeClientes = sc.nextInt();
					clientesCadastrados += quantidadeClientes;
					for(i = 10; i < (10 + quantidadeClientes); i++) {
						System.out.println("Digite o nome do cliente " + (i-9));
						nome[i] = sc.next();
						sc.nextLine();
						System.out.println("Digite o endereço do cliente " + (i-9));
						endereco[i] = sc.nextLine();
						System.out.println("Digite o telefone do cliente " + (i-9));
						telefone[i] = sc.next();
					}
					
					System.out.println("Cliente(s) registrados com sucesso!");
					break;
					
			case 2: // Customer search
					System.out.println("Digite o nome do cliente: ");
					buscaCliente =  sc.next();
					for(i = 0; i < 15; i++) {
						if(nome[i].equals(buscaCliente)) {
							System.out.println("Nome: " + nome[i] + "\nEndereço: " + endereco[i] + "\n"
									+ "Telefone: " + telefone[i]);
							System.out.println("Deseja alterar algum dado do cliente? [y/n]");
							answer = sc.next().charAt(0);
							
							if(answer == 'y') {
								System.out.println("Digite os novos dados do cliente: ");
								nome[i] = sc.next();
								endereco[i] = sc.next();
								telefone[i] = sc.next();
								System.out.println("Os novos dados são:\nNome: " + nome[i] + "\nEndereço: "
								+ endereco[i] + "\nTelefone: " + telefone[i]);
								t = 1;
							} else {
								break;
							}
							
						}
					}
					if (t == 0) {
						System.out.println("Cliente não encontrado!");
					}
					
					break;
					
			case 3: // New product
					System.out.println("Digite a quantidade de produtos a serem cadastrados(máx: 5): ");
					quantidadeProdutos = sc.nextInt();
					produtosCadastrados += quantidadeProdutos;
					for(i = 10; i < (10 + quantidadeProdutos); i++) {
						System.out.println("Digite o nome, descrição, valor, porcentagem de lucro e quantidade em estoque do produto "
								+ (i-9));
						nomeProduto[i] = sc.next();
						sc.next();
						descricaoProduto[i] = sc.nextLine();
						valorProduto[i] = sc.next();
						lucroProduto[i] = sc.next();
						estoqueProduto[i] = sc.nextInt();
					}
					
					break;
					
			case 4: // Product search
					System.out.println("Digite o nome do produto: ");
					buscaProduto = sc.next();
					for(i = 0; i < 15; i++) {
						if(buscaProduto.equals(nomeProduto[i])) {
							System.out.println("Produto: " + nomeProduto[i] + "\nDescrição: " + descricaoProduto[i] + "\nValor: "
									+ valorProduto[i] + "\nPorcentagem de lucro: " + lucroProduto[i] +
									"%\nQuantidade no estoque: " + estoqueProduto[i]);
							System.out.println("Deseja alterar algum dado do produto? [y/n]");
							answer = sc.next().charAt(0);
							
							if(answer == 'y') {
								System.out.println("Digite os novos dados do produto: ");
								nomeProduto[i] = sc.next();
								descricaoProduto[i] = sc.next();
								valorProduto[i] = sc.next();
								lucroProduto[i] = sc.next();
								estoqueProduto[i] = sc.nextInt();
								System.out.println("Os novos dados são:\nProduto: " + nomeProduto[i] + "\nDescrição: " + 
										descricaoProduto[i] + "\nValor: " + valorProduto[i] + "\nPorcentagem de lucro: " +
										lucroProduto[i] + "%\nQuantidade no estoque: " + estoqueProduto[i]);
								t = 1;
							}
							else {
								t = 1;
								break;
							}
						}
					}
					
					if (t == 0) {
						System.out.println("Produto não encontrado!");
					}
					
					break;
			case 5: // Sale
					System.out.println("Selecione um cliente:\n");
					for(i = 0; i < clientesCadastrados; i++) {
						System.out.println((i+1) + ". " + nome[i]);
					}
					selecaoCliente = sc.nextInt();
					while (t == 0) {
						System.out.println("Selecione um produto:\n");
						for(i = 0; i < produtosCadastrados; i++) {
						System.out.println((i+1) + ". " + nomeProduto[i]);
						}
						selecaoProduto = sc.nextInt();
						System.out.println("Quantos foram vendidos?");
						vendaProduto = sc.nextInt();
						estoqueProduto[(selecaoProduto - 1)] = estoqueProduto[(selecaoProduto - 1)] - vendaProduto;
						System.out.println("Deseja cadastrar mais vendas para esse cliente? [y/n]");
						answer = sc.next().charAt(0);
						if(answer == 'n') {
							t = 1;
						}
					}
					
					break;
			case 6: System.out.println("Estoque:");
					for(i = 0; i < produtosCadastrados; i++) {
							System.out.println((i+1) + ". " + nomeProduto[i] + ": " + estoqueProduto[i] + " Unidades.");
					}
					
					break;
					
			case 7: // Exit
					System.out.println("Programa encerrado!");
					System.exit(0);
			default: System.out.println("Opção inválida, reiniciar programa!");
					 System.exit(0);
		}
			System.out.println("\n");
		} while (selecao != 7);
		
		sc.close();
		
		}
		
	}
