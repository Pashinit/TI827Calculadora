
package ti827calculator;


class Divide {

    static void dividir() {
        LeDados r =new LeDados();
        r.readValores();
        System.out.println("Divisão: "+(r.valor1/r.valor2));
    }
    
}
