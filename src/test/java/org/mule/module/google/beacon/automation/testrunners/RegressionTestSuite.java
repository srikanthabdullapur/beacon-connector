
package org.mule.module.google.beacon.automation.testrunners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.mule.module.google.beacon.GoogleBeaconConnector;
import org.mule.module.google.beacon.automation.testcases.ActivateBeaconTestCases;
import org.mule.module.google.beacon.automation.testcases.BatchDeleteAttachmentsTestCases;
import org.mule.module.google.beacon.automation.testcases.CreateAttachmentTestCases;
import org.mule.module.google.beacon.automation.testcases.DeactivateBeaconTestCases;
import org.mule.module.google.beacon.automation.testcases.DecommissionBeaconTestCases;
import org.mule.module.google.beacon.automation.testcases.DeleteAttachmentTestCases;
import org.mule.module.google.beacon.automation.testcases.GetBeaconInfoTestCases;
import org.mule.module.google.beacon.automation.testcases.GetBeaconsTestCases;
import org.mule.module.google.beacon.automation.testcases.ListAttachmentsTestCases;
import org.mule.module.google.beacon.automation.testcases.ListBeaconsTestCases;
import org.mule.module.google.beacon.automation.testcases.RegisterBeaconTestCases;
import org.mule.module.google.beacon.automation.testcases.UpdateBeaconTestCases;
import org.mule.tools.devkit.ctf.junit.RegressionTests;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

@RunWith(org.junit.experimental.categories.Categories.class)
@org.junit.experimental.categories.Categories.IncludeCategory(RegressionTests.class)
@org.junit.runners.Suite.SuiteClasses({
    ListAttachmentsTestCases.class,
    RegisterBeaconTestCases.class,
    ActivateBeaconTestCases.class,
    DeactivateBeaconTestCases.class,
    DecommissionBeaconTestCases.class,
    GetBeaconInfoTestCases.class,
    GetBeaconsTestCases.class,
    ListBeaconsTestCases.class,
    UpdateBeaconTestCases.class,
    CreateAttachmentTestCases.class,
    BatchDeleteAttachmentsTestCases.class,
    DeleteAttachmentTestCases.class
})
public class RegressionTestSuite {


    @BeforeClass
    public static void initialiseSuite() {
        ConnectorTestContext.initialize(GoogleBeaconConnector.class);
    }

    @AfterClass
    public static void shutdownSuite() {
        ConnectorTestContext.shutDown();
    }

}
