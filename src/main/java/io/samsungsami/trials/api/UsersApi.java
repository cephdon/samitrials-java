package io.samsungsami.trials.api;

import io.samsungsami.trials.client.ApiException;
import io.samsungsami.trials.client.ApiInvoker;

import io.samsungsami.trials.model.*;

import java.util.*;

import io.samsungsami.trials.model.TrialsEnvelope;

import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class UsersApi {
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

  
    
  public TrialsEnvelope getUserTrials (String userId, String role, Integer count, Integer offset) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/users/{userId}/trials".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(role)))
      queryParams.put("role", String.valueOf(role));
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
        return (TrialsEnvelope) ApiInvoker.deserialize(response, "", TrialsEnvelope.class);
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
