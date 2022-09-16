
package ti827calculator;

class Soma {

    static void somar() {
        LeDados r =new LeDados();
        r.readValores();
        System.out.println("Soma: "+(r.valor1+r.valor2));
    }
  
}
