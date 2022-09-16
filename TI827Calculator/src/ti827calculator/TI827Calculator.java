
package ti827calculator;

import java.util.Scanner;


public class TI827Calculator {

    public static Scanner read = new Scanner(System.in);
            
    public static void main(String[] args) {
        char op;
        do{
            System.out.println("--- MENU CALCULADORA ---");
            System.out.println("+ : Soma");
            System.out.println("- : Subtração");
            System.out.println("* : Multiplicação");
            System.out.println("/ : Divisão");
            System.out.println("e : Expoente");  
            System.out.println("i : IMC"); 
            System.out.println("s : Sair");
            System.out.println("Selecione o poperador da opção pretendida");
            op = read.next().charAt(0);
            
            switch (op){
                case '+': Soma.somar();break;
                case '-': Subtrai.subtrair();break;
                case '*': Multiplica.multiplicar();break;
                case '/': Divide.dividir();break;
                case 'e':
                case 'E': Expoente.potencial();break;
                case 'i':
                case 'I': IMC.calculaIMC();break;
                case 's':
                case 'S': break;
                default: System.out.println("Operador incorreto");
            }
        }while (op!='s' && op !='S');
        
    }
    
}
