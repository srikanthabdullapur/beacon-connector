
package org.mule.module.google.beacon.automation;

import org.junit.After;
import org.junit.Before;
import org.mule.module.google.beacon.GoogleBeaconConnector;
import org.mule.tools.devkit.ctf.mockup.ConnectorDispatcher;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

public abstract class AbstractTestCase {

    private GoogleBeaconConnector connector;
    private ConnectorDispatcher<GoogleBeaconConnector> dispatcher;

    protected GoogleBeaconConnector getConnector() {
        return connector;
    }

    protected ConnectorDispatcher<GoogleBeaconConnector> getDispatcher() {
        return dispatcher;
    }

    @Before
    public void init() {
        //Initialization for single-test run
        ConnectorTestContext.initialize(GoogleBeaconConnector.class, false);
        //Context instance
        ConnectorTestContext<GoogleBeaconConnector> context = ConnectorTestContext.getInstance(GoogleBeaconConnector.class);
        //Connector dispatcher
        dispatcher = context.getConnectorDispatcher();
        connector = dispatcher.createMockup();
    }

    @After
    public void shutDown() {
        ConnectorTestContext.shutDown(false);
    }

}
