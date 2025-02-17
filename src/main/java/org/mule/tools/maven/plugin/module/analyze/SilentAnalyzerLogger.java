/*
 * Copyright 2023 Salesforce, Inc. All rights reserved.
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.tools.maven.plugin.module.analyze;

import org.mule.tools.maven.plugin.module.common.ModuleLogger;

public class SilentAnalyzerLogger implements ModuleLogger {

  @Override
  public void log(String message) {
    // Do nothing
  }
}
