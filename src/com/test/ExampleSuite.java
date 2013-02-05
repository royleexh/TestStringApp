package com.test;

import junit.framework.TestSuite;


public class ExampleSuite extends TestSuite
{
    public ExampleSuite() 
    {
        addTestSuite( SampleStringTest.class );
    }
}
