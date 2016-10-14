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

package org.project.openbaton.nubomedia.paas.model.persistence.security;

import org.openbaton.catalogue.util.IdGenerator;

import javax.persistence.*;

/**
 * Created by lto on 24/05/16.
 */
@Entity
public class Role {
  @Id private String id;

  @Enumerated(EnumType.STRING)
  private RoleEnum role;

  private String project;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  @Override
  public String toString() {
    return "Role{" + "role=" + role + ", project=" + project + '}';
  }

  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  @PrePersist
  public void ensureId() {
    id = IdGenerator.createUUID();
  }

  public enum RoleEnum {
    GUEST,
    USER,
    ADMIN
  }
}
