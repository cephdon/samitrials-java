package io.samsungsami.trials.model;

import io.samsungsami.trials.model.TrialStatus;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class TrialUpdateInfo  {
  
  private String description = null;
  private Long endDate = null;
  private String name = null;
  private Long startDate = null;
  private TrialStatus status = null;

  
  /**
   * Description of the trial.
   **/
  @ApiModelProperty(required = true, value = "Description of the trial.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * End date of the Trial (in milliseconds since epoch)
   **/
  @ApiModelProperty(required = false, value = "End date of the Trial (in milliseconds since epoch)")
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }
  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  
  /**
   * Name of the trial.
   **/
  @ApiModelProperty(required = true, value = "Name of the trial.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Start date of the Trial (in milliseconds since epoch)
   **/
  @ApiModelProperty(required = false, value = "Start date of the Trial (in milliseconds since epoch)")
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  
  /**
   * Status.
   **/
  @ApiModelProperty(required = false, value = "Status.")
  @JsonProperty("status")
  public TrialStatus getStatus() {
    return status;
  }
  public void setStatus(TrialStatus status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialUpdateInfo {\n");
    
    sb.append("  description: ").append(description).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
