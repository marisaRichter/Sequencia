/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class SequenciaTest {
    
    Sequencia numbers;
    
    @Before
    public void inicializa(){
        
        numbers = new Sequencia();
        numbers.setValores(6);
        numbers.setValores(9);
        numbers.setValores(15);
        numbers.setValores(-2);
        numbers.setValores(92);
        numbers.setValores(11);
    }    
    
    @Test
    public void chekMin(){        
        assertEquals(-2, numbers.getMinimo());        
    }
    
    @Test
    public void chekMax(){        
        assertEquals(92, numbers.getMaximo());        
    }
    
    @Test
    public void chekSize(){        
        assertEquals(6, numbers.getSize());        
    }
    
    @Test
    public void chekMedia(){     
        double expected = 21.833333333333332;
        double actual = numbers.getMedia();
        assertEquals(expected, actual, actual);
    }
}
