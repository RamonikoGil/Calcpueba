/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package matematicas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ramon
 */
public class CalcPruebaTest {
    
    public CalcPruebaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setNum1 method, of class CalcPrueba.
     */
    @org.junit.jupiter.api.Test
    public void testSetNum1() {
        System.out.println("setNum1");
        int _num1 = 0;
        CalcPrueba instance = null;
        instance.setNum1(_num1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of suma method, of class CalcPrueba.
     */
    @org.junit.jupiter.api.Test
    public void testSuma() {
        System.out.println("suma");
        CalcPrueba instance = null;
        int expResult = 0;
        int result = instance.suma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class CalcPrueba.
     */
    @org.junit.jupiter.api.Test
    public void testResta() {
        System.out.println("resta");
        CalcPrueba instance = null;
        int expResult = 0;
        int result = instance.resta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
