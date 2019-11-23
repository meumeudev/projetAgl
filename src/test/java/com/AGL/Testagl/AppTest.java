package com.AGL.Testagl;

import org.junit.Before;

import junit.framework.Test;
import service.impl.Calcul;


import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	private Calcul c;
	@Before
public void setup()
{
		 c=new Calcul();
}
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void testApp()
    {
    	
    	assertEquals(100,c.multiplication(10, 10));
    	int res1=c.addition(10, 10);
    	int res2=c.multiplication(10, 2);
    	//assertEquals(40,c.addition(30, 10));
    	//assertEquals(40,c.addition(30, 10));
    	assertTrue("verifie",res1==res2);
    	
    	
    
    }
}
