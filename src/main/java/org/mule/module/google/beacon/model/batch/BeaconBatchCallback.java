/**
 * Mule Google Beacon Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.google.beacon.model.batch;


import org.mule.modules.google.api.client.batch.BatchCallback;

import com.google.api.services.calendar.model.Calendar;
import com.google.api.services.proximitybeacon.model.Beacon;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class BeaconBatchCallback extends BatchCallback<org.mule.module.google.beacon.model.Beacon, Beacon> {
	
	/*@Override
	protected org.mule.module.google.beacon.model.Calendar typeToWrapper(Calendar object) {
		return new org.mule.module.google.beacon.model.Calendar(object);
	}*/

	@Override
	protected org.mule.module.google.beacon.model.Beacon typeToWrapper(Beacon object) {
		return new org.mule.module.google.beacon.model.Beacon(object);
	}
	
	
	

}
