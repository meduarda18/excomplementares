public class Livro {
  private String titulo;
  private String autor;
  private double preco;

  public Livro(String titulo, String autor, double preco){
    this.titulo = titulo;
    this.autor = autor;
    this.preco = preco;
  }

  public void apresentar(){
    System.out.printf(titulo, autor, "%.2f", preco);
  }

  public static void main(String[] args) {
    Livro livro1 = new Livro("Amor", "Chico", 35.49);
    System.out.println(livro1.titulo);
    System.out.println(livro1.autor);    
    System.out.println(livro1.preco);

  }
}
