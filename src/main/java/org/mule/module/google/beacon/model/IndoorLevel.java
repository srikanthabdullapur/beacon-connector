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

public class IndoorLevel extends BaseWrapper<com.google.api.services.proximitybeacon.model.IndoorLevel>{
	public IndoorLevel() {
		this (new com.google.api.services.proximitybeacon.model.IndoorLevel());
	}
	public IndoorLevel(com.google.api.services.proximitybeacon.model.IndoorLevel wrapped) {
		super(wrapped);
	}

	public String getName() {
		return wrapped.getName();
	}
	
	public void setName(String paramString) {
		wrapped.setName(paramString);
	}
	
	public void set(String paramString, String paramObject) {
		wrapped.set(paramString, paramObject);
	}
}
