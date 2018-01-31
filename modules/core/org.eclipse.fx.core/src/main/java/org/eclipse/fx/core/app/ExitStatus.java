/*******************************************************************************
 * Copyright (c) 2016 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.core.app;

/**
 * The exit status of the application
 *
 * <p>
 * This provisional API and subject to change
 * </p>
 *
 * @since 3.0
 * @noimplement
 * @noreference
 */
public enum ExitStatus {
	/**
	 * Default exit
	 */
	OK,
	/**
	 * Restart the application
	 */
	RESTART
}
