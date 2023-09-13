public class Estudante{
  public String nome;
  public int matricula;
  private float nota1;  
  private float nota2;
  private float nota3;
  private float media;


  public Estudante(String nome, int matricula, float nota1, float nota2, float nota3){
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

  public void setNota1(float nota1){
    this.nota1 = nota1;
  }

  public void setNota2(float nota2){
    this.nota2 = nota2;
  }

  public void setNota3(float nota3){
    this.nota3 = nota3;
  }

  public void mediaAluno(){
    if (nota1 >= 0.0f && nota1 <= 10.0f && nota2 >= 0.0f && nota2 <= 10.0f && nota3 >= 0.0f && nota3 <= 10.0f){
      media = (nota1 + nota2 + nota3)/3.0f;
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
    Estudante estudante1 = new Estudante("Maria", 202020, 7.5f, 8.0f, 9.0f);
    estudante1.mediaAluno();
    System.out.println(estudante1.getNome());
    System.out.println(estudante1.getMatricula());    
    System.out.printf("%.2f", estudante1.media);

  }

}

