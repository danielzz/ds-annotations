/*******************************************************************************
 * Copyright (c) 2012, 2013 Ecliptical Software Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ecliptical Software Inc. - initial API and implementation
 *******************************************************************************/
package ca.ecliptical.pde.internal.ds;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "ca.ecliptical.pde.internal.ds.messages"; //$NON-NLS-1$

	public static String AnnotationProcessor_duplicateActivateMethod;

	public static String AnnotationProcessor_duplicateDeactivateMethod;

	public static String AnnotationProcessor_duplicateLifeCycleMethodParameterType;

	public static String AnnotationProcessor_duplicateModifiedMethod;

	public static String AnnotationProcessor_duplicateReferenceName;

	public static String AnnotationProcessor_duplicateServiceDeclaration;

	public static String AnnotationProcessor_inconsistentComponentPropertyType;

	public static String AnnotationProcessor_invalidBindMethodParameters;

	public static String AnnotationProcessor_invalidBindMethodReturnType;

	public static String AnnotationProcessor_invalidComponentConfigurationPid;

	public static String AnnotationProcessor_invalidComponentDescriptorNamespace;

	public static String AnnotationProcessor_invalidComponentFactoryName;

	public static String AnnotationProcessor_invalidComponentImplementationClass;

	public static String AnnotationProcessor_invalidComponentName;

	public static String AnnotationProcessor_invalidComponentProperty_nameRequired;

	public static String AnnotationProcessor_invalidComponentProperty_valueRequired;

	public static String AnnotationProcessor_invalidComponentPropertyFile;

	public static String AnnotationProcessor_invalidComponentPropertyType;

	public static String AnnotationProcessor_invalidComponentPropertyValue;

	public static String AnnotationProcessor_invalidComponentService;

	public static String AnnotationProcessor_invalidLifeCycleMethodParameterType;

	public static String AnnotationProcessor_invalidLifeCycleMethodReturnType;

	public static String AnnotationProcessor_invalidReferenceService;

	public static String AnnotationProcessor_invalidReferenceServiceUnknown;

	public static String AnnotationProcessor_invalidReferenceUnbind;

	public static String AnnotationProcessor_invalidReferenceUpdated;

	public static String AnnotationProcessor_stringOrEmpty;

	public static String AnnotationProcessor_unknownServiceTypeLabel;

	public static String DSAnnotationPreferenceListener_jobName;

	public static String DSAnnotationPreferenceListener_taskName;

	public static String DSAnnotationPropertyPage_enableCheckbox_text;

	public static String DSAnnotationPropertyPage_errorLevelError;

	public static String DSAnnotationPropertyPage_errorLevelLabel_text;

	public static String DSAnnotationPropertyPage_errorLevelNone;

	public static String DSAnnotationPropertyPage_errorLevelWarning;

	public static String DSAnnotationPropertyPage_errorMessage_path;

	public static String DSAnnotationPropertyPage_pathLabel_text;

	public static String DSAnnotationPropertyPage_projectCheckbox_text;

	public static String DSAnnotationPropertyPage_workspaceLink_text;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		super();
	}
}
