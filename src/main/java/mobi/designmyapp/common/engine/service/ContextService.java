/*
 Copyright 2015 eBusiness Information
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 http://www.apache.org/licenses/LICENSE-2.0
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package mobi.designmyapp.common.engine.service;

import mobi.designmyapp.common.engine.builder.Builder;

import java.io.File;
import java.io.Serializable;

/**
 * This class provides resource services.
 * See knowledge base on http://developer.designmyapp.mobi for more details
 * Created by Loïc Ortola on 24/07/14.
 */
public interface ContextService {

  /**
   * Retrieve the resource directory of an application.
   * The resource directory is where uploaded files are stored
   *
   * @return the application resource directory
   */
  File getResourceDirectory();

  /**
   * Retrieve the static resources directory for a specific template tag.
   * The static resources directory can contain any static asset specific to a template
   *
   * @return the static resources directory
   */
  File getStaticResourcesDirectory(String templateTag);

  /**
   * Retrieve the work directory typed for current target.
   *
   * @param type  build target type
   * @return the work directory
   */
  File getWorkDirectory(Builder.Type type);

  /**
   * Retrieve the tmp directory of an application.
   * Tmp directory should be the output of processed files right before they are built and transferred to the final application templates.
   *
   * @return the tmp directory
   */
  File getTmpDirectory();

  /**
   * Retrieve the read-only template directory for a specific template and target.
   *
   * @param type        build target type
   * @return the template directory
   */
  File getTemplateDirectory(Builder.Type type, String version);

  /**
   * Create url to retrieve data from server resources
   * @param namespace resource namespace
   * @param filename name of the file to expose
   * @param apiKey apiKey to access the file
   * @return a String representing the url to access the file
   */
  String createUrl(String namespace, String filename, String apiKey);

  /**
   * Create url to retrieve bundle.zip from server webapp resources
   * @return a String representing the url to access the file
   */
  String createBundleUrl();

  /**
   * Return the appId of the current generation.
   * @return the appId
   */
  String getAppId();

  /**
   * Retrieve environment URL
   *
   * @return current environment base URL
   */
  String getEnvironmentBaseUrl();

  /**
   * Set the webapp response of current build.
   * @param response the webapp custom response.
   */
  void setWebappResponse(Serializable response);
}