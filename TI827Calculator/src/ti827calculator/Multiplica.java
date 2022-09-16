
package ti827calculator;

class Multiplica {

    static void multiplicar() {
        LeDados r =new LeDados();
        r.readValores();
        System.out.println("Multiplicação: "+(r.valor1*r.valor2));
    }
    
}
