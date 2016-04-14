/**
 * Mule Google Beacon Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.module.google.beacon.model;

import org.mule.modules.google.api.model.BaseWrapper;

public class LatLng extends BaseWrapper<com.google.api.services.proximitybeacon.model.LatLng>{
	public LatLng() {
		this (new com.google.api.services.proximitybeacon.model.LatLng());
	}
	public LatLng(com.google.api.services.proximitybeacon.model.LatLng wrapped) {
		super(wrapped);
	}

	public Double getLatitude() {
		return wrapped.getLatitude();
	}
	
	public Double getLongitude() {
		return wrapped.getLongitude();
	}
	
	public void setLatitude(Double paramDouble) {
		wrapped.setLatitude(paramDouble);
	}
	
	public void setLongitude(Double paramDouble) {
		wrapped.setLongitude(paramDouble);
	}
	
	public void set(String paramString, String paramObject) {
		wrapped.set(paramString, paramObject);
	}
	
}
