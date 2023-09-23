
package calculadora;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraJUnit {


        Calculadora calculadora = new Calculadora();
        Soma sum = new Soma();
        Subtracao sub = new Subtracao();
        Multiplicacao mult = new Multiplicacao();
        Divisao div = new Divisao();

    //@Test
    public void testeSomar() {
        assertEquals(3, sum.somar (1, 2));
        assertEquals(4, sum.somar(4, 0));
        assertEquals(0, sum.somar(0, 0));
        assertEquals(1, sum.somar(-2, 3));
        assertEquals(-8, sum.somar(-5, -3));
    }

    //Test
    public void testeSubtrair() {
        assertEquals(-1, sub.subtrair(1, 2));
        assertEquals(4, sub.subtrair(4, 0));
        assertEquals(0, sub.subtrair(0, 0));
        assertEquals(-5, sub.subtrair(-2, 3));
        assertEquals(-2, sub.subtrair(-5, -3));
    }

    //Test
    public void testMultiplicar() {
        assertEquals(2, mult.multiplicar(1, 2));
        assertEquals(0, mult.multiplicar(4, 0));
        assertEquals(0, mult.multiplicar(0, 0));
        assertEquals(-6, mult.multiplicar(-2, 3));
        assertEquals(15, mult.multiplicar(-5, -3));
    }

    //@Test
    public void testDividir() {
        assertEquals(2, div.dividir(4, 2));
        assertEquals(0, div.dividir(0, 4));
        assertEquals(1, div.dividir(3, 3));
        assertEquals(-1, div.dividir(-2, 2));
        assertEquals(1, div.dividir(-5, -5));
        

        }

    private void assertEquals(int i, int somar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

