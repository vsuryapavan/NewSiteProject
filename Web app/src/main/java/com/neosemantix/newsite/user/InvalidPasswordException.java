// Copyright 2014; All rights reserved with NeoSemantix, Inc.
package com.neosemantix.newsite.user;

import com.neosemantix.newsite.NewsiteRuntimeException;

/**
 * @author umesh
 *
 */
@SuppressWarnings("serial")
public class InvalidPasswordException extends NewsiteRuntimeException {

	public InvalidPasswordException() {
		super("Invalid password.");
	}
}
