/*
 * Copyright 2021-2021 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AlfrescoContentRepresentation
 */
@Validated

public class AlfrescoContentRepresentation   {
  @JsonProperty("folder")
  private Boolean folder = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("simpleType")
  private String simpleType = null;

  @JsonProperty("title")
  private String title = null;

  public AlfrescoContentRepresentation folder(Boolean folder) {
    this.folder = folder;
    return this;
  }

  /**
   * Get folder
   * @return folder
  **/
  @ApiModelProperty(value = "")


  public Boolean isFolder() {
    return folder;
  }

  public void setFolder(Boolean folder) {
    this.folder = folder;
  }

  public AlfrescoContentRepresentation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AlfrescoContentRepresentation simpleType(String simpleType) {
    this.simpleType = simpleType;
    return this;
  }

  /**
   * Get simpleType
   * @return simpleType
  **/
  @ApiModelProperty(value = "")


  public String getSimpleType() {
    return simpleType;
  }

  public void setSimpleType(String simpleType) {
    this.simpleType = simpleType;
  }

  public AlfrescoContentRepresentation title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlfrescoContentRepresentation alfrescoContentRepresentation = (AlfrescoContentRepresentation) o;
    return Objects.equals(this.folder, alfrescoContentRepresentation.folder) &&
        Objects.equals(this.id, alfrescoContentRepresentation.id) &&
        Objects.equals(this.simpleType, alfrescoContentRepresentation.simpleType) &&
        Objects.equals(this.title, alfrescoContentRepresentation.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(folder, id, simpleType, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlfrescoContentRepresentation {\n");
    
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    simpleType: ").append(toIndentedString(simpleType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

