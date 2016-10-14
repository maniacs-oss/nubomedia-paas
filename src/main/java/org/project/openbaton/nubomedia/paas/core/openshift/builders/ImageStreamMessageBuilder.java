/*
 *
 *  * (C) Copyright 2016 NUBOMEDIA (http://www.nubomedia.eu)
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *   http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *  *
 *
 */

package org.project.openbaton.nubomedia.paas.core.openshift.builders;

import org.project.openbaton.nubomedia.paas.model.openshift.ImageStreamConfig;
import org.project.openbaton.nubomedia.paas.model.openshift.Metadata;

/**
 * Created by maa on 26/09/2015.
 */
public class ImageStreamMessageBuilder {

  private String osName;

  public ImageStreamMessageBuilder(String osName) {
    this.osName = osName;
  }

  public ImageStreamConfig buildMessage() {
    ImageStreamConfig.ImageStreamStatus status = new ImageStreamConfig.ImageStreamStatus("");
    Metadata metadata = new Metadata(osName, "", "");
    return new ImageStreamConfig(
        metadata, new ImageStreamConfig.ImageStreamSpecification(), status);
  }
}
