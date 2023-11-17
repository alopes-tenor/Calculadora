
package calculadora;

/**
 *
 * @author Amanda Lopes Tenor
 * @version 2.0
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     * Classe Main instanciando todas as classes.
     */
    public static void main(String[] args) {
     /** 
    * Instanciando a classe Soma 
    */
    Soma sum = new Soma();
    System.out.println("Soma");
    /**
     * Primeiro cenário: dois números inteiros
     */
    int teste1 = sum.somar(1, 2);
    System.out.println("Primeiro cenário: dois números inteiros.Resultado= " + teste1);
     /**
     * Segundo cenário: um número e 0 
     */
    int teste2= sum.somar(4,0);
    System.out.println("Segundo cenário: um número e 0.Resultado= " + teste2);
    /**
    * Terceiro cenário: dois números 0 
    */
    int teste3= sum.somar(0,0);
    System.out.println("Terceiro cenário: dois números 0.Resultado= " + teste3);
    /**
     * Quarto cenário: um número negativo e outro positivo
     */
    int teste4= sum.somar(-2,3);
    System.out.println("Quarto cenário: um número negativo e outro positivo.Resultado= " + teste4);
    /**
     * Quinto cenário: dois números negativos
     */
    int teste5= sum.somar(-3,-5);
    System.out.println("Quinto cenário: dois números negativos.Resultado= " + teste5);
    
    /**
     * Instanciando a classe subtração
     */
    Subtracao sub = new Subtracao();
    System.out.println("Subtração");
    /**
     * Primeiro cenário: dois números inteiros
     */
    int testesub1= sub.subtrair(4,3);
    System.out.println("Primeiro cenário: dois números inteiros " + testesub1);
   /**
     * Segundo cenário: um número e 0 
     */
    int testesub2=sub.subtrair(5,0);
    System.out.println("Segundo cenário: um número e zero" + testesub2);
    /**
    * Terceiro cenário: dois números 0 
    */
    int testesub3=sub.subtrair(0,0);
        System.out.println("Terceiro cenário: zero e zero" + testesub3);
    /**
     * Quarto cenário: um número negativo e outro positivo
     */
    int testesub4 = sub.subtrair(-6,7);
        System.out.println("Quarto cenário: um número negativo e outro positivo" + testesub4);
    /**
     * Quinto cenário: dois números negativos
     */
    int testesub5 = sub.subtrair(-5, -4);
        System.out.println("Quinto cenário: dois números negativos" + testesub5);
    /**
     * Instanciando a classe Multiplicação
     */
       Multiplicacao mult = new Multiplicacao();
       System.out.println("Multiplicação");
    /**
     * Primeiro cenário: dois números inteiros
     */
    int testemult1 = mult.multiplicar(5, 30);
     System.out.println("Primeiro cenário: dois números inteiros" + testemult1);
   /**
     * Segundo cenário: um número e 0 
     */
    int testemult2= mult.multiplicar(5,0);
    System.out.println("Segundo cenário: um número e zero" + testemult2);
    /**
    * Terceiro cenário: dois números 0 
    */
    int testemult3=mult.multiplicar(0,0);
    System.out.println("Terceiro cenário: zero e zero" + testemult3);
    /**
     * Quarto cenário: um número negativo e outro positivo
     */
    int testemult4 = mult.multiplicar(-6,7);
        System.out.println("Quarto cenário: um número negativo e outro positivo" + testemult4);
    /**
     * Quinto cenário: dois números negativos
     */
    int testemult5 = mult.multiplicar(-5, -4);
        System.out.println("Quinto cenário: dois números negativos"+ testemult5);
        
    /**
     * Instanciando a classe Divisão
     */
        Divisao div = new Divisao();
        System.out.println("Divisão");
    /**
     * Primeiro cenário: dois números inteiros
     */
    int testediv1 = div.dividir(5, 30);
     System.out.println(testediv1);
   /**
     * Segundo cenário: um número e 0 
     */
    int testediv2= div.dividir(5,0);
    System.out.println("Segundo cenário: um número e zero" + testediv2);
    /**
    * Terceiro cenário: dois números 0 
    */
    int testediv3 = div.dividir(0,0);
    System.out.println("Terceiro cenário: zero e zero" + testediv3);
    /**
     * Quarto cenário: um número negativo e outro positivo
     */
    int testediv4 = div.dividir(-6,7);
        System.out.println("Quarto cenário: um número negativo e outro positivo" + testediv4);
    /**
     * Quinto cenário: dois números negativos
     */
    int testediv5 = div.dividir(-5, -4);
        System.out.println("Quinto cenário: dois números negativos"+ testediv5);
       
    }

    
}
