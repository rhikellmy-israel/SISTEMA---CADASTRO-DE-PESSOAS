public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String profissao;

    public Pessoa(String nome, int idade, String cpf, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.profissao = profissao;
    }
    public boolean IsCadastro(){
        boolean cadastrado = true;
        return cadastrado;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getCpf() {
        return cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void add() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}

