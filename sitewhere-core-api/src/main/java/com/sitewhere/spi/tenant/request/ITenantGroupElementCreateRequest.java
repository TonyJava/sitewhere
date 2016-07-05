/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.spi.tenant.request;

/**
 * Information needed to create an element in a tenant group.
 * 
 * @author Derek
 */
public interface ITenantGroupElementCreateRequest {

	/**
	 * Get id of tenant group element belongs to.
	 * 
	 * @return
	 */
	public String getTenantGroupId();

	/**
	 * Get id of tenant referenced by element.
	 * 
	 * @return
	 */
	public String getTenantId();
}