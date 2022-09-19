
package ti827calculator;


class Expoente {

    static void potencial() {
        LeDados r =new LeDados();
        r.readValores("Insira o valor da base: ","Insira o valor do expoente: ");
        System.out.println("Potência: "+Math.pow(r.valor1, r.valor2));
    }
    
}
