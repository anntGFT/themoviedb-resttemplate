package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.math.BigDecimal;
import org.openapitools.client.model.DELETEAuthenticationSession200Response;
import org.openapitools.client.model.DELETEAuthenticationSessionRequest;
import org.openapitools.client.model.GETAccount200Response;
import org.openapitools.client.model.GETAccountAccountIdLists200Response;
import org.openapitools.client.model.GETAccountAccountIdRatedTvEpisodes200Response;
import org.openapitools.client.model.GETAccountAccountIdWatchlistTv200Response;
import org.openapitools.client.model.GETAuthenticationGuestSessionNew200Response;
import org.openapitools.client.model.GETCertificationMovieList200Response;
import org.openapitools.client.model.GETCertificationTvList200Response;
import org.openapitools.client.model.GETCollectionCollectionId200Response;
import org.openapitools.client.model.GETCollectionCollectionIdImages200Response;
import org.openapitools.client.model.GETCompanyCompanyId200Response;
import org.openapitools.client.model.GETCompanyCompanyIdAlternativeNames200Response;
import org.openapitools.client.model.GETCompanyCompanyIdImages200Response;
import org.openapitools.client.model.GETConfiguration200Response;
import org.openapitools.client.model.GETConfigurationCountries200ResponseInner;
import org.openapitools.client.model.GETConfigurationJobs200ResponseInner;
import org.openapitools.client.model.GETConfigurationLanguages200ResponseInner;
import org.openapitools.client.model.GETConfigurationTimezones200ResponseInner;
import org.openapitools.client.model.GETCreditCreditId200Response;
import org.openapitools.client.model.GETDiscoverTv200Response;
import org.openapitools.client.model.GETFindExternalId200Response;
import org.openapitools.client.model.GETGenreTvList200Response;
import org.openapitools.client.model.GETGuestSessionGuestSessionIdRatedMovies200Response;
import org.openapitools.client.model.GETGuestSessionGuestSessionIdRatedTv200Response;
import org.openapitools.client.model.GETGuestSessionGuestSessionIdRatedTvEpisodes200Response;
import org.openapitools.client.model.GETKeywordKeywordIdMovies200Response;
import org.openapitools.client.model.GETListListId200Response;
import org.openapitools.client.model.GETListListIdItemStatus200Response;
import org.openapitools.client.model.GETMovieLatest200Response;
import org.openapitools.client.model.GETMovieMovieId200Response;
import org.openapitools.client.model.GETMovieMovieIdAccountStates200Response;
import org.openapitools.client.model.GETMovieMovieIdAlternativeTitles200Response;
import org.openapitools.client.model.GETMovieMovieIdChanges200Response;
import org.openapitools.client.model.GETMovieMovieIdCredits200Response;
import org.openapitools.client.model.GETMovieMovieIdExternalIds200Response;
import org.openapitools.client.model.GETMovieMovieIdImages200Response;
import org.openapitools.client.model.GETMovieMovieIdKeywords200Response;
import org.openapitools.client.model.GETMovieMovieIdLists200Response;
import org.openapitools.client.model.GETMovieMovieIdRecommendations200Response;
import org.openapitools.client.model.GETMovieMovieIdReleaseDates200Response;
import org.openapitools.client.model.GETMovieMovieIdReviews200Response;
import org.openapitools.client.model.GETMovieMovieIdTranslations200Response;
import org.openapitools.client.model.GETMovieMovieIdVideos200Response;
import org.openapitools.client.model.GETMovieMovieIdWatchProviders200Response;
import org.openapitools.client.model.GETMovieNowPlaying200Response;
import org.openapitools.client.model.GETMoviePopular200Response;
import org.openapitools.client.model.GETMoviePopular401Response;
import org.openapitools.client.model.GETMovieUpcoming200Response;
import org.openapitools.client.model.GETNetworkNetworkId200Response;
import org.openapitools.client.model.GETPersonChanges200Response;
import org.openapitools.client.model.GETPersonLatest200Response;
import org.openapitools.client.model.GETPersonPersonId200Response;
import org.openapitools.client.model.GETPersonPersonIdChanges200Response;
import org.openapitools.client.model.GETPersonPersonIdCombinedCredits200Response;
import org.openapitools.client.model.GETPersonPersonIdExternalIds200Response;
import org.openapitools.client.model.GETPersonPersonIdImages200Response;
import org.openapitools.client.model.GETPersonPersonIdMovieCredits200Response;
import org.openapitools.client.model.GETPersonPersonIdTaggedImages200Response;
import org.openapitools.client.model.GETPersonPersonIdTranslations200Response;
import org.openapitools.client.model.GETPersonPersonIdTvCredits200Response;
import org.openapitools.client.model.GETPersonPopular200Response;
import org.openapitools.client.model.GETReviewReviewId200Response;
import org.openapitools.client.model.GETSearchCollection200Response;
import org.openapitools.client.model.GETSearchKeyword200Response;
import org.openapitools.client.model.GETSearchKeyword200ResponseResultsInner;
import org.openapitools.client.model.GETSearchMulti200Response;
import org.openapitools.client.model.GETSearchPerson200Response;
import org.openapitools.client.model.GETTvEpisodeEpisodeIdChanges200Response;
import org.openapitools.client.model.GETTvEpisodeGroupId200Response;
import org.openapitools.client.model.GETTvLatest200Response;
import org.openapitools.client.model.GETTvSeasonSeasonIdChanges200Response;
import org.openapitools.client.model.GETTvTvId200Response;
import org.openapitools.client.model.GETTvTvIdAlternativeTitles200Response;
import org.openapitools.client.model.GETTvTvIdChanges200Response;
import org.openapitools.client.model.GETTvTvIdContentRatings200Response;
import org.openapitools.client.model.GETTvTvIdEpisodeGroups200Response;
import org.openapitools.client.model.GETTvTvIdImages200Response;
import org.openapitools.client.model.GETTvTvIdKeywords200Response;
import org.openapitools.client.model.GETTvTvIdReviews200Response;
import org.openapitools.client.model.GETTvTvIdScreenedTheatrically200Response;
import org.openapitools.client.model.GETTvTvIdSeasonSeasonNumberAccountStates200Response;
import org.openapitools.client.model.GETTvTvIdSeasonSeasonNumberCredits200Response;
import org.openapitools.client.model.GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response;
import org.openapitools.client.model.GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages200Response;
import org.openapitools.client.model.GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response;
import org.openapitools.client.model.GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response;
import org.openapitools.client.model.GETTvTvIdSeasonSeasonNumberImages200Response;
import org.openapitools.client.model.GETTvTvIdTranslations200Response;
import org.openapitools.client.model.GETTvTvIdWatchProviders200Response;
import org.openapitools.client.model.GETWatchProvidersRegions200Response;
import org.openapitools.client.model.GETWatchProvidersTv200Response;
import java.time.LocalDate;
import org.openapitools.client.model.POSTAccountAccountIdFavoriteRequest;
import org.openapitools.client.model.POSTAccountAccountIdWatchlistRequest;
import org.openapitools.client.model.POSTAuthenticationSessionConvert4200Response;
import org.openapitools.client.model.POSTAuthenticationSessionConvert4401Response;
import org.openapitools.client.model.POSTAuthenticationSessionConvert4Request;
import org.openapitools.client.model.POSTAuthenticationSessionNewRequest;
import org.openapitools.client.model.POSTAuthenticationTokenValidateWithLogin200Response;
import org.openapitools.client.model.POSTAuthenticationTokenValidateWithLoginRequest;
import org.openapitools.client.model.POSTList201Response;
import org.openapitools.client.model.POSTListListIdAddItemRequest;
import org.openapitools.client.model.POSTListListIdRemoveItemRequest;
import org.openapitools.client.model.POSTListRequest;
import org.openapitools.client.model.POSTMovieMovieIdRatingRequest;
import org.openapitools.client.model.POSTTvTvIdRatingRequest;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T07:38:43.023Z[UTC]")
@Component("org.openapitools.client.api.DefaultApi")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    @Autowired
    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete Session
     * If you would like to delete (or \&quot;logout\&quot;) from a session, call this method with a valid session ID.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param body  (optional)
     * @return DELETEAuthenticationSession200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DELETEAuthenticationSession200Response dELETEAuthenticationSession(DELETEAuthenticationSessionRequest body) throws RestClientException {
        return dELETEAuthenticationSessionWithHttpInfo(body).getBody();
    }

    /**
     * Delete Session
     * If you would like to delete (or \&quot;logout\&quot;) from a session, call this method with a valid session ID.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param body  (optional)
     * @return ResponseEntity&lt;DELETEAuthenticationSession200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DELETEAuthenticationSession200Response> dELETEAuthenticationSessionWithHttpInfo(DELETEAuthenticationSessionRequest body) throws RestClientException {
        Object localVarPostBody = body;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<DELETEAuthenticationSession200Response> localReturnType = new ParameterizedTypeReference<DELETEAuthenticationSession200Response>() {};
        return apiClient.invokeAPI("/authentication/session", HttpMethod.DELETE, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete List
     * Delete a list.
     * <p><b>201</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param listId  (required)
     * @param sessionId  (required)
     * @return POSTAuthenticationSessionConvert4401Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public POSTAuthenticationSessionConvert4401Response dELETEListListId(String listId, String sessionId) throws RestClientException {
        return dELETEListListIdWithHttpInfo(listId, sessionId).getBody();
    }

    /**
     * Delete List
     * Delete a list.
     * <p><b>201</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param listId  (required)
     * @param sessionId  (required)
     * @return ResponseEntity&lt;POSTAuthenticationSessionConvert4401Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<POSTAuthenticationSessionConvert4401Response> dELETEListListIdWithHttpInfo(String listId, String sessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling dELETEListListId");
        }
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling dELETEListListId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response> localReturnType = new ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response>() {};
        return apiClient.invokeAPI("/list/{list_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete Rating
     * Remove your rating for a movie.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * @param movieId  (required)
     * @param contentType  (required)
     * @param guestSessionId  (optional)
     * @param sessionId  (optional)
     * @return POSTAuthenticationSessionConvert4401Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public POSTAuthenticationSessionConvert4401Response dELETEMovieMovieIdRating(Integer movieId, String contentType, String guestSessionId, String sessionId) throws RestClientException {
        return dELETEMovieMovieIdRatingWithHttpInfo(movieId, contentType, guestSessionId, sessionId).getBody();
    }

    /**
     * Delete Rating
     * Remove your rating for a movie.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * @param movieId  (required)
     * @param contentType  (required)
     * @param guestSessionId  (optional)
     * @param sessionId  (optional)
     * @return ResponseEntity&lt;POSTAuthenticationSessionConvert4401Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<POSTAuthenticationSessionConvert4401Response> dELETEMovieMovieIdRatingWithHttpInfo(Integer movieId, String contentType, String guestSessionId, String sessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'movieId' is set
        if (movieId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movieId' when calling dELETEMovieMovieIdRating");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contentType' when calling dELETEMovieMovieIdRating");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("movie_id", movieId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "guest_session_id", guestSessionId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response> localReturnType = new ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response>() {};
        return apiClient.invokeAPI("/movie/{movie_id}/rating", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete Rating
     * Remove your rating for a TV show.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * @param tvId  (required)
     * @param contentType  (required)
     * @param guestSessionId  (optional)
     * @param sessionId  (optional)
     * @return POSTAuthenticationSessionConvert4401Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public POSTAuthenticationSessionConvert4401Response dELETETvTvIdRating(Integer tvId, String contentType, String guestSessionId, String sessionId) throws RestClientException {
        return dELETETvTvIdRatingWithHttpInfo(tvId, contentType, guestSessionId, sessionId).getBody();
    }

    /**
     * Delete Rating
     * Remove your rating for a TV show.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * @param tvId  (required)
     * @param contentType  (required)
     * @param guestSessionId  (optional)
     * @param sessionId  (optional)
     * @return ResponseEntity&lt;POSTAuthenticationSessionConvert4401Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<POSTAuthenticationSessionConvert4401Response> dELETETvTvIdRatingWithHttpInfo(Integer tvId, String contentType, String guestSessionId, String sessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling dELETETvTvIdRating");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contentType' when calling dELETETvTvIdRating");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "guest_session_id", guestSessionId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response> localReturnType = new ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/rating", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete Rating
     * Remove your rating for a TV episode.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @param episodeNumber  (required)
     * @param contentType  (required)
     * @param guestSessionId  (optional)
     * @param sessionId  (optional)
     * @return POSTAuthenticationSessionConvert4401Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public POSTAuthenticationSessionConvert4401Response dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating(Integer tvId, Integer seasonNumber, Integer episodeNumber, String contentType, String guestSessionId, String sessionId) throws RestClientException {
        return dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRatingWithHttpInfo(tvId, seasonNumber, episodeNumber, contentType, guestSessionId, sessionId).getBody();
    }

    /**
     * Delete Rating
     * Remove your rating for a TV episode.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @param episodeNumber  (required)
     * @param contentType  (required)
     * @param guestSessionId  (optional)
     * @param sessionId  (optional)
     * @return ResponseEntity&lt;POSTAuthenticationSessionConvert4401Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<POSTAuthenticationSessionConvert4401Response> dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRatingWithHttpInfo(Integer tvId, Integer seasonNumber, Integer episodeNumber, String contentType, String guestSessionId, String sessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating");
        }
        
        // verify the required parameter 'seasonNumber' is set
        if (seasonNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seasonNumber' when calling dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating");
        }
        
        // verify the required parameter 'episodeNumber' is set
        if (episodeNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'episodeNumber' when calling dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contentType' when calling dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);
        uriVariables.put("season_number", seasonNumber);
        uriVariables.put("episode_number", episodeNumber);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "guest_session_id", guestSessionId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response> localReturnType = new ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Details
     * Get your account details.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param sessionId  (required)
     * @return GETAccount200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETAccount200Response gETAccount(String sessionId) throws RestClientException {
        return gETAccountWithHttpInfo(sessionId).getBody();
    }

    /**
     * Get Details
     * Get your account details.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param sessionId  (required)
     * @return ResponseEntity&lt;GETAccount200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETAccount200Response> gETAccountWithHttpInfo(String sessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling gETAccount");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETAccount200Response> localReturnType = new ParameterizedTypeReference<GETAccount200Response>() {};
        return apiClient.invokeAPI("/account", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Favorite Movies
     * Get the list of your favorite movies.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param sessionId  (required)
     * @return GETMovieMovieIdRecommendations200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdRecommendations200Response gETAccountAccountIdFavoriteMovies(Integer accountId, String sessionId) throws RestClientException {
        return gETAccountAccountIdFavoriteMoviesWithHttpInfo(accountId, sessionId).getBody();
    }

    /**
     * Get Favorite Movies
     * Get the list of your favorite movies.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param sessionId  (required)
     * @return ResponseEntity&lt;GETMovieMovieIdRecommendations200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdRecommendations200Response> gETAccountAccountIdFavoriteMoviesWithHttpInfo(Integer accountId, String sessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling gETAccountAccountIdFavoriteMovies");
        }
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling gETAccountAccountIdFavoriteMovies");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("account_id", accountId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdRecommendations200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdRecommendations200Response>() {};
        return apiClient.invokeAPI("/account/{account_id}/favorite/movies", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Favorite TV Shows
     * Get the list of your favorite TV shows.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param sessionId  (required)
     * @return GETAccountAccountIdWatchlistTv200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETAccountAccountIdWatchlistTv200Response gETAccountAccountIdFavoriteTv(Integer accountId, String sessionId) throws RestClientException {
        return gETAccountAccountIdFavoriteTvWithHttpInfo(accountId, sessionId).getBody();
    }

    /**
     * Get Favorite TV Shows
     * Get the list of your favorite TV shows.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param sessionId  (required)
     * @return ResponseEntity&lt;GETAccountAccountIdWatchlistTv200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETAccountAccountIdWatchlistTv200Response> gETAccountAccountIdFavoriteTvWithHttpInfo(Integer accountId, String sessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling gETAccountAccountIdFavoriteTv");
        }
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling gETAccountAccountIdFavoriteTv");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("account_id", accountId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETAccountAccountIdWatchlistTv200Response> localReturnType = new ParameterizedTypeReference<GETAccountAccountIdWatchlistTv200Response>() {};
        return apiClient.invokeAPI("/account/{account_id}/favorite/tv", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Created Lists
     * Get all of the lists created by an account. Will invlude private lists if you are the owner.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param sessionId  (required)
     * @param apiKey  (optional)
     * @return GETAccountAccountIdLists200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETAccountAccountIdLists200Response gETAccountAccountIdLists(Integer accountId, String sessionId, String apiKey) throws RestClientException {
        return gETAccountAccountIdListsWithHttpInfo(accountId, sessionId, apiKey).getBody();
    }

    /**
     * Get Created Lists
     * Get all of the lists created by an account. Will invlude private lists if you are the owner.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param sessionId  (required)
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;GETAccountAccountIdLists200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETAccountAccountIdLists200Response> gETAccountAccountIdListsWithHttpInfo(Integer accountId, String sessionId, String apiKey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling gETAccountAccountIdLists");
        }
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling gETAccountAccountIdLists");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("account_id", accountId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "api_key", apiKey));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETAccountAccountIdLists200Response> localReturnType = new ParameterizedTypeReference<GETAccountAccountIdLists200Response>() {};
        return apiClient.invokeAPI("/account/{account_id}/lists", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Rated Movies
     * Get a list of all the movies you have rated.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param sessionId  (required)
     * @return GETGuestSessionGuestSessionIdRatedMovies200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETGuestSessionGuestSessionIdRatedMovies200Response gETAccountAccountIdRatedMovies(Integer accountId, String sessionId) throws RestClientException {
        return gETAccountAccountIdRatedMoviesWithHttpInfo(accountId, sessionId).getBody();
    }

    /**
     * Get Rated Movies
     * Get a list of all the movies you have rated.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param sessionId  (required)
     * @return ResponseEntity&lt;GETGuestSessionGuestSessionIdRatedMovies200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETGuestSessionGuestSessionIdRatedMovies200Response> gETAccountAccountIdRatedMoviesWithHttpInfo(Integer accountId, String sessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling gETAccountAccountIdRatedMovies");
        }
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling gETAccountAccountIdRatedMovies");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("account_id", accountId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETGuestSessionGuestSessionIdRatedMovies200Response> localReturnType = new ParameterizedTypeReference<GETGuestSessionGuestSessionIdRatedMovies200Response>() {};
        return apiClient.invokeAPI("/account/{account_id}/rated/movies", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Rated TV Shows
     * Get a list of all the TV shows you have rated.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param sessionId  (required)
     * @return GETGuestSessionGuestSessionIdRatedTv200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETGuestSessionGuestSessionIdRatedTv200Response gETAccountAccountIdRatedTv(Integer accountId, String sessionId) throws RestClientException {
        return gETAccountAccountIdRatedTvWithHttpInfo(accountId, sessionId).getBody();
    }

    /**
     * Get Rated TV Shows
     * Get a list of all the TV shows you have rated.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param sessionId  (required)
     * @return ResponseEntity&lt;GETGuestSessionGuestSessionIdRatedTv200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETGuestSessionGuestSessionIdRatedTv200Response> gETAccountAccountIdRatedTvWithHttpInfo(Integer accountId, String sessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling gETAccountAccountIdRatedTv");
        }
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling gETAccountAccountIdRatedTv");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("account_id", accountId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETGuestSessionGuestSessionIdRatedTv200Response> localReturnType = new ParameterizedTypeReference<GETGuestSessionGuestSessionIdRatedTv200Response>() {};
        return apiClient.invokeAPI("/account/{account_id}/rated/tv", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Rated TV Episodes
     * Get a list of all the TV episodes you have rated.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param sessionId  (required)
     * @return GETAccountAccountIdRatedTvEpisodes200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETAccountAccountIdRatedTvEpisodes200Response gETAccountAccountIdRatedTvEpisodes(String accountId, String sessionId) throws RestClientException {
        return gETAccountAccountIdRatedTvEpisodesWithHttpInfo(accountId, sessionId).getBody();
    }

    /**
     * Get Rated TV Episodes
     * Get a list of all the TV episodes you have rated.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param sessionId  (required)
     * @return ResponseEntity&lt;GETAccountAccountIdRatedTvEpisodes200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETAccountAccountIdRatedTvEpisodes200Response> gETAccountAccountIdRatedTvEpisodesWithHttpInfo(String accountId, String sessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling gETAccountAccountIdRatedTvEpisodes");
        }
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling gETAccountAccountIdRatedTvEpisodes");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("account_id", accountId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETAccountAccountIdRatedTvEpisodes200Response> localReturnType = new ParameterizedTypeReference<GETAccountAccountIdRatedTvEpisodes200Response>() {};
        return apiClient.invokeAPI("/account/{account_id}/rated/tv/episodes", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Movie Watchlist
     * Get a list of all the movies you have added to your watchlist.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param sessionId  (required)
     * @return GETMovieMovieIdRecommendations200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdRecommendations200Response gETAccountAccountIdWatchlistMovies(Integer accountId, String sessionId) throws RestClientException {
        return gETAccountAccountIdWatchlistMoviesWithHttpInfo(accountId, sessionId).getBody();
    }

    /**
     * Get Movie Watchlist
     * Get a list of all the movies you have added to your watchlist.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param sessionId  (required)
     * @return ResponseEntity&lt;GETMovieMovieIdRecommendations200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdRecommendations200Response> gETAccountAccountIdWatchlistMoviesWithHttpInfo(Integer accountId, String sessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling gETAccountAccountIdWatchlistMovies");
        }
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling gETAccountAccountIdWatchlistMovies");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("account_id", accountId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdRecommendations200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdRecommendations200Response>() {};
        return apiClient.invokeAPI("/account/{account_id}/watchlist/movies", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get TV Show Watchlist
     * Get a list of all the TV shows you have added to your watchlist.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param sessionId  (required)
     * @return GETAccountAccountIdWatchlistTv200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETAccountAccountIdWatchlistTv200Response gETAccountAccountIdWatchlistTv(Integer accountId, String sessionId) throws RestClientException {
        return gETAccountAccountIdWatchlistTvWithHttpInfo(accountId, sessionId).getBody();
    }

    /**
     * Get TV Show Watchlist
     * Get a list of all the TV shows you have added to your watchlist.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param sessionId  (required)
     * @return ResponseEntity&lt;GETAccountAccountIdWatchlistTv200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETAccountAccountIdWatchlistTv200Response> gETAccountAccountIdWatchlistTvWithHttpInfo(Integer accountId, String sessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling gETAccountAccountIdWatchlistTv");
        }
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling gETAccountAccountIdWatchlistTv");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("account_id", accountId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETAccountAccountIdWatchlistTv200Response> localReturnType = new ParameterizedTypeReference<GETAccountAccountIdWatchlistTv200Response>() {};
        return apiClient.invokeAPI("/account/{account_id}/watchlist/tv", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Guest Session
     * This method will let you create a new guest session. Guest sessions are a type of session that will let a user rate movies and TV shows but not require them to have a TMDB user account. More information about user authentication can be found [here](#docTextSection:NSZtgz7zptsiLYxXZ).  Please note, you should only generate a single guest session per user (or device) as you will be able to attach the ratings to a TMDB user account in the future. There is also IP limits in place so you should always make sure it&#39;s the end user doing the guest session actions.  If a guest session is not used for the first time within 24 hours, it will be automatically deleted.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETAuthenticationGuestSessionNew200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETAuthenticationGuestSessionNew200Response gETAuthenticationGuestSessionNew() throws RestClientException {
        return gETAuthenticationGuestSessionNewWithHttpInfo().getBody();
    }

    /**
     * Create Guest Session
     * This method will let you create a new guest session. Guest sessions are a type of session that will let a user rate movies and TV shows but not require them to have a TMDB user account. More information about user authentication can be found [here](#docTextSection:NSZtgz7zptsiLYxXZ).  Please note, you should only generate a single guest session per user (or device) as you will be able to attach the ratings to a TMDB user account in the future. There is also IP limits in place so you should always make sure it&#39;s the end user doing the guest session actions.  If a guest session is not used for the first time within 24 hours, it will be automatically deleted.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETAuthenticationGuestSessionNew200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETAuthenticationGuestSessionNew200Response> gETAuthenticationGuestSessionNewWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETAuthenticationGuestSessionNew200Response> localReturnType = new ParameterizedTypeReference<GETAuthenticationGuestSessionNew200Response>() {};
        return apiClient.invokeAPI("/authentication/guest_session/new", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Request Token
     * Create a temporary request token that can be used to validate a TMDB user login. More details about how this works can be found [here](#docTextSection:NSZtgz7zptsiLYxXZ).
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return POSTAuthenticationTokenValidateWithLogin200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public POSTAuthenticationTokenValidateWithLogin200Response gETAuthenticationTokenNew() throws RestClientException {
        return gETAuthenticationTokenNewWithHttpInfo().getBody();
    }

    /**
     * Create Request Token
     * Create a temporary request token that can be used to validate a TMDB user login. More details about how this works can be found [here](#docTextSection:NSZtgz7zptsiLYxXZ).
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;POSTAuthenticationTokenValidateWithLogin200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<POSTAuthenticationTokenValidateWithLogin200Response> gETAuthenticationTokenNewWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<POSTAuthenticationTokenValidateWithLogin200Response> localReturnType = new ParameterizedTypeReference<POSTAuthenticationTokenValidateWithLogin200Response>() {};
        return apiClient.invokeAPI("/authentication/token/new", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Movie Certifications
     * Get an up to date list of the officially supported movie certifications on TMDB.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETCertificationMovieList200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETCertificationMovieList200Response gETCertificationMovieList() throws RestClientException {
        return gETCertificationMovieListWithHttpInfo().getBody();
    }

    /**
     * Get Movie Certifications
     * Get an up to date list of the officially supported movie certifications on TMDB.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETCertificationMovieList200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETCertificationMovieList200Response> gETCertificationMovieListWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETCertificationMovieList200Response> localReturnType = new ParameterizedTypeReference<GETCertificationMovieList200Response>() {};
        return apiClient.invokeAPI("/certification/movie/list", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get TV Certifications
     * Get an up to date list of the officially supported TV show certifications on TMDB.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETCertificationTvList200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETCertificationTvList200Response gETCertificationTvList() throws RestClientException {
        return gETCertificationTvListWithHttpInfo().getBody();
    }

    /**
     * Get TV Certifications
     * Get an up to date list of the officially supported TV show certifications on TMDB.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETCertificationTvList200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETCertificationTvList200Response> gETCertificationTvListWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETCertificationTvList200Response> localReturnType = new ParameterizedTypeReference<GETCertificationTvList200Response>() {};
        return apiClient.invokeAPI("/certification/tv/list", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Details
     * Get collection details by id.  #### Recent Changes  | **Date** | **Change** | | - | - | | March 16, 2018 | Added the [translations](#endpoint:bhcsxEgRvyk3N7FnD) method. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param collectionId  (required)
     * @return GETCollectionCollectionId200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETCollectionCollectionId200Response gETCollectionCollectionId(Integer collectionId) throws RestClientException {
        return gETCollectionCollectionIdWithHttpInfo(collectionId).getBody();
    }

    /**
     * Get Details
     * Get collection details by id.  #### Recent Changes  | **Date** | **Change** | | - | - | | March 16, 2018 | Added the [translations](#endpoint:bhcsxEgRvyk3N7FnD) method. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param collectionId  (required)
     * @return ResponseEntity&lt;GETCollectionCollectionId200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETCollectionCollectionId200Response> gETCollectionCollectionIdWithHttpInfo(Integer collectionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling gETCollectionCollectionId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("collection_id", collectionId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETCollectionCollectionId200Response> localReturnType = new ParameterizedTypeReference<GETCollectionCollectionId200Response>() {};
        return apiClient.invokeAPI("/collection/{collection_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Images
     * Get the images for a collection by id.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param collectionId  (required)
     * @return GETCollectionCollectionIdImages200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETCollectionCollectionIdImages200Response gETCollectionCollectionIdImages(Integer collectionId) throws RestClientException {
        return gETCollectionCollectionIdImagesWithHttpInfo(collectionId).getBody();
    }

    /**
     * Get Images
     * Get the images for a collection by id.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param collectionId  (required)
     * @return ResponseEntity&lt;GETCollectionCollectionIdImages200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETCollectionCollectionIdImages200Response> gETCollectionCollectionIdImagesWithHttpInfo(Integer collectionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling gETCollectionCollectionIdImages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("collection_id", collectionId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETCollectionCollectionIdImages200Response> localReturnType = new ParameterizedTypeReference<GETCollectionCollectionIdImages200Response>() {};
        return apiClient.invokeAPI("/collection/{collection_id}/images", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Translations
     * Get the list translations for a collection by id.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param collectionId  (required)
     * @return GETMovieMovieIdTranslations200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdTranslations200Response gETCollectionCollectionIdTranslations(Integer collectionId) throws RestClientException {
        return gETCollectionCollectionIdTranslationsWithHttpInfo(collectionId).getBody();
    }

    /**
     * Get Translations
     * Get the list translations for a collection by id.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param collectionId  (required)
     * @return ResponseEntity&lt;GETMovieMovieIdTranslations200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdTranslations200Response> gETCollectionCollectionIdTranslationsWithHttpInfo(Integer collectionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling gETCollectionCollectionIdTranslations");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("collection_id", collectionId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdTranslations200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdTranslations200Response>() {};
        return apiClient.invokeAPI("/collection/{collection_id}/translations", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Details
     * Get a companies details by id.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param companyId  (required)
     * @return GETCompanyCompanyId200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETCompanyCompanyId200Response gETCompanyCompanyId(Integer companyId) throws RestClientException {
        return gETCompanyCompanyIdWithHttpInfo(companyId).getBody();
    }

    /**
     * Get Details
     * Get a companies details by id.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param companyId  (required)
     * @return ResponseEntity&lt;GETCompanyCompanyId200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETCompanyCompanyId200Response> gETCompanyCompanyIdWithHttpInfo(Integer companyId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'companyId' when calling gETCompanyCompanyId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("company_id", companyId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETCompanyCompanyId200Response> localReturnType = new ParameterizedTypeReference<GETCompanyCompanyId200Response>() {};
        return apiClient.invokeAPI("/company/{company_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Alternative Names
     * Get the alternative names of a company.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param companyId  (required)
     * @return GETCompanyCompanyIdAlternativeNames200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETCompanyCompanyIdAlternativeNames200Response gETCompanyCompanyIdAlternativeNames(Integer companyId) throws RestClientException {
        return gETCompanyCompanyIdAlternativeNamesWithHttpInfo(companyId).getBody();
    }

    /**
     * Get Alternative Names
     * Get the alternative names of a company.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param companyId  (required)
     * @return ResponseEntity&lt;GETCompanyCompanyIdAlternativeNames200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETCompanyCompanyIdAlternativeNames200Response> gETCompanyCompanyIdAlternativeNamesWithHttpInfo(Integer companyId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'companyId' when calling gETCompanyCompanyIdAlternativeNames");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("company_id", companyId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETCompanyCompanyIdAlternativeNames200Response> localReturnType = new ParameterizedTypeReference<GETCompanyCompanyIdAlternativeNames200Response>() {};
        return apiClient.invokeAPI("/company/{company_id}/alternative_names", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Images
     * Get a companies logos by id.  There are two image formats that are supported for companies, PNG&#39;s and SVG&#39;s. You can see which type the original file is by looking at the &#x60;file_type&#x60; field. We prefer SVG&#39;s as they are resolution independent and as such, the width and height are only there to reflect the original asset that was uploaded. An SVG can be scaled properly beyond those dimensions if you call them as a PNG.  For more information about how SVG&#39;s and PNG&#39;s can be used, take a read through [this document](#docTextSection:mXP9B2uzoDJFguDZv).
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param companyId  (required)
     * @return GETCompanyCompanyIdImages200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETCompanyCompanyIdImages200Response gETCompanyCompanyIdImages(Integer companyId) throws RestClientException {
        return gETCompanyCompanyIdImagesWithHttpInfo(companyId).getBody();
    }

    /**
     * Get Images
     * Get a companies logos by id.  There are two image formats that are supported for companies, PNG&#39;s and SVG&#39;s. You can see which type the original file is by looking at the &#x60;file_type&#x60; field. We prefer SVG&#39;s as they are resolution independent and as such, the width and height are only there to reflect the original asset that was uploaded. An SVG can be scaled properly beyond those dimensions if you call them as a PNG.  For more information about how SVG&#39;s and PNG&#39;s can be used, take a read through [this document](#docTextSection:mXP9B2uzoDJFguDZv).
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param companyId  (required)
     * @return ResponseEntity&lt;GETCompanyCompanyIdImages200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETCompanyCompanyIdImages200Response> gETCompanyCompanyIdImagesWithHttpInfo(Integer companyId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'companyId' when calling gETCompanyCompanyIdImages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("company_id", companyId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETCompanyCompanyIdImages200Response> localReturnType = new ParameterizedTypeReference<GETCompanyCompanyIdImages200Response>() {};
        return apiClient.invokeAPI("/company/{company_id}/images", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get API Configuration
     * Get the system wide configuration information. Some elements of the API require some knowledge of this configuration data. The purpose of this is to try and keep the actual API responses as light as possible. It is recommended you cache this data within your application and check for updates every few days.  This method currently holds the data relevant to building image URLs as well as the change key map.  To build an image URL, you will need 3 pieces of data. The &#x60;base_url&#x60;, &#x60;size&#x60; and &#x60;file_path&#x60;. Simply combine them all and you will have a fully qualified URL. Here’s an example URL:      https://image.tmdb.org/t/p/w500/8uO0gUM8aNqYLs1OsTBQiXu0fEv.jpg  The configuration method also contains the list of change keys which can be useful if you are building an app that consumes data from the change feed.
     * <p><b>200</b> - 
     * @param apiKey  (optional)
     * @return GETConfiguration200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETConfiguration200Response gETConfiguration(String apiKey) throws RestClientException {
        return gETConfigurationWithHttpInfo(apiKey).getBody();
    }

    /**
     * Get API Configuration
     * Get the system wide configuration information. Some elements of the API require some knowledge of this configuration data. The purpose of this is to try and keep the actual API responses as light as possible. It is recommended you cache this data within your application and check for updates every few days.  This method currently holds the data relevant to building image URLs as well as the change key map.  To build an image URL, you will need 3 pieces of data. The &#x60;base_url&#x60;, &#x60;size&#x60; and &#x60;file_path&#x60;. Simply combine them all and you will have a fully qualified URL. Here’s an example URL:      https://image.tmdb.org/t/p/w500/8uO0gUM8aNqYLs1OsTBQiXu0fEv.jpg  The configuration method also contains the list of change keys which can be useful if you are building an app that consumes data from the change feed.
     * <p><b>200</b> - 
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;GETConfiguration200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETConfiguration200Response> gETConfigurationWithHttpInfo(String apiKey) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "api_key", apiKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETConfiguration200Response> localReturnType = new ParameterizedTypeReference<GETConfiguration200Response>() {};
        return apiClient.invokeAPI("/configuration", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Countries
     * Get the list of countries (ISO 3166-1 tags) used throughout TMDB.
     * <p><b>200</b> - 
     * @param apiKey  (optional)
     * @return List&lt;GETConfigurationCountries200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GETConfigurationCountries200ResponseInner> gETConfigurationCountries(String apiKey) throws RestClientException {
        return gETConfigurationCountriesWithHttpInfo(apiKey).getBody();
    }

    /**
     * Get Countries
     * Get the list of countries (ISO 3166-1 tags) used throughout TMDB.
     * <p><b>200</b> - 
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;List&lt;GETConfigurationCountries200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<GETConfigurationCountries200ResponseInner>> gETConfigurationCountriesWithHttpInfo(String apiKey) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "api_key", apiKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<List<GETConfigurationCountries200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<GETConfigurationCountries200ResponseInner>>() {};
        return apiClient.invokeAPI("/configuration/countries", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Jobs
     * Get a list of the jobs and departments we use on TMDB.
     * <p><b>200</b> - 
     * @param apiKey  (optional)
     * @return List&lt;GETConfigurationJobs200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GETConfigurationJobs200ResponseInner> gETConfigurationJobs(String apiKey) throws RestClientException {
        return gETConfigurationJobsWithHttpInfo(apiKey).getBody();
    }

    /**
     * Get Jobs
     * Get a list of the jobs and departments we use on TMDB.
     * <p><b>200</b> - 
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;List&lt;GETConfigurationJobs200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<GETConfigurationJobs200ResponseInner>> gETConfigurationJobsWithHttpInfo(String apiKey) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "api_key", apiKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<List<GETConfigurationJobs200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<GETConfigurationJobs200ResponseInner>>() {};
        return apiClient.invokeAPI("/configuration/jobs", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Languages
     * Get the list of languages (ISO 639-1 tags) used throughout TMDB.
     * <p><b>200</b> - 
     * @param apiKey  (optional)
     * @return List&lt;GETConfigurationLanguages200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GETConfigurationLanguages200ResponseInner> gETConfigurationLanguages(String apiKey) throws RestClientException {
        return gETConfigurationLanguagesWithHttpInfo(apiKey).getBody();
    }

    /**
     * Get Languages
     * Get the list of languages (ISO 639-1 tags) used throughout TMDB.
     * <p><b>200</b> - 
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;List&lt;GETConfigurationLanguages200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<GETConfigurationLanguages200ResponseInner>> gETConfigurationLanguagesWithHttpInfo(String apiKey) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "api_key", apiKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<List<GETConfigurationLanguages200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<GETConfigurationLanguages200ResponseInner>>() {};
        return apiClient.invokeAPI("/configuration/languages", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Primary Translations
     * Get a list of the _officially_ supported translations on TMDB.  While it&#39;s technically possible to add a translation in any one of the [languages](#endpoint:tem8QfFFyAfWodrCv) we have added to TMDB (we don&#39;t restrict content), the ones listed in this method are the ones we also support for localizing the website with which means they are what we refer to as the \&quot;primary\&quot; translations.  These are all specified as [IETF tags](https://en.wikipedia.org/wiki/IETF_language_tag) to identify the languages we use on TMDB. There is one exception which is image languages. They are currently only designated by a ISO-639-1 tag. This is a planned upgrade for the future.  We&#39;re always open to adding more if you think one should be added. You can ask about getting a new primary translation added by posting on [the forums](https://www.themoviedb.org/talk/category/5047951f760ee3318900009a).  One more thing to mention, these are the translations that map to our website translation project. You can view and contribute to that project [here](https://www.localeapp.com/projects/8267).
     * <p><b>200</b> - 
     * @param apiKey  (optional)
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> gETConfigurationPrimaryTranslations(String apiKey) throws RestClientException {
        return gETConfigurationPrimaryTranslationsWithHttpInfo(apiKey).getBody();
    }

    /**
     * Get Primary Translations
     * Get a list of the _officially_ supported translations on TMDB.  While it&#39;s technically possible to add a translation in any one of the [languages](#endpoint:tem8QfFFyAfWodrCv) we have added to TMDB (we don&#39;t restrict content), the ones listed in this method are the ones we also support for localizing the website with which means they are what we refer to as the \&quot;primary\&quot; translations.  These are all specified as [IETF tags](https://en.wikipedia.org/wiki/IETF_language_tag) to identify the languages we use on TMDB. There is one exception which is image languages. They are currently only designated by a ISO-639-1 tag. This is a planned upgrade for the future.  We&#39;re always open to adding more if you think one should be added. You can ask about getting a new primary translation added by posting on [the forums](https://www.themoviedb.org/talk/category/5047951f760ee3318900009a).  One more thing to mention, these are the translations that map to our website translation project. You can view and contribute to that project [here](https://www.localeapp.com/projects/8267).
     * <p><b>200</b> - 
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> gETConfigurationPrimaryTranslationsWithHttpInfo(String apiKey) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "api_key", apiKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<List<String>> localReturnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI("/configuration/primary_translations", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Timezones
     * Get the list of timezones used throughout TMDB.
     * <p><b>200</b> - 
     * @param apiKey  (optional)
     * @return List&lt;GETConfigurationTimezones200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GETConfigurationTimezones200ResponseInner> gETConfigurationTimezones(String apiKey) throws RestClientException {
        return gETConfigurationTimezonesWithHttpInfo(apiKey).getBody();
    }

    /**
     * Get Timezones
     * Get the list of timezones used throughout TMDB.
     * <p><b>200</b> - 
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;List&lt;GETConfigurationTimezones200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<GETConfigurationTimezones200ResponseInner>> gETConfigurationTimezonesWithHttpInfo(String apiKey) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "api_key", apiKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<List<GETConfigurationTimezones200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<GETConfigurationTimezones200ResponseInner>>() {};
        return apiClient.invokeAPI("/configuration/timezones", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Details
     * Get a movie or TV credit details by id.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 13, 2018 | Movie credits are now supported. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param creditId  (required)
     * @return GETCreditCreditId200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETCreditCreditId200Response gETCreditCreditId(String creditId) throws RestClientException {
        return gETCreditCreditIdWithHttpInfo(creditId).getBody();
    }

    /**
     * Get Details
     * Get a movie or TV credit details by id.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 13, 2018 | Movie credits are now supported. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param creditId  (required)
     * @return ResponseEntity&lt;GETCreditCreditId200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETCreditCreditId200Response> gETCreditCreditIdWithHttpInfo(String creditId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'creditId' is set
        if (creditId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'creditId' when calling gETCreditCreditId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("credit_id", creditId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETCreditCreditId200Response> localReturnType = new ParameterizedTypeReference<GETCreditCreditId200Response>() {};
        return apiClient.invokeAPI("/credit/{credit_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Movie Discover
     * Discover movies by different types of data like average rating, number of votes, genres and certifications. You can get a valid list of certifications from the [certifications list](#endpoint:faFKjuKG2HnwexAWM) method.  Discover also supports a nice list of sort options. See below for all of the available options.  Please note, when using &#x60;certification&#x60; \\ &#x60;certification.lte&#x60; you must also specify &#x60;certification_country&#x60;. These two parameters work together in order to filter the results. You can only filter results with the countries we have added to our [certifications list](#endpoint:faFKjuKG2HnwexAWM).  If you specify the &#x60;region&#x60; parameter, the regional release date will be used instead of the primary release date. The date returned will be the first date based on your query (ie. if a &#x60;with_release_type&#x60; is specified). It&#39;s important to note the order of the release types that are used. Specifying \&quot;2|3\&quot; would return the limited theatrical release date as opposed to \&quot;3|2\&quot; which would return the theatrical date.  Also note that a number of filters support being comma (&#x60;,&#x60;) or pipe (&#x60;|&#x60;) separated. Comma&#39;s are treated like an &#x60;AND&#x60; and query while pipe&#39;s are an &#x60;OR&#x60;.   Some examples of what can be done with discover can be found [here](https://www.themoviedb.org/documentation/api/discover).  #### Recent Changes  | **Date** | **Change** | | - | - | | November 18, 2021 | A new &#x60;without_companies&#x60; filter is available.| | April 13, 2021 | A new &#x60;with_watch_monetization_types&#x60; filter is available to use with &#x60;watch_region&#x60;.| | January 2, 2021 | A new set of filters are available for watch provider filtering. Check out &#x60;with_watch_providers&#x60; and &#x60;watch_region&#x60;.|
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param sortBy Choose from one of the many available sort options. (optional, default to popularity.desc)
     * @param certificationCountry Used in conjunction with the certification filter, use this to specify a country with a valid certification. (optional)
     * @param certification Filter results with a valid certification from the &#39;certification_country&#39; field. (optional)
     * @param certificationLte Filter and only include movies that have a certification that is less than or equal to the specified value. (optional)
     * @param certificationGte Filter and only include movies that have a certification that is greater than or equal to the specified value. (optional)
     * @param includeAdult A filter and include or exclude adult movies. (optional, default to false)
     * @param includeVideo A filter to include or exclude videos. (optional, default to false)
     * @param language Specify a language to query translatable fields with. (optional, default to en-US)
     * @param page Specify the page of results to query. (optional, default to 1)
     * @param primaryReleaseYear A filter to limit the results to a specific primary release year. (optional)
     * @param primaryReleaseDateGte Filter and only include movies that have a primary release date that is greater or equal to the specified value. (optional)
     * @param primaryReleaseDateLte Filter and only include movies that have a primary release date that is less than or equal to the specified value. (optional)
     * @param releaseDateGte Filter and only include movies that have a release date (looking at all release dates) that is greater or equal to the specified value. (optional)
     * @param releaseDateLte Filter and only include movies that have a release date (looking at all release dates) that is less than or equal to the specified value. (optional)
     * @param withReleaseType Specify a comma (AND) or pipe (OR) separated value to filter release types by. These release types map to the same values found on the movie release date method. (optional)
     * @param year A filter to limit the results to a specific year (looking at all release dates). (optional)
     * @param voteCountGte Filter and only include movies that have a vote count that is greater or equal to the specified value. (optional)
     * @param voteCountLte Filter and only include movies that have a vote count that is less than or equal to the specified value. (optional)
     * @param voteAverageGte Filter and only include movies that have a rating that is greater or equal to the specified value. (optional)
     * @param voteAverageLte Filter and only include movies that have a rating that is less than or equal to the specified value. (optional)
     * @param withCast A comma separated list of person ID&#39;s. Only include movies that have one of the ID&#39;s added as an actor. (optional)
     * @param withCrew A comma separated list of person ID&#39;s. Only include movies that have one of the ID&#39;s added as a crew member. (optional)
     * @param withPeople A comma separated list of person ID&#39;s. Only include movies that have one of the ID&#39;s added as a either a actor or a crew member. (optional)
     * @param withCompanies A comma separated list of production company ID&#39;s. Only include movies that have one of the ID&#39;s added as a production company. (optional)
     * @param withGenres Comma separated value of genre ids that you want to include in the results. (optional)
     * @param withoutGenres Comma separated value of genre ids that you want to exclude from the results. (optional)
     * @param withKeywords A comma separated list of keyword ID&#39;s. Only includes movies that have one of the ID&#39;s added as a keyword. (optional)
     * @param withoutKeywords Exclude items with certain keywords. You can comma and pipe seperate these values to create an &#39;AND&#39; or &#39;OR&#39; logic. (optional)
     * @param withRuntimeGte Filter and only include movies that have a runtime that is greater or equal to a value. (optional)
     * @param withRuntimeLte Filter and only include movies that have a runtime that is less than or equal to a value. (optional)
     * @param withOriginalLanguage Specify an ISO 639-1 string to filter results by their original language value. (optional)
     * @param withWatchProviders A comma or pipe separated list of watch provider ID&#39;s. Combine this filter with &#x60;watch_region&#x60; in order to filter your results by a specific watch provider in a specific region. (optional)
     * @param watchRegion An ISO 3166-1 code. Combine this filter with &#x60;with_watch_providers&#x60; in order to filter your results by a specific watch provider in a specific region. (optional)
     * @param withWatchMonetizationTypes In combination with &#x60;watch_region&#x60;, you can filter by monetization type. (optional)
     * @param withoutCompanies Filter the results to exclude the specific production companies you specify here. &#x60;AND&#x60; / &#x60;OR&#x60; filters are supported. (optional)
     * @return GETMoviePopular200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMoviePopular200Response gETDiscoverMovie(String sortBy, String certificationCountry, String certification, String certificationLte, String certificationGte, Boolean includeAdult, Boolean includeVideo, String language, Integer page, Integer primaryReleaseYear, LocalDate primaryReleaseDateGte, LocalDate primaryReleaseDateLte, LocalDate releaseDateGte, LocalDate releaseDateLte, Integer withReleaseType, Integer year, Integer voteCountGte, Integer voteCountLte, BigDecimal voteAverageGte, BigDecimal voteAverageLte, String withCast, String withCrew, String withPeople, String withCompanies, String withGenres, String withoutGenres, String withKeywords, String withoutKeywords, Integer withRuntimeGte, Integer withRuntimeLte, String withOriginalLanguage, String withWatchProviders, String watchRegion, String withWatchMonetizationTypes, String withoutCompanies) throws RestClientException {
        return gETDiscoverMovieWithHttpInfo(sortBy, certificationCountry, certification, certificationLte, certificationGte, includeAdult, includeVideo, language, page, primaryReleaseYear, primaryReleaseDateGte, primaryReleaseDateLte, releaseDateGte, releaseDateLte, withReleaseType, year, voteCountGte, voteCountLte, voteAverageGte, voteAverageLte, withCast, withCrew, withPeople, withCompanies, withGenres, withoutGenres, withKeywords, withoutKeywords, withRuntimeGte, withRuntimeLte, withOriginalLanguage, withWatchProviders, watchRegion, withWatchMonetizationTypes, withoutCompanies).getBody();
    }

    /**
     * Movie Discover
     * Discover movies by different types of data like average rating, number of votes, genres and certifications. You can get a valid list of certifications from the [certifications list](#endpoint:faFKjuKG2HnwexAWM) method.  Discover also supports a nice list of sort options. See below for all of the available options.  Please note, when using &#x60;certification&#x60; \\ &#x60;certification.lte&#x60; you must also specify &#x60;certification_country&#x60;. These two parameters work together in order to filter the results. You can only filter results with the countries we have added to our [certifications list](#endpoint:faFKjuKG2HnwexAWM).  If you specify the &#x60;region&#x60; parameter, the regional release date will be used instead of the primary release date. The date returned will be the first date based on your query (ie. if a &#x60;with_release_type&#x60; is specified). It&#39;s important to note the order of the release types that are used. Specifying \&quot;2|3\&quot; would return the limited theatrical release date as opposed to \&quot;3|2\&quot; which would return the theatrical date.  Also note that a number of filters support being comma (&#x60;,&#x60;) or pipe (&#x60;|&#x60;) separated. Comma&#39;s are treated like an &#x60;AND&#x60; and query while pipe&#39;s are an &#x60;OR&#x60;.   Some examples of what can be done with discover can be found [here](https://www.themoviedb.org/documentation/api/discover).  #### Recent Changes  | **Date** | **Change** | | - | - | | November 18, 2021 | A new &#x60;without_companies&#x60; filter is available.| | April 13, 2021 | A new &#x60;with_watch_monetization_types&#x60; filter is available to use with &#x60;watch_region&#x60;.| | January 2, 2021 | A new set of filters are available for watch provider filtering. Check out &#x60;with_watch_providers&#x60; and &#x60;watch_region&#x60;.|
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param sortBy Choose from one of the many available sort options. (optional, default to popularity.desc)
     * @param certificationCountry Used in conjunction with the certification filter, use this to specify a country with a valid certification. (optional)
     * @param certification Filter results with a valid certification from the &#39;certification_country&#39; field. (optional)
     * @param certificationLte Filter and only include movies that have a certification that is less than or equal to the specified value. (optional)
     * @param certificationGte Filter and only include movies that have a certification that is greater than or equal to the specified value. (optional)
     * @param includeAdult A filter and include or exclude adult movies. (optional, default to false)
     * @param includeVideo A filter to include or exclude videos. (optional, default to false)
     * @param language Specify a language to query translatable fields with. (optional, default to en-US)
     * @param page Specify the page of results to query. (optional, default to 1)
     * @param primaryReleaseYear A filter to limit the results to a specific primary release year. (optional)
     * @param primaryReleaseDateGte Filter and only include movies that have a primary release date that is greater or equal to the specified value. (optional)
     * @param primaryReleaseDateLte Filter and only include movies that have a primary release date that is less than or equal to the specified value. (optional)
     * @param releaseDateGte Filter and only include movies that have a release date (looking at all release dates) that is greater or equal to the specified value. (optional)
     * @param releaseDateLte Filter and only include movies that have a release date (looking at all release dates) that is less than or equal to the specified value. (optional)
     * @param withReleaseType Specify a comma (AND) or pipe (OR) separated value to filter release types by. These release types map to the same values found on the movie release date method. (optional)
     * @param year A filter to limit the results to a specific year (looking at all release dates). (optional)
     * @param voteCountGte Filter and only include movies that have a vote count that is greater or equal to the specified value. (optional)
     * @param voteCountLte Filter and only include movies that have a vote count that is less than or equal to the specified value. (optional)
     * @param voteAverageGte Filter and only include movies that have a rating that is greater or equal to the specified value. (optional)
     * @param voteAverageLte Filter and only include movies that have a rating that is less than or equal to the specified value. (optional)
     * @param withCast A comma separated list of person ID&#39;s. Only include movies that have one of the ID&#39;s added as an actor. (optional)
     * @param withCrew A comma separated list of person ID&#39;s. Only include movies that have one of the ID&#39;s added as a crew member. (optional)
     * @param withPeople A comma separated list of person ID&#39;s. Only include movies that have one of the ID&#39;s added as a either a actor or a crew member. (optional)
     * @param withCompanies A comma separated list of production company ID&#39;s. Only include movies that have one of the ID&#39;s added as a production company. (optional)
     * @param withGenres Comma separated value of genre ids that you want to include in the results. (optional)
     * @param withoutGenres Comma separated value of genre ids that you want to exclude from the results. (optional)
     * @param withKeywords A comma separated list of keyword ID&#39;s. Only includes movies that have one of the ID&#39;s added as a keyword. (optional)
     * @param withoutKeywords Exclude items with certain keywords. You can comma and pipe seperate these values to create an &#39;AND&#39; or &#39;OR&#39; logic. (optional)
     * @param withRuntimeGte Filter and only include movies that have a runtime that is greater or equal to a value. (optional)
     * @param withRuntimeLte Filter and only include movies that have a runtime that is less than or equal to a value. (optional)
     * @param withOriginalLanguage Specify an ISO 639-1 string to filter results by their original language value. (optional)
     * @param withWatchProviders A comma or pipe separated list of watch provider ID&#39;s. Combine this filter with &#x60;watch_region&#x60; in order to filter your results by a specific watch provider in a specific region. (optional)
     * @param watchRegion An ISO 3166-1 code. Combine this filter with &#x60;with_watch_providers&#x60; in order to filter your results by a specific watch provider in a specific region. (optional)
     * @param withWatchMonetizationTypes In combination with &#x60;watch_region&#x60;, you can filter by monetization type. (optional)
     * @param withoutCompanies Filter the results to exclude the specific production companies you specify here. &#x60;AND&#x60; / &#x60;OR&#x60; filters are supported. (optional)
     * @return ResponseEntity&lt;GETMoviePopular200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMoviePopular200Response> gETDiscoverMovieWithHttpInfo(String sortBy, String certificationCountry, String certification, String certificationLte, String certificationGte, Boolean includeAdult, Boolean includeVideo, String language, Integer page, Integer primaryReleaseYear, LocalDate primaryReleaseDateGte, LocalDate primaryReleaseDateLte, LocalDate releaseDateGte, LocalDate releaseDateLte, Integer withReleaseType, Integer year, Integer voteCountGte, Integer voteCountLte, BigDecimal voteAverageGte, BigDecimal voteAverageLte, String withCast, String withCrew, String withPeople, String withCompanies, String withGenres, String withoutGenres, String withKeywords, String withoutKeywords, Integer withRuntimeGte, Integer withRuntimeLte, String withOriginalLanguage, String withWatchProviders, String watchRegion, String withWatchMonetizationTypes, String withoutCompanies) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort_by", sortBy));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "certification_country", certificationCountry));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "certification", certification));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "certification.lte", certificationLte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "certification.gte", certificationGte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_adult", includeAdult));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_video", includeVideo));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "primary_release_year", primaryReleaseYear));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "primary_release_date.gte", primaryReleaseDateGte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "primary_release_date.lte", primaryReleaseDateLte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "release_date.gte", releaseDateGte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "release_date.lte", releaseDateLte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_release_type", withReleaseType));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "year", year));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "vote_count.gte", voteCountGte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "vote_count.lte", voteCountLte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "vote_average.gte", voteAverageGte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "vote_average.lte", voteAverageLte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_cast", withCast));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_crew", withCrew));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_people", withPeople));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_companies", withCompanies));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_genres", withGenres));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "without_genres", withoutGenres));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_keywords", withKeywords));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "without_keywords", withoutKeywords));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_runtime.gte", withRuntimeGte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_runtime.lte", withRuntimeLte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_original_language", withOriginalLanguage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_watch_providers", withWatchProviders));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "watch_region", watchRegion));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_watch_monetization_types", withWatchMonetizationTypes));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "without_companies", withoutCompanies));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMoviePopular200Response> localReturnType = new ParameterizedTypeReference<GETMoviePopular200Response>() {};
        return apiClient.invokeAPI("/discover/movie", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * TV Discover
     * Discover TV shows by different types of data like average rating, number of votes, genres, the network they aired on and air dates.  Discover also supports a nice list of sort options. See below for all of the available options.  Also note that a number of filters support being comma (&#x60;,&#x60;) or pipe (&#x60;|&#x60;) separated. Comma&#39;s are treated like an &#x60;AND&#x60; and query while pipe&#39;s are an &#x60;OR&#x60;.   Some examples of what can be done with discover can be found [here](https://www.themoviedb.org/documentation/api/discover).  #### Recent Changes  | **Date** | **Change** | | - | - | | November 18, 2021 | Some new filters are available: &#x60;with_status&#x60;, &#x60;with_type&#x60; and &#x60;without_companies&#x60;.| | April 13, 2021 | A new &#x60;with_watch_monetization_types&#x60; filter is available to use with &#x60;watch_region&#x60;.| | January 2, 2021 | A new set of filters are available for watch provider filtering. Check out &#x60;with_watch_providers&#x60; and &#x60;watch_region&#x60;.|
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param sortBy Choose from one of the many available sort options. (optional, default to popularity.desc)
     * @param airDateGte Filter and only include TV shows that have a air date (by looking at all episodes) that is greater or equal to the specified value. (optional)
     * @param airDateLte Filter and only include TV shows that have a air date (by looking at all episodes) that is less than or equal to the specified value. (optional)
     * @param firstAirDateGte Filter and only include TV shows that have a original air date that is greater or equal to the specified value. Can be used in conjunction with the \&quot;include_null_first_air_dates\&quot; filter if you want to include items with no air date. (optional)
     * @param firstAirDateLte Filter and only include TV shows that have a original air date that is less than or equal to the specified value. Can be used in conjunction with the \&quot;include_null_first_air_dates\&quot; filter if you want to include items with no air date. (optional)
     * @param firstAirDateYear Filter and only include TV shows that have a original air date year that equal to the specified value. Can be used in conjunction with the \&quot;include_null_first_air_dates\&quot; filter if you want to include items with no air date. (optional)
     * @param language Specify a language to query translatable fields with. (optional, default to en-US)
     * @param page Specify the page of results to query. (optional, default to 1)
     * @param timezone Used in conjunction with the air_date.gte/lte filter to calculate the proper UTC offset. (optional, default to America/New_York)
     * @param voteAverageGte Filter and only include movies that have a rating that is greater or equal to the specified value. (optional)
     * @param voteCountGte Filter and only include movies that have a rating that is less than or equal to the specified value. (optional)
     * @param withGenres Comma separated value of genre ids that you want to include in the results. (optional)
     * @param withNetworks Comma separated value of network ids that you want to include in the results. (optional)
     * @param withoutGenres Comma separated value of genre ids that you want to exclude from the results. (optional)
     * @param withRuntimeGte Filter and only include TV shows with an episode runtime that is greater than or equal to a value. (optional)
     * @param withRuntimeLte Filter and only include TV shows with an episode runtime that is less than or equal to a value. (optional)
     * @param includeNullFirstAirDates Use this filter to include TV shows that don&#39;t have an air date while using any of the \&quot;first_air_date\&quot; filters. (optional, default to false)
     * @param withOriginalLanguage Specify an ISO 639-1 string to filter results by their original language value. (optional)
     * @param withoutKeywords Exclude items with certain keywords. You can comma and pipe seperate these values to create an &#39;AND&#39; or &#39;OR&#39; logic. (optional)
     * @param screenedTheatrically Filter results to include items that have been screened theatrically. (optional)
     * @param withCompanies A comma separated list of production company ID&#39;s. Only include movies that have one of the ID&#39;s added as a production company. (optional)
     * @param withKeywords A comma separated list of keyword ID&#39;s. Only includes TV shows that have one of the ID&#39;s added as a keyword. (optional)
     * @param withWatchProviders A comma or pipe separated list of watch provider ID&#39;s. Combine this filter with &#x60;watch_region&#x60; in order to filter your results by a specific watch provider in a specific region. (optional)
     * @param watchRegion An ISO 3166-1 code. Combine this filter with &#x60;with_watch_providers&#x60; in order to filter your results by a specific watch provider in a specific region. (optional)
     * @param withWatchMonetizationTypes In combination with &#x60;watch_region&#x60;, you can filter by monetization type. (optional)
     * @param withStatus Filter TV shows by their status.  Returning Series: 0 Planned: 1 In Production: 2 Ended: 3 Cancelled: 4 Pilot: 5 (optional)
     * @param withType Filter TV shows by their type.  Documentary: 0 News: 1 Miniseries: 2 Reality: 3 Scripted: 4 Talk Show: 5 Video: 6 (optional)
     * @param withoutCompanies Filter the results to exclude the specific production companies you specify here. &#x60;AND&#x60; / &#x60;OR&#x60; filters are supported. (optional)
     * @return GETDiscoverTv200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETDiscoverTv200Response gETDiscoverTv(String sortBy, LocalDate airDateGte, LocalDate airDateLte, LocalDate firstAirDateGte, LocalDate firstAirDateLte, Integer firstAirDateYear, String language, Integer page, String timezone, BigDecimal voteAverageGte, Integer voteCountGte, String withGenres, String withNetworks, String withoutGenres, Integer withRuntimeGte, Integer withRuntimeLte, Boolean includeNullFirstAirDates, String withOriginalLanguage, String withoutKeywords, Boolean screenedTheatrically, String withCompanies, String withKeywords, String withWatchProviders, String watchRegion, String withWatchMonetizationTypes, String withStatus, String withType, String withoutCompanies) throws RestClientException {
        return gETDiscoverTvWithHttpInfo(sortBy, airDateGte, airDateLte, firstAirDateGte, firstAirDateLte, firstAirDateYear, language, page, timezone, voteAverageGte, voteCountGte, withGenres, withNetworks, withoutGenres, withRuntimeGte, withRuntimeLte, includeNullFirstAirDates, withOriginalLanguage, withoutKeywords, screenedTheatrically, withCompanies, withKeywords, withWatchProviders, watchRegion, withWatchMonetizationTypes, withStatus, withType, withoutCompanies).getBody();
    }

    /**
     * TV Discover
     * Discover TV shows by different types of data like average rating, number of votes, genres, the network they aired on and air dates.  Discover also supports a nice list of sort options. See below for all of the available options.  Also note that a number of filters support being comma (&#x60;,&#x60;) or pipe (&#x60;|&#x60;) separated. Comma&#39;s are treated like an &#x60;AND&#x60; and query while pipe&#39;s are an &#x60;OR&#x60;.   Some examples of what can be done with discover can be found [here](https://www.themoviedb.org/documentation/api/discover).  #### Recent Changes  | **Date** | **Change** | | - | - | | November 18, 2021 | Some new filters are available: &#x60;with_status&#x60;, &#x60;with_type&#x60; and &#x60;without_companies&#x60;.| | April 13, 2021 | A new &#x60;with_watch_monetization_types&#x60; filter is available to use with &#x60;watch_region&#x60;.| | January 2, 2021 | A new set of filters are available for watch provider filtering. Check out &#x60;with_watch_providers&#x60; and &#x60;watch_region&#x60;.|
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param sortBy Choose from one of the many available sort options. (optional, default to popularity.desc)
     * @param airDateGte Filter and only include TV shows that have a air date (by looking at all episodes) that is greater or equal to the specified value. (optional)
     * @param airDateLte Filter and only include TV shows that have a air date (by looking at all episodes) that is less than or equal to the specified value. (optional)
     * @param firstAirDateGte Filter and only include TV shows that have a original air date that is greater or equal to the specified value. Can be used in conjunction with the \&quot;include_null_first_air_dates\&quot; filter if you want to include items with no air date. (optional)
     * @param firstAirDateLte Filter and only include TV shows that have a original air date that is less than or equal to the specified value. Can be used in conjunction with the \&quot;include_null_first_air_dates\&quot; filter if you want to include items with no air date. (optional)
     * @param firstAirDateYear Filter and only include TV shows that have a original air date year that equal to the specified value. Can be used in conjunction with the \&quot;include_null_first_air_dates\&quot; filter if you want to include items with no air date. (optional)
     * @param language Specify a language to query translatable fields with. (optional, default to en-US)
     * @param page Specify the page of results to query. (optional, default to 1)
     * @param timezone Used in conjunction with the air_date.gte/lte filter to calculate the proper UTC offset. (optional, default to America/New_York)
     * @param voteAverageGte Filter and only include movies that have a rating that is greater or equal to the specified value. (optional)
     * @param voteCountGte Filter and only include movies that have a rating that is less than or equal to the specified value. (optional)
     * @param withGenres Comma separated value of genre ids that you want to include in the results. (optional)
     * @param withNetworks Comma separated value of network ids that you want to include in the results. (optional)
     * @param withoutGenres Comma separated value of genre ids that you want to exclude from the results. (optional)
     * @param withRuntimeGte Filter and only include TV shows with an episode runtime that is greater than or equal to a value. (optional)
     * @param withRuntimeLte Filter and only include TV shows with an episode runtime that is less than or equal to a value. (optional)
     * @param includeNullFirstAirDates Use this filter to include TV shows that don&#39;t have an air date while using any of the \&quot;first_air_date\&quot; filters. (optional, default to false)
     * @param withOriginalLanguage Specify an ISO 639-1 string to filter results by their original language value. (optional)
     * @param withoutKeywords Exclude items with certain keywords. You can comma and pipe seperate these values to create an &#39;AND&#39; or &#39;OR&#39; logic. (optional)
     * @param screenedTheatrically Filter results to include items that have been screened theatrically. (optional)
     * @param withCompanies A comma separated list of production company ID&#39;s. Only include movies that have one of the ID&#39;s added as a production company. (optional)
     * @param withKeywords A comma separated list of keyword ID&#39;s. Only includes TV shows that have one of the ID&#39;s added as a keyword. (optional)
     * @param withWatchProviders A comma or pipe separated list of watch provider ID&#39;s. Combine this filter with &#x60;watch_region&#x60; in order to filter your results by a specific watch provider in a specific region. (optional)
     * @param watchRegion An ISO 3166-1 code. Combine this filter with &#x60;with_watch_providers&#x60; in order to filter your results by a specific watch provider in a specific region. (optional)
     * @param withWatchMonetizationTypes In combination with &#x60;watch_region&#x60;, you can filter by monetization type. (optional)
     * @param withStatus Filter TV shows by their status.  Returning Series: 0 Planned: 1 In Production: 2 Ended: 3 Cancelled: 4 Pilot: 5 (optional)
     * @param withType Filter TV shows by their type.  Documentary: 0 News: 1 Miniseries: 2 Reality: 3 Scripted: 4 Talk Show: 5 Video: 6 (optional)
     * @param withoutCompanies Filter the results to exclude the specific production companies you specify here. &#x60;AND&#x60; / &#x60;OR&#x60; filters are supported. (optional)
     * @return ResponseEntity&lt;GETDiscoverTv200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETDiscoverTv200Response> gETDiscoverTvWithHttpInfo(String sortBy, LocalDate airDateGte, LocalDate airDateLte, LocalDate firstAirDateGte, LocalDate firstAirDateLte, Integer firstAirDateYear, String language, Integer page, String timezone, BigDecimal voteAverageGte, Integer voteCountGte, String withGenres, String withNetworks, String withoutGenres, Integer withRuntimeGte, Integer withRuntimeLte, Boolean includeNullFirstAirDates, String withOriginalLanguage, String withoutKeywords, Boolean screenedTheatrically, String withCompanies, String withKeywords, String withWatchProviders, String watchRegion, String withWatchMonetizationTypes, String withStatus, String withType, String withoutCompanies) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort_by", sortBy));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "air_date.gte", airDateGte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "air_date.lte", airDateLte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "first_air_date.gte", firstAirDateGte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "first_air_date.lte", firstAirDateLte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "first_air_date_year", firstAirDateYear));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "timezone", timezone));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "vote_average.gte", voteAverageGte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "vote_count.gte", voteCountGte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_genres", withGenres));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_networks", withNetworks));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "without_genres", withoutGenres));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_runtime.gte", withRuntimeGte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_runtime.lte", withRuntimeLte));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_null_first_air_dates", includeNullFirstAirDates));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_original_language", withOriginalLanguage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "without_keywords", withoutKeywords));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "screened_theatrically", screenedTheatrically));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_companies", withCompanies));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_keywords", withKeywords));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_watch_providers", withWatchProviders));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "watch_region", watchRegion));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_watch_monetization_types", withWatchMonetizationTypes));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_status", withStatus));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_type", withType));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "without_companies", withoutCompanies));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETDiscoverTv200Response> localReturnType = new ParameterizedTypeReference<GETDiscoverTv200Response>() {};
        return apiClient.invokeAPI("/discover/tv", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Find by ID
     * The find method makes it easy to search for objects in our database by an external id.  This method will search all objects (movies, TV shows and people) and return the results in a single response.  The supported external sources for each object are as follows.  #### Media Databases  |              | Movies | TV Shows | TV Seasons | TV Episodes | People | | ------------ | ------ | -------- | ---------- | ----------- | ------ | | IMDb ID      | ✓      | ✓        | ✗          | ✓           | ✓      | | TVDB ID      | ✗      | ✓        | ✓          | ✓           | ✗      | | Freebase MID*| ✗      | ✓        | ✓          | ✓           | ✓      | | Freebase ID* | ✗      | ✓        | ✓          | ✓           | ✓      | | TVRage ID*   | ✗      | ✓        | ✓          | ✓           | ✓      |  #### Social IDs  |              | Movies | TV Shows | TV Seasons | TV Episodes | People | | ------------ | ------ | -------- | ---------- | ----------- | ------ | | Facebook     | ✓      | ✓        | ✗          | ✗           | ✓      | | Instagram    | ✓      | ✓        | ✗          | ✗           | ✓      | | Twitter      | ✓      | ✓        | ✗          | ✗           | ✓      |  *Defunct or no longer available as a service.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param externalId  (required)
     * @param externalSource  (required)
     * @return GETFindExternalId200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETFindExternalId200Response gETFindExternalId(String externalId, String externalSource) throws RestClientException {
        return gETFindExternalIdWithHttpInfo(externalId, externalSource).getBody();
    }

    /**
     * Find by ID
     * The find method makes it easy to search for objects in our database by an external id.  This method will search all objects (movies, TV shows and people) and return the results in a single response.  The supported external sources for each object are as follows.  #### Media Databases  |              | Movies | TV Shows | TV Seasons | TV Episodes | People | | ------------ | ------ | -------- | ---------- | ----------- | ------ | | IMDb ID      | ✓      | ✓        | ✗          | ✓           | ✓      | | TVDB ID      | ✗      | ✓        | ✓          | ✓           | ✗      | | Freebase MID*| ✗      | ✓        | ✓          | ✓           | ✓      | | Freebase ID* | ✗      | ✓        | ✓          | ✓           | ✓      | | TVRage ID*   | ✗      | ✓        | ✓          | ✓           | ✓      |  #### Social IDs  |              | Movies | TV Shows | TV Seasons | TV Episodes | People | | ------------ | ------ | -------- | ---------- | ----------- | ------ | | Facebook     | ✓      | ✓        | ✗          | ✗           | ✓      | | Instagram    | ✓      | ✓        | ✗          | ✗           | ✓      | | Twitter      | ✓      | ✓        | ✗          | ✗           | ✓      |  *Defunct or no longer available as a service.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param externalId  (required)
     * @param externalSource  (required)
     * @return ResponseEntity&lt;GETFindExternalId200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETFindExternalId200Response> gETFindExternalIdWithHttpInfo(String externalId, String externalSource) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalId' when calling gETFindExternalId");
        }
        
        // verify the required parameter 'externalSource' is set
        if (externalSource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalSource' when calling gETFindExternalId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("external_id", externalId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "external_source", externalSource));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETFindExternalId200Response> localReturnType = new ParameterizedTypeReference<GETFindExternalId200Response>() {};
        return apiClient.invokeAPI("/find/{external_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Movie List
     * Get the list of official genres for movies.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param language  (optional)
     * @return GETGenreTvList200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETGenreTvList200Response gETGenreMovieList(String language) throws RestClientException {
        return gETGenreMovieListWithHttpInfo(language).getBody();
    }

    /**
     * Get Movie List
     * Get the list of official genres for movies.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param language  (optional)
     * @return ResponseEntity&lt;GETGenreTvList200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETGenreTvList200Response> gETGenreMovieListWithHttpInfo(String language) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETGenreTvList200Response> localReturnType = new ParameterizedTypeReference<GETGenreTvList200Response>() {};
        return apiClient.invokeAPI("/genre/movie/list", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get TV List
     * Get the list of official genres for TV shows.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETGenreTvList200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETGenreTvList200Response gETGenreTvList() throws RestClientException {
        return gETGenreTvListWithHttpInfo().getBody();
    }

    /**
     * Get TV List
     * Get the list of official genres for TV shows.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETGenreTvList200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETGenreTvList200Response> gETGenreTvListWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETGenreTvList200Response> localReturnType = new ParameterizedTypeReference<GETGenreTvList200Response>() {};
        return apiClient.invokeAPI("/genre/tv/list", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Rated Movies
     * Get the rated movies for a guest session.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param guestSessionId  (required)
     * @return GETGuestSessionGuestSessionIdRatedMovies200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETGuestSessionGuestSessionIdRatedMovies200Response gETGuestSessionGuestSessionIdRatedMovies(String guestSessionId) throws RestClientException {
        return gETGuestSessionGuestSessionIdRatedMoviesWithHttpInfo(guestSessionId).getBody();
    }

    /**
     * Get Rated Movies
     * Get the rated movies for a guest session.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param guestSessionId  (required)
     * @return ResponseEntity&lt;GETGuestSessionGuestSessionIdRatedMovies200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETGuestSessionGuestSessionIdRatedMovies200Response> gETGuestSessionGuestSessionIdRatedMoviesWithHttpInfo(String guestSessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'guestSessionId' is set
        if (guestSessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'guestSessionId' when calling gETGuestSessionGuestSessionIdRatedMovies");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("guest_session_id", guestSessionId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETGuestSessionGuestSessionIdRatedMovies200Response> localReturnType = new ParameterizedTypeReference<GETGuestSessionGuestSessionIdRatedMovies200Response>() {};
        return apiClient.invokeAPI("/guest_session/{guest_session_id}/rated/movies", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Rated TV Shows
     * Get the rated TV shows for a guest session.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param guestSessionId  (required)
     * @return GETGuestSessionGuestSessionIdRatedTv200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETGuestSessionGuestSessionIdRatedTv200Response gETGuestSessionGuestSessionIdRatedTv(String guestSessionId) throws RestClientException {
        return gETGuestSessionGuestSessionIdRatedTvWithHttpInfo(guestSessionId).getBody();
    }

    /**
     * Get Rated TV Shows
     * Get the rated TV shows for a guest session.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param guestSessionId  (required)
     * @return ResponseEntity&lt;GETGuestSessionGuestSessionIdRatedTv200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETGuestSessionGuestSessionIdRatedTv200Response> gETGuestSessionGuestSessionIdRatedTvWithHttpInfo(String guestSessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'guestSessionId' is set
        if (guestSessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'guestSessionId' when calling gETGuestSessionGuestSessionIdRatedTv");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("guest_session_id", guestSessionId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETGuestSessionGuestSessionIdRatedTv200Response> localReturnType = new ParameterizedTypeReference<GETGuestSessionGuestSessionIdRatedTv200Response>() {};
        return apiClient.invokeAPI("/guest_session/{guest_session_id}/rated/tv", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Rated TV Episodes
     * Get the rated TV episodes for a guest session.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param guestSessionId  (required)
     * @return GETGuestSessionGuestSessionIdRatedTvEpisodes200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETGuestSessionGuestSessionIdRatedTvEpisodes200Response gETGuestSessionGuestSessionIdRatedTvEpisodes(String guestSessionId) throws RestClientException {
        return gETGuestSessionGuestSessionIdRatedTvEpisodesWithHttpInfo(guestSessionId).getBody();
    }

    /**
     * Get Rated TV Episodes
     * Get the rated TV episodes for a guest session.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param guestSessionId  (required)
     * @return ResponseEntity&lt;GETGuestSessionGuestSessionIdRatedTvEpisodes200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETGuestSessionGuestSessionIdRatedTvEpisodes200Response> gETGuestSessionGuestSessionIdRatedTvEpisodesWithHttpInfo(String guestSessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'guestSessionId' is set
        if (guestSessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'guestSessionId' when calling gETGuestSessionGuestSessionIdRatedTvEpisodes");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("guest_session_id", guestSessionId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETGuestSessionGuestSessionIdRatedTvEpisodes200Response> localReturnType = new ParameterizedTypeReference<GETGuestSessionGuestSessionIdRatedTvEpisodes200Response>() {};
        return apiClient.invokeAPI("/guest_session/{guest_session_id}/rated/tv/episodes", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Details
     * 
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param keywordId  (required)
     * @return GETSearchKeyword200ResponseResultsInner
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETSearchKeyword200ResponseResultsInner gETKeywordKeywordId(Integer keywordId) throws RestClientException {
        return gETKeywordKeywordIdWithHttpInfo(keywordId).getBody();
    }

    /**
     * Get Details
     * 
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param keywordId  (required)
     * @return ResponseEntity&lt;GETSearchKeyword200ResponseResultsInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETSearchKeyword200ResponseResultsInner> gETKeywordKeywordIdWithHttpInfo(Integer keywordId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'keywordId' is set
        if (keywordId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keywordId' when calling gETKeywordKeywordId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("keyword_id", keywordId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETSearchKeyword200ResponseResultsInner> localReturnType = new ParameterizedTypeReference<GETSearchKeyword200ResponseResultsInner>() {};
        return apiClient.invokeAPI("/keyword/{keyword_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Movies
     * Get the movies that belong to a keyword.  We **highly recommend** using [movie discover](#endpoint:p5NyoR7dM842S8G9j) instead of this method as it is much more flexible.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param keywordId  (required)
     * @return GETKeywordKeywordIdMovies200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETKeywordKeywordIdMovies200Response gETKeywordKeywordIdMovies(Integer keywordId) throws RestClientException {
        return gETKeywordKeywordIdMoviesWithHttpInfo(keywordId).getBody();
    }

    /**
     * Get Movies
     * Get the movies that belong to a keyword.  We **highly recommend** using [movie discover](#endpoint:p5NyoR7dM842S8G9j) instead of this method as it is much more flexible.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param keywordId  (required)
     * @return ResponseEntity&lt;GETKeywordKeywordIdMovies200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETKeywordKeywordIdMovies200Response> gETKeywordKeywordIdMoviesWithHttpInfo(Integer keywordId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'keywordId' is set
        if (keywordId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keywordId' when calling gETKeywordKeywordIdMovies");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("keyword_id", keywordId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETKeywordKeywordIdMovies200Response> localReturnType = new ParameterizedTypeReference<GETKeywordKeywordIdMovies200Response>() {};
        return apiClient.invokeAPI("/keyword/{keyword_id}/movies", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Details
     * Get the details of a list.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param listId  (required)
     * @return GETListListId200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETListListId200Response gETListListId(String listId) throws RestClientException {
        return gETListListIdWithHttpInfo(listId).getBody();
    }

    /**
     * Get Details
     * Get the details of a list.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param listId  (required)
     * @return ResponseEntity&lt;GETListListId200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETListListId200Response> gETListListIdWithHttpInfo(String listId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling gETListListId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETListListId200Response> localReturnType = new ParameterizedTypeReference<GETListListId200Response>() {};
        return apiClient.invokeAPI("/list/{list_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Check Item Status
     * You can use this method to check if a movie has already been added to the list.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param listId  (required)
     * @param movieId  (required)
     * @return GETListListIdItemStatus200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETListListIdItemStatus200Response gETListListIdItemStatus(String listId, Integer movieId) throws RestClientException {
        return gETListListIdItemStatusWithHttpInfo(listId, movieId).getBody();
    }

    /**
     * Check Item Status
     * You can use this method to check if a movie has already been added to the list.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param listId  (required)
     * @param movieId  (required)
     * @return ResponseEntity&lt;GETListListIdItemStatus200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETListListIdItemStatus200Response> gETListListIdItemStatusWithHttpInfo(String listId, Integer movieId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling gETListListIdItemStatus");
        }
        
        // verify the required parameter 'movieId' is set
        if (movieId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movieId' when calling gETListListIdItemStatus");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "movie_id", movieId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETListListIdItemStatus200Response> localReturnType = new ParameterizedTypeReference<GETListListIdItemStatus200Response>() {};
        return apiClient.invokeAPI("/list/{list_id}/item_status", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Movie Change List
     * Get  a list of all of the movie ids that have been changed in the past 24 hours.  You can query it for up to 14 days worth of changed IDs at a time with the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters. 100 items are returned per page.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETPersonChanges200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETPersonChanges200Response gETMovieChanges() throws RestClientException {
        return gETMovieChangesWithHttpInfo().getBody();
    }

    /**
     * Get Movie Change List
     * Get  a list of all of the movie ids that have been changed in the past 24 hours.  You can query it for up to 14 days worth of changed IDs at a time with the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters. 100 items are returned per page.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETPersonChanges200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETPersonChanges200Response> gETMovieChangesWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETPersonChanges200Response> localReturnType = new ParameterizedTypeReference<GETPersonChanges200Response>() {};
        return apiClient.invokeAPI("/movie/changes", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Latest
     * Get the most newly created movie. This is a live response and will continuously change.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETMovieLatest200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieLatest200Response gETMovieLatest() throws RestClientException {
        return gETMovieLatestWithHttpInfo().getBody();
    }

    /**
     * Get Latest
     * Get the most newly created movie. This is a live response and will continuously change.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETMovieLatest200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieLatest200Response> gETMovieLatestWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieLatest200Response> localReturnType = new ParameterizedTypeReference<GETMovieLatest200Response>() {};
        return apiClient.invokeAPI("/movie/latest", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Details
     * Get the primary information about a movie.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).  #### Recent Changes  | **Date** | **Change** | | - | - | | November 20, 2020 | A &#x60;watch/providers&#x60; method has been added to show what providers (eg. streaming) are available and where.|
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @return GETMovieMovieId200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieId200Response gETMovieMovieId(Integer movieId) throws RestClientException {
        return gETMovieMovieIdWithHttpInfo(movieId).getBody();
    }

    /**
     * Get Details
     * Get the primary information about a movie.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).  #### Recent Changes  | **Date** | **Change** | | - | - | | November 20, 2020 | A &#x60;watch/providers&#x60; method has been added to show what providers (eg. streaming) are available and where.|
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @return ResponseEntity&lt;GETMovieMovieId200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieId200Response> gETMovieMovieIdWithHttpInfo(Integer movieId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'movieId' is set
        if (movieId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movieId' when calling gETMovieMovieId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("movie_id", movieId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieId200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieId200Response>() {};
        return apiClient.invokeAPI("/movie/{movie_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Account States
     * Grab the following account states for a session:  - Movie rating - If it belongs to your watchlist - If it belongs to your favourite list
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param sessionId  (optional)
     * @param guestSessionId  (optional)
     * @return GETMovieMovieIdAccountStates200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdAccountStates200Response gETMovieMovieIdAccountStates(Integer movieId, String sessionId, String guestSessionId) throws RestClientException {
        return gETMovieMovieIdAccountStatesWithHttpInfo(movieId, sessionId, guestSessionId).getBody();
    }

    /**
     * Get Account States
     * Grab the following account states for a session:  - Movie rating - If it belongs to your watchlist - If it belongs to your favourite list
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param sessionId  (optional)
     * @param guestSessionId  (optional)
     * @return ResponseEntity&lt;GETMovieMovieIdAccountStates200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdAccountStates200Response> gETMovieMovieIdAccountStatesWithHttpInfo(Integer movieId, String sessionId, String guestSessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'movieId' is set
        if (movieId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movieId' when calling gETMovieMovieIdAccountStates");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("movie_id", movieId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "guest_session_id", guestSessionId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdAccountStates200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdAccountStates200Response>() {};
        return apiClient.invokeAPI("/movie/{movie_id}/account_states", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Alternative Titles
     * Get all of the alternative titles for a movie.  #### Recent Changes  | **Date** | **Change** | | - | - | | March 16, 2018 | Added the &#x60;type&#x60; field. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param country  (optional)
     * @return GETMovieMovieIdAlternativeTitles200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdAlternativeTitles200Response gETMovieMovieIdAlternativeTitles(Integer movieId, String country) throws RestClientException {
        return gETMovieMovieIdAlternativeTitlesWithHttpInfo(movieId, country).getBody();
    }

    /**
     * Get Alternative Titles
     * Get all of the alternative titles for a movie.  #### Recent Changes  | **Date** | **Change** | | - | - | | March 16, 2018 | Added the &#x60;type&#x60; field. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param country  (optional)
     * @return ResponseEntity&lt;GETMovieMovieIdAlternativeTitles200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdAlternativeTitles200Response> gETMovieMovieIdAlternativeTitlesWithHttpInfo(Integer movieId, String country) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'movieId' is set
        if (movieId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movieId' when calling gETMovieMovieIdAlternativeTitles");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("movie_id", movieId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "country", country));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdAlternativeTitles200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdAlternativeTitles200Response>() {};
        return apiClient.invokeAPI("/movie/{movie_id}/alternative_titles", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Changes
     * Get the changes for a movie. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @return GETMovieMovieIdChanges200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdChanges200Response gETMovieMovieIdChanges(Integer movieId) throws RestClientException {
        return gETMovieMovieIdChangesWithHttpInfo(movieId).getBody();
    }

    /**
     * Get Changes
     * Get the changes for a movie. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @return ResponseEntity&lt;GETMovieMovieIdChanges200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdChanges200Response> gETMovieMovieIdChangesWithHttpInfo(Integer movieId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'movieId' is set
        if (movieId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movieId' when calling gETMovieMovieIdChanges");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("movie_id", movieId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdChanges200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdChanges200Response>() {};
        return apiClient.invokeAPI("/movie/{movie_id}/changes", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Credits
     * Get the cast and crew for a movie.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @return GETMovieMovieIdCredits200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdCredits200Response gETMovieMovieIdCredits(Integer movieId) throws RestClientException {
        return gETMovieMovieIdCreditsWithHttpInfo(movieId).getBody();
    }

    /**
     * Get Credits
     * Get the cast and crew for a movie.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @return ResponseEntity&lt;GETMovieMovieIdCredits200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdCredits200Response> gETMovieMovieIdCreditsWithHttpInfo(Integer movieId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'movieId' is set
        if (movieId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movieId' when calling gETMovieMovieIdCredits");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("movie_id", movieId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdCredits200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdCredits200Response>() {};
        return apiClient.invokeAPI("/movie/{movie_id}/credits", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get External IDs
     * Get the external ids for a movie. We currently support the following external sources.  | **Media Databases** | **Social IDs** | | ------------------- | -------------- | | IMDb ID             | Facebook       | |                     | Instagram      | |                     | Twitter        |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return GETMovieMovieIdExternalIds200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdExternalIds200Response gETMovieMovieIdExternalIds(Integer movieId, String apiKey) throws RestClientException {
        return gETMovieMovieIdExternalIdsWithHttpInfo(movieId, apiKey).getBody();
    }

    /**
     * Get External IDs
     * Get the external ids for a movie. We currently support the following external sources.  | **Media Databases** | **Social IDs** | | ------------------- | -------------- | | IMDb ID             | Facebook       | |                     | Instagram      | |                     | Twitter        |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;GETMovieMovieIdExternalIds200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdExternalIds200Response> gETMovieMovieIdExternalIdsWithHttpInfo(Integer movieId, String apiKey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'movieId' is set
        if (movieId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movieId' when calling gETMovieMovieIdExternalIds");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("movie_id", movieId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "api_key", apiKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdExternalIds200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdExternalIds200Response>() {};
        return apiClient.invokeAPI("/movie/{movie_id}/external_ids", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Images
     * Get the images that belong to a movie.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param includeImageLanguage  (optional)
     * @return GETMovieMovieIdImages200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdImages200Response gETMovieMovieIdImages(Integer movieId, String includeImageLanguage) throws RestClientException {
        return gETMovieMovieIdImagesWithHttpInfo(movieId, includeImageLanguage).getBody();
    }

    /**
     * Get Images
     * Get the images that belong to a movie.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param includeImageLanguage  (optional)
     * @return ResponseEntity&lt;GETMovieMovieIdImages200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdImages200Response> gETMovieMovieIdImagesWithHttpInfo(Integer movieId, String includeImageLanguage) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'movieId' is set
        if (movieId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movieId' when calling gETMovieMovieIdImages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("movie_id", movieId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_image_language", includeImageLanguage));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdImages200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdImages200Response>() {};
        return apiClient.invokeAPI("/movie/{movie_id}/images", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Keywords
     * Get the keywords that have been added to a movie.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return GETMovieMovieIdKeywords200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdKeywords200Response gETMovieMovieIdKeywords(Integer movieId, String apiKey) throws RestClientException {
        return gETMovieMovieIdKeywordsWithHttpInfo(movieId, apiKey).getBody();
    }

    /**
     * Get Keywords
     * Get the keywords that have been added to a movie.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;GETMovieMovieIdKeywords200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdKeywords200Response> gETMovieMovieIdKeywordsWithHttpInfo(Integer movieId, String apiKey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'movieId' is set
        if (movieId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movieId' when calling gETMovieMovieIdKeywords");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("movie_id", movieId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "api_key", apiKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdKeywords200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdKeywords200Response>() {};
        return apiClient.invokeAPI("/movie/{movie_id}/keywords", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Lists
     * Get a list of lists that this movie belongs to.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return GETMovieMovieIdLists200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdLists200Response gETMovieMovieIdLists(Integer movieId, String apiKey) throws RestClientException {
        return gETMovieMovieIdListsWithHttpInfo(movieId, apiKey).getBody();
    }

    /**
     * Get Lists
     * Get a list of lists that this movie belongs to.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;GETMovieMovieIdLists200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdLists200Response> gETMovieMovieIdListsWithHttpInfo(Integer movieId, String apiKey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'movieId' is set
        if (movieId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movieId' when calling gETMovieMovieIdLists");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("movie_id", movieId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "api_key", apiKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdLists200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdLists200Response>() {};
        return apiClient.invokeAPI("/movie/{movie_id}/lists", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Recommendations
     * Get a list of recommended movies for a movie.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return GETMovieMovieIdRecommendations200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdRecommendations200Response gETMovieMovieIdRecommendations(Integer movieId, String apiKey) throws RestClientException {
        return gETMovieMovieIdRecommendationsWithHttpInfo(movieId, apiKey).getBody();
    }

    /**
     * Get Recommendations
     * Get a list of recommended movies for a movie.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;GETMovieMovieIdRecommendations200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdRecommendations200Response> gETMovieMovieIdRecommendationsWithHttpInfo(Integer movieId, String apiKey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'movieId' is set
        if (movieId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movieId' when calling gETMovieMovieIdRecommendations");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("movie_id", movieId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "api_key", apiKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdRecommendations200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdRecommendations200Response>() {};
        return apiClient.invokeAPI("/movie/{movie_id}/recommendations", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Release Dates
     * Get the release date along with the certification for a movie.  Release dates support different types:  1. Premiere 2. Theatrical (limited) 3. Theatrical 4. Digital 5. Physical 6. TV
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return GETMovieMovieIdReleaseDates200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdReleaseDates200Response gETMovieMovieIdReleaseDates(Integer movieId, String apiKey) throws RestClientException {
        return gETMovieMovieIdReleaseDatesWithHttpInfo(movieId, apiKey).getBody();
    }

    /**
     * Get Release Dates
     * Get the release date along with the certification for a movie.  Release dates support different types:  1. Premiere 2. Theatrical (limited) 3. Theatrical 4. Digital 5. Physical 6. TV
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;GETMovieMovieIdReleaseDates200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdReleaseDates200Response> gETMovieMovieIdReleaseDatesWithHttpInfo(Integer movieId, String apiKey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'movieId' is set
        if (movieId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movieId' when calling gETMovieMovieIdReleaseDates");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("movie_id", movieId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "api_key", apiKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdReleaseDates200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdReleaseDates200Response>() {};
        return apiClient.invokeAPI("/movie/{movie_id}/release_dates", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Reviews
     * Get the user reviews for a movie.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return GETMovieMovieIdReviews200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdReviews200Response gETMovieMovieIdReviews(Integer movieId, String apiKey) throws RestClientException {
        return gETMovieMovieIdReviewsWithHttpInfo(movieId, apiKey).getBody();
    }

    /**
     * Get Reviews
     * Get the user reviews for a movie.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;GETMovieMovieIdReviews200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdReviews200Response> gETMovieMovieIdReviewsWithHttpInfo(Integer movieId, String apiKey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'movieId' is set
        if (movieId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movieId' when calling gETMovieMovieIdReviews");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("movie_id", movieId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "api_key", apiKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdReviews200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdReviews200Response>() {};
        return apiClient.invokeAPI("/movie/{movie_id}/reviews", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Similar Movies
     * Get a list of similar movies. This is **not** the same as the \&quot;Recommendation\&quot; system you see on the website.  These items are assembled by looking at keywords and genres.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return GETMovieMovieIdRecommendations200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdRecommendations200Response gETMovieMovieIdSimilar(Integer movieId, String apiKey) throws RestClientException {
        return gETMovieMovieIdSimilarWithHttpInfo(movieId, apiKey).getBody();
    }

    /**
     * Get Similar Movies
     * Get a list of similar movies. This is **not** the same as the \&quot;Recommendation\&quot; system you see on the website.  These items are assembled by looking at keywords and genres.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;GETMovieMovieIdRecommendations200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdRecommendations200Response> gETMovieMovieIdSimilarWithHttpInfo(Integer movieId, String apiKey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'movieId' is set
        if (movieId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movieId' when calling gETMovieMovieIdSimilar");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("movie_id", movieId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "api_key", apiKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdRecommendations200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdRecommendations200Response>() {};
        return apiClient.invokeAPI("/movie/{movie_id}/similar", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Translations
     * Get a list of translations that have been created for a movie.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return GETMovieMovieIdTranslations200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdTranslations200Response gETMovieMovieIdTranslations(Integer movieId, String apiKey) throws RestClientException {
        return gETMovieMovieIdTranslationsWithHttpInfo(movieId, apiKey).getBody();
    }

    /**
     * Get Translations
     * Get a list of translations that have been created for a movie.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;GETMovieMovieIdTranslations200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdTranslations200Response> gETMovieMovieIdTranslationsWithHttpInfo(Integer movieId, String apiKey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'movieId' is set
        if (movieId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movieId' when calling gETMovieMovieIdTranslations");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("movie_id", movieId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "api_key", apiKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdTranslations200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdTranslations200Response>() {};
        return apiClient.invokeAPI("/movie/{movie_id}/translations", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Videos
     * Get the videos that have been added to a movie.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 28, 2021 | A new &#x60;include_video_language&#x60; filter is now available. You can use this filter the same way you use &#x60;include_image_language&#x60; on image calls. We also added two new fields, &#x60;official&#x60; and &#x60;published_at&#x60; to the video response. | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot; and \&quot;Bloopers\&quot; were added as valid video types. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return GETMovieMovieIdVideos200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdVideos200Response gETMovieMovieIdVideos(Integer movieId, String apiKey) throws RestClientException {
        return gETMovieMovieIdVideosWithHttpInfo(movieId, apiKey).getBody();
    }

    /**
     * Get Videos
     * Get the videos that have been added to a movie.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 28, 2021 | A new &#x60;include_video_language&#x60; filter is now available. You can use this filter the same way you use &#x60;include_image_language&#x60; on image calls. We also added two new fields, &#x60;official&#x60; and &#x60;published_at&#x60; to the video response. | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot; and \&quot;Bloopers\&quot; were added as valid video types. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;GETMovieMovieIdVideos200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdVideos200Response> gETMovieMovieIdVideosWithHttpInfo(Integer movieId, String apiKey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'movieId' is set
        if (movieId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movieId' when calling gETMovieMovieIdVideos");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("movie_id", movieId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "api_key", apiKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdVideos200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdVideos200Response>() {};
        return apiClient.invokeAPI("/movie/{movie_id}/videos", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Watch Providers
     * Powered by our partnership with JustWatch, you can query this method to get a list of the availabilities per country by provider.  This is **not** going to return full deep links, but rather, it&#39;s just enough information to display what&#39;s available where.  You can link to the provided TMDB URL to help support TMDB and provide the actual deep links to the content.  **Please note**: In order to use this data **you must** attribute the source of the data as JustWatch. If we find any usage not complying with these terms we will revoke access to the API.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return GETMovieMovieIdWatchProviders200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdWatchProviders200Response gETMovieMovieIdWatchProviders(Integer movieId, String apiKey) throws RestClientException {
        return gETMovieMovieIdWatchProvidersWithHttpInfo(movieId, apiKey).getBody();
    }

    /**
     * Get Watch Providers
     * Powered by our partnership with JustWatch, you can query this method to get a list of the availabilities per country by provider.  This is **not** going to return full deep links, but rather, it&#39;s just enough information to display what&#39;s available where.  You can link to the provided TMDB URL to help support TMDB and provide the actual deep links to the content.  **Please note**: In order to use this data **you must** attribute the source of the data as JustWatch. If we find any usage not complying with these terms we will revoke access to the API.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;GETMovieMovieIdWatchProviders200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdWatchProviders200Response> gETMovieMovieIdWatchProvidersWithHttpInfo(Integer movieId, String apiKey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'movieId' is set
        if (movieId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movieId' when calling gETMovieMovieIdWatchProviders");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("movie_id", movieId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "api_key", apiKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdWatchProviders200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdWatchProviders200Response>() {};
        return apiClient.invokeAPI("/movie/{movie_id}/watch/providers", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Now Playing
     * Get a list of movies in theatres. This is a release type query that looks for all movies that have a release type of 2 or 3 within the specified date range.  You can optionally specify a &#x60;region&#x60; prameter which will narrow the search to only look for theatrical release dates within the specified country.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETMovieNowPlaying200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieNowPlaying200Response gETMovieNowPlaying() throws RestClientException {
        return gETMovieNowPlayingWithHttpInfo().getBody();
    }

    /**
     * Get Now Playing
     * Get a list of movies in theatres. This is a release type query that looks for all movies that have a release type of 2 or 3 within the specified date range.  You can optionally specify a &#x60;region&#x60; prameter which will narrow the search to only look for theatrical release dates within the specified country.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETMovieNowPlaying200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieNowPlaying200Response> gETMovieNowPlayingWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieNowPlaying200Response> localReturnType = new ParameterizedTypeReference<GETMovieNowPlaying200Response>() {};
        return apiClient.invokeAPI("/movie/now_playing", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Popular
     * Get a list of the current popular movies on TMDB. This list updates daily.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETMoviePopular200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMoviePopular200Response gETMoviePopular() throws RestClientException {
        return gETMoviePopularWithHttpInfo().getBody();
    }

    /**
     * Get Popular
     * Get a list of the current popular movies on TMDB. This list updates daily.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETMoviePopular200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMoviePopular200Response> gETMoviePopularWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMoviePopular200Response> localReturnType = new ParameterizedTypeReference<GETMoviePopular200Response>() {};
        return apiClient.invokeAPI("/movie/popular", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Top Rated
     * Get the top rated movies on TMDB.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETMoviePopular200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMoviePopular200Response gETMovieTopRated() throws RestClientException {
        return gETMovieTopRatedWithHttpInfo().getBody();
    }

    /**
     * Get Top Rated
     * Get the top rated movies on TMDB.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETMoviePopular200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMoviePopular200Response> gETMovieTopRatedWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMoviePopular200Response> localReturnType = new ParameterizedTypeReference<GETMoviePopular200Response>() {};
        return apiClient.invokeAPI("/movie/top_rated", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Upcoming
     * Get a list of upcoming movies in theatres. This is a release type query that looks for all movies that have a release type of 2 or 3 within the specified date range.  You can optionally specify a &#x60;region&#x60; prameter which will narrow the search to only look for theatrical release dates within the specified country.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETMovieUpcoming200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieUpcoming200Response gETMovieUpcoming() throws RestClientException {
        return gETMovieUpcomingWithHttpInfo().getBody();
    }

    /**
     * Get Upcoming
     * Get a list of upcoming movies in theatres. This is a release type query that looks for all movies that have a release type of 2 or 3 within the specified date range.  You can optionally specify a &#x60;region&#x60; prameter which will narrow the search to only look for theatrical release dates within the specified country.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETMovieUpcoming200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieUpcoming200Response> gETMovieUpcomingWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieUpcoming200Response> localReturnType = new ParameterizedTypeReference<GETMovieUpcoming200Response>() {};
        return apiClient.invokeAPI("/movie/upcoming", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Details
     * Get the details of a network.  #### Recent Changes  | **Date** | **Change** | | - | - | | November 14, 2020 | The &#x60;logo_path&#x60; has been added to the default response. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param networkId  (required)
     * @return GETNetworkNetworkId200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETNetworkNetworkId200Response gETNetworkNetworkId(Integer networkId) throws RestClientException {
        return gETNetworkNetworkIdWithHttpInfo(networkId).getBody();
    }

    /**
     * Get Details
     * Get the details of a network.  #### Recent Changes  | **Date** | **Change** | | - | - | | November 14, 2020 | The &#x60;logo_path&#x60; has been added to the default response. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param networkId  (required)
     * @return ResponseEntity&lt;GETNetworkNetworkId200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETNetworkNetworkId200Response> gETNetworkNetworkIdWithHttpInfo(Integer networkId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'networkId' is set
        if (networkId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'networkId' when calling gETNetworkNetworkId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("network_id", networkId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETNetworkNetworkId200Response> localReturnType = new ParameterizedTypeReference<GETNetworkNetworkId200Response>() {};
        return apiClient.invokeAPI("/network/{network_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Alternative Names
     * Get the alternative names of a network.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param networkId  (required)
     * @return GETCompanyCompanyIdAlternativeNames200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETCompanyCompanyIdAlternativeNames200Response gETNetworkNetworkIdAlternativeNames(Integer networkId) throws RestClientException {
        return gETNetworkNetworkIdAlternativeNamesWithHttpInfo(networkId).getBody();
    }

    /**
     * Get Alternative Names
     * Get the alternative names of a network.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param networkId  (required)
     * @return ResponseEntity&lt;GETCompanyCompanyIdAlternativeNames200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETCompanyCompanyIdAlternativeNames200Response> gETNetworkNetworkIdAlternativeNamesWithHttpInfo(Integer networkId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'networkId' is set
        if (networkId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'networkId' when calling gETNetworkNetworkIdAlternativeNames");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("network_id", networkId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETCompanyCompanyIdAlternativeNames200Response> localReturnType = new ParameterizedTypeReference<GETCompanyCompanyIdAlternativeNames200Response>() {};
        return apiClient.invokeAPI("/network/{network_id}/alternative_names", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Images
     * Get the TV network logos by id.  There are two image formats that are supported for networks, PNG&#39;s and SVG&#39;s. You can see which type the original file is by looking at the &#x60;file_type&#x60; field. We prefer SVG&#39;s as they are resolution independent and as such, the width and height are only there to reflect the original asset that was uploaded. An SVG can be scaled properly beyond those dimensions if you call them as a PNG.  For more information about how SVG&#39;s and PNG&#39;s can be used, take a read through [this document](#docTextSection:mXP9B2uzoDJFguDZv).
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param networkId  (required)
     * @return GETCompanyCompanyIdImages200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETCompanyCompanyIdImages200Response gETNetworkNetworkIdImages(Integer networkId) throws RestClientException {
        return gETNetworkNetworkIdImagesWithHttpInfo(networkId).getBody();
    }

    /**
     * Get Images
     * Get the TV network logos by id.  There are two image formats that are supported for networks, PNG&#39;s and SVG&#39;s. You can see which type the original file is by looking at the &#x60;file_type&#x60; field. We prefer SVG&#39;s as they are resolution independent and as such, the width and height are only there to reflect the original asset that was uploaded. An SVG can be scaled properly beyond those dimensions if you call them as a PNG.  For more information about how SVG&#39;s and PNG&#39;s can be used, take a read through [this document](#docTextSection:mXP9B2uzoDJFguDZv).
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param networkId  (required)
     * @return ResponseEntity&lt;GETCompanyCompanyIdImages200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETCompanyCompanyIdImages200Response> gETNetworkNetworkIdImagesWithHttpInfo(Integer networkId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'networkId' is set
        if (networkId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'networkId' when calling gETNetworkNetworkIdImages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("network_id", networkId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETCompanyCompanyIdImages200Response> localReturnType = new ParameterizedTypeReference<GETCompanyCompanyIdImages200Response>() {};
        return apiClient.invokeAPI("/network/{network_id}/images", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Person Change List
     * Get a list of all of the person ids that have been changed in the past 24 hours.  You can query it for up to 14 days worth of changed IDs at a time with the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters. 100 items are returned per page.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETPersonChanges200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETPersonChanges200Response gETPersonChanges() throws RestClientException {
        return gETPersonChangesWithHttpInfo().getBody();
    }

    /**
     * Get Person Change List
     * Get a list of all of the person ids that have been changed in the past 24 hours.  You can query it for up to 14 days worth of changed IDs at a time with the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters. 100 items are returned per page.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETPersonChanges200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETPersonChanges200Response> gETPersonChangesWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETPersonChanges200Response> localReturnType = new ParameterizedTypeReference<GETPersonChanges200Response>() {};
        return apiClient.invokeAPI("/person/changes", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Latest
     * Get the most newly created person. This is a live response and will continuously change.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETPersonLatest200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETPersonLatest200Response gETPersonLatest() throws RestClientException {
        return gETPersonLatestWithHttpInfo().getBody();
    }

    /**
     * Get Latest
     * Get the most newly created person. This is a live response and will continuously change.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETPersonLatest200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETPersonLatest200Response> gETPersonLatestWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETPersonLatest200Response> localReturnType = new ParameterizedTypeReference<GETPersonLatest200Response>() {};
        return apiClient.invokeAPI("/person/latest", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Details
     * Get the primary person details by id.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).  #### Recent Changes  | **Date** | **Change** | | - | - | | July 17, 2018 | Added the &#x60;known_for_department&#x60; field. | | April 26, 2018 | Added the [translations](#endpoint:CSaMjCxXAtGpxNGfS) method. | | November 9, 2016 | Biographies are now translatable on TMDB. This means you can query person details with a language parameter. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param personId  (required)
     * @return GETPersonPersonId200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETPersonPersonId200Response gETPersonPersonId(Integer personId) throws RestClientException {
        return gETPersonPersonIdWithHttpInfo(personId).getBody();
    }

    /**
     * Get Details
     * Get the primary person details by id.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).  #### Recent Changes  | **Date** | **Change** | | - | - | | July 17, 2018 | Added the &#x60;known_for_department&#x60; field. | | April 26, 2018 | Added the [translations](#endpoint:CSaMjCxXAtGpxNGfS) method. | | November 9, 2016 | Biographies are now translatable on TMDB. This means you can query person details with a language parameter. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param personId  (required)
     * @return ResponseEntity&lt;GETPersonPersonId200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETPersonPersonId200Response> gETPersonPersonIdWithHttpInfo(Integer personId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling gETPersonPersonId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("person_id", personId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETPersonPersonId200Response> localReturnType = new ParameterizedTypeReference<GETPersonPersonId200Response>() {};
        return apiClient.invokeAPI("/person/{person_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Changes
     * Get the changes for a person. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param personId  (required)
     * @return GETPersonPersonIdChanges200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETPersonPersonIdChanges200Response gETPersonPersonIdChanges(Integer personId) throws RestClientException {
        return gETPersonPersonIdChangesWithHttpInfo(personId).getBody();
    }

    /**
     * Get Changes
     * Get the changes for a person. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param personId  (required)
     * @return ResponseEntity&lt;GETPersonPersonIdChanges200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETPersonPersonIdChanges200Response> gETPersonPersonIdChangesWithHttpInfo(Integer personId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling gETPersonPersonIdChanges");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("person_id", personId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETPersonPersonIdChanges200Response> localReturnType = new ParameterizedTypeReference<GETPersonPersonIdChanges200Response>() {};
        return apiClient.invokeAPI("/person/{person_id}/changes", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Combined Credits
     * Get the movie and TV credits together in a single response.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param personId  (required)
     * @return GETPersonPersonIdCombinedCredits200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETPersonPersonIdCombinedCredits200Response gETPersonPersonIdCombinedCredits(Integer personId) throws RestClientException {
        return gETPersonPersonIdCombinedCreditsWithHttpInfo(personId).getBody();
    }

    /**
     * Get Combined Credits
     * Get the movie and TV credits together in a single response.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param personId  (required)
     * @return ResponseEntity&lt;GETPersonPersonIdCombinedCredits200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETPersonPersonIdCombinedCredits200Response> gETPersonPersonIdCombinedCreditsWithHttpInfo(Integer personId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling gETPersonPersonIdCombinedCredits");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("person_id", personId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETPersonPersonIdCombinedCredits200Response> localReturnType = new ParameterizedTypeReference<GETPersonPersonIdCombinedCredits200Response>() {};
        return apiClient.invokeAPI("/person/{person_id}/combined_credits", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get External IDs
     * Get the external ids for a person. We currently support the following external sources.  | **External Sources** | | ------------     | | IMDB ID          | | Facebook         | | Freebase MID     | | Freebase ID      | | Instagram        | | TVRage ID        | | Twitter          |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param personId  (required)
     * @return GETPersonPersonIdExternalIds200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETPersonPersonIdExternalIds200Response gETPersonPersonIdExternalIds(Integer personId) throws RestClientException {
        return gETPersonPersonIdExternalIdsWithHttpInfo(personId).getBody();
    }

    /**
     * Get External IDs
     * Get the external ids for a person. We currently support the following external sources.  | **External Sources** | | ------------     | | IMDB ID          | | Facebook         | | Freebase MID     | | Freebase ID      | | Instagram        | | TVRage ID        | | Twitter          |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param personId  (required)
     * @return ResponseEntity&lt;GETPersonPersonIdExternalIds200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETPersonPersonIdExternalIds200Response> gETPersonPersonIdExternalIdsWithHttpInfo(Integer personId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling gETPersonPersonIdExternalIds");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("person_id", personId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETPersonPersonIdExternalIds200Response> localReturnType = new ParameterizedTypeReference<GETPersonPersonIdExternalIds200Response>() {};
        return apiClient.invokeAPI("/person/{person_id}/external_ids", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Images
     * Get the images for a person.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param personId  (required)
     * @return GETPersonPersonIdImages200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETPersonPersonIdImages200Response gETPersonPersonIdImages(Integer personId) throws RestClientException {
        return gETPersonPersonIdImagesWithHttpInfo(personId).getBody();
    }

    /**
     * Get Images
     * Get the images for a person.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param personId  (required)
     * @return ResponseEntity&lt;GETPersonPersonIdImages200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETPersonPersonIdImages200Response> gETPersonPersonIdImagesWithHttpInfo(Integer personId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling gETPersonPersonIdImages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("person_id", personId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETPersonPersonIdImages200Response> localReturnType = new ParameterizedTypeReference<GETPersonPersonIdImages200Response>() {};
        return apiClient.invokeAPI("/person/{person_id}/images", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Movie Credits
     * Get the movie credits for a person.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param personId  (required)
     * @return GETPersonPersonIdMovieCredits200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETPersonPersonIdMovieCredits200Response gETPersonPersonIdMovieCredits(Integer personId) throws RestClientException {
        return gETPersonPersonIdMovieCreditsWithHttpInfo(personId).getBody();
    }

    /**
     * Get Movie Credits
     * Get the movie credits for a person.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param personId  (required)
     * @return ResponseEntity&lt;GETPersonPersonIdMovieCredits200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETPersonPersonIdMovieCredits200Response> gETPersonPersonIdMovieCreditsWithHttpInfo(Integer personId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling gETPersonPersonIdMovieCredits");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("person_id", personId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETPersonPersonIdMovieCredits200Response> localReturnType = new ParameterizedTypeReference<GETPersonPersonIdMovieCredits200Response>() {};
        return apiClient.invokeAPI("/person/{person_id}/movie_credits", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Tagged Images
     * Get the images that this person has been tagged in.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param personId  (required)
     * @return GETPersonPersonIdTaggedImages200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETPersonPersonIdTaggedImages200Response gETPersonPersonIdTaggedImages(Integer personId) throws RestClientException {
        return gETPersonPersonIdTaggedImagesWithHttpInfo(personId).getBody();
    }

    /**
     * Get Tagged Images
     * Get the images that this person has been tagged in.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param personId  (required)
     * @return ResponseEntity&lt;GETPersonPersonIdTaggedImages200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETPersonPersonIdTaggedImages200Response> gETPersonPersonIdTaggedImagesWithHttpInfo(Integer personId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling gETPersonPersonIdTaggedImages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("person_id", personId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETPersonPersonIdTaggedImages200Response> localReturnType = new ParameterizedTypeReference<GETPersonPersonIdTaggedImages200Response>() {};
        return apiClient.invokeAPI("/person/{person_id}/tagged_images", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Translations
     * Get a list of translations that have been created for a person.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param personId  (required)
     * @return GETPersonPersonIdTranslations200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETPersonPersonIdTranslations200Response gETPersonPersonIdTranslations(Integer personId) throws RestClientException {
        return gETPersonPersonIdTranslationsWithHttpInfo(personId).getBody();
    }

    /**
     * Get Translations
     * Get a list of translations that have been created for a person.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param personId  (required)
     * @return ResponseEntity&lt;GETPersonPersonIdTranslations200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETPersonPersonIdTranslations200Response> gETPersonPersonIdTranslationsWithHttpInfo(Integer personId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling gETPersonPersonIdTranslations");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("person_id", personId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETPersonPersonIdTranslations200Response> localReturnType = new ParameterizedTypeReference<GETPersonPersonIdTranslations200Response>() {};
        return apiClient.invokeAPI("/person/{person_id}/translations", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get TV Credits
     * Get the TV show credits for a person.  You can query for some extra details about the credit with the [credit method](#endpoint:xPWdEBLkvCNZSicLN).
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param personId  (required)
     * @return GETPersonPersonIdTvCredits200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETPersonPersonIdTvCredits200Response gETPersonPersonIdTvCredits(Integer personId) throws RestClientException {
        return gETPersonPersonIdTvCreditsWithHttpInfo(personId).getBody();
    }

    /**
     * Get TV Credits
     * Get the TV show credits for a person.  You can query for some extra details about the credit with the [credit method](#endpoint:xPWdEBLkvCNZSicLN).
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param personId  (required)
     * @return ResponseEntity&lt;GETPersonPersonIdTvCredits200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETPersonPersonIdTvCredits200Response> gETPersonPersonIdTvCreditsWithHttpInfo(Integer personId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling gETPersonPersonIdTvCredits");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("person_id", personId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETPersonPersonIdTvCredits200Response> localReturnType = new ParameterizedTypeReference<GETPersonPersonIdTvCredits200Response>() {};
        return apiClient.invokeAPI("/person/{person_id}/tv_credits", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Popular
     * Get the list of popular people on TMDB. This list updates daily.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETPersonPopular200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETPersonPopular200Response gETPersonPopular() throws RestClientException {
        return gETPersonPopularWithHttpInfo().getBody();
    }

    /**
     * Get Popular
     * Get the list of popular people on TMDB. This list updates daily.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETPersonPopular200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETPersonPopular200Response> gETPersonPopularWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETPersonPopular200Response> localReturnType = new ParameterizedTypeReference<GETPersonPopular200Response>() {};
        return apiClient.invokeAPI("/person/popular", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Details
     * Retrieve the details of a movie or TV show review.  #### Recent Changes  | **Date** | **Change** | | - | - | | November 14, 2020 | A &#x60;author_details&#x60; field has been added to the default response, which includes an &#x60;avatar_path&#x60; and &#x60;rating&#x60; value. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param reviewId  (required)
     * @return GETReviewReviewId200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETReviewReviewId200Response gETReviewReviewId(String reviewId) throws RestClientException {
        return gETReviewReviewIdWithHttpInfo(reviewId).getBody();
    }

    /**
     * Get Details
     * Retrieve the details of a movie or TV show review.  #### Recent Changes  | **Date** | **Change** | | - | - | | November 14, 2020 | A &#x60;author_details&#x60; field has been added to the default response, which includes an &#x60;avatar_path&#x60; and &#x60;rating&#x60; value. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param reviewId  (required)
     * @return ResponseEntity&lt;GETReviewReviewId200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETReviewReviewId200Response> gETReviewReviewIdWithHttpInfo(String reviewId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'reviewId' is set
        if (reviewId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reviewId' when calling gETReviewReviewId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("review_id", reviewId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETReviewReviewId200Response> localReturnType = new ParameterizedTypeReference<GETReviewReviewId200Response>() {};
        return apiClient.invokeAPI("/review/{review_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search Collections
     * Search for collections.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETSearchCollection200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETSearchCollection200Response gETSearchCollection() throws RestClientException {
        return gETSearchCollectionWithHttpInfo().getBody();
    }

    /**
     * Search Collections
     * Search for collections.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETSearchCollection200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETSearchCollection200Response> gETSearchCollectionWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETSearchCollection200Response> localReturnType = new ParameterizedTypeReference<GETSearchCollection200Response>() {};
        return apiClient.invokeAPI("/search/collection", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search Companies
     * Search for companies.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETSearchKeyword200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETSearchKeyword200Response gETSearchCompany() throws RestClientException {
        return gETSearchCompanyWithHttpInfo().getBody();
    }

    /**
     * Search Companies
     * Search for companies.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETSearchKeyword200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETSearchKeyword200Response> gETSearchCompanyWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETSearchKeyword200Response> localReturnType = new ParameterizedTypeReference<GETSearchKeyword200Response>() {};
        return apiClient.invokeAPI("/search/company", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search Keywords
     * Search for keywords.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETSearchKeyword200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETSearchKeyword200Response gETSearchKeyword() throws RestClientException {
        return gETSearchKeywordWithHttpInfo().getBody();
    }

    /**
     * Search Keywords
     * Search for keywords.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETSearchKeyword200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETSearchKeyword200Response> gETSearchKeywordWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETSearchKeyword200Response> localReturnType = new ParameterizedTypeReference<GETSearchKeyword200Response>() {};
        return apiClient.invokeAPI("/search/keyword", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search Movies
     * Search for movies.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param year  (optional)
     * @param primaryReleaseYear  (optional)
     * @return GETMoviePopular200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMoviePopular200Response gETSearchMovie(Integer year, Integer primaryReleaseYear) throws RestClientException {
        return gETSearchMovieWithHttpInfo(year, primaryReleaseYear).getBody();
    }

    /**
     * Search Movies
     * Search for movies.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param year  (optional)
     * @param primaryReleaseYear  (optional)
     * @return ResponseEntity&lt;GETMoviePopular200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMoviePopular200Response> gETSearchMovieWithHttpInfo(Integer year, Integer primaryReleaseYear) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "year", year));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "primary_release_year", primaryReleaseYear));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMoviePopular200Response> localReturnType = new ParameterizedTypeReference<GETMoviePopular200Response>() {};
        return apiClient.invokeAPI("/search/movie", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Multi Search
     * Search multiple models in a single request. Multi search currently supports searching for movies, tv shows and people in a single request.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETSearchMulti200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETSearchMulti200Response gETSearchMulti() throws RestClientException {
        return gETSearchMultiWithHttpInfo().getBody();
    }

    /**
     * Multi Search
     * Search multiple models in a single request. Multi search currently supports searching for movies, tv shows and people in a single request.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETSearchMulti200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETSearchMulti200Response> gETSearchMultiWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETSearchMulti200Response> localReturnType = new ParameterizedTypeReference<GETSearchMulti200Response>() {};
        return apiClient.invokeAPI("/search/multi", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search People
     * Search for people.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETSearchPerson200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETSearchPerson200Response gETSearchPerson() throws RestClientException {
        return gETSearchPersonWithHttpInfo().getBody();
    }

    /**
     * Search People
     * Search for people.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETSearchPerson200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETSearchPerson200Response> gETSearchPersonWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETSearchPerson200Response> localReturnType = new ParameterizedTypeReference<GETSearchPerson200Response>() {};
        return apiClient.invokeAPI("/search/person", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search TV Shows
     * Search for a TV show.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param firstAirDateYear  (optional)
     * @return GETDiscoverTv200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETDiscoverTv200Response gETSearchTv(Integer firstAirDateYear) throws RestClientException {
        return gETSearchTvWithHttpInfo(firstAirDateYear).getBody();
    }

    /**
     * Search TV Shows
     * Search for a TV show.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param firstAirDateYear  (optional)
     * @return ResponseEntity&lt;GETDiscoverTv200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETDiscoverTv200Response> gETSearchTvWithHttpInfo(Integer firstAirDateYear) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "first_air_date_year", firstAirDateYear));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETDiscoverTv200Response> localReturnType = new ParameterizedTypeReference<GETDiscoverTv200Response>() {};
        return apiClient.invokeAPI("/search/tv", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get TV Airing Today
     * Get a list of TV shows that are airing today. This query is purely day based as we do not currently support airing times.  You can specify a [timezone](endpoint:KQ4CDdEoWKJYLkrhS) to offset the day calculation. Without a specified timezone, this query defaults to EST (Eastern Time UTC-05:00).
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETDiscoverTv200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETDiscoverTv200Response gETTvAiringToday() throws RestClientException {
        return gETTvAiringTodayWithHttpInfo().getBody();
    }

    /**
     * Get TV Airing Today
     * Get a list of TV shows that are airing today. This query is purely day based as we do not currently support airing times.  You can specify a [timezone](endpoint:KQ4CDdEoWKJYLkrhS) to offset the day calculation. Without a specified timezone, this query defaults to EST (Eastern Time UTC-05:00).
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETDiscoverTv200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETDiscoverTv200Response> gETTvAiringTodayWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETDiscoverTv200Response> localReturnType = new ParameterizedTypeReference<GETDiscoverTv200Response>() {};
        return apiClient.invokeAPI("/tv/airing_today", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get TV Change List
     * Get a list of all of the TV show ids that have been changed in the past 24 hours.  You can query it for up to 14 days worth of changed IDs at a time with the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters. 100 items are returned per page.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETPersonChanges200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETPersonChanges200Response gETTvChanges() throws RestClientException {
        return gETTvChangesWithHttpInfo().getBody();
    }

    /**
     * Get TV Change List
     * Get a list of all of the TV show ids that have been changed in the past 24 hours.  You can query it for up to 14 days worth of changed IDs at a time with the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters. 100 items are returned per page.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETPersonChanges200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETPersonChanges200Response> gETTvChangesWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETPersonChanges200Response> localReturnType = new ParameterizedTypeReference<GETPersonChanges200Response>() {};
        return apiClient.invokeAPI("/tv/changes", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Changes
     * Get the changes for a TV episode. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param episodeId  (required)
     * @return GETTvEpisodeEpisodeIdChanges200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvEpisodeEpisodeIdChanges200Response gETTvEpisodeEpisodeIdChanges(Integer episodeId) throws RestClientException {
        return gETTvEpisodeEpisodeIdChangesWithHttpInfo(episodeId).getBody();
    }

    /**
     * Get Changes
     * Get the changes for a TV episode. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param episodeId  (required)
     * @return ResponseEntity&lt;GETTvEpisodeEpisodeIdChanges200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvEpisodeEpisodeIdChanges200Response> gETTvEpisodeEpisodeIdChangesWithHttpInfo(Integer episodeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'episodeId' is set
        if (episodeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'episodeId' when calling gETTvEpisodeEpisodeIdChanges");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("episode_id", episodeId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvEpisodeEpisodeIdChanges200Response> localReturnType = new ParameterizedTypeReference<GETTvEpisodeEpisodeIdChanges200Response>() {};
        return apiClient.invokeAPI("/tv/episode/{episode_id}/changes", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Details
     * Get the details of a TV episode group. Groups support 7 different types which are enumerated as the following:  1. Original air date 2. Absolute 3. DVD 4. Digital 5. Story arc 6. Production 7. TV
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param id  (required)
     * @return GETTvEpisodeGroupId200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvEpisodeGroupId200Response gETTvEpisodeGroupId(String id) throws RestClientException {
        return gETTvEpisodeGroupIdWithHttpInfo(id).getBody();
    }

    /**
     * Get Details
     * Get the details of a TV episode group. Groups support 7 different types which are enumerated as the following:  1. Original air date 2. Absolute 3. DVD 4. Digital 5. Story arc 6. Production 7. TV
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param id  (required)
     * @return ResponseEntity&lt;GETTvEpisodeGroupId200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvEpisodeGroupId200Response> gETTvEpisodeGroupIdWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling gETTvEpisodeGroupId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvEpisodeGroupId200Response> localReturnType = new ParameterizedTypeReference<GETTvEpisodeGroupId200Response>() {};
        return apiClient.invokeAPI("/tv/episode_group/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Latest
     * Get the most newly created TV show. This is a live response and will continuously change.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETTvLatest200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvLatest200Response gETTvLatest() throws RestClientException {
        return gETTvLatestWithHttpInfo().getBody();
    }

    /**
     * Get Latest
     * Get the most newly created TV show. This is a live response and will continuously change.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETTvLatest200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvLatest200Response> gETTvLatestWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvLatest200Response> localReturnType = new ParameterizedTypeReference<GETTvLatest200Response>() {};
        return apiClient.invokeAPI("/tv/latest", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get TV On The Air
     * Get a list of shows that are currently on the air.  This query looks for any TV show that has an episode with an air date in the next 7 days.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETDiscoverTv200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETDiscoverTv200Response gETTvOnTheAir() throws RestClientException {
        return gETTvOnTheAirWithHttpInfo().getBody();
    }

    /**
     * Get TV On The Air
     * Get a list of shows that are currently on the air.  This query looks for any TV show that has an episode with an air date in the next 7 days.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETDiscoverTv200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETDiscoverTv200Response> gETTvOnTheAirWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETDiscoverTv200Response> localReturnType = new ParameterizedTypeReference<GETDiscoverTv200Response>() {};
        return apiClient.invokeAPI("/tv/on_the_air", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Popular
     * Get a list of the current popular TV shows on TMDB. This list updates daily.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETDiscoverTv200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETDiscoverTv200Response gETTvPopular() throws RestClientException {
        return gETTvPopularWithHttpInfo().getBody();
    }

    /**
     * Get Popular
     * Get a list of the current popular TV shows on TMDB. This list updates daily.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETDiscoverTv200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETDiscoverTv200Response> gETTvPopularWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETDiscoverTv200Response> localReturnType = new ParameterizedTypeReference<GETDiscoverTv200Response>() {};
        return apiClient.invokeAPI("/tv/popular", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get  Changes
     * Get the changes for a TV season. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param seasonId  (required)
     * @return GETTvSeasonSeasonIdChanges200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvSeasonSeasonIdChanges200Response gETTvSeasonSeasonIdChanges(Integer seasonId) throws RestClientException {
        return gETTvSeasonSeasonIdChangesWithHttpInfo(seasonId).getBody();
    }

    /**
     * Get  Changes
     * Get the changes for a TV season. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param seasonId  (required)
     * @return ResponseEntity&lt;GETTvSeasonSeasonIdChanges200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvSeasonSeasonIdChanges200Response> gETTvSeasonSeasonIdChangesWithHttpInfo(Integer seasonId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'seasonId' is set
        if (seasonId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seasonId' when calling gETTvSeasonSeasonIdChanges");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("season_id", seasonId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvSeasonSeasonIdChanges200Response> localReturnType = new ParameterizedTypeReference<GETTvSeasonSeasonIdChanges200Response>() {};
        return apiClient.invokeAPI("/tv/season/{season_id}/changes", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Top Rated
     * Get a list of the top rated TV shows on TMDB.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETDiscoverTv200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETDiscoverTv200Response gETTvTopRated() throws RestClientException {
        return gETTvTopRatedWithHttpInfo().getBody();
    }

    /**
     * Get Top Rated
     * Get a list of the top rated TV shows on TMDB.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETDiscoverTv200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETDiscoverTv200Response> gETTvTopRatedWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETDiscoverTv200Response> localReturnType = new ParameterizedTypeReference<GETDiscoverTv200Response>() {};
        return apiClient.invokeAPI("/tv/top_rated", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Details
     * Get the primary TV show details by id.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).  #### Recent Changes  | **Date** | **Change** | | - | - | | November 20, 2020 | A &#x60;watch/providers&#x60; method has been added to show what providers (eg. streaming) are available and where.| | November 14, 2020 | The &#x60;tagline&#x60; has been added to the default response, and is also available as part of the translations method. | | July 17, 2018 | We now return &#x60;last_episode_to_air&#x60; and &#x60;next_episode_to_air&#x60; fields. | | March 12, 2018 | Networks return proper logos and we introduced SVG support. | | March 8, 2018 | The &#x60;seasons&#x60; field now returns the translated names and overviews. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return GETTvTvId200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvTvId200Response gETTvTvId(Integer tvId) throws RestClientException {
        return gETTvTvIdWithHttpInfo(tvId).getBody();
    }

    /**
     * Get Details
     * Get the primary TV show details by id.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).  #### Recent Changes  | **Date** | **Change** | | - | - | | November 20, 2020 | A &#x60;watch/providers&#x60; method has been added to show what providers (eg. streaming) are available and where.| | November 14, 2020 | The &#x60;tagline&#x60; has been added to the default response, and is also available as part of the translations method. | | July 17, 2018 | We now return &#x60;last_episode_to_air&#x60; and &#x60;next_episode_to_air&#x60; fields. | | March 12, 2018 | Networks return proper logos and we introduced SVG support. | | March 8, 2018 | The &#x60;seasons&#x60; field now returns the translated names and overviews. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return ResponseEntity&lt;GETTvTvId200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvTvId200Response> gETTvTvIdWithHttpInfo(Integer tvId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvTvId200Response> localReturnType = new ParameterizedTypeReference<GETTvTvId200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Account States
     * Grab the following account states for a session:  - TV show rating - If it belongs to your watchlist - If it belongs to your favourite list
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param guestSessionId  (optional)
     * @param sessionId  (optional)
     * @return GETMovieMovieIdAccountStates200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdAccountStates200Response gETTvTvIdAccountStates(Integer tvId, String guestSessionId, String sessionId) throws RestClientException {
        return gETTvTvIdAccountStatesWithHttpInfo(tvId, guestSessionId, sessionId).getBody();
    }

    /**
     * Get Account States
     * Grab the following account states for a session:  - TV show rating - If it belongs to your watchlist - If it belongs to your favourite list
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param guestSessionId  (optional)
     * @param sessionId  (optional)
     * @return ResponseEntity&lt;GETMovieMovieIdAccountStates200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdAccountStates200Response> gETTvTvIdAccountStatesWithHttpInfo(Integer tvId, String guestSessionId, String sessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdAccountStates");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "guest_session_id", guestSessionId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdAccountStates200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdAccountStates200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/account_states", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Alternative Titles
     * Returns all of the alternative titles for a TV show.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return GETTvTvIdAlternativeTitles200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvTvIdAlternativeTitles200Response gETTvTvIdAlternativeTitles(Integer tvId) throws RestClientException {
        return gETTvTvIdAlternativeTitlesWithHttpInfo(tvId).getBody();
    }

    /**
     * Get Alternative Titles
     * Returns all of the alternative titles for a TV show.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return ResponseEntity&lt;GETTvTvIdAlternativeTitles200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvTvIdAlternativeTitles200Response> gETTvTvIdAlternativeTitlesWithHttpInfo(Integer tvId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdAlternativeTitles");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvTvIdAlternativeTitles200Response> localReturnType = new ParameterizedTypeReference<GETTvTvIdAlternativeTitles200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/alternative_titles", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Changes
     * Get the changes for a TV show. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.  TV show changes are different than movie changes in that there are some edits on seasons and episodes that will create a change entry at the show level. These can be found under the season and episode keys. These keys will contain a &#x60;series_id&#x60; and &#x60;episode_id&#x60;. You can use the [season changes](#endpoint:ZqhtyQbJ4YXz8RSya) and [episode changes](#endpoint:FpqrhBzgf2RJv4bHC) methods to look these up individually.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return GETTvTvIdChanges200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvTvIdChanges200Response gETTvTvIdChanges(Integer tvId) throws RestClientException {
        return gETTvTvIdChangesWithHttpInfo(tvId).getBody();
    }

    /**
     * Get Changes
     * Get the changes for a TV show. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.  TV show changes are different than movie changes in that there are some edits on seasons and episodes that will create a change entry at the show level. These can be found under the season and episode keys. These keys will contain a &#x60;series_id&#x60; and &#x60;episode_id&#x60;. You can use the [season changes](#endpoint:ZqhtyQbJ4YXz8RSya) and [episode changes](#endpoint:FpqrhBzgf2RJv4bHC) methods to look these up individually.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return ResponseEntity&lt;GETTvTvIdChanges200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvTvIdChanges200Response> gETTvTvIdChangesWithHttpInfo(Integer tvId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdChanges");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvTvIdChanges200Response> localReturnType = new ParameterizedTypeReference<GETTvTvIdChanges200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/changes", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Content Ratings
     * Get the list of content ratings (certifications) that have been added to a TV show.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return GETTvTvIdContentRatings200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvTvIdContentRatings200Response gETTvTvIdContentRatings(Integer tvId) throws RestClientException {
        return gETTvTvIdContentRatingsWithHttpInfo(tvId).getBody();
    }

    /**
     * Get Content Ratings
     * Get the list of content ratings (certifications) that have been added to a TV show.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return ResponseEntity&lt;GETTvTvIdContentRatings200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvTvIdContentRatings200Response> gETTvTvIdContentRatingsWithHttpInfo(Integer tvId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdContentRatings");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvTvIdContentRatings200Response> localReturnType = new ParameterizedTypeReference<GETTvTvIdContentRatings200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/content_ratings", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Episode Groups
     * Get all of the episode groups that have been created for a TV show. With a group ID you can call the [get TV episode group details](#endpoint:yCouThc88qs7DGHY5) method.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return GETTvTvIdEpisodeGroups200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvTvIdEpisodeGroups200Response gETTvTvIdEpisodeGroups(Integer tvId) throws RestClientException {
        return gETTvTvIdEpisodeGroupsWithHttpInfo(tvId).getBody();
    }

    /**
     * Get Episode Groups
     * Get all of the episode groups that have been created for a TV show. With a group ID you can call the [get TV episode group details](#endpoint:yCouThc88qs7DGHY5) method.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return ResponseEntity&lt;GETTvTvIdEpisodeGroups200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvTvIdEpisodeGroups200Response> gETTvTvIdEpisodeGroupsWithHttpInfo(Integer tvId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdEpisodeGroups");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvTvIdEpisodeGroups200Response> localReturnType = new ParameterizedTypeReference<GETTvTvIdEpisodeGroups200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/episode_groups", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get External IDs
     * Get the external ids for a TV show. We currently support the following external sources.  | **Media Databases** | **Social IDs** | | ------------------- | -------------- | | IMDb ID             | Facebook       | | TVDB ID             | Instagram      | | Freebase MID*       | Twitter        | | Freebase ID*        |                | | TVRage ID*          |                |  *Defunct or no longer available as a service.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return GETMovieMovieIdExternalIds200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdExternalIds200Response gETTvTvIdExternalIds(Integer tvId) throws RestClientException {
        return gETTvTvIdExternalIdsWithHttpInfo(tvId).getBody();
    }

    /**
     * Get External IDs
     * Get the external ids for a TV show. We currently support the following external sources.  | **Media Databases** | **Social IDs** | | ------------------- | -------------- | | IMDb ID             | Facebook       | | TVDB ID             | Instagram      | | Freebase MID*       | Twitter        | | Freebase ID*        |                | | TVRage ID*          |                |  *Defunct or no longer available as a service.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return ResponseEntity&lt;GETMovieMovieIdExternalIds200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdExternalIds200Response> gETTvTvIdExternalIdsWithHttpInfo(Integer tvId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdExternalIds");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdExternalIds200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdExternalIds200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/external_ids", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Images
     * Get the images that belong to a TV show.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return GETTvTvIdImages200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvTvIdImages200Response gETTvTvIdImages(Integer tvId) throws RestClientException {
        return gETTvTvIdImagesWithHttpInfo(tvId).getBody();
    }

    /**
     * Get Images
     * Get the images that belong to a TV show.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return ResponseEntity&lt;GETTvTvIdImages200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvTvIdImages200Response> gETTvTvIdImagesWithHttpInfo(Integer tvId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdImages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvTvIdImages200Response> localReturnType = new ParameterizedTypeReference<GETTvTvIdImages200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/images", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Keywords
     * Get the keywords that have been added to a TV show.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return GETTvTvIdKeywords200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvTvIdKeywords200Response gETTvTvIdKeywords(Integer tvId) throws RestClientException {
        return gETTvTvIdKeywordsWithHttpInfo(tvId).getBody();
    }

    /**
     * Get Keywords
     * Get the keywords that have been added to a TV show.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return ResponseEntity&lt;GETTvTvIdKeywords200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvTvIdKeywords200Response> gETTvTvIdKeywordsWithHttpInfo(Integer tvId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdKeywords");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvTvIdKeywords200Response> localReturnType = new ParameterizedTypeReference<GETTvTvIdKeywords200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/keywords", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Recommendations
     * Get the list of TV show recommendations for this item.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return GETAccountAccountIdWatchlistTv200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETAccountAccountIdWatchlistTv200Response gETTvTvIdRecommendations(Integer tvId) throws RestClientException {
        return gETTvTvIdRecommendationsWithHttpInfo(tvId).getBody();
    }

    /**
     * Get Recommendations
     * Get the list of TV show recommendations for this item.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return ResponseEntity&lt;GETAccountAccountIdWatchlistTv200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETAccountAccountIdWatchlistTv200Response> gETTvTvIdRecommendationsWithHttpInfo(Integer tvId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdRecommendations");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETAccountAccountIdWatchlistTv200Response> localReturnType = new ParameterizedTypeReference<GETAccountAccountIdWatchlistTv200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/recommendations", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Reviews
     * Get the reviews for a TV show.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return GETTvTvIdReviews200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvTvIdReviews200Response gETTvTvIdReviews(Integer tvId) throws RestClientException {
        return gETTvTvIdReviewsWithHttpInfo(tvId).getBody();
    }

    /**
     * Get Reviews
     * Get the reviews for a TV show.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return ResponseEntity&lt;GETTvTvIdReviews200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvTvIdReviews200Response> gETTvTvIdReviewsWithHttpInfo(Integer tvId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdReviews");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvTvIdReviews200Response> localReturnType = new ParameterizedTypeReference<GETTvTvIdReviews200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/reviews", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Screened Theatrically
     * Get a list of seasons or episodes that have been screened in a film festival or theatre.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return GETTvTvIdScreenedTheatrically200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvTvIdScreenedTheatrically200Response gETTvTvIdScreenedTheatrically(Integer tvId) throws RestClientException {
        return gETTvTvIdScreenedTheatricallyWithHttpInfo(tvId).getBody();
    }

    /**
     * Get Screened Theatrically
     * Get a list of seasons or episodes that have been screened in a film festival or theatre.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return ResponseEntity&lt;GETTvTvIdScreenedTheatrically200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvTvIdScreenedTheatrically200Response> gETTvTvIdScreenedTheatricallyWithHttpInfo(Integer tvId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdScreenedTheatrically");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvTvIdScreenedTheatrically200Response> localReturnType = new ParameterizedTypeReference<GETTvTvIdScreenedTheatrically200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/screened_theatrically", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Account States
     * Returns all of the user ratings for the season&#39;s episodes.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @param guestSessionId  (optional)
     * @param sessionId  (optional)
     * @return GETTvTvIdSeasonSeasonNumberAccountStates200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvTvIdSeasonSeasonNumberAccountStates200Response gETTvTvIdSeasonSeasonNumberAccountStates(Integer tvId, Integer seasonNumber, String guestSessionId, String sessionId) throws RestClientException {
        return gETTvTvIdSeasonSeasonNumberAccountStatesWithHttpInfo(tvId, seasonNumber, guestSessionId, sessionId).getBody();
    }

    /**
     * Get Account States
     * Returns all of the user ratings for the season&#39;s episodes.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @param guestSessionId  (optional)
     * @param sessionId  (optional)
     * @return ResponseEntity&lt;GETTvTvIdSeasonSeasonNumberAccountStates200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvTvIdSeasonSeasonNumberAccountStates200Response> gETTvTvIdSeasonSeasonNumberAccountStatesWithHttpInfo(Integer tvId, Integer seasonNumber, String guestSessionId, String sessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdSeasonSeasonNumberAccountStates");
        }
        
        // verify the required parameter 'seasonNumber' is set
        if (seasonNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seasonNumber' when calling gETTvTvIdSeasonSeasonNumberAccountStates");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);
        uriVariables.put("season_number", seasonNumber);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "guest_session_id", guestSessionId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvTvIdSeasonSeasonNumberAccountStates200Response> localReturnType = new ParameterizedTypeReference<GETTvTvIdSeasonSeasonNumberAccountStates200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/season/{season_number}/account_states", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Credits
     * Get the credits for TV season.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @return GETTvTvIdSeasonSeasonNumberCredits200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvTvIdSeasonSeasonNumberCredits200Response gETTvTvIdSeasonSeasonNumberCredits(Integer tvId, Integer seasonNumber) throws RestClientException {
        return gETTvTvIdSeasonSeasonNumberCreditsWithHttpInfo(tvId, seasonNumber).getBody();
    }

    /**
     * Get Credits
     * Get the credits for TV season.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @return ResponseEntity&lt;GETTvTvIdSeasonSeasonNumberCredits200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvTvIdSeasonSeasonNumberCredits200Response> gETTvTvIdSeasonSeasonNumberCreditsWithHttpInfo(Integer tvId, Integer seasonNumber) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdSeasonSeasonNumberCredits");
        }
        
        // verify the required parameter 'seasonNumber' is set
        if (seasonNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seasonNumber' when calling gETTvTvIdSeasonSeasonNumberCredits");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);
        uriVariables.put("season_number", seasonNumber);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvTvIdSeasonSeasonNumberCredits200Response> localReturnType = new ParameterizedTypeReference<GETTvTvIdSeasonSeasonNumberCredits200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/season/{season_number}/credits", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Details
     * Get the TV episode details by id.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).  #### Recent Changes  | **Date** | **Change** | | - | - | | June 1, 2018 | Added the [translations](#endpoint:5SFwZar3LkP99QMp7) method. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @param episodeNumber  (required)
     * @return GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber(Integer tvId, Integer seasonNumber, Integer episodeNumber) throws RestClientException {
        return gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberWithHttpInfo(tvId, seasonNumber, episodeNumber).getBody();
    }

    /**
     * Get Details
     * Get the TV episode details by id.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).  #### Recent Changes  | **Date** | **Change** | | - | - | | June 1, 2018 | Added the [translations](#endpoint:5SFwZar3LkP99QMp7) method. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @param episodeNumber  (required)
     * @return ResponseEntity&lt;GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response> gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberWithHttpInfo(Integer tvId, Integer seasonNumber, Integer episodeNumber) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber");
        }
        
        // verify the required parameter 'seasonNumber' is set
        if (seasonNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seasonNumber' when calling gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber");
        }
        
        // verify the required parameter 'episodeNumber' is set
        if (episodeNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'episodeNumber' when calling gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);
        uriVariables.put("season_number", seasonNumber);
        uriVariables.put("episode_number", episodeNumber);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response> localReturnType = new ParameterizedTypeReference<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/season/{season_number}/episode/{episode_number}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Account States
     * Get your rating for a episode.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @param episodeNumber  (required)
     * @param guestSessionId  (optional)
     * @param sessionId  (optional)
     * @return GETMovieMovieIdExternalIds200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdExternalIds200Response gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates(Integer tvId, Integer seasonNumber, Integer episodeNumber, String guestSessionId, String sessionId) throws RestClientException {
        return gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStatesWithHttpInfo(tvId, seasonNumber, episodeNumber, guestSessionId, sessionId).getBody();
    }

    /**
     * Get Account States
     * Get your rating for a episode.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @param episodeNumber  (required)
     * @param guestSessionId  (optional)
     * @param sessionId  (optional)
     * @return ResponseEntity&lt;GETMovieMovieIdExternalIds200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdExternalIds200Response> gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStatesWithHttpInfo(Integer tvId, Integer seasonNumber, Integer episodeNumber, String guestSessionId, String sessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates");
        }
        
        // verify the required parameter 'seasonNumber' is set
        if (seasonNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seasonNumber' when calling gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates");
        }
        
        // verify the required parameter 'episodeNumber' is set
        if (episodeNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'episodeNumber' when calling gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);
        uriVariables.put("season_number", seasonNumber);
        uriVariables.put("episode_number", episodeNumber);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "guest_session_id", guestSessionId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdExternalIds200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdExternalIds200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/account_states", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get External IDs
     * Get the external ids for a TV episode. We currently support the following external sources.  | **External Sources** | | -------------------- | | IMDb ID              | | TVDB ID              | | Freebase MID*        | | Freebase ID*         | | TVRage ID*           |  *Defunct or no longer available as a service.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @param episodeNumber  (required)
     * @return GETMovieMovieIdExternalIds200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdExternalIds200Response gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds(Integer tvId, Integer seasonNumber, Integer episodeNumber) throws RestClientException {
        return gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIdsWithHttpInfo(tvId, seasonNumber, episodeNumber).getBody();
    }

    /**
     * Get External IDs
     * Get the external ids for a TV episode. We currently support the following external sources.  | **External Sources** | | -------------------- | | IMDb ID              | | TVDB ID              | | Freebase MID*        | | Freebase ID*         | | TVRage ID*           |  *Defunct or no longer available as a service.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @param episodeNumber  (required)
     * @return ResponseEntity&lt;GETMovieMovieIdExternalIds200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdExternalIds200Response> gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIdsWithHttpInfo(Integer tvId, Integer seasonNumber, Integer episodeNumber) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds");
        }
        
        // verify the required parameter 'seasonNumber' is set
        if (seasonNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seasonNumber' when calling gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds");
        }
        
        // verify the required parameter 'episodeNumber' is set
        if (episodeNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'episodeNumber' when calling gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);
        uriVariables.put("season_number", seasonNumber);
        uriVariables.put("episode_number", episodeNumber);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdExternalIds200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdExternalIds200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/external_ids", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Images
     * Get the images that belong to a TV episode.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @param episodeNumber  (required)
     * @return GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages200Response gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages(Integer tvId, Integer seasonNumber, Integer episodeNumber) throws RestClientException {
        return gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImagesWithHttpInfo(tvId, seasonNumber, episodeNumber).getBody();
    }

    /**
     * Get Images
     * Get the images that belong to a TV episode.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @param episodeNumber  (required)
     * @return ResponseEntity&lt;GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages200Response> gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImagesWithHttpInfo(Integer tvId, Integer seasonNumber, Integer episodeNumber) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages");
        }
        
        // verify the required parameter 'seasonNumber' is set
        if (seasonNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seasonNumber' when calling gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages");
        }
        
        // verify the required parameter 'episodeNumber' is set
        if (episodeNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'episodeNumber' when calling gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);
        uriVariables.put("season_number", seasonNumber);
        uriVariables.put("episode_number", episodeNumber);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages200Response> localReturnType = new ParameterizedTypeReference<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/images", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Translations
     * Get the translation data for an episode.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @param episodeNumber  (required)
     * @return GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations(Integer tvId, Integer seasonNumber, Integer episodeNumber) throws RestClientException {
        return gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslationsWithHttpInfo(tvId, seasonNumber, episodeNumber).getBody();
    }

    /**
     * Get Translations
     * Get the translation data for an episode.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @param episodeNumber  (required)
     * @return ResponseEntity&lt;GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response> gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslationsWithHttpInfo(Integer tvId, Integer seasonNumber, Integer episodeNumber) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations");
        }
        
        // verify the required parameter 'seasonNumber' is set
        if (seasonNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seasonNumber' when calling gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations");
        }
        
        // verify the required parameter 'episodeNumber' is set
        if (episodeNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'episodeNumber' when calling gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);
        uriVariables.put("season_number", seasonNumber);
        uriVariables.put("episode_number", episodeNumber);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response> localReturnType = new ParameterizedTypeReference<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/translations", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get  Videos
     * Get the videos that have been added to a TV episode.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 28, 2021 | A new &#x60;include_video_language&#x60; filter is now available. You can use this filter the same way you use &#x60;include_image_language&#x60; on image calls. We also added two new fields, &#x60;official&#x60; and &#x60;published_at&#x60; to the video response. | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot;, \&quot;Bloopers\&quot; and \&quot;Recap\&quot; were added as valid video types. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @param episodeNumber  (required)
     * @return GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos(Integer tvId, Integer seasonNumber, Integer episodeNumber) throws RestClientException {
        return gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideosWithHttpInfo(tvId, seasonNumber, episodeNumber).getBody();
    }

    /**
     * Get  Videos
     * Get the videos that have been added to a TV episode.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 28, 2021 | A new &#x60;include_video_language&#x60; filter is now available. You can use this filter the same way you use &#x60;include_image_language&#x60; on image calls. We also added two new fields, &#x60;official&#x60; and &#x60;published_at&#x60; to the video response. | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot;, \&quot;Bloopers\&quot; and \&quot;Recap\&quot; were added as valid video types. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @param episodeNumber  (required)
     * @return ResponseEntity&lt;GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response> gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideosWithHttpInfo(Integer tvId, Integer seasonNumber, Integer episodeNumber) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos");
        }
        
        // verify the required parameter 'seasonNumber' is set
        if (seasonNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seasonNumber' when calling gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos");
        }
        
        // verify the required parameter 'episodeNumber' is set
        if (episodeNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'episodeNumber' when calling gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);
        uriVariables.put("season_number", seasonNumber);
        uriVariables.put("episode_number", episodeNumber);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response> localReturnType = new ParameterizedTypeReference<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/videos", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get External IDs
     * Get the external ids for a TV season. We currently support the following external sources.  | **Media Databases** | | ------------------- | | TVDB ID             | | Freebase MID*       | | Freebase ID*        | | TVRage ID*          |  *Defunct or no longer available as a service.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @return GETMovieMovieIdExternalIds200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdExternalIds200Response gETTvTvIdSeasonSeasonNumberExternalIds(Integer tvId, Integer seasonNumber) throws RestClientException {
        return gETTvTvIdSeasonSeasonNumberExternalIdsWithHttpInfo(tvId, seasonNumber).getBody();
    }

    /**
     * Get External IDs
     * Get the external ids for a TV season. We currently support the following external sources.  | **Media Databases** | | ------------------- | | TVDB ID             | | Freebase MID*       | | Freebase ID*        | | TVRage ID*          |  *Defunct or no longer available as a service.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @return ResponseEntity&lt;GETMovieMovieIdExternalIds200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdExternalIds200Response> gETTvTvIdSeasonSeasonNumberExternalIdsWithHttpInfo(Integer tvId, Integer seasonNumber) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdSeasonSeasonNumberExternalIds");
        }
        
        // verify the required parameter 'seasonNumber' is set
        if (seasonNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seasonNumber' when calling gETTvTvIdSeasonSeasonNumberExternalIds");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);
        uriVariables.put("season_number", seasonNumber);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdExternalIds200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdExternalIds200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/season/{season_number}/external_ids", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Images
     * Get the images that belong to a TV season.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @return GETTvTvIdSeasonSeasonNumberImages200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvTvIdSeasonSeasonNumberImages200Response gETTvTvIdSeasonSeasonNumberImages(Integer tvId, Integer seasonNumber) throws RestClientException {
        return gETTvTvIdSeasonSeasonNumberImagesWithHttpInfo(tvId, seasonNumber).getBody();
    }

    /**
     * Get Images
     * Get the images that belong to a TV season.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @return ResponseEntity&lt;GETTvTvIdSeasonSeasonNumberImages200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvTvIdSeasonSeasonNumberImages200Response> gETTvTvIdSeasonSeasonNumberImagesWithHttpInfo(Integer tvId, Integer seasonNumber) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdSeasonSeasonNumberImages");
        }
        
        // verify the required parameter 'seasonNumber' is set
        if (seasonNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seasonNumber' when calling gETTvTvIdSeasonSeasonNumberImages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);
        uriVariables.put("season_number", seasonNumber);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvTvIdSeasonSeasonNumberImages200Response> localReturnType = new ParameterizedTypeReference<GETTvTvIdSeasonSeasonNumberImages200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/season/{season_number}/images", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Translations
     * Get the credits for TV season.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @return GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response gETTvTvIdSeasonSeasonNumberTranslations(Integer tvId, Integer seasonNumber) throws RestClientException {
        return gETTvTvIdSeasonSeasonNumberTranslationsWithHttpInfo(tvId, seasonNumber).getBody();
    }

    /**
     * Get Translations
     * Get the credits for TV season.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @return ResponseEntity&lt;GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response> gETTvTvIdSeasonSeasonNumberTranslationsWithHttpInfo(Integer tvId, Integer seasonNumber) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdSeasonSeasonNumberTranslations");
        }
        
        // verify the required parameter 'seasonNumber' is set
        if (seasonNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seasonNumber' when calling gETTvTvIdSeasonSeasonNumberTranslations");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);
        uriVariables.put("season_number", seasonNumber);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response> localReturnType = new ParameterizedTypeReference<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/season/{season_number}/translations", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Videos
     * Get the videos that have been added to a TV season.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 28, 2021 | A new &#x60;include_video_language&#x60; filter is now available. You can use this filter the same way you use &#x60;include_image_language&#x60; on image calls. We also added two new fields, &#x60;official&#x60; and &#x60;published_at&#x60; to the video response. | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot; and \&quot;Bloopers\&quot; and \&quot;Recap\&quot; were added as valid video types. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @return GETMovieMovieIdVideos200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdVideos200Response gETTvTvIdSeasonSeasonNumberVideos(Integer tvId, Integer seasonNumber) throws RestClientException {
        return gETTvTvIdSeasonSeasonNumberVideosWithHttpInfo(tvId, seasonNumber).getBody();
    }

    /**
     * Get Videos
     * Get the videos that have been added to a TV season.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 28, 2021 | A new &#x60;include_video_language&#x60; filter is now available. You can use this filter the same way you use &#x60;include_image_language&#x60; on image calls. We also added two new fields, &#x60;official&#x60; and &#x60;published_at&#x60; to the video response. | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot; and \&quot;Bloopers\&quot; and \&quot;Recap\&quot; were added as valid video types. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @return ResponseEntity&lt;GETMovieMovieIdVideos200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdVideos200Response> gETTvTvIdSeasonSeasonNumberVideosWithHttpInfo(Integer tvId, Integer seasonNumber) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdSeasonSeasonNumberVideos");
        }
        
        // verify the required parameter 'seasonNumber' is set
        if (seasonNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seasonNumber' when calling gETTvTvIdSeasonSeasonNumberVideos");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);
        uriVariables.put("season_number", seasonNumber);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdVideos200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdVideos200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/season/{season_number}/videos", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Similar TV Shows
     * Get a list of similar TV shows. These items are assembled by looking at keywords and genres.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return GETAccountAccountIdWatchlistTv200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETAccountAccountIdWatchlistTv200Response gETTvTvIdSimilar(Integer tvId) throws RestClientException {
        return gETTvTvIdSimilarWithHttpInfo(tvId).getBody();
    }

    /**
     * Get Similar TV Shows
     * Get a list of similar TV shows. These items are assembled by looking at keywords and genres.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return ResponseEntity&lt;GETAccountAccountIdWatchlistTv200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETAccountAccountIdWatchlistTv200Response> gETTvTvIdSimilarWithHttpInfo(Integer tvId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdSimilar");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETAccountAccountIdWatchlistTv200Response> localReturnType = new ParameterizedTypeReference<GETAccountAccountIdWatchlistTv200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/similar", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Translations
     * Get a list of the translations that exist for a TV show.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return GETTvTvIdTranslations200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvTvIdTranslations200Response gETTvTvIdTranslations(Integer tvId) throws RestClientException {
        return gETTvTvIdTranslationsWithHttpInfo(tvId).getBody();
    }

    /**
     * Get Translations
     * Get a list of the translations that exist for a TV show.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return ResponseEntity&lt;GETTvTvIdTranslations200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvTvIdTranslations200Response> gETTvTvIdTranslationsWithHttpInfo(Integer tvId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdTranslations");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvTvIdTranslations200Response> localReturnType = new ParameterizedTypeReference<GETTvTvIdTranslations200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/translations", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Videos
     * Get the videos that have been added to a TV show.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 28, 2021 | A new &#x60;include_video_language&#x60; filter is now available. You can use this filter the same way you use &#x60;include_image_language&#x60; on image calls. We also added two new fields, &#x60;official&#x60; and &#x60;published_at&#x60; to the video response. | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot; and \&quot;Bloopers\&quot; were added as valid video types. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return GETMovieMovieIdVideos200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETMovieMovieIdVideos200Response gETTvTvIdVideos(Integer tvId) throws RestClientException {
        return gETTvTvIdVideosWithHttpInfo(tvId).getBody();
    }

    /**
     * Get Videos
     * Get the videos that have been added to a TV show.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 28, 2021 | A new &#x60;include_video_language&#x60; filter is now available. You can use this filter the same way you use &#x60;include_image_language&#x60; on image calls. We also added two new fields, &#x60;official&#x60; and &#x60;published_at&#x60; to the video response. | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot; and \&quot;Bloopers\&quot; were added as valid video types. |
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return ResponseEntity&lt;GETMovieMovieIdVideos200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETMovieMovieIdVideos200Response> gETTvTvIdVideosWithHttpInfo(Integer tvId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdVideos");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETMovieMovieIdVideos200Response> localReturnType = new ParameterizedTypeReference<GETMovieMovieIdVideos200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/videos", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Watch Providers
     * Powered by our partnership with JustWatch, you can query this method to get a list of the availabilities per country by provider.  This is **not** going to return full deep links, but rather, it&#39;s just enough information to display what&#39;s available where.  You can link to the provided TMDB URL to help support TMDB and provide the actual deep links to the content.  **Please note**: In order to use this data **you must** attribute the source of the data as JustWatch. If we find any usage not complying with these terms we will revoke access to the API.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return GETTvTvIdWatchProviders200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETTvTvIdWatchProviders200Response gETTvTvIdWatchProviders(Integer tvId) throws RestClientException {
        return gETTvTvIdWatchProvidersWithHttpInfo(tvId).getBody();
    }

    /**
     * Get Watch Providers
     * Powered by our partnership with JustWatch, you can query this method to get a list of the availabilities per country by provider.  This is **not** going to return full deep links, but rather, it&#39;s just enough information to display what&#39;s available where.  You can link to the provided TMDB URL to help support TMDB and provide the actual deep links to the content.  **Please note**: In order to use this data **you must** attribute the source of the data as JustWatch. If we find any usage not complying with these terms we will revoke access to the API.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @return ResponseEntity&lt;GETTvTvIdWatchProviders200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETTvTvIdWatchProviders200Response> gETTvTvIdWatchProvidersWithHttpInfo(Integer tvId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling gETTvTvIdWatchProviders");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETTvTvIdWatchProviders200Response> localReturnType = new ParameterizedTypeReference<GETTvTvIdWatchProviders200Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/watch/providers", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Movie Providers
     * Returns a list of the watch provider (OTT/streaming) data we have available for movies. You can specify a &#x60;watch_region&#x60; param if you want to further filter the list by country.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param watchRegion Use the ISO-3166-1 code to filter the providers that are available in a particular country. (optional)
     * @return GETWatchProvidersTv200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETWatchProvidersTv200Response gETWatchProvidersMovie(String watchRegion) throws RestClientException {
        return gETWatchProvidersMovieWithHttpInfo(watchRegion).getBody();
    }

    /**
     * Get Movie Providers
     * Returns a list of the watch provider (OTT/streaming) data we have available for movies. You can specify a &#x60;watch_region&#x60; param if you want to further filter the list by country.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param watchRegion Use the ISO-3166-1 code to filter the providers that are available in a particular country. (optional)
     * @return ResponseEntity&lt;GETWatchProvidersTv200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETWatchProvidersTv200Response> gETWatchProvidersMovieWithHttpInfo(String watchRegion) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "watch_region", watchRegion));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETWatchProvidersTv200Response> localReturnType = new ParameterizedTypeReference<GETWatchProvidersTv200Response>() {};
        return apiClient.invokeAPI("/watch/providers/movie", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Available Regions
     * Returns a list of all of the countries we have watch provider (OTT/streaming) data for.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return GETWatchProvidersRegions200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETWatchProvidersRegions200Response gETWatchProvidersRegions() throws RestClientException {
        return gETWatchProvidersRegionsWithHttpInfo().getBody();
    }

    /**
     * Get Available Regions
     * Returns a list of all of the countries we have watch provider (OTT/streaming) data for.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @return ResponseEntity&lt;GETWatchProvidersRegions200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETWatchProvidersRegions200Response> gETWatchProvidersRegionsWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETWatchProvidersRegions200Response> localReturnType = new ParameterizedTypeReference<GETWatchProvidersRegions200Response>() {};
        return apiClient.invokeAPI("/watch/providers/regions", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get TV Providers
     * Returns a list of the watch provider (OTT/streaming) data we have available for TV series. You can specify a &#x60;watch_region&#x60; param if you want to further filter the list by country.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param watchRegion Use the ISO-3166-1 code to filter the providers that are available in a particular country. (optional)
     * @return GETWatchProvidersTv200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GETWatchProvidersTv200Response gETWatchProvidersTv(String watchRegion) throws RestClientException {
        return gETWatchProvidersTvWithHttpInfo(watchRegion).getBody();
    }

    /**
     * Get TV Providers
     * Returns a list of the watch provider (OTT/streaming) data we have available for TV series. You can specify a &#x60;watch_region&#x60; param if you want to further filter the list by country.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param watchRegion Use the ISO-3166-1 code to filter the providers that are available in a particular country. (optional)
     * @return ResponseEntity&lt;GETWatchProvidersTv200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GETWatchProvidersTv200Response> gETWatchProvidersTvWithHttpInfo(String watchRegion) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "watch_region", watchRegion));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<GETWatchProvidersTv200Response> localReturnType = new ParameterizedTypeReference<GETWatchProvidersTv200Response>() {};
        return apiClient.invokeAPI("/watch/providers/tv", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Mark as Favorite
     * This method allows you to mark a movie or TV show as a favorite item.
     * <p><b>201</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param sessionId  (required)
     * @param contentType  (required)
     * @param body  (optional)
     * @return POSTAuthenticationSessionConvert4401Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public POSTAuthenticationSessionConvert4401Response pOSTAccountAccountIdFavorite(Integer accountId, String sessionId, String contentType, POSTAccountAccountIdFavoriteRequest body) throws RestClientException {
        return pOSTAccountAccountIdFavoriteWithHttpInfo(accountId, sessionId, contentType, body).getBody();
    }

    /**
     * Mark as Favorite
     * This method allows you to mark a movie or TV show as a favorite item.
     * <p><b>201</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param sessionId  (required)
     * @param contentType  (required)
     * @param body  (optional)
     * @return ResponseEntity&lt;POSTAuthenticationSessionConvert4401Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<POSTAuthenticationSessionConvert4401Response> pOSTAccountAccountIdFavoriteWithHttpInfo(Integer accountId, String sessionId, String contentType, POSTAccountAccountIdFavoriteRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling pOSTAccountAccountIdFavorite");
        }
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling pOSTAccountAccountIdFavorite");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contentType' when calling pOSTAccountAccountIdFavorite");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("account_id", accountId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response> localReturnType = new ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response>() {};
        return apiClient.invokeAPI("/account/{account_id}/favorite", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add to Watchlist
     * Add a movie or TV show to your watchlist.
     * <p><b>201</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param contentType  (required)
     * @param sessionId  (required)
     * @param body  (optional)
     * @return POSTAuthenticationSessionConvert4401Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public POSTAuthenticationSessionConvert4401Response pOSTAccountAccountIdWatchlist(Integer accountId, String contentType, String sessionId, POSTAccountAccountIdWatchlistRequest body) throws RestClientException {
        return pOSTAccountAccountIdWatchlistWithHttpInfo(accountId, contentType, sessionId, body).getBody();
    }

    /**
     * Add to Watchlist
     * Add a movie or TV show to your watchlist.
     * <p><b>201</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param accountId  (required)
     * @param contentType  (required)
     * @param sessionId  (required)
     * @param body  (optional)
     * @return ResponseEntity&lt;POSTAuthenticationSessionConvert4401Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<POSTAuthenticationSessionConvert4401Response> pOSTAccountAccountIdWatchlistWithHttpInfo(Integer accountId, String contentType, String sessionId, POSTAccountAccountIdWatchlistRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling pOSTAccountAccountIdWatchlist");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contentType' when calling pOSTAccountAccountIdWatchlist");
        }
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling pOSTAccountAccountIdWatchlist");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("account_id", accountId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response> localReturnType = new ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response>() {};
        return apiClient.invokeAPI("/account/{account_id}/watchlist", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Session (from v4 access token)
     * Use this method to create a v3 session ID if you already have a valid v4 access token. The v4 token needs to be authenticated by the user. Your standard \&quot;read token\&quot; will not validate to create a session ID.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param body  (optional)
     * @return POSTAuthenticationSessionConvert4200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public POSTAuthenticationSessionConvert4200Response pOSTAuthenticationSessionConvert4(POSTAuthenticationSessionConvert4Request body) throws RestClientException {
        return pOSTAuthenticationSessionConvert4WithHttpInfo(body).getBody();
    }

    /**
     * Create Session (from v4 access token)
     * Use this method to create a v3 session ID if you already have a valid v4 access token. The v4 token needs to be authenticated by the user. Your standard \&quot;read token\&quot; will not validate to create a session ID.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param body  (optional)
     * @return ResponseEntity&lt;POSTAuthenticationSessionConvert4200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<POSTAuthenticationSessionConvert4200Response> pOSTAuthenticationSessionConvert4WithHttpInfo(POSTAuthenticationSessionConvert4Request body) throws RestClientException {
        Object localVarPostBody = body;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<POSTAuthenticationSessionConvert4200Response> localReturnType = new ParameterizedTypeReference<POSTAuthenticationSessionConvert4200Response>() {};
        return apiClient.invokeAPI("/authentication/session/convert/4", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Session
     * You can use this method to create a fully valid session ID once a user has validated the request token. More information about how this works can be found [here](#docTextSection:NSZtgz7zptsiLYxXZ).
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param body  (optional)
     * @return POSTAuthenticationSessionConvert4200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public POSTAuthenticationSessionConvert4200Response pOSTAuthenticationSessionNew(POSTAuthenticationSessionNewRequest body) throws RestClientException {
        return pOSTAuthenticationSessionNewWithHttpInfo(body).getBody();
    }

    /**
     * Create Session
     * You can use this method to create a fully valid session ID once a user has validated the request token. More information about how this works can be found [here](#docTextSection:NSZtgz7zptsiLYxXZ).
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param body  (optional)
     * @return ResponseEntity&lt;POSTAuthenticationSessionConvert4200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<POSTAuthenticationSessionConvert4200Response> pOSTAuthenticationSessionNewWithHttpInfo(POSTAuthenticationSessionNewRequest body) throws RestClientException {
        Object localVarPostBody = body;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<POSTAuthenticationSessionConvert4200Response> localReturnType = new ParameterizedTypeReference<POSTAuthenticationSessionConvert4200Response>() {};
        return apiClient.invokeAPI("/authentication/session/new", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Session With Login
     * This method allows an application to validate a request token by entering a username and password.  Not all applications have access to a web view so this can be used as a substitute.  Please note, the preferred method of validating a request token is to have a user authenticate the request via the TMDB website. You can read about that method [here](#docTextSection:NSZtgz7zptsiLYxXZ).  If you decide to use this method please **use HTTPS**.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param body  (optional)
     * @return POSTAuthenticationTokenValidateWithLogin200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public POSTAuthenticationTokenValidateWithLogin200Response pOSTAuthenticationTokenValidateWithLogin(POSTAuthenticationTokenValidateWithLoginRequest body) throws RestClientException {
        return pOSTAuthenticationTokenValidateWithLoginWithHttpInfo(body).getBody();
    }

    /**
     * Create Session With Login
     * This method allows an application to validate a request token by entering a username and password.  Not all applications have access to a web view so this can be used as a substitute.  Please note, the preferred method of validating a request token is to have a user authenticate the request via the TMDB website. You can read about that method [here](#docTextSection:NSZtgz7zptsiLYxXZ).  If you decide to use this method please **use HTTPS**.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param body  (optional)
     * @return ResponseEntity&lt;POSTAuthenticationTokenValidateWithLogin200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<POSTAuthenticationTokenValidateWithLogin200Response> pOSTAuthenticationTokenValidateWithLoginWithHttpInfo(POSTAuthenticationTokenValidateWithLoginRequest body) throws RestClientException {
        Object localVarPostBody = body;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<POSTAuthenticationTokenValidateWithLogin200Response> localReturnType = new ParameterizedTypeReference<POSTAuthenticationTokenValidateWithLogin200Response>() {};
        return apiClient.invokeAPI("/authentication/token/validate_with_login", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create List
     * Create a list.
     * <p><b>201</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param contentType  (required)
     * @param sessionId  (required)
     * @param body  (optional)
     * @return POSTList201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public POSTList201Response pOSTList(String contentType, String sessionId, POSTListRequest body) throws RestClientException {
        return pOSTListWithHttpInfo(contentType, sessionId, body).getBody();
    }

    /**
     * Create List
     * Create a list.
     * <p><b>201</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param contentType  (required)
     * @param sessionId  (required)
     * @param body  (optional)
     * @return ResponseEntity&lt;POSTList201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<POSTList201Response> pOSTListWithHttpInfo(String contentType, String sessionId, POSTListRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contentType' when calling pOSTList");
        }
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling pOSTList");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<POSTList201Response> localReturnType = new ParameterizedTypeReference<POSTList201Response>() {};
        return apiClient.invokeAPI("/list", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add Movie
     * Add a movie to a list.
     * <p><b>201</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param listId  (required)
     * @param contentType  (required)
     * @param sessionId  (required)
     * @param body  (optional)
     * @return POSTAuthenticationSessionConvert4401Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public POSTAuthenticationSessionConvert4401Response pOSTListListIdAddItem(String listId, String contentType, String sessionId, POSTListListIdAddItemRequest body) throws RestClientException {
        return pOSTListListIdAddItemWithHttpInfo(listId, contentType, sessionId, body).getBody();
    }

    /**
     * Add Movie
     * Add a movie to a list.
     * <p><b>201</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param listId  (required)
     * @param contentType  (required)
     * @param sessionId  (required)
     * @param body  (optional)
     * @return ResponseEntity&lt;POSTAuthenticationSessionConvert4401Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<POSTAuthenticationSessionConvert4401Response> pOSTListListIdAddItemWithHttpInfo(String listId, String contentType, String sessionId, POSTListListIdAddItemRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling pOSTListListIdAddItem");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contentType' when calling pOSTListListIdAddItem");
        }
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling pOSTListListIdAddItem");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response> localReturnType = new ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response>() {};
        return apiClient.invokeAPI("/list/{list_id}/add_item", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Clear List
     * Clear all of the items from a list.
     * <p><b>201</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param listId  (required)
     * @param confirm  (required)
     * @param sessionId  (required)
     * @return POSTAuthenticationSessionConvert4401Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public POSTAuthenticationSessionConvert4401Response pOSTListListIdClear(String listId, Boolean confirm, String sessionId) throws RestClientException {
        return pOSTListListIdClearWithHttpInfo(listId, confirm, sessionId).getBody();
    }

    /**
     * Clear List
     * Clear all of the items from a list.
     * <p><b>201</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param listId  (required)
     * @param confirm  (required)
     * @param sessionId  (required)
     * @return ResponseEntity&lt;POSTAuthenticationSessionConvert4401Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<POSTAuthenticationSessionConvert4401Response> pOSTListListIdClearWithHttpInfo(String listId, Boolean confirm, String sessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling pOSTListListIdClear");
        }
        
        // verify the required parameter 'confirm' is set
        if (confirm == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'confirm' when calling pOSTListListIdClear");
        }
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling pOSTListListIdClear");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "confirm", confirm));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response> localReturnType = new ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response>() {};
        return apiClient.invokeAPI("/list/{list_id}/clear", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Remove Movie
     * Remove a movie from a list.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param listId  (required)
     * @param contentType  (required)
     * @param sessionId  (required)
     * @param body  (optional)
     * @return POSTAuthenticationSessionConvert4401Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public POSTAuthenticationSessionConvert4401Response pOSTListListIdRemoveItem(String listId, String contentType, String sessionId, POSTListListIdRemoveItemRequest body) throws RestClientException {
        return pOSTListListIdRemoveItemWithHttpInfo(listId, contentType, sessionId, body).getBody();
    }

    /**
     * Remove Movie
     * Remove a movie from a list.
     * <p><b>200</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param listId  (required)
     * @param contentType  (required)
     * @param sessionId  (required)
     * @param body  (optional)
     * @return ResponseEntity&lt;POSTAuthenticationSessionConvert4401Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<POSTAuthenticationSessionConvert4401Response> pOSTListListIdRemoveItemWithHttpInfo(String listId, String contentType, String sessionId, POSTListListIdRemoveItemRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listId' when calling pOSTListListIdRemoveItem");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contentType' when calling pOSTListListIdRemoveItem");
        }
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling pOSTListListIdRemoveItem");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("list_id", listId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response> localReturnType = new ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response>() {};
        return apiClient.invokeAPI("/list/{list_id}/remove_item", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Rate Movie
     * Rate a movie.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).
     * <p><b>201</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param contentType  (required)
     * @param guestSessionId  (optional)
     * @param sessionId  (optional)
     * @param body  (optional)
     * @return POSTAuthenticationSessionConvert4401Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public POSTAuthenticationSessionConvert4401Response pOSTMovieMovieIdRating(Integer movieId, String contentType, String guestSessionId, String sessionId, POSTMovieMovieIdRatingRequest body) throws RestClientException {
        return pOSTMovieMovieIdRatingWithHttpInfo(movieId, contentType, guestSessionId, sessionId, body).getBody();
    }

    /**
     * Rate Movie
     * Rate a movie.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).
     * <p><b>201</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param movieId  (required)
     * @param contentType  (required)
     * @param guestSessionId  (optional)
     * @param sessionId  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;POSTAuthenticationSessionConvert4401Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<POSTAuthenticationSessionConvert4401Response> pOSTMovieMovieIdRatingWithHttpInfo(Integer movieId, String contentType, String guestSessionId, String sessionId, POSTMovieMovieIdRatingRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'movieId' is set
        if (movieId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movieId' when calling pOSTMovieMovieIdRating");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contentType' when calling pOSTMovieMovieIdRating");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("movie_id", movieId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "guest_session_id", guestSessionId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response> localReturnType = new ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response>() {};
        return apiClient.invokeAPI("/movie/{movie_id}/rating", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Rate TV Show
     * Rate a TV show.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).
     * <p><b>201</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param contentType  (required)
     * @param guestSessionId  (optional)
     * @param sessionId  (optional)
     * @param body  (optional)
     * @return POSTAuthenticationSessionConvert4401Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public POSTAuthenticationSessionConvert4401Response pOSTTvTvIdRating(Integer tvId, String contentType, String guestSessionId, String sessionId, POSTTvTvIdRatingRequest body) throws RestClientException {
        return pOSTTvTvIdRatingWithHttpInfo(tvId, contentType, guestSessionId, sessionId, body).getBody();
    }

    /**
     * Rate TV Show
     * Rate a TV show.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).
     * <p><b>201</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param contentType  (required)
     * @param guestSessionId  (optional)
     * @param sessionId  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;POSTAuthenticationSessionConvert4401Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<POSTAuthenticationSessionConvert4401Response> pOSTTvTvIdRatingWithHttpInfo(Integer tvId, String contentType, String guestSessionId, String sessionId, POSTTvTvIdRatingRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling pOSTTvTvIdRating");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contentType' when calling pOSTTvTvIdRating");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "guest_session_id", guestSessionId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response> localReturnType = new ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/rating", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Rate TV Episode
     * Rate a TV episode.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).
     * <p><b>201</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @param episodeNumber  (required)
     * @param contentType  (required)
     * @param guestSessionId  (optional)
     * @param sessionId  (optional)
     * @param body  (optional)
     * @return POSTAuthenticationSessionConvert4401Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public POSTAuthenticationSessionConvert4401Response pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating(Integer tvId, Integer seasonNumber, Integer episodeNumber, String contentType, String guestSessionId, String sessionId, POSTTvTvIdRatingRequest body) throws RestClientException {
        return pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRatingWithHttpInfo(tvId, seasonNumber, episodeNumber, contentType, guestSessionId, sessionId, body).getBody();
    }

    /**
     * Rate TV Episode
     * Rate a TV episode.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).
     * <p><b>201</b> - 
     * <p><b>401</b> - 
     * <p><b>404</b> - 
     * @param tvId  (required)
     * @param seasonNumber  (required)
     * @param episodeNumber  (required)
     * @param contentType  (required)
     * @param guestSessionId  (optional)
     * @param sessionId  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;POSTAuthenticationSessionConvert4401Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<POSTAuthenticationSessionConvert4401Response> pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRatingWithHttpInfo(Integer tvId, Integer seasonNumber, Integer episodeNumber, String contentType, String guestSessionId, String sessionId, POSTTvTvIdRatingRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'tvId' is set
        if (tvId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tvId' when calling pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating");
        }
        
        // verify the required parameter 'seasonNumber' is set
        if (seasonNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seasonNumber' when calling pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating");
        }
        
        // verify the required parameter 'episodeNumber' is set
        if (episodeNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'episodeNumber' when calling pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contentType' when calling pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tv_id", tvId);
        uriVariables.put("season_number", seasonNumber);
        uriVariables.put("episode_number", episodeNumber);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "guest_session_id", guestSessionId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response> localReturnType = new ParameterizedTypeReference<POSTAuthenticationSessionConvert4401Response>() {};
        return apiClient.invokeAPI("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
