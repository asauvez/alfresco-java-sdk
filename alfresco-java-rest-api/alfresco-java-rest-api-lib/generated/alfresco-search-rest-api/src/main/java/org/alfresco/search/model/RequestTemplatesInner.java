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
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestTemplatesInner
 */
@Validated

public class RequestTemplatesInner   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("template")
  private String template = null;

  public RequestTemplatesInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The template name
   * @return name
  **/
  @ApiModelProperty(value = "The template name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RequestTemplatesInner template(String template) {
    this.template = template;
    return this;
  }

  /**
   * The template
   * @return template
  **/
  @ApiModelProperty(value = "The template")


  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestTemplatesInner requestTemplatesInner = (RequestTemplatesInner) o;
    return Objects.equals(this.name, requestTemplatesInner.name) &&
        Objects.equals(this.template, requestTemplatesInner.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestTemplatesInner {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

