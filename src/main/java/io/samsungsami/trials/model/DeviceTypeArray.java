package io.samsungsami.trials.model;

import java.util.*;
import io.samsungsami.trials.model.DeviceType;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class DeviceTypeArray  {
  
  private List<DeviceType> deviceTypes = new ArrayList<DeviceType>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("deviceTypes")
  public List<DeviceType> getDeviceTypes() {
    return deviceTypes;
  }
  public void setDeviceTypes(List<DeviceType> deviceTypes) {
    this.deviceTypes = deviceTypes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTypeArray {\n");
    
    sb.append("  deviceTypes: ").append(deviceTypes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
