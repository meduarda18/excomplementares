public class Estudante{
  public String nome;
  public int matricula;
  private double nota1, nota2, nota3;  
  private double media;


  public Estudante(String nome, int matricula, double nota1, double nota2, double nota3){
    this.nome = nome;
    this.matricula = matricula;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
  }

  public String getNome(){
    return nome;
  }

  public int getMatricula(){
    return matricula;
  }

  public void setNota(double nota1, double nota2, double nota3){
    this.nota1 = nota1;    
    this.nota2 = nota2;
    this.nota3 = nota3;

  }

  public void mediaAluno(){
    if (nota1 >= 0.0 && nota1 <= 10.0 && nota2 >= 0.0 && nota2 <= 10.0 && nota3 >= 0.0 && nota3 <= 10.0){
      media = (nota1 + nota2 + nota3)/3.0;
    }  
  }

  public String verificarMedia(){
    if (media >= 7.0){
      return "Aluno aprovado";
    } else {
      return "Aluno reprovado";
    }
  }

  public static void main(String[] args) {
    Estudante estudante1 = new Estudante("Maria", 202020, 7.5, 8.0, 9.0);
    estudante1.mediaAluno();
    estudante1.verificarMedia();
    System.out.println(estudante1.getNome());
    System.out.println(estudante1.getMatricula());    
    System.out.printf("%.2f\n", estudante1.media);
    System.out.println(estudante1.verificarMedia());

  }

}