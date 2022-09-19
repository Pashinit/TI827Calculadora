
package ti827calculator;

public class LeDados {
    
    public float valor1, valor2;
    
    public void readValores(String s1, String s2){
        System.out.println(s1);
        valor1 = TI827Calculator.read.nextFloat();
        System.out.println(s2);
        valor2 = TI827Calculator.read.nextFloat();
    }
}
