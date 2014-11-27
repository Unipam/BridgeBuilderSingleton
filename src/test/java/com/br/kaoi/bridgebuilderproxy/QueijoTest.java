/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.kaoi.bridgebuilderproxy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vinicius
 */
public class QueijoTest {
    
    public QueijoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }



    /**
     * Test of colocarRecheio method, of class Queijo.
     */
    @org.junit.Test
    public void testSingletonQueijo() {
        Queijo q1 = Queijo.getQueijo();
        Queijo q2 = Queijo.getQueijo();
        
        assertEquals(q1,q2);
               
    }
    
}
