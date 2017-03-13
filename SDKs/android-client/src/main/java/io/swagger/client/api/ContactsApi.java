/**
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.ContactFull;
import io.swagger.client.model.CreateContactParams;
import io.swagger.client.model.DeleteContact;
import io.swagger.client.model.ListContacts;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ContactsApi {
  String basePath = "https://api.phone.com/v4";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Add a new address book contact for an extension
  * For more on the input fields, see Account Contacts.
   * @param accountId Account ID
   * @param extensionId Extension ID
   * @param data Contact data
   * @return ContactFull
  */
  public ContactFull createAccountExtensionContact (Integer accountId, Integer extensionId, CreateContactParams data) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = data;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling createAccountExtensionContact",
        new ApiException(400, "Missing the required parameter 'accountId' when calling createAccountExtensionContact"));
    }
    // verify the required parameter 'extensionId' is set
    if (extensionId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'extensionId' when calling createAccountExtensionContact",
        new ApiException(400, "Missing the required parameter 'extensionId' when calling createAccountExtensionContact"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/extensions/{extension_id}/contacts".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "extension_id" + "\\}", apiInvoker.escapeString(extensionId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKey" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (ContactFull) ApiInvoker.deserialize(localVarResponse, "", ContactFull.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * Add a new address book contact for an extension
   * For more on the input fields, see Account Contacts.
   * @param accountId Account ID   * @param extensionId Extension ID   * @param data Contact data
  */
  public void createAccountExtensionContact (Integer accountId, Integer extensionId, CreateContactParams data, final Response.Listener<ContactFull> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = data;

  
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling createAccountExtensionContact",
         new ApiException(400, "Missing the required parameter 'accountId' when calling createAccountExtensionContact"));
    }
    
    // verify the required parameter 'extensionId' is set
    if (extensionId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'extensionId' when calling createAccountExtensionContact",
         new ApiException(400, "Missing the required parameter 'extensionId' when calling createAccountExtensionContact"));
    }
    

    // create path and map variables
    String path = "/accounts/{account_id}/extensions/{extension_id}/contacts".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "extension_id" + "\\}", apiInvoker.escapeString(extensionId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "apiKey" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((ContactFull) ApiInvoker.deserialize(localVarResponse,  "", ContactFull.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 
  * 
   * @param accountId Account ID
   * @param extensionId Extension ID
   * @param contactId Contact ID
   * @return DeleteContact
  */
  public DeleteContact deleteAccountExtensionContact (Integer accountId, Integer extensionId, Integer contactId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling deleteAccountExtensionContact",
        new ApiException(400, "Missing the required parameter 'accountId' when calling deleteAccountExtensionContact"));
    }
    // verify the required parameter 'extensionId' is set
    if (extensionId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'extensionId' when calling deleteAccountExtensionContact",
        new ApiException(400, "Missing the required parameter 'extensionId' when calling deleteAccountExtensionContact"));
    }
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'contactId' when calling deleteAccountExtensionContact",
        new ApiException(400, "Missing the required parameter 'contactId' when calling deleteAccountExtensionContact"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/extensions/{extension_id}/contacts/{contact_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "extension_id" + "\\}", apiInvoker.escapeString(extensionId.toString())).replaceAll("\\{" + "contact_id" + "\\}", apiInvoker.escapeString(contactId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKey" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (DeleteContact) ApiInvoker.deserialize(localVarResponse, "", DeleteContact.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * 
   * 
   * @param accountId Account ID   * @param extensionId Extension ID   * @param contactId Contact ID
  */
  public void deleteAccountExtensionContact (Integer accountId, Integer extensionId, Integer contactId, final Response.Listener<DeleteContact> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling deleteAccountExtensionContact",
         new ApiException(400, "Missing the required parameter 'accountId' when calling deleteAccountExtensionContact"));
    }
    
    // verify the required parameter 'extensionId' is set
    if (extensionId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'extensionId' when calling deleteAccountExtensionContact",
         new ApiException(400, "Missing the required parameter 'extensionId' when calling deleteAccountExtensionContact"));
    }
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'contactId' when calling deleteAccountExtensionContact",
         new ApiException(400, "Missing the required parameter 'contactId' when calling deleteAccountExtensionContact"));
    }
    

    // create path and map variables
    String path = "/accounts/{account_id}/extensions/{extension_id}/contacts/{contact_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "extension_id" + "\\}", apiInvoker.escapeString(extensionId.toString())).replaceAll("\\{" + "contact_id" + "\\}", apiInvoker.escapeString(contactId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "apiKey" };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((DeleteContact) ApiInvoker.deserialize(localVarResponse,  "", DeleteContact.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Retrieve the details of an address book contact
  * For more info on the fields shown, see Account Contacts.
   * @param accountId Account ID
   * @param extensionId Extension ID
   * @param contactId Contact ID
   * @return ContactFull
  */
  public ContactFull getAccountExtensionContact (Integer accountId, Integer extensionId, Integer contactId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling getAccountExtensionContact",
        new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountExtensionContact"));
    }
    // verify the required parameter 'extensionId' is set
    if (extensionId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'extensionId' when calling getAccountExtensionContact",
        new ApiException(400, "Missing the required parameter 'extensionId' when calling getAccountExtensionContact"));
    }
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'contactId' when calling getAccountExtensionContact",
        new ApiException(400, "Missing the required parameter 'contactId' when calling getAccountExtensionContact"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/extensions/{extension_id}/contacts/{contact_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "extension_id" + "\\}", apiInvoker.escapeString(extensionId.toString())).replaceAll("\\{" + "contact_id" + "\\}", apiInvoker.escapeString(contactId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKey" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (ContactFull) ApiInvoker.deserialize(localVarResponse, "", ContactFull.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * Retrieve the details of an address book contact
   * For more info on the fields shown, see Account Contacts.
   * @param accountId Account ID   * @param extensionId Extension ID   * @param contactId Contact ID
  */
  public void getAccountExtensionContact (Integer accountId, Integer extensionId, Integer contactId, final Response.Listener<ContactFull> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling getAccountExtensionContact",
         new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountExtensionContact"));
    }
    
    // verify the required parameter 'extensionId' is set
    if (extensionId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'extensionId' when calling getAccountExtensionContact",
         new ApiException(400, "Missing the required parameter 'extensionId' when calling getAccountExtensionContact"));
    }
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'contactId' when calling getAccountExtensionContact",
         new ApiException(400, "Missing the required parameter 'contactId' when calling getAccountExtensionContact"));
    }
    

    // create path and map variables
    String path = "/accounts/{account_id}/extensions/{extension_id}/contacts/{contact_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "extension_id" + "\\}", apiInvoker.escapeString(extensionId.toString())).replaceAll("\\{" + "contact_id" + "\\}", apiInvoker.escapeString(contactId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "apiKey" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((ContactFull) ApiInvoker.deserialize(localVarResponse,  "", ContactFull.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Show a list of address book contacts
  * See Account Contacts for more info on the fields in each item.
   * @param accountId Account ID
   * @param extensionId Extension ID
   * @param filtersId ID filter
   * @param filtersGroupId Group filter
   * @param filtersUpdatedAt Updated At filter
   * @param sortId ID sorting
   * @param sortUpdatedAt Updated At sorting
   * @param limit Max results
   * @param offset Results to skip
   * @param fields Field set
   * @return ListContacts
  */
  public ListContacts listAccountExtensionContacts (Integer accountId, Integer extensionId, List<String> filtersId, List<String> filtersGroupId, List<String> filtersUpdatedAt, String sortId, String sortUpdatedAt, Integer limit, Integer offset, String fields) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling listAccountExtensionContacts",
        new ApiException(400, "Missing the required parameter 'accountId' when calling listAccountExtensionContacts"));
    }
    // verify the required parameter 'extensionId' is set
    if (extensionId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'extensionId' when calling listAccountExtensionContacts",
        new ApiException(400, "Missing the required parameter 'extensionId' when calling listAccountExtensionContacts"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/extensions/{extension_id}/contacts".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "extension_id" + "\\}", apiInvoker.escapeString(extensionId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[id]", filtersId));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[group_id]", filtersGroupId));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[updated_at]", filtersUpdatedAt));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[id]", sortId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[updated_at]", sortUpdatedAt));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "fields", fields));
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKey" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (ListContacts) ApiInvoker.deserialize(localVarResponse, "", ListContacts.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * Show a list of address book contacts
   * See Account Contacts for more info on the fields in each item.
   * @param accountId Account ID   * @param extensionId Extension ID   * @param filtersId ID filter   * @param filtersGroupId Group filter   * @param filtersUpdatedAt Updated At filter   * @param sortId ID sorting   * @param sortUpdatedAt Updated At sorting   * @param limit Max results   * @param offset Results to skip   * @param fields Field set
  */
  public void listAccountExtensionContacts (Integer accountId, Integer extensionId, List<String> filtersId, List<String> filtersGroupId, List<String> filtersUpdatedAt, String sortId, String sortUpdatedAt, Integer limit, Integer offset, String fields, final Response.Listener<ListContacts> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling listAccountExtensionContacts",
         new ApiException(400, "Missing the required parameter 'accountId' when calling listAccountExtensionContacts"));
    }
    
    // verify the required parameter 'extensionId' is set
    if (extensionId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'extensionId' when calling listAccountExtensionContacts",
         new ApiException(400, "Missing the required parameter 'extensionId' when calling listAccountExtensionContacts"));
    }
    

    // create path and map variables
    String path = "/accounts/{account_id}/extensions/{extension_id}/contacts".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "extension_id" + "\\}", apiInvoker.escapeString(extensionId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[id]", filtersId));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[group_id]", filtersGroupId));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[updated_at]", filtersUpdatedAt));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[id]", sortId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[updated_at]", sortUpdatedAt));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "fields", fields));


    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "apiKey" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((ListContacts) ApiInvoker.deserialize(localVarResponse,  "", ListContacts.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 
  * For more on the input fields, see Account Contacts.
   * @param accountId Account ID
   * @param extensionId Extension ID
   * @param contactId Contact ID
   * @param data Contact data
   * @return ContactFull
  */
  public ContactFull replaceAccountExtensionContact (Integer accountId, Integer extensionId, Integer contactId, CreateContactParams data) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = data;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling replaceAccountExtensionContact",
        new ApiException(400, "Missing the required parameter 'accountId' when calling replaceAccountExtensionContact"));
    }
    // verify the required parameter 'extensionId' is set
    if (extensionId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'extensionId' when calling replaceAccountExtensionContact",
        new ApiException(400, "Missing the required parameter 'extensionId' when calling replaceAccountExtensionContact"));
    }
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'contactId' when calling replaceAccountExtensionContact",
        new ApiException(400, "Missing the required parameter 'contactId' when calling replaceAccountExtensionContact"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/extensions/{extension_id}/contacts/{contact_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "extension_id" + "\\}", apiInvoker.escapeString(extensionId.toString())).replaceAll("\\{" + "contact_id" + "\\}", apiInvoker.escapeString(contactId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKey" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (ContactFull) ApiInvoker.deserialize(localVarResponse, "", ContactFull.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * 
   * For more on the input fields, see Account Contacts.
   * @param accountId Account ID   * @param extensionId Extension ID   * @param contactId Contact ID   * @param data Contact data
  */
  public void replaceAccountExtensionContact (Integer accountId, Integer extensionId, Integer contactId, CreateContactParams data, final Response.Listener<ContactFull> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = data;

  
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling replaceAccountExtensionContact",
         new ApiException(400, "Missing the required parameter 'accountId' when calling replaceAccountExtensionContact"));
    }
    
    // verify the required parameter 'extensionId' is set
    if (extensionId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'extensionId' when calling replaceAccountExtensionContact",
         new ApiException(400, "Missing the required parameter 'extensionId' when calling replaceAccountExtensionContact"));
    }
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'contactId' when calling replaceAccountExtensionContact",
         new ApiException(400, "Missing the required parameter 'contactId' when calling replaceAccountExtensionContact"));
    }
    

    // create path and map variables
    String path = "/accounts/{account_id}/extensions/{extension_id}/contacts/{contact_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "extension_id" + "\\}", apiInvoker.escapeString(extensionId.toString())).replaceAll("\\{" + "contact_id" + "\\}", apiInvoker.escapeString(contactId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "apiKey" };

    try {
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((ContactFull) ApiInvoker.deserialize(localVarResponse,  "", ContactFull.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}