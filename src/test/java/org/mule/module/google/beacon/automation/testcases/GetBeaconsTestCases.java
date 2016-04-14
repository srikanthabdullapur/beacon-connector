
package org.mule.module.google.beacon.automation.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.module.google.beacon.automation.AbstractTestCase;
import org.mule.tools.devkit.ctf.junit.RegressionTests;

public class GetBeaconsTestCases
    extends AbstractTestCase
{


    @Before
    public void setUp() {
        //TODO: Add code to add @Before behaviour to your test.
    }

    @After
    public void tearDown()
        throws Exception
    {
        //TODO: Add code to reset sandbox state to the one before the test was run or remove.
    }

    @Test
    @Category(RegressionTests.class)
    public void testGetBeacons() {
        //TODO: You need to call directly the methods of the connector being tested as follows 
        //Object result = connector.getBeacons( <Method Parameters> );
    }

}
