
package simple.maven.glassfish.jaxrs.resource;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import simple.maven.glassfish.jaxrs.response.HelloMessage;


public class SimpleResourceTest {
    
    public SimpleResourceTest() {
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
     * Test of helloMessage method, of class SimpleResource.
     */
    @Test
    public void testHelloMessage() {
        System.out.println("helloMessage");
        
        String message = "testtest";
        
        // result
        SimpleResource instance = new SimpleResource();
        HelloMessage result = instance.helloMessage(message);
        
        // assert
        assertEquals("Hello, " + message, result.getMessage());
    }

    /**
     * Test of pathParamSample method, of class SimpleResource.
     */
    /*
    @Test
    public void testPathParamSample() {
        System.out.println("pathParamSample");
        int op1 = 0;
        int op2 = 0;
        SimpleResource instance = new SimpleResource();
        String expResult = "";
        String result = instance.pathParamSample(op1, op2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */

    /**
     * Test of pathParamSample2 method, of class SimpleResource.
     */
    /*
    @Test
    public void testPathParamSample2() {
        System.out.println("pathParamSample2");
        int op1 = 0;
        int op2 = 0;
        SimpleResource instance = new SimpleResource();
        String expResult = "";
        String result = instance.pathParamSample2(op1, op2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    
}
