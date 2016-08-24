/*
 *
 *  * Copyright (c) 2016 Open Baton
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package org.project.openbaton.nubomedia.paas.repository.application;

import org.project.openbaton.nubomedia.paas.model.persistence.Application;

/**
 * Created by mob on 04.09.15.
 */
public interface ApplicationRepositoryCustom {

  Application findFirstByAppIdAndProjectId(String id, String projectId);

  Application findByNsrId(String nsrId);

  Application findByMSGroupID(String msGroupId);
}
