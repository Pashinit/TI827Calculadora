
package ti827calculator;

class IMC {

    static void calculaIMC() {
        float imc1;
        LeDados r =new LeDados();
        r.readValores();
        imc1 = (r.valor1/(r.valor2*r.valor2));
        System.out.print("IMC: "+imc1+" ");
        
        
        
        if (imc1 < 18.5)
            System.out.println(" \"Abaixo do Peso\" ");
            else if (imc1 > 18.5 && imc1 < 24.9)
                System.out.println(" \"Peso Normal\" ");
            else if (imc1 > 25 && imc1 < 29.9)
                System.out.println("\"Sobrepeso\" ");
            else if (imc1 > 30 && imc1 < 34.9)
                System.out.println(" \"Obesidade Grau I\" ");
            else if (imc1 > 35 && imc1 < 39.9)
                System.out.println(" \"Obesidade Grau II\" ");
        else
            System.out.println(" \"Obesidade Grau III ou Mórbida\" ");
    }
    
}
