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
package org.alfresco.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RatingAggregate
 */
@Validated

public class RatingAggregate   {
  @JsonProperty("numberOfRatings")
  private Integer numberOfRatings = null;

  @JsonProperty("average")
  private Integer average = null;

  public RatingAggregate numberOfRatings(Integer numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
    return this;
  }

  /**
   * Get numberOfRatings
   * @return numberOfRatings
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getNumberOfRatings() {
    return numberOfRatings;
  }

  public void setNumberOfRatings(Integer numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
  }

  public RatingAggregate average(Integer average) {
    this.average = average;
    return this;
  }

  /**
   * Get average
   * @return average
  **/
  @ApiModelProperty(value = "")


  public Integer getAverage() {
    return average;
  }

  public void setAverage(Integer average) {
    this.average = average;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatingAggregate ratingAggregate = (RatingAggregate) o;
    return Objects.equals(this.numberOfRatings, ratingAggregate.numberOfRatings) &&
        Objects.equals(this.average, ratingAggregate.average);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfRatings, average);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingAggregate {\n");
    
    sb.append("    numberOfRatings: ").append(toIndentedString(numberOfRatings)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
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

