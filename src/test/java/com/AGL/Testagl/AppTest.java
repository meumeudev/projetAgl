package com.AGL.Testagl;

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
    	Calcul c=new Calcul();
    	double res1=c.addition(30, 10);
    	double rest2=c.multiplication(5, 8);
       assertTrue("verifie",res1==rest2);
    }
}
