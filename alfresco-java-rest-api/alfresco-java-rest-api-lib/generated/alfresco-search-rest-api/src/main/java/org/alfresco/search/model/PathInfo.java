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
package org.alfresco.search.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.search.model.PathElement;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PathInfo
 */
@Validated

public class PathInfo   {
  @JsonProperty("elements")
  @Valid
  private List<PathElement> elements = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isComplete")
  private Boolean isComplete = null;

  public PathInfo elements(List<PathElement> elements) {
    this.elements = elements;
    return this;
  }

  public PathInfo addElementsItem(PathElement elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<>();
    }
    this.elements.add(elementsItem);
    return this;
  }

  /**
   * Get elements
   * @return elements
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<PathElement> getElements() {
    return elements;
  }

  public void setElements(List<PathElement> elements) {
    this.elements = elements;
  }

  public PathInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PathInfo isComplete(Boolean isComplete) {
    this.isComplete = isComplete;
    return this;
  }

  /**
   * Get isComplete
   * @return isComplete
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsComplete() {
    return isComplete;
  }

  public void setIsComplete(Boolean isComplete) {
    this.isComplete = isComplete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathInfo pathInfo = (PathInfo) o;
    return Objects.equals(this.elements, pathInfo.elements) &&
        Objects.equals(this.name, pathInfo.name) &&
        Objects.equals(this.isComplete, pathInfo.isComplete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elements, name, isComplete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathInfo {\n");
    
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isComplete: ").append(toIndentedString(isComplete)).append("\n");
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

