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

public class BeaconAttachment extends BaseWrapper<com.google.api.services.proximitybeacon.model.BeaconAttachment> {
	public BeaconAttachment() {
		this(new com.google.api.services.proximitybeacon.model.BeaconAttachment());
	}

	public BeaconAttachment(com.google.api.services.proximitybeacon.model.BeaconAttachment wrapped) {
		super(wrapped);
	}
	
	public String getAttachmentName() {
		return wrapped.getAttachmentName();
	}
	
	public String getNamespacedType() {
		return wrapped.getNamespacedType();
	}
	public String getData() {
		return wrapped.getData();
	}
	public byte[] decodeData() {
		return wrapped.decodeData();
	}
	
	public void setAttachmentName(String paramString) {
		wrapped.setAttachmentName(paramString);
	}
	
	public void setNamespacedType(String paramString) {
		wrapped.setNamespacedType(paramString);
	}
	
	public void setData(String paramString) {
		wrapped.setData(paramString);
	}
	
	public void encodeData(byte[] paramArrayOfByte) {
		wrapped.encodeData(paramArrayOfByte);
	}
	
	public void set(String paramString, String paramObject) {
		wrapped.set(paramString, paramObject);
	}
	
	

}
