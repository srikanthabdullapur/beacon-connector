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

import org.mule.modules.google.oauth.invalidation.InvalidationAwareCredential;

import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson.JacksonFactory;
import com.google.api.services.proximitybeacon.Proximitybeacon;

/**
 * 
 * @author chandana.nagandla@whishworks.com
 *
 */
public class DefaultGoogleBeaconClientFactory implements GoogleBeaconClientFactory {

	/**
	 * @see org.mule.module.google.beacon.GoogleBeaconClientFactory#newClient(java.lang.String, java.lang.String)
	 */
	@Override
	public Proximitybeacon newClient(String accessToken, String applicationName) {
		Credential credential = new InvalidationAwareCredential(BearerToken.authorizationHeaderAccessMethod());
		credential.setAccessToken(accessToken);
		
		return new Proximitybeacon.Builder(new NetHttpTransport(), new JacksonFactory(), credential)
						.setApplicationName(applicationName)
						.build();
	}

}
