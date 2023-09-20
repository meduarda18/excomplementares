public class Calculadora {
  private int opcao;
  private double operando1;  
  private double operando2;
  private double result;


  public Calculadora(int opcao, double operando1, double operando2){
    this.opcao = opcao;
    this.operando1 = operando1;
    this.operando2 = operando2;
  }

  public double calcular(){
    if(opcao == 1){
      result = operando1 + operando2;
    } else if (opcao == 2){
      result = operando1 - operando2;
    }else if (opcao == 3){
      result = operando1 / operando2;
    }else if (opcao == 4){
      result = operando1 * operando2;
    }

    return result; 
  }

  public static void main(String[] args) {
    Calculadora calculo1 = new Calculadora(1, 30, 2);
    calculo1.calcular();
    System.out.println(calculo1.result);

  }
}
