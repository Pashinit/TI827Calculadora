
package ti827calculator;

class Multiplica {

    static void multiplicar() {
        LeDados r =new LeDados();
        r.readValores("Insira o primeiro valor: ", "Insira o segundo valor:");
        System.out.println("Multiplicação: "+(r.valor1*r.valor2));
    }
    
}
