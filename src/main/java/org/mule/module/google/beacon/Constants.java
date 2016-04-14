/**
 * Mule Google Beacon Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.module.google.beacon;

public interface Constants {
	//Http requests
	public static final String GET = "GET";
	public static final String POST= "POST";
	public static final String PUT = "PUT";
	public static final String DELETE = "DELETE";
	
	//URLs
	public static final String BEACON_REGISTRY_SCOPE = "https://www.googleapis.com/auth/userlocation.beacon.registry";
	public static final String PROXIMITY_URL = "https://proximitybeacon.googleapis.com/v1beta1/";
	public static final String REGISTER_BEACON_URL= "https://proximitybeacon.googleapis.com/v1beta1/beacons:register";
	public static final String LIST_ATTACHMENTS= "/attachments";
	public static final String ACTIVATE_BEACON = ":activate";
	public static final String DEACTIVATE_BEACON = ":deactivate";
	public static final String DECOMMISSION_BEACON = ":decommission";
	public static final String GET_BEACON_URL = "https://proximitybeacon.googleapis.com/v1beta1/beacons";
	public static final String QUERY_BEACON_URL= "https://proximitybeacon.googleapis.com/v1beta1/beacons?q=";
	public static final String BATCH_DELETE_ATTACHMENTS= "/attachments:batchDelete";
	public static final String ATTACHMENTS = "/attachments/";
	
	//Http Headers
	public static final String AUTHORIZATION = "Authorization";
	public static final String BEARER= "Bearer ";
	public static final String USER_AGENT = "User-Agent";
	public static final String ACCEPT = "Accept";
	public static final String MOZILLA = "Mozilla/5.0 (compatible)";
	public static final String CONTENT_TYPE = "Content-Type";
	public static final String CONTENT_LENGTH= "Bearer";
	
	//Beaacon Properties
	public static final String BEACON_TYPE = "EDDYSTONE";
		
}
