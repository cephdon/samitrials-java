package io.samsungsami.trials.api;

import io.samsungsami.trials.client.ApiException;
import io.samsungsami.trials.client.ApiInvoker;

import io.samsungsami.trials.model.*;

import java.util.*;

import io.samsungsami.trials.model.TrialAdministratorsEnvelope;
import io.samsungsami.trials.model.TrialParticipantRelEnvelope;
import io.samsungsami.trials.model.TrialInvitationsEnvelope;
import io.samsungsami.trials.model.TrialInvitationInfo;
import io.samsungsami.trials.model.TrialInvitationEnvelope;
import io.samsungsami.trials.model.TrialInvitationStatusInfo;
import io.samsungsami.trials.model.TrialParticipantsEnvelope;

import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class TrialsmembersApi {
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

  
    
  public TrialAdministratorsEnvelope getTrialAdministrators (String trialId, Integer count, Integer offset) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/trials/{trialId}/administrators".replaceAll("\\{format\\}","json")
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
        return (TrialAdministratorsEnvelope) ApiInvoker.deserialize(response, "", TrialAdministratorsEnvelope.class);
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
  
    
  public TrialParticipantRelEnvelope deleteTrialAdministrator (String trialId, String userId) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/trials/{trialId}/administrators/{userId}".replaceAll("\\{format\\}","json")
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
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (TrialParticipantRelEnvelope) ApiInvoker.deserialize(response, "", TrialParticipantRelEnvelope.class);
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
  
    
  public TrialInvitationsEnvelope getTrialInvitations (String trialId, String status, Integer count, Integer offset) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/trials/{trialId}/invitations".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(status)))
      queryParams.put("status", String.valueOf(status));
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
        return (TrialInvitationsEnvelope) ApiInvoker.deserialize(response, "", TrialInvitationsEnvelope.class);
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
  
    
  public TrialInvitationEnvelope createTrialInvitation (String trialId, TrialInvitationInfo body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/trials/{trialId}/invitations".replaceAll("\\{format\\}","json")
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
        return (TrialInvitationEnvelope) ApiInvoker.deserialize(response, "", TrialInvitationEnvelope.class);
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
  
    
  public TrialInvitationEnvelope updateTrialInvitation (String trialId, String invitationId, TrialInvitationStatusInfo body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/trials/{trialId}/invitations/{invitationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString()))
      .replaceAll("\\{" + "invitationId" + "\\}", apiInvoker.escapeString(invitationId.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (TrialInvitationEnvelope) ApiInvoker.deserialize(response, "", TrialInvitationEnvelope.class);
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
  
    
  public TrialInvitationEnvelope deleteTrialInvitation (String trialId, String invitationId) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/trials/{trialId}/invitations/{invitationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "trialId" + "\\}", apiInvoker.escapeString(trialId.toString()))
      .replaceAll("\\{" + "invitationId" + "\\}", apiInvoker.escapeString(invitationId.toString()));

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
        return (TrialInvitationEnvelope) ApiInvoker.deserialize(response, "", TrialInvitationEnvelope.class);
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
  
    
  public TrialParticipantsEnvelope getTrialParticipants (String trialId, Integer count, Integer offset) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/trials/{trialId}/participants".replaceAll("\\{format\\}","json")
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
        return (TrialParticipantsEnvelope) ApiInvoker.deserialize(response, "", TrialParticipantsEnvelope.class);
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
  
    
  public TrialParticipantRelEnvelope deleteTrialParticipant (String trialId, String userId) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/trials/{trialId}/participants/{userId}".replaceAll("\\{format\\}","json")
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
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (TrialParticipantRelEnvelope) ApiInvoker.deserialize(response, "", TrialParticipantRelEnvelope.class);
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
