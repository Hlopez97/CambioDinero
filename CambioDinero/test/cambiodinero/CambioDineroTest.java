/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiodinero;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hecto
 */
public class CambioDineroTest {
    
    public CambioDineroTest() {
    }
    
    
    @Test
    public void testSC1_TC1() {
        int numero = 0;
        int[] expResult = {0,0,0,0,0,0,0,0,0,0};
        int[] result = CambioDinero.Cambio(numero);       
        for (int a =0; a<  result.length; a++)
        {
            if (expResult[a] != result[a])
            {
                fail("no es igual");
            }
        }

    } 
    @Test
    public void testSC1_TC2() {
        int numero = -1;
        int[] expResult = {0,0,0,0,0,0,0,0,0,0};
        int[] result = CambioDinero.Cambio(numero);       
        for (int a =0; a<  result.length; a++)
        {
            if (expResult[a] != result[a])
            {
                fail("no es igual");
            }
        }

    }
    @Test
    public void testSC2_TC1() {
        int numero = 2000;
        int[] expResult = {1,0,0,0,0,0,0,0,0,0};
        int[] result = CambioDinero.Cambio(numero);       
        for (int a =0; a<  result.length; a++)
        {
            if (expResult[a] != result[a])
            {
                fail("no es igual");
            }
        }

    }
    @Test
    public void testSC2_TC2() {
        int numero = 4000;
        int[] expResult = {2,0,0,0,0,0,0,0,0,0};
        int[] result = CambioDinero.Cambio(numero);       
        for (int a =0; a<  result.length; a++)
        {
            if (expResult[a] != result[a])
            {
                fail("no es igual");
            }
        }

    }
    @Test
    public void testSC3_TC1() {
        int numero = 7000;
        int[] expResult = {3,1,0,0,0,0,0,0,0,0};
        int[] result = CambioDinero.Cambio(numero);       
        for (int a =0; a<  result.length; a++)
        {
            if (expResult[a] != result[a])
            {
                fail("no es igual");
            }
        }

    }
    @Test
    public void testSC4_TC1() {
        int numero = 1297500;
        int[] expResult = {648,1,1,0,0,0,0,0,0,0};
        int[] result = CambioDinero.Cambio(numero);       
        for (int a =0; a<  result.length; a++)
        {
            if (expResult[a] != result[a])
            {
                fail("no es igual");
            }
        }

    }
    @Test
    public void testSC5_TC1() {
        int numero = 3800;
        int[] expResult = {1,1,1,1,1,0,0,0,0,0};
        int[] result = CambioDinero.Cambio(numero);       
        for (int a =0; a<  result.length; a++)
        {
            if (expResult[a] != result[a])
            {
                fail("no es igual");
            }
        }

    }
    @Test
    public void testSC6_TC1() {
        int numero = 3875;
        int[] expResult = {1,1,1,1,1,1,1,0,0,0};
        int[] result = CambioDinero.Cambio(numero);       
        for (int a =0; a<  result.length; a++)
        {
            if (expResult[a] != result[a])
            {
                fail("no es igual");
            }
        }

    }
    @Test
    public void testSC7_TC1() {
        int numero = 3890;
        int[] expResult = {1,1,1,1,1,1,1,1,1,0};
        int[] result = CambioDinero.Cambio(numero);       
        for (int a =0; a<  result.length; a++)
        {
            if (expResult[a] != result[a])
            {
                fail("no es igual");
            }
        }

    }
    @Test
    public void testSC8_TC1() {
        int numero = 3894;
        int[] expResult = {1,1,1,1,1,1,1,1,1,4};
        int[] result = CambioDinero.Cambio(numero);       
        for (int a =0; a<  result.length; a++)
        {
            if (expResult[a] != result[a])
            {
                fail("no es igual");
            }
        }

    }
    @Test
    public void testSC8_TC2() {
        int numero = 7887894;
        int[] expResult = {3943,1,1,1,1,1,1,1,1,4};
        int[] result = CambioDinero.Cambio(numero);       
        for (int a =0; a<  result.length; a++)
        {
            if (expResult[a] != result[a])
            {
                fail("no es igual");
            }
        }

    }
    

}
