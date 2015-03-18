package io.samsungsami.trials.api;

import io.samsungsami.trials.client.ApiException;
import io.samsungsami.trials.client.ApiInvoker;

import io.samsungsami.trials.model.*;

import java.util.*;

import io.samsungsami.trials.model.ConnectedDevicesEnvelope;
import io.samsungsami.trials.model.DeviceTypesEnvelope;
import io.samsungsami.trials.model.DeviceTypeInfo;
import io.samsungsami.trials.model.TrialDeviceTypeRel;
import io.samsungsami.trials.model.TrialUserDeviceRelEnvelope;
import io.samsungsami.trials.model.DeviceInfo;

import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class TrialsdevicesApi {
  String basePath = "https://api.samsungsami.io/v1.1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
    
  public ConnectedDevicesEnvelope getConnectedDevices (String trialId, Integer count, Integer offset) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/trials/{trialId}/devices".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count));
    if(!"null".equals(String.valueOf(offset)))
      queryParams.put("offset", String.valueOf(offset));
    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ConnectedDevicesEnvelope) ApiInvoker.deserialize(response, "", ConnectedDevicesEnvelope.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
    
  public DeviceTypesEnvelope getTrialDeviceTypes (String trialId, Integer count, Integer offset) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/trials/{trialId}/devicetypes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count));
    if(!"null".equals(String.valueOf(offset)))
      queryParams.put("offset", String.valueOf(offset));
    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (DeviceTypesEnvelope) ApiInvoker.deserialize(response, "", DeviceTypesEnvelope.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
    
  public TrialDeviceTypeRel addTrialDeviceType (String trialId, DeviceTypeInfo deviceTypeInfo) throws ApiException {
    Object postBody = deviceTypeInfo;
    

    // create path and map variables
    String path = "/trials/{trialId}/devicetypes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (TrialDeviceTypeRel) ApiInvoker.deserialize(response, "", TrialDeviceTypeRel.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
    
  public ConnectedDevicesEnvelope getUserConnectedDevices (String trialId, String userId, Integer count, Integer offset) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/trials/{trialId}/participants/{userId}/devices".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count));
    if(!"null".equals(String.valueOf(offset)))
      queryParams.put("offset", String.valueOf(offset));
    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ConnectedDevicesEnvelope) ApiInvoker.deserialize(response, "", ConnectedDevicesEnvelope.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
    
  public TrialUserDeviceRelEnvelope connectTrialDevice (String trialId, String userId, DeviceInfo deviceInfo) throws ApiException {
    Object postBody = deviceInfo;
    

    // create path and map variables
    String path = "/trials/{trialId}/participants/{userId}/devices".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (TrialUserDeviceRelEnvelope) ApiInvoker.deserialize(response, "", TrialUserDeviceRelEnvelope.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
    
  public TrialUserDeviceRelEnvelope disconnectTrialDevice (String trialId, String userId, String deviceId) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/trials/{trialId}/participants/{userId}/devices/{deviceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()))
      .replaceAll("\\{" + "deviceId" + "\\}", apiInvoker.escapeString(deviceId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (TrialUserDeviceRelEnvelope) ApiInvoker.deserialize(response, "", TrialUserDeviceRelEnvelope.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
}
