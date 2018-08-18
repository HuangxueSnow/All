/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylibrary1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    /*@Test
    public void testMyChainList(){
        MyList list= new MyChainList();
        list.add(1);
        list.add(2);
        assertEquals(list.size(),2);
        assertEquals(1,list.get(0));
        assertEquals(2,list.get(1));
        list.remove(0);
        assertEquals(list.size(),1);
        assertEquals(list.get(1),null);
        assertEquals(list.get(0),1);
        
    }*/
    @Test
    public void testMyChainListSize(){
        MyChainList list = new MyChainList();
        list.add(1);
        int size = list.size();
        assertEquals(size,1);
        
        list.add(2);
        size = list.size();
        assertEquals(size,2);
        
        list.removeAt(0);
        size = list.size();
        assertEquals(size,1);
        
        list.removeAt(0);
        size = list.size();
        assertEquals(size,0);
        
    }
    
    @Test
    public void testMyListAdd() {
        MyChainList list= new MyChainList();
        list.add(1);
        int i = (Integer)list.get(0);
        assertEquals(i,1);
        
        list.add(2);
        i = (Integer)list.get(1);
        assertEquals(i,2);
        i = (Integer)list.get(0);
        assertEquals(i,1);
    }
    @Test
    public void testMyListRemove() {
        MyChainList list= new MyChainList();
        list.add("A");
        list.add('B');
        list.add('C');
        
        list.removeAt(0);
        int size = list.size();
        assertEquals(size,2);
        char c = (Character)list.get(0);
        assertEquals(c,'B');
        c = (Character)list.get(1);
        assertEquals(c,'C');
        
        list.remove('C');
        size = list.size();
        assertEquals(size,1);
        c = (Character)list.get(0);
        assertEquals(c,'B');
    }
}
