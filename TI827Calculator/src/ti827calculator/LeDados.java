
package ti827calculator;

public class LeDados {
    
    public float valor1, valor2;
    
    public void readValores(){
        System.out.println("Insira um valor");
        valor1 = TI827Calculator.read.nextFloat();
        System.out.println("Insira outro valor");
        valor2 = TI827Calculator.read.nextFloat();
    }
}
