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

public class AdvertisedId extends BaseWrapper<com.google.api.services.proximitybeacon.model.AdvertisedId>{
	public AdvertisedId() {
		this(new com.google.api.services.proximitybeacon.model.AdvertisedId());
	}

	public AdvertisedId(com.google.api.services.proximitybeacon.model.AdvertisedId wrapped) {
		super(wrapped);
	}
	
	
	public String getId() {
		return wrapped.getId();
	}
	
	public String getType() {
		return wrapped.getType();
	}
	
	public byte[] decodeId() {
		return wrapped.decodeId();
	}
	
	public void setType(String paramString) {
		wrapped.setType(paramString);
	}
	
	public void setId(String paramString) {
		 wrapped.setId(paramString);
	}

	public void encodeId(byte[]paramArrayOfByte) {
		wrapped.encodeId(paramArrayOfByte);
	}
	
	public void set(String paramString, String paramObject) {
		wrapped.set(paramString, paramObject);
	}

}
