public class Pessoa {
  public String nome;
  public int idade;
  public String endereco;

  public Pessoa(String nome, int idade, String endereco) {
    this.nome = nome;
    this.idade = idade;
    this.endereco = endereco;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("Maria", 18, "Rua João");
    System.out.println(pessoa1.nome);
    System.out.println(pessoa1.idade);    
    System.out.println(pessoa1.endereco);

  }
}
