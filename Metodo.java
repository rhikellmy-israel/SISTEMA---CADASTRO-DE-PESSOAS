import java.util.List;
import java.util.Scanner;

public class Metodo {
    //Método para cadastrar uma pessoa
    public static void push(List<Pessoa>lista) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa: ");
        String nome = sc.nextLine();

        System.out.println("Informe a idade da pessoa: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Informe o CPF da pessoa: ");
        String cpf = sc.nextLine();

        System.out.println("Digite a profissáo da pessoa: ");
        String profissao = sc.nextLine();

        Pessoa pessoa = new Pessoa(nome, idade, cpf, profissao);
        
        lista.add(pessoa);

        System.out.println("Pessoa - " + pessoa.getNome() + " - cadastrada com sucesso!"
        );

        System.out.println("Pessoa cadastrada com sucesso!");
    }
    

    // Método para mostrar toda a lista de pessoas cadastradas
    public static void listaPessoa(List<Pessoa> lista) {
        if (lista.isEmpty()) {
            System.out.println("A lista esta vazia");
        } else {
            for (Pessoa pessoaAtual : lista) {
                System.out.println("Nome: " + pessoaAtual.getNome());
                System.out.println("Idade: " + pessoaAtual.getIdade());
                System.out.println("CPF: " + pessoaAtual.getCpf());
                System.out.println("Profissão: " + pessoaAtual.getProfissao());
                System.out.println("----------");
            }
        }
    }

    // Método para deletar um cadastro de pessoa

    public static void deletar(List<Pessoa> lista, String nomeParaDeletar){
        for(int i = 0; i < lista.size(); i++){
            Pessoa p = lista.get(i);
            if(p.getNome().equalsIgnoreCase(nomeParaDeletar)){
                lista.remove(i);
                System.out.println("Pessoa Deletada da lista com sucesso!");
                return;
            }
        }
        System.out.println("Não foi possivel encontrar a pessoa mencionada");
    }

    public static void alterar(List<Pessoa> lista, String nomeParaAlterar){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < lista.size(); i++){
            Pessoa p = lista.get(i);

            if(p.getNome().equalsIgnoreCase(nomeParaAlterar)){
                System.out.println("Digite o novo nome: ");
                String novoNome = sc.nextLine();

                System.out.println("Digite a idade dessa pessoa: ");
                int novaIdade = sc.nextInt();
                sc.nextLine();

                System.out.println("Digite o CPF dessa pessoa: ");
                String novoCpf = sc.nextLine();

                System.out.println("Informe a profissão dessa pessoa: ");
                String novaProfissao = sc.nextLine();

                
                p.setNome(novoNome);
                p.setIdade(novaIdade);
                p.setCpf(novoCpf);
                p.setProfissao(novaProfissao);

                System.out.println("Pessoa atualizada com sucesso!");
            }
        }
        
    }
}

    


