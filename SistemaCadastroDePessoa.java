import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaCadastroDePessoa {
    public static void main(String[] args) {
        System.out.println("====== Cadastro de Pessoas ======");
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> lista = new ArrayList<>();
        
    while(true){
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar pessoa");
        System.out.println("2 - Listar pessoas cadastradas");
        System.out.println("3 - Deletar pessoa cadastrada");    
        System.out.println("4 - Alterar Pessoa");
        System.out.println("5 - Sair");
        System.out.println("---------------------------------");

        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                Metodo.push(lista);
                System.out.println(" ");
            
                break;
            case 2:
                Metodo.listaPessoa(lista);
                System.out.println(" ");

                break;
            case 3:
                System.out.println("Digite o nome da pessoa que deseja deletar: ");
                String nomeParaDeletar = sc.nextLine();
                Metodo.deletar(lista, nomeParaDeletar);
                System.out.println(" ");

                break;
            case 4:
                System.out.println("Digite o nome da pessoa que deseja alterar: ");
                String nomeParaAlterar = sc.nextLine();
                Metodo.alterar(lista, nomeParaAlterar);
                break;
            case 5:
                System.out.println("Encerrando o programa...");
                sc.close();
                System.out.println(" ");
                return;
            default:
                System.out.println("Opção inválida! Tente novamente.");
            }

        }
    }
}
