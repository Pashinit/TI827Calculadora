
package ti827calculator;

class Subtrai {

    static void subtrair() {
        LeDados r =new LeDados();
        r.readValores("Insira o primeiro valor: ", "Insira o segundo valor:");
        System.out.println("Subtração: "+(r.valor1-r.valor2));
    }
    
}
