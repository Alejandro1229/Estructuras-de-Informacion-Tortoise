
package co.edu.ucundinamarca.taller3;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
import tallern3.Funciones;

public class Funcionestesst {
    
    @Test
    public void testFunciones(){
        
        int fun = Funciones.FactorialRec(3);
        assertEquals( 6, fun);
    }
    
    @Test
    public void testFuncionesIterativa (){
        
        int fun =Funciones.Factorial(3);
        assertEquals(6, fun);
    }
    
    
}
