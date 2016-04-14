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

import java.util.Map;

import org.mule.modules.google.api.model.BaseWrapper;

public class Beacon extends BaseWrapper<com.google.api.services.proximitybeacon.model.Beacon>{
	public Beacon() {
		this (new com.google.api.services.proximitybeacon.model.Beacon());
		}

	public Beacon(com.google.api.services.proximitybeacon.model.Beacon wrapped) {
		super(wrapped);
	}
	
	public String getBeaconName() {
		return wrapped.getBeaconName();
	}
	
	public org.mule.module.google.beacon.model.AdvertisedId getAdvertisedId() {
		return new org.mule.module.google.beacon.model.AdvertisedId(wrapped.getAdvertisedId());
	}
	
	public String getDescription() {
		return wrapped.getDescription();
	}
	
	public org.mule.module.google.beacon.model.IndoorLevel getIndoorLevel() {
		return new org.mule.module.google.beacon.model.IndoorLevel(wrapped.getIndoorLevel());
	}
	
	public org.mule.module.google.beacon.model.LatLng getLatLng() {
		return new org.mule.module.google.beacon.model.LatLng(wrapped.getLatLng());
	}
	
	public String getPlaceId() {
		return wrapped.getPlaceId();
	}
	
	public String getExpectedStability() {
		return wrapped.getExpectedStability();
	}
	
	public Map<String, String> getProperties() {
		return wrapped.getProperties();
	}
	
	public String getStatus() {
		return wrapped.getStatus();
	}
	
	public void setBeaconName(String paramString) {
		wrapped.setBeaconName(paramString);
	}
	
	public void setAdvertisedId(org.mule.module.google.beacon.model.AdvertisedId paramAdvertisedId) {
		wrapped.setAdvertisedId(paramAdvertisedId.wrapped());
	}
	
	public void setDescription(String paramString) {
		wrapped.setDescription(paramString);
	}
	
	public void setIndoorLevel(org.mule.module.google.beacon.model.IndoorLevel paramIndoorLevel) {
		wrapped.setIndoorLevel(paramIndoorLevel.wrapped());
	}
	
	public void setLatLng(org.mule.module.google.beacon.model.LatLng paramLatLng) {
		wrapped.setLatLng(paramLatLng.wrapped());
	}
	
	public void setPlaceId(String paramString) {
		wrapped.setPlaceId(paramString);
	}
	
	public void setExpectedStability(String paramString) {
		wrapped.setExpectedStability(paramString);
	}
	
	public void setProperties(Map<String, String>paramMap) {
		 wrapped.setProperties(paramMap);
	}
	
	public void setStatus(String paramString) {
		wrapped.setStatus(paramString);
	}
	
	public void set(String paramString, String paramObject) {
		wrapped.set(paramString, paramObject);
	}
	

}
