# DefaultApi

All URIs are relative to *https://api.themoviedb.org/3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dELETEAuthenticationSession**](DefaultApi.md#dELETEAuthenticationSession) | **DELETE** /authentication/session | Delete Session |
| [**dELETEListListId**](DefaultApi.md#dELETEListListId) | **DELETE** /list/{list_id} | Delete List |
| [**dELETEMovieMovieIdRating**](DefaultApi.md#dELETEMovieMovieIdRating) | **DELETE** /movie/{movie_id}/rating | Delete Rating |
| [**dELETETvTvIdRating**](DefaultApi.md#dELETETvTvIdRating) | **DELETE** /tv/{tv_id}/rating | Delete Rating |
| [**dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating**](DefaultApi.md#dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating) | **DELETE** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating | Delete Rating |
| [**gETAccount**](DefaultApi.md#gETAccount) | **GET** /account | Get Details |
| [**gETAccountAccountIdFavoriteMovies**](DefaultApi.md#gETAccountAccountIdFavoriteMovies) | **GET** /account/{account_id}/favorite/movies | Get Favorite Movies |
| [**gETAccountAccountIdFavoriteTv**](DefaultApi.md#gETAccountAccountIdFavoriteTv) | **GET** /account/{account_id}/favorite/tv | Get Favorite TV Shows |
| [**gETAccountAccountIdLists**](DefaultApi.md#gETAccountAccountIdLists) | **GET** /account/{account_id}/lists | Get Created Lists |
| [**gETAccountAccountIdRatedMovies**](DefaultApi.md#gETAccountAccountIdRatedMovies) | **GET** /account/{account_id}/rated/movies | Get Rated Movies |
| [**gETAccountAccountIdRatedTv**](DefaultApi.md#gETAccountAccountIdRatedTv) | **GET** /account/{account_id}/rated/tv | Get Rated TV Shows |
| [**gETAccountAccountIdRatedTvEpisodes**](DefaultApi.md#gETAccountAccountIdRatedTvEpisodes) | **GET** /account/{account_id}/rated/tv/episodes | Get Rated TV Episodes |
| [**gETAccountAccountIdWatchlistMovies**](DefaultApi.md#gETAccountAccountIdWatchlistMovies) | **GET** /account/{account_id}/watchlist/movies | Get Movie Watchlist |
| [**gETAccountAccountIdWatchlistTv**](DefaultApi.md#gETAccountAccountIdWatchlistTv) | **GET** /account/{account_id}/watchlist/tv | Get TV Show Watchlist |
| [**gETAuthenticationGuestSessionNew**](DefaultApi.md#gETAuthenticationGuestSessionNew) | **GET** /authentication/guest_session/new | Create Guest Session |
| [**gETAuthenticationTokenNew**](DefaultApi.md#gETAuthenticationTokenNew) | **GET** /authentication/token/new | Create Request Token |
| [**gETCertificationMovieList**](DefaultApi.md#gETCertificationMovieList) | **GET** /certification/movie/list | Get Movie Certifications |
| [**gETCertificationTvList**](DefaultApi.md#gETCertificationTvList) | **GET** /certification/tv/list | Get TV Certifications |
| [**gETCollectionCollectionId**](DefaultApi.md#gETCollectionCollectionId) | **GET** /collection/{collection_id} | Get Details |
| [**gETCollectionCollectionIdImages**](DefaultApi.md#gETCollectionCollectionIdImages) | **GET** /collection/{collection_id}/images | Get Images |
| [**gETCollectionCollectionIdTranslations**](DefaultApi.md#gETCollectionCollectionIdTranslations) | **GET** /collection/{collection_id}/translations | Get Translations |
| [**gETCompanyCompanyId**](DefaultApi.md#gETCompanyCompanyId) | **GET** /company/{company_id} | Get Details |
| [**gETCompanyCompanyIdAlternativeNames**](DefaultApi.md#gETCompanyCompanyIdAlternativeNames) | **GET** /company/{company_id}/alternative_names | Get Alternative Names |
| [**gETCompanyCompanyIdImages**](DefaultApi.md#gETCompanyCompanyIdImages) | **GET** /company/{company_id}/images | Get Images |
| [**gETConfiguration**](DefaultApi.md#gETConfiguration) | **GET** /configuration | Get API Configuration |
| [**gETConfigurationCountries**](DefaultApi.md#gETConfigurationCountries) | **GET** /configuration/countries | Get Countries |
| [**gETConfigurationJobs**](DefaultApi.md#gETConfigurationJobs) | **GET** /configuration/jobs | Get Jobs |
| [**gETConfigurationLanguages**](DefaultApi.md#gETConfigurationLanguages) | **GET** /configuration/languages | Get Languages |
| [**gETConfigurationPrimaryTranslations**](DefaultApi.md#gETConfigurationPrimaryTranslations) | **GET** /configuration/primary_translations | Get Primary Translations |
| [**gETConfigurationTimezones**](DefaultApi.md#gETConfigurationTimezones) | **GET** /configuration/timezones | Get Timezones |
| [**gETCreditCreditId**](DefaultApi.md#gETCreditCreditId) | **GET** /credit/{credit_id} | Get Details |
| [**gETDiscoverMovie**](DefaultApi.md#gETDiscoverMovie) | **GET** /discover/movie | Movie Discover |
| [**gETDiscoverTv**](DefaultApi.md#gETDiscoverTv) | **GET** /discover/tv | TV Discover |
| [**gETFindExternalId**](DefaultApi.md#gETFindExternalId) | **GET** /find/{external_id} | Find by ID |
| [**gETGenreMovieList**](DefaultApi.md#gETGenreMovieList) | **GET** /genre/movie/list | Get Movie List |
| [**gETGenreTvList**](DefaultApi.md#gETGenreTvList) | **GET** /genre/tv/list | Get TV List |
| [**gETGuestSessionGuestSessionIdRatedMovies**](DefaultApi.md#gETGuestSessionGuestSessionIdRatedMovies) | **GET** /guest_session/{guest_session_id}/rated/movies | Get Rated Movies |
| [**gETGuestSessionGuestSessionIdRatedTv**](DefaultApi.md#gETGuestSessionGuestSessionIdRatedTv) | **GET** /guest_session/{guest_session_id}/rated/tv | Get Rated TV Shows |
| [**gETGuestSessionGuestSessionIdRatedTvEpisodes**](DefaultApi.md#gETGuestSessionGuestSessionIdRatedTvEpisodes) | **GET** /guest_session/{guest_session_id}/rated/tv/episodes | Get Rated TV Episodes |
| [**gETKeywordKeywordId**](DefaultApi.md#gETKeywordKeywordId) | **GET** /keyword/{keyword_id} | Get Details |
| [**gETKeywordKeywordIdMovies**](DefaultApi.md#gETKeywordKeywordIdMovies) | **GET** /keyword/{keyword_id}/movies | Get Movies |
| [**gETListListId**](DefaultApi.md#gETListListId) | **GET** /list/{list_id} | Get Details |
| [**gETListListIdItemStatus**](DefaultApi.md#gETListListIdItemStatus) | **GET** /list/{list_id}/item_status | Check Item Status |
| [**gETMovieChanges**](DefaultApi.md#gETMovieChanges) | **GET** /movie/changes | Get Movie Change List |
| [**gETMovieLatest**](DefaultApi.md#gETMovieLatest) | **GET** /movie/latest | Get Latest |
| [**gETMovieMovieId**](DefaultApi.md#gETMovieMovieId) | **GET** /movie/{movie_id} | Get Details |
| [**gETMovieMovieIdAccountStates**](DefaultApi.md#gETMovieMovieIdAccountStates) | **GET** /movie/{movie_id}/account_states | Get Account States |
| [**gETMovieMovieIdAlternativeTitles**](DefaultApi.md#gETMovieMovieIdAlternativeTitles) | **GET** /movie/{movie_id}/alternative_titles | Get Alternative Titles |
| [**gETMovieMovieIdChanges**](DefaultApi.md#gETMovieMovieIdChanges) | **GET** /movie/{movie_id}/changes | Get Changes |
| [**gETMovieMovieIdCredits**](DefaultApi.md#gETMovieMovieIdCredits) | **GET** /movie/{movie_id}/credits | Get Credits |
| [**gETMovieMovieIdExternalIds**](DefaultApi.md#gETMovieMovieIdExternalIds) | **GET** /movie/{movie_id}/external_ids | Get External IDs |
| [**gETMovieMovieIdImages**](DefaultApi.md#gETMovieMovieIdImages) | **GET** /movie/{movie_id}/images | Get Images |
| [**gETMovieMovieIdKeywords**](DefaultApi.md#gETMovieMovieIdKeywords) | **GET** /movie/{movie_id}/keywords | Get Keywords |
| [**gETMovieMovieIdLists**](DefaultApi.md#gETMovieMovieIdLists) | **GET** /movie/{movie_id}/lists | Get Lists |
| [**gETMovieMovieIdRecommendations**](DefaultApi.md#gETMovieMovieIdRecommendations) | **GET** /movie/{movie_id}/recommendations | Get Recommendations |
| [**gETMovieMovieIdReleaseDates**](DefaultApi.md#gETMovieMovieIdReleaseDates) | **GET** /movie/{movie_id}/release_dates | Get Release Dates |
| [**gETMovieMovieIdReviews**](DefaultApi.md#gETMovieMovieIdReviews) | **GET** /movie/{movie_id}/reviews | Get Reviews |
| [**gETMovieMovieIdSimilar**](DefaultApi.md#gETMovieMovieIdSimilar) | **GET** /movie/{movie_id}/similar | Get Similar Movies |
| [**gETMovieMovieIdTranslations**](DefaultApi.md#gETMovieMovieIdTranslations) | **GET** /movie/{movie_id}/translations | Get Translations |
| [**gETMovieMovieIdVideos**](DefaultApi.md#gETMovieMovieIdVideos) | **GET** /movie/{movie_id}/videos | Get Videos |
| [**gETMovieMovieIdWatchProviders**](DefaultApi.md#gETMovieMovieIdWatchProviders) | **GET** /movie/{movie_id}/watch/providers | Get Watch Providers |
| [**gETMovieNowPlaying**](DefaultApi.md#gETMovieNowPlaying) | **GET** /movie/now_playing | Get Now Playing |
| [**gETMoviePopular**](DefaultApi.md#gETMoviePopular) | **GET** /movie/popular | Get Popular |
| [**gETMovieTopRated**](DefaultApi.md#gETMovieTopRated) | **GET** /movie/top_rated | Get Top Rated |
| [**gETMovieUpcoming**](DefaultApi.md#gETMovieUpcoming) | **GET** /movie/upcoming | Get Upcoming |
| [**gETNetworkNetworkId**](DefaultApi.md#gETNetworkNetworkId) | **GET** /network/{network_id} | Get Details |
| [**gETNetworkNetworkIdAlternativeNames**](DefaultApi.md#gETNetworkNetworkIdAlternativeNames) | **GET** /network/{network_id}/alternative_names | Get Alternative Names |
| [**gETNetworkNetworkIdImages**](DefaultApi.md#gETNetworkNetworkIdImages) | **GET** /network/{network_id}/images | Get Images |
| [**gETPersonChanges**](DefaultApi.md#gETPersonChanges) | **GET** /person/changes | Get Person Change List |
| [**gETPersonLatest**](DefaultApi.md#gETPersonLatest) | **GET** /person/latest | Get Latest |
| [**gETPersonPersonId**](DefaultApi.md#gETPersonPersonId) | **GET** /person/{person_id} | Get Details |
| [**gETPersonPersonIdChanges**](DefaultApi.md#gETPersonPersonIdChanges) | **GET** /person/{person_id}/changes | Get Changes |
| [**gETPersonPersonIdCombinedCredits**](DefaultApi.md#gETPersonPersonIdCombinedCredits) | **GET** /person/{person_id}/combined_credits | Get Combined Credits |
| [**gETPersonPersonIdExternalIds**](DefaultApi.md#gETPersonPersonIdExternalIds) | **GET** /person/{person_id}/external_ids | Get External IDs |
| [**gETPersonPersonIdImages**](DefaultApi.md#gETPersonPersonIdImages) | **GET** /person/{person_id}/images | Get Images |
| [**gETPersonPersonIdMovieCredits**](DefaultApi.md#gETPersonPersonIdMovieCredits) | **GET** /person/{person_id}/movie_credits | Get Movie Credits |
| [**gETPersonPersonIdTaggedImages**](DefaultApi.md#gETPersonPersonIdTaggedImages) | **GET** /person/{person_id}/tagged_images | Get Tagged Images |
| [**gETPersonPersonIdTranslations**](DefaultApi.md#gETPersonPersonIdTranslations) | **GET** /person/{person_id}/translations | Get Translations |
| [**gETPersonPersonIdTvCredits**](DefaultApi.md#gETPersonPersonIdTvCredits) | **GET** /person/{person_id}/tv_credits | Get TV Credits |
| [**gETPersonPopular**](DefaultApi.md#gETPersonPopular) | **GET** /person/popular | Get Popular |
| [**gETReviewReviewId**](DefaultApi.md#gETReviewReviewId) | **GET** /review/{review_id} | Get Details |
| [**gETSearchCollection**](DefaultApi.md#gETSearchCollection) | **GET** /search/collection | Search Collections |
| [**gETSearchCompany**](DefaultApi.md#gETSearchCompany) | **GET** /search/company | Search Companies |
| [**gETSearchKeyword**](DefaultApi.md#gETSearchKeyword) | **GET** /search/keyword | Search Keywords |
| [**gETSearchMovie**](DefaultApi.md#gETSearchMovie) | **GET** /search/movie | Search Movies |
| [**gETSearchMulti**](DefaultApi.md#gETSearchMulti) | **GET** /search/multi | Multi Search |
| [**gETSearchPerson**](DefaultApi.md#gETSearchPerson) | **GET** /search/person | Search People |
| [**gETSearchTv**](DefaultApi.md#gETSearchTv) | **GET** /search/tv | Search TV Shows |
| [**gETTvAiringToday**](DefaultApi.md#gETTvAiringToday) | **GET** /tv/airing_today | Get TV Airing Today |
| [**gETTvChanges**](DefaultApi.md#gETTvChanges) | **GET** /tv/changes | Get TV Change List |
| [**gETTvEpisodeEpisodeIdChanges**](DefaultApi.md#gETTvEpisodeEpisodeIdChanges) | **GET** /tv/episode/{episode_id}/changes | Get Changes |
| [**gETTvEpisodeGroupId**](DefaultApi.md#gETTvEpisodeGroupId) | **GET** /tv/episode_group/{id} | Get Details |
| [**gETTvLatest**](DefaultApi.md#gETTvLatest) | **GET** /tv/latest | Get Latest |
| [**gETTvOnTheAir**](DefaultApi.md#gETTvOnTheAir) | **GET** /tv/on_the_air | Get TV On The Air |
| [**gETTvPopular**](DefaultApi.md#gETTvPopular) | **GET** /tv/popular | Get Popular |
| [**gETTvSeasonSeasonIdChanges**](DefaultApi.md#gETTvSeasonSeasonIdChanges) | **GET** /tv/season/{season_id}/changes | Get  Changes |
| [**gETTvTopRated**](DefaultApi.md#gETTvTopRated) | **GET** /tv/top_rated | Get Top Rated |
| [**gETTvTvId**](DefaultApi.md#gETTvTvId) | **GET** /tv/{tv_id} | Get Details |
| [**gETTvTvIdAccountStates**](DefaultApi.md#gETTvTvIdAccountStates) | **GET** /tv/{tv_id}/account_states | Get Account States |
| [**gETTvTvIdAlternativeTitles**](DefaultApi.md#gETTvTvIdAlternativeTitles) | **GET** /tv/{tv_id}/alternative_titles | Get Alternative Titles |
| [**gETTvTvIdChanges**](DefaultApi.md#gETTvTvIdChanges) | **GET** /tv/{tv_id}/changes | Get Changes |
| [**gETTvTvIdContentRatings**](DefaultApi.md#gETTvTvIdContentRatings) | **GET** /tv/{tv_id}/content_ratings | Get Content Ratings |
| [**gETTvTvIdEpisodeGroups**](DefaultApi.md#gETTvTvIdEpisodeGroups) | **GET** /tv/{tv_id}/episode_groups | Get Episode Groups |
| [**gETTvTvIdExternalIds**](DefaultApi.md#gETTvTvIdExternalIds) | **GET** /tv/{tv_id}/external_ids | Get External IDs |
| [**gETTvTvIdImages**](DefaultApi.md#gETTvTvIdImages) | **GET** /tv/{tv_id}/images | Get Images |
| [**gETTvTvIdKeywords**](DefaultApi.md#gETTvTvIdKeywords) | **GET** /tv/{tv_id}/keywords | Get Keywords |
| [**gETTvTvIdRecommendations**](DefaultApi.md#gETTvTvIdRecommendations) | **GET** /tv/{tv_id}/recommendations | Get Recommendations |
| [**gETTvTvIdReviews**](DefaultApi.md#gETTvTvIdReviews) | **GET** /tv/{tv_id}/reviews | Get Reviews |
| [**gETTvTvIdScreenedTheatrically**](DefaultApi.md#gETTvTvIdScreenedTheatrically) | **GET** /tv/{tv_id}/screened_theatrically | Get Screened Theatrically |
| [**gETTvTvIdSeasonSeasonNumberAccountStates**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberAccountStates) | **GET** /tv/{tv_id}/season/{season_number}/account_states | Get Account States |
| [**gETTvTvIdSeasonSeasonNumberCredits**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberCredits) | **GET** /tv/{tv_id}/season/{season_number}/credits | Get Credits |
| [**gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber) | **GET** /tv/{tv_id}/season/{season_number}/episode/{episode_number} | Get Details |
| [**gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates) | **GET** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/account_states | Get Account States |
| [**gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds) | **GET** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/external_ids | Get External IDs |
| [**gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages) | **GET** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/images | Get Images |
| [**gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations) | **GET** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/translations | Get Translations |
| [**gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos) | **GET** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/videos | Get  Videos |
| [**gETTvTvIdSeasonSeasonNumberExternalIds**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberExternalIds) | **GET** /tv/{tv_id}/season/{season_number}/external_ids | Get External IDs |
| [**gETTvTvIdSeasonSeasonNumberImages**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberImages) | **GET** /tv/{tv_id}/season/{season_number}/images | Get Images |
| [**gETTvTvIdSeasonSeasonNumberTranslations**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberTranslations) | **GET** /tv/{tv_id}/season/{season_number}/translations | Get Translations |
| [**gETTvTvIdSeasonSeasonNumberVideos**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberVideos) | **GET** /tv/{tv_id}/season/{season_number}/videos | Get Videos |
| [**gETTvTvIdSimilar**](DefaultApi.md#gETTvTvIdSimilar) | **GET** /tv/{tv_id}/similar | Get Similar TV Shows |
| [**gETTvTvIdTranslations**](DefaultApi.md#gETTvTvIdTranslations) | **GET** /tv/{tv_id}/translations | Get Translations |
| [**gETTvTvIdVideos**](DefaultApi.md#gETTvTvIdVideos) | **GET** /tv/{tv_id}/videos | Get Videos |
| [**gETTvTvIdWatchProviders**](DefaultApi.md#gETTvTvIdWatchProviders) | **GET** /tv/{tv_id}/watch/providers | Get Watch Providers |
| [**gETWatchProvidersMovie**](DefaultApi.md#gETWatchProvidersMovie) | **GET** /watch/providers/movie | Get Movie Providers |
| [**gETWatchProvidersRegions**](DefaultApi.md#gETWatchProvidersRegions) | **GET** /watch/providers/regions | Get Available Regions |
| [**gETWatchProvidersTv**](DefaultApi.md#gETWatchProvidersTv) | **GET** /watch/providers/tv | Get TV Providers |
| [**pOSTAccountAccountIdFavorite**](DefaultApi.md#pOSTAccountAccountIdFavorite) | **POST** /account/{account_id}/favorite | Mark as Favorite |
| [**pOSTAccountAccountIdWatchlist**](DefaultApi.md#pOSTAccountAccountIdWatchlist) | **POST** /account/{account_id}/watchlist | Add to Watchlist |
| [**pOSTAuthenticationSessionConvert4**](DefaultApi.md#pOSTAuthenticationSessionConvert4) | **POST** /authentication/session/convert/4 | Create Session (from v4 access token) |
| [**pOSTAuthenticationSessionNew**](DefaultApi.md#pOSTAuthenticationSessionNew) | **POST** /authentication/session/new | Create Session |
| [**pOSTAuthenticationTokenValidateWithLogin**](DefaultApi.md#pOSTAuthenticationTokenValidateWithLogin) | **POST** /authentication/token/validate_with_login | Create Session With Login |
| [**pOSTList**](DefaultApi.md#pOSTList) | **POST** /list | Create List |
| [**pOSTListListIdAddItem**](DefaultApi.md#pOSTListListIdAddItem) | **POST** /list/{list_id}/add_item | Add Movie |
| [**pOSTListListIdClear**](DefaultApi.md#pOSTListListIdClear) | **POST** /list/{list_id}/clear | Clear List |
| [**pOSTListListIdRemoveItem**](DefaultApi.md#pOSTListListIdRemoveItem) | **POST** /list/{list_id}/remove_item | Remove Movie |
| [**pOSTMovieMovieIdRating**](DefaultApi.md#pOSTMovieMovieIdRating) | **POST** /movie/{movie_id}/rating | Rate Movie |
| [**pOSTTvTvIdRating**](DefaultApi.md#pOSTTvTvIdRating) | **POST** /tv/{tv_id}/rating | Rate TV Show |
| [**pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating**](DefaultApi.md#pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating) | **POST** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating | Rate TV Episode |



## dELETEAuthenticationSession

> DELETEAuthenticationSession200Response dELETEAuthenticationSession(body)

Delete Session

If you would like to delete (or \&quot;logout\&quot;) from a session, call this method with a valid session ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        DELETEAuthenticationSessionRequest body = new DELETEAuthenticationSessionRequest(); // DELETEAuthenticationSessionRequest | 
        try {
            DELETEAuthenticationSession200Response result = apiInstance.dELETEAuthenticationSession(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#dELETEAuthenticationSession");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**DELETEAuthenticationSessionRequest**](DELETEAuthenticationSessionRequest.md)|  | [optional] |

### Return type

[**DELETEAuthenticationSession200Response**](DELETEAuthenticationSession200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## dELETEListListId

> POSTAuthenticationSessionConvert4401Response dELETEListListId(listId, sessionId)

Delete List

Delete a list.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String listId = "listId_example"; // String | 
        String sessionId = "sessionId_example"; // String | 
        try {
            POSTAuthenticationSessionConvert4401Response result = apiInstance.dELETEListListId(listId, sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#dELETEListListId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**|  | |
| **sessionId** | **String**|  | |

### Return type

[**POSTAuthenticationSessionConvert4401Response**](POSTAuthenticationSessionConvert4401Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## dELETEMovieMovieIdRating

> POSTAuthenticationSessionConvert4401Response dELETEMovieMovieIdRating(movieId, contentType, guestSessionId, sessionId)

Delete Rating

Remove your rating for a movie.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer movieId = 56; // Integer | 
        String contentType = "application/json;charset=utf-8"; // String | 
        String guestSessionId = "guestSessionId_example"; // String | 
        String sessionId = "sessionId_example"; // String | 
        try {
            POSTAuthenticationSessionConvert4401Response result = apiInstance.dELETEMovieMovieIdRating(movieId, contentType, guestSessionId, sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#dELETEMovieMovieIdRating");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **movieId** | **Integer**|  | |
| **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8] |
| **guestSessionId** | **String**|  | [optional] |
| **sessionId** | **String**|  | [optional] |

### Return type

[**POSTAuthenticationSessionConvert4401Response**](POSTAuthenticationSessionConvert4401Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |


## dELETETvTvIdRating

> POSTAuthenticationSessionConvert4401Response dELETETvTvIdRating(tvId, contentType, guestSessionId, sessionId)

Delete Rating

Remove your rating for a TV show.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        String contentType = "application/json;charset=utf-8"; // String | 
        String guestSessionId = "guestSessionId_example"; // String | 
        String sessionId = "sessionId_example"; // String | 
        try {
            POSTAuthenticationSessionConvert4401Response result = apiInstance.dELETETvTvIdRating(tvId, contentType, guestSessionId, sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#dELETETvTvIdRating");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |
| **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8] |
| **guestSessionId** | **String**|  | [optional] |
| **sessionId** | **String**|  | [optional] |

### Return type

[**POSTAuthenticationSessionConvert4401Response**](POSTAuthenticationSessionConvert4401Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |


## dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating

> POSTAuthenticationSessionConvert4401Response dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating(tvId, seasonNumber, episodeNumber, contentType, guestSessionId, sessionId)

Delete Rating

Remove your rating for a TV episode.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        Integer seasonNumber = 56; // Integer | 
        Integer episodeNumber = 56; // Integer | 
        String contentType = "application/json;charset=utf-8"; // String | 
        String guestSessionId = "guestSessionId_example"; // String | 
        String sessionId = "sessionId_example"; // String | 
        try {
            POSTAuthenticationSessionConvert4401Response result = apiInstance.dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating(tvId, seasonNumber, episodeNumber, contentType, guestSessionId, sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |
| **seasonNumber** | **Integer**|  | |
| **episodeNumber** | **Integer**|  | |
| **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8] |
| **guestSessionId** | **String**|  | [optional] |
| **sessionId** | **String**|  | [optional] |

### Return type

[**POSTAuthenticationSessionConvert4401Response**](POSTAuthenticationSessionConvert4401Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |


## gETAccount

> GETAccount200Response gETAccount(sessionId)

Get Details

Get your account details.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String sessionId = "sessionId_example"; // String | 
        try {
            GETAccount200Response result = apiInstance.gETAccount(sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETAccount");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**|  | |

### Return type

[**GETAccount200Response**](GETAccount200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETAccountAccountIdFavoriteMovies

> GETMovieMovieIdRecommendations200Response gETAccountAccountIdFavoriteMovies(accountId, sessionId)

Get Favorite Movies

Get the list of your favorite movies.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer accountId = 56; // Integer | 
        String sessionId = "sessionId_example"; // String | 
        try {
            GETMovieMovieIdRecommendations200Response result = apiInstance.gETAccountAccountIdFavoriteMovies(accountId, sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETAccountAccountIdFavoriteMovies");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **Integer**|  | |
| **sessionId** | **String**|  | |

### Return type

[**GETMovieMovieIdRecommendations200Response**](GETMovieMovieIdRecommendations200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETAccountAccountIdFavoriteTv

> GETAccountAccountIdWatchlistTv200Response gETAccountAccountIdFavoriteTv(accountId, sessionId)

Get Favorite TV Shows

Get the list of your favorite TV shows.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer accountId = 56; // Integer | 
        String sessionId = "sessionId_example"; // String | 
        try {
            GETAccountAccountIdWatchlistTv200Response result = apiInstance.gETAccountAccountIdFavoriteTv(accountId, sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETAccountAccountIdFavoriteTv");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **Integer**|  | |
| **sessionId** | **String**|  | |

### Return type

[**GETAccountAccountIdWatchlistTv200Response**](GETAccountAccountIdWatchlistTv200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETAccountAccountIdLists

> GETAccountAccountIdLists200Response gETAccountAccountIdLists(accountId, sessionId, apiKey)

Get Created Lists

Get all of the lists created by an account. Will invlude private lists if you are the owner.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer accountId = 56; // Integer | 
        String sessionId = "sessionId_example"; // String | 
        String apiKey = "apiKey_example"; // String | 
        try {
            GETAccountAccountIdLists200Response result = apiInstance.gETAccountAccountIdLists(accountId, sessionId, apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETAccountAccountIdLists");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **Integer**|  | |
| **sessionId** | **String**|  | |
| **apiKey** | **String**|  | [optional] |

### Return type

[**GETAccountAccountIdLists200Response**](GETAccountAccountIdLists200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETAccountAccountIdRatedMovies

> GETGuestSessionGuestSessionIdRatedMovies200Response gETAccountAccountIdRatedMovies(accountId, sessionId)

Get Rated Movies

Get a list of all the movies you have rated.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer accountId = 56; // Integer | 
        String sessionId = "sessionId_example"; // String | 
        try {
            GETGuestSessionGuestSessionIdRatedMovies200Response result = apiInstance.gETAccountAccountIdRatedMovies(accountId, sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETAccountAccountIdRatedMovies");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **Integer**|  | |
| **sessionId** | **String**|  | |

### Return type

[**GETGuestSessionGuestSessionIdRatedMovies200Response**](GETGuestSessionGuestSessionIdRatedMovies200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETAccountAccountIdRatedTv

> GETGuestSessionGuestSessionIdRatedTv200Response gETAccountAccountIdRatedTv(accountId, sessionId)

Get Rated TV Shows

Get a list of all the TV shows you have rated.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer accountId = 56; // Integer | 
        String sessionId = "sessionId_example"; // String | 
        try {
            GETGuestSessionGuestSessionIdRatedTv200Response result = apiInstance.gETAccountAccountIdRatedTv(accountId, sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETAccountAccountIdRatedTv");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **Integer**|  | |
| **sessionId** | **String**|  | |

### Return type

[**GETGuestSessionGuestSessionIdRatedTv200Response**](GETGuestSessionGuestSessionIdRatedTv200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETAccountAccountIdRatedTvEpisodes

> GETAccountAccountIdRatedTvEpisodes200Response gETAccountAccountIdRatedTvEpisodes(accountId, sessionId)

Get Rated TV Episodes

Get a list of all the TV episodes you have rated.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String accountId = "accountId_example"; // String | 
        String sessionId = "sessionId_example"; // String | 
        try {
            GETAccountAccountIdRatedTvEpisodes200Response result = apiInstance.gETAccountAccountIdRatedTvEpisodes(accountId, sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETAccountAccountIdRatedTvEpisodes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**|  | |
| **sessionId** | **String**|  | |

### Return type

[**GETAccountAccountIdRatedTvEpisodes200Response**](GETAccountAccountIdRatedTvEpisodes200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETAccountAccountIdWatchlistMovies

> GETMovieMovieIdRecommendations200Response gETAccountAccountIdWatchlistMovies(accountId, sessionId)

Get Movie Watchlist

Get a list of all the movies you have added to your watchlist.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer accountId = 56; // Integer | 
        String sessionId = "sessionId_example"; // String | 
        try {
            GETMovieMovieIdRecommendations200Response result = apiInstance.gETAccountAccountIdWatchlistMovies(accountId, sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETAccountAccountIdWatchlistMovies");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **Integer**|  | |
| **sessionId** | **String**|  | |

### Return type

[**GETMovieMovieIdRecommendations200Response**](GETMovieMovieIdRecommendations200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETAccountAccountIdWatchlistTv

> GETAccountAccountIdWatchlistTv200Response gETAccountAccountIdWatchlistTv(accountId, sessionId)

Get TV Show Watchlist

Get a list of all the TV shows you have added to your watchlist.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer accountId = 56; // Integer | 
        String sessionId = "sessionId_example"; // String | 
        try {
            GETAccountAccountIdWatchlistTv200Response result = apiInstance.gETAccountAccountIdWatchlistTv(accountId, sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETAccountAccountIdWatchlistTv");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **Integer**|  | |
| **sessionId** | **String**|  | |

### Return type

[**GETAccountAccountIdWatchlistTv200Response**](GETAccountAccountIdWatchlistTv200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETAuthenticationGuestSessionNew

> GETAuthenticationGuestSessionNew200Response gETAuthenticationGuestSessionNew()

Create Guest Session

This method will let you create a new guest session. Guest sessions are a type of session that will let a user rate movies and TV shows but not require them to have a TMDB user account. More information about user authentication can be found [here](#docTextSection:NSZtgz7zptsiLYxXZ).  Please note, you should only generate a single guest session per user (or device) as you will be able to attach the ratings to a TMDB user account in the future. There is also IP limits in place so you should always make sure it&#39;s the end user doing the guest session actions.  If a guest session is not used for the first time within 24 hours, it will be automatically deleted.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETAuthenticationGuestSessionNew200Response result = apiInstance.gETAuthenticationGuestSessionNew();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETAuthenticationGuestSessionNew");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETAuthenticationGuestSessionNew200Response**](GETAuthenticationGuestSessionNew200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETAuthenticationTokenNew

> POSTAuthenticationTokenValidateWithLogin200Response gETAuthenticationTokenNew()

Create Request Token

Create a temporary request token that can be used to validate a TMDB user login. More details about how this works can be found [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            POSTAuthenticationTokenValidateWithLogin200Response result = apiInstance.gETAuthenticationTokenNew();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETAuthenticationTokenNew");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**POSTAuthenticationTokenValidateWithLogin200Response**](POSTAuthenticationTokenValidateWithLogin200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETCertificationMovieList

> GETCertificationMovieList200Response gETCertificationMovieList()

Get Movie Certifications

Get an up to date list of the officially supported movie certifications on TMDB.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETCertificationMovieList200Response result = apiInstance.gETCertificationMovieList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETCertificationMovieList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETCertificationMovieList200Response**](GETCertificationMovieList200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETCertificationTvList

> GETCertificationTvList200Response gETCertificationTvList()

Get TV Certifications

Get an up to date list of the officially supported TV show certifications on TMDB.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETCertificationTvList200Response result = apiInstance.gETCertificationTvList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETCertificationTvList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETCertificationTvList200Response**](GETCertificationTvList200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETCollectionCollectionId

> GETCollectionCollectionId200Response gETCollectionCollectionId(collectionId)

Get Details

Get collection details by id.  #### Recent Changes  | **Date** | **Change** | | - | - | | March 16, 2018 | Added the [translations](#endpoint:bhcsxEgRvyk3N7FnD) method. |

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer collectionId = 56; // Integer | 
        try {
            GETCollectionCollectionId200Response result = apiInstance.gETCollectionCollectionId(collectionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETCollectionCollectionId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectionId** | **Integer**|  | |

### Return type

[**GETCollectionCollectionId200Response**](GETCollectionCollectionId200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETCollectionCollectionIdImages

> GETCollectionCollectionIdImages200Response gETCollectionCollectionIdImages(collectionId)

Get Images

Get the images for a collection by id.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer collectionId = 56; // Integer | 
        try {
            GETCollectionCollectionIdImages200Response result = apiInstance.gETCollectionCollectionIdImages(collectionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETCollectionCollectionIdImages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectionId** | **Integer**|  | |

### Return type

[**GETCollectionCollectionIdImages200Response**](GETCollectionCollectionIdImages200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETCollectionCollectionIdTranslations

> GETMovieMovieIdTranslations200Response gETCollectionCollectionIdTranslations(collectionId)

Get Translations

Get the list translations for a collection by id.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer collectionId = 56; // Integer | 
        try {
            GETMovieMovieIdTranslations200Response result = apiInstance.gETCollectionCollectionIdTranslations(collectionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETCollectionCollectionIdTranslations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectionId** | **Integer**|  | |

### Return type

[**GETMovieMovieIdTranslations200Response**](GETMovieMovieIdTranslations200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETCompanyCompanyId

> GETCompanyCompanyId200Response gETCompanyCompanyId(companyId)

Get Details

Get a companies details by id.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer companyId = 56; // Integer | 
        try {
            GETCompanyCompanyId200Response result = apiInstance.gETCompanyCompanyId(companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETCompanyCompanyId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyId** | **Integer**|  | |

### Return type

[**GETCompanyCompanyId200Response**](GETCompanyCompanyId200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETCompanyCompanyIdAlternativeNames

> GETCompanyCompanyIdAlternativeNames200Response gETCompanyCompanyIdAlternativeNames(companyId)

Get Alternative Names

Get the alternative names of a company.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer companyId = 56; // Integer | 
        try {
            GETCompanyCompanyIdAlternativeNames200Response result = apiInstance.gETCompanyCompanyIdAlternativeNames(companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETCompanyCompanyIdAlternativeNames");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyId** | **Integer**|  | |

### Return type

[**GETCompanyCompanyIdAlternativeNames200Response**](GETCompanyCompanyIdAlternativeNames200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETCompanyCompanyIdImages

> GETCompanyCompanyIdImages200Response gETCompanyCompanyIdImages(companyId)

Get Images

Get a companies logos by id.  There are two image formats that are supported for companies, PNG&#39;s and SVG&#39;s. You can see which type the original file is by looking at the &#x60;file_type&#x60; field. We prefer SVG&#39;s as they are resolution independent and as such, the width and height are only there to reflect the original asset that was uploaded. An SVG can be scaled properly beyond those dimensions if you call them as a PNG.  For more information about how SVG&#39;s and PNG&#39;s can be used, take a read through [this document](#docTextSection:mXP9B2uzoDJFguDZv).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer companyId = 56; // Integer | 
        try {
            GETCompanyCompanyIdImages200Response result = apiInstance.gETCompanyCompanyIdImages(companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETCompanyCompanyIdImages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyId** | **Integer**|  | |

### Return type

[**GETCompanyCompanyIdImages200Response**](GETCompanyCompanyIdImages200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETConfiguration

> GETConfiguration200Response gETConfiguration(apiKey)

Get API Configuration

Get the system wide configuration information. Some elements of the API require some knowledge of this configuration data. The purpose of this is to try and keep the actual API responses as light as possible. It is recommended you cache this data within your application and check for updates every few days.  This method currently holds the data relevant to building image URLs as well as the change key map.  To build an image URL, you will need 3 pieces of data. The &#x60;base_url&#x60;, &#x60;size&#x60; and &#x60;file_path&#x60;. Simply combine them all and you will have a fully qualified URL. Here’s an example URL:      https://image.tmdb.org/t/p/w500/8uO0gUM8aNqYLs1OsTBQiXu0fEv.jpg  The configuration method also contains the list of change keys which can be useful if you are building an app that consumes data from the change feed.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String apiKey = "apiKey_example"; // String | 
        try {
            GETConfiguration200Response result = apiInstance.gETConfiguration(apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETConfiguration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | [optional] |

### Return type

[**GETConfiguration200Response**](GETConfiguration200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## gETConfigurationCountries

> List&lt;GETConfigurationCountries200ResponseInner&gt; gETConfigurationCountries(apiKey)

Get Countries

Get the list of countries (ISO 3166-1 tags) used throughout TMDB.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String apiKey = "apiKey_example"; // String | 
        try {
            List<GETConfigurationCountries200ResponseInner> result = apiInstance.gETConfigurationCountries(apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETConfigurationCountries");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | [optional] |

### Return type

[**List&lt;GETConfigurationCountries200ResponseInner&gt;**](GETConfigurationCountries200ResponseInner.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## gETConfigurationJobs

> List&lt;GETConfigurationJobs200ResponseInner&gt; gETConfigurationJobs(apiKey)

Get Jobs

Get a list of the jobs and departments we use on TMDB.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String apiKey = "apiKey_example"; // String | 
        try {
            List<GETConfigurationJobs200ResponseInner> result = apiInstance.gETConfigurationJobs(apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETConfigurationJobs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | [optional] |

### Return type

[**List&lt;GETConfigurationJobs200ResponseInner&gt;**](GETConfigurationJobs200ResponseInner.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## gETConfigurationLanguages

> List&lt;GETConfigurationLanguages200ResponseInner&gt; gETConfigurationLanguages(apiKey)

Get Languages

Get the list of languages (ISO 639-1 tags) used throughout TMDB.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String apiKey = "apiKey_example"; // String | 
        try {
            List<GETConfigurationLanguages200ResponseInner> result = apiInstance.gETConfigurationLanguages(apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETConfigurationLanguages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | [optional] |

### Return type

[**List&lt;GETConfigurationLanguages200ResponseInner&gt;**](GETConfigurationLanguages200ResponseInner.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## gETConfigurationPrimaryTranslations

> List&lt;String&gt; gETConfigurationPrimaryTranslations(apiKey)

Get Primary Translations

Get a list of the _officially_ supported translations on TMDB.  While it&#39;s technically possible to add a translation in any one of the [languages](#endpoint:tem8QfFFyAfWodrCv) we have added to TMDB (we don&#39;t restrict content), the ones listed in this method are the ones we also support for localizing the website with which means they are what we refer to as the \&quot;primary\&quot; translations.  These are all specified as [IETF tags](https://en.wikipedia.org/wiki/IETF_language_tag) to identify the languages we use on TMDB. There is one exception which is image languages. They are currently only designated by a ISO-639-1 tag. This is a planned upgrade for the future.  We&#39;re always open to adding more if you think one should be added. You can ask about getting a new primary translation added by posting on [the forums](https://www.themoviedb.org/talk/category/5047951f760ee3318900009a).  One more thing to mention, these are the translations that map to our website translation project. You can view and contribute to that project [here](https://www.localeapp.com/projects/8267).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String apiKey = "apiKey_example"; // String | 
        try {
            List<String> result = apiInstance.gETConfigurationPrimaryTranslations(apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETConfigurationPrimaryTranslations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## gETConfigurationTimezones

> List&lt;GETConfigurationTimezones200ResponseInner&gt; gETConfigurationTimezones(apiKey)

Get Timezones

Get the list of timezones used throughout TMDB.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String apiKey = "apiKey_example"; // String | 
        try {
            List<GETConfigurationTimezones200ResponseInner> result = apiInstance.gETConfigurationTimezones(apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETConfigurationTimezones");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | [optional] |

### Return type

[**List&lt;GETConfigurationTimezones200ResponseInner&gt;**](GETConfigurationTimezones200ResponseInner.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## gETCreditCreditId

> GETCreditCreditId200Response gETCreditCreditId(creditId)

Get Details

Get a movie or TV credit details by id.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 13, 2018 | Movie credits are now supported. |

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String creditId = "creditId_example"; // String | 
        try {
            GETCreditCreditId200Response result = apiInstance.gETCreditCreditId(creditId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETCreditCreditId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **creditId** | **String**|  | |

### Return type

[**GETCreditCreditId200Response**](GETCreditCreditId200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETDiscoverMovie

> GETMoviePopular200Response gETDiscoverMovie(sortBy, certificationCountry, certification, certificationLte, certificationGte, includeAdult, includeVideo, language, page, primaryReleaseYear, primaryReleaseDateGte, primaryReleaseDateLte, releaseDateGte, releaseDateLte, withReleaseType, year, voteCountGte, voteCountLte, voteAverageGte, voteAverageLte, withCast, withCrew, withPeople, withCompanies, withGenres, withoutGenres, withKeywords, withoutKeywords, withRuntimeGte, withRuntimeLte, withOriginalLanguage, withWatchProviders, watchRegion, withWatchMonetizationTypes, withoutCompanies)

Movie Discover

Discover movies by different types of data like average rating, number of votes, genres and certifications. You can get a valid list of certifications from the [certifications list](#endpoint:faFKjuKG2HnwexAWM) method.  Discover also supports a nice list of sort options. See below for all of the available options.  Please note, when using &#x60;certification&#x60; \\ &#x60;certification.lte&#x60; you must also specify &#x60;certification_country&#x60;. These two parameters work together in order to filter the results. You can only filter results with the countries we have added to our [certifications list](#endpoint:faFKjuKG2HnwexAWM).  If you specify the &#x60;region&#x60; parameter, the regional release date will be used instead of the primary release date. The date returned will be the first date based on your query (ie. if a &#x60;with_release_type&#x60; is specified). It&#39;s important to note the order of the release types that are used. Specifying \&quot;2|3\&quot; would return the limited theatrical release date as opposed to \&quot;3|2\&quot; which would return the theatrical date.  Also note that a number of filters support being comma (&#x60;,&#x60;) or pipe (&#x60;|&#x60;) separated. Comma&#39;s are treated like an &#x60;AND&#x60; and query while pipe&#39;s are an &#x60;OR&#x60;.   Some examples of what can be done with discover can be found [here](https://www.themoviedb.org/documentation/api/discover).  #### Recent Changes  | **Date** | **Change** | | - | - | | November 18, 2021 | A new &#x60;without_companies&#x60; filter is available.| | April 13, 2021 | A new &#x60;with_watch_monetization_types&#x60; filter is available to use with &#x60;watch_region&#x60;.| | January 2, 2021 | A new set of filters are available for watch provider filtering. Check out &#x60;with_watch_providers&#x60; and &#x60;watch_region&#x60;.|

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String sortBy = ""; // String | Choose from one of the many available sort options.
        String certificationCountry = "certificationCountry_example"; // String | Used in conjunction with the certification filter, use this to specify a country with a valid certification.
        String certification = "certification_example"; // String | Filter results with a valid certification from the 'certification_country' field.
        String certificationLte = "certificationLte_example"; // String | Filter and only include movies that have a certification that is less than or equal to the specified value.
        String certificationGte = "certificationGte_example"; // String | Filter and only include movies that have a certification that is greater than or equal to the specified value.
        Boolean includeAdult = false; // Boolean | A filter and include or exclude adult movies.
        Boolean includeVideo = false; // Boolean | A filter to include or exclude videos.
        String language = "en-US"; // String | Specify a language to query translatable fields with.
        Integer page = 1; // Integer | Specify the page of results to query.
        Integer primaryReleaseYear = 56; // Integer | A filter to limit the results to a specific primary release year.
        LocalDate primaryReleaseDateGte = LocalDate.now(); // LocalDate | Filter and only include movies that have a primary release date that is greater or equal to the specified value.
        LocalDate primaryReleaseDateLte = LocalDate.now(); // LocalDate | Filter and only include movies that have a primary release date that is less than or equal to the specified value.
        LocalDate releaseDateGte = LocalDate.now(); // LocalDate | Filter and only include movies that have a release date (looking at all release dates) that is greater or equal to the specified value.
        LocalDate releaseDateLte = LocalDate.now(); // LocalDate | Filter and only include movies that have a release date (looking at all release dates) that is less than or equal to the specified value.
        Integer withReleaseType = 56; // Integer | Specify a comma (AND) or pipe (OR) separated value to filter release types by. These release types map to the same values found on the movie release date method.
        Integer year = 56; // Integer | A filter to limit the results to a specific year (looking at all release dates).
        Integer voteCountGte = 56; // Integer | Filter and only include movies that have a vote count that is greater or equal to the specified value.
        Integer voteCountLte = 56; // Integer | Filter and only include movies that have a vote count that is less than or equal to the specified value.
        BigDecimal voteAverageGte = new BigDecimal(78); // BigDecimal | Filter and only include movies that have a rating that is greater or equal to the specified value.
        BigDecimal voteAverageLte = new BigDecimal(78); // BigDecimal | Filter and only include movies that have a rating that is less than or equal to the specified value.
        String withCast = "withCast_example"; // String | A comma separated list of person ID's. Only include movies that have one of the ID's added as an actor.
        String withCrew = "withCrew_example"; // String | A comma separated list of person ID's. Only include movies that have one of the ID's added as a crew member.
        String withPeople = "withPeople_example"; // String | A comma separated list of person ID's. Only include movies that have one of the ID's added as a either a actor or a crew member.
        String withCompanies = "withCompanies_example"; // String | A comma separated list of production company ID's. Only include movies that have one of the ID's added as a production company.
        String withGenres = "withGenres_example"; // String | Comma separated value of genre ids that you want to include in the results.
        String withoutGenres = "withoutGenres_example"; // String | Comma separated value of genre ids that you want to exclude from the results.
        String withKeywords = "withKeywords_example"; // String | A comma separated list of keyword ID's. Only includes movies that have one of the ID's added as a keyword.
        String withoutKeywords = "withoutKeywords_example"; // String | Exclude items with certain keywords. You can comma and pipe seperate these values to create an 'AND' or 'OR' logic.
        Integer withRuntimeGte = 56; // Integer | Filter and only include movies that have a runtime that is greater or equal to a value.
        Integer withRuntimeLte = 56; // Integer | Filter and only include movies that have a runtime that is less than or equal to a value.
        String withOriginalLanguage = "withOriginalLanguage_example"; // String | Specify an ISO 639-1 string to filter results by their original language value.
        String withWatchProviders = "withWatchProviders_example"; // String | A comma or pipe separated list of watch provider ID's. Combine this filter with `watch_region` in order to filter your results by a specific watch provider in a specific region.
        String watchRegion = "watchRegion_example"; // String | An ISO 3166-1 code. Combine this filter with `with_watch_providers` in order to filter your results by a specific watch provider in a specific region.
        String withWatchMonetizationTypes = "flatrate"; // String | In combination with `watch_region`, you can filter by monetization type.
        String withoutCompanies = "withoutCompanies_example"; // String | Filter the results to exclude the specific production companies you specify here. `AND` / `OR` filters are supported.
        try {
            GETMoviePopular200Response result = apiInstance.gETDiscoverMovie(sortBy, certificationCountry, certification, certificationLte, certificationGte, includeAdult, includeVideo, language, page, primaryReleaseYear, primaryReleaseDateGte, primaryReleaseDateLte, releaseDateGte, releaseDateLte, withReleaseType, year, voteCountGte, voteCountLte, voteAverageGte, voteAverageLte, withCast, withCrew, withPeople, withCompanies, withGenres, withoutGenres, withKeywords, withoutKeywords, withRuntimeGte, withRuntimeLte, withOriginalLanguage, withWatchProviders, watchRegion, withWatchMonetizationTypes, withoutCompanies);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETDiscoverMovie");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sortBy** | **String**| Choose from one of the many available sort options. | [optional] [default to popularity.desc] [enum: , popularity.asc, popularity.desc, release_date.asc, release_date.desc, revenue.asc, revenue.desc, primary_release_date.asc, primary_release_date.desc, original_title.asc, original_title.desc, vote_average.asc, vote_average.desc, vote_count.asc, vote_count.desc] |
| **certificationCountry** | **String**| Used in conjunction with the certification filter, use this to specify a country with a valid certification. | [optional] |
| **certification** | **String**| Filter results with a valid certification from the &#39;certification_country&#39; field. | [optional] |
| **certificationLte** | **String**| Filter and only include movies that have a certification that is less than or equal to the specified value. | [optional] |
| **certificationGte** | **String**| Filter and only include movies that have a certification that is greater than or equal to the specified value. | [optional] |
| **includeAdult** | **Boolean**| A filter and include or exclude adult movies. | [optional] [default to false] |
| **includeVideo** | **Boolean**| A filter to include or exclude videos. | [optional] [default to false] |
| **language** | **String**| Specify a language to query translatable fields with. | [optional] [default to en-US] |
| **page** | **Integer**| Specify the page of results to query. | [optional] [default to 1] |
| **primaryReleaseYear** | **Integer**| A filter to limit the results to a specific primary release year. | [optional] |
| **primaryReleaseDateGte** | **LocalDate**| Filter and only include movies that have a primary release date that is greater or equal to the specified value. | [optional] |
| **primaryReleaseDateLte** | **LocalDate**| Filter and only include movies that have a primary release date that is less than or equal to the specified value. | [optional] |
| **releaseDateGte** | **LocalDate**| Filter and only include movies that have a release date (looking at all release dates) that is greater or equal to the specified value. | [optional] |
| **releaseDateLte** | **LocalDate**| Filter and only include movies that have a release date (looking at all release dates) that is less than or equal to the specified value. | [optional] |
| **withReleaseType** | **Integer**| Specify a comma (AND) or pipe (OR) separated value to filter release types by. These release types map to the same values found on the movie release date method. | [optional] |
| **year** | **Integer**| A filter to limit the results to a specific year (looking at all release dates). | [optional] |
| **voteCountGte** | **Integer**| Filter and only include movies that have a vote count that is greater or equal to the specified value. | [optional] |
| **voteCountLte** | **Integer**| Filter and only include movies that have a vote count that is less than or equal to the specified value. | [optional] |
| **voteAverageGte** | **BigDecimal**| Filter and only include movies that have a rating that is greater or equal to the specified value. | [optional] |
| **voteAverageLte** | **BigDecimal**| Filter and only include movies that have a rating that is less than or equal to the specified value. | [optional] |
| **withCast** | **String**| A comma separated list of person ID&#39;s. Only include movies that have one of the ID&#39;s added as an actor. | [optional] |
| **withCrew** | **String**| A comma separated list of person ID&#39;s. Only include movies that have one of the ID&#39;s added as a crew member. | [optional] |
| **withPeople** | **String**| A comma separated list of person ID&#39;s. Only include movies that have one of the ID&#39;s added as a either a actor or a crew member. | [optional] |
| **withCompanies** | **String**| A comma separated list of production company ID&#39;s. Only include movies that have one of the ID&#39;s added as a production company. | [optional] |
| **withGenres** | **String**| Comma separated value of genre ids that you want to include in the results. | [optional] |
| **withoutGenres** | **String**| Comma separated value of genre ids that you want to exclude from the results. | [optional] |
| **withKeywords** | **String**| A comma separated list of keyword ID&#39;s. Only includes movies that have one of the ID&#39;s added as a keyword. | [optional] |
| **withoutKeywords** | **String**| Exclude items with certain keywords. You can comma and pipe seperate these values to create an &#39;AND&#39; or &#39;OR&#39; logic. | [optional] |
| **withRuntimeGte** | **Integer**| Filter and only include movies that have a runtime that is greater or equal to a value. | [optional] |
| **withRuntimeLte** | **Integer**| Filter and only include movies that have a runtime that is less than or equal to a value. | [optional] |
| **withOriginalLanguage** | **String**| Specify an ISO 639-1 string to filter results by their original language value. | [optional] |
| **withWatchProviders** | **String**| A comma or pipe separated list of watch provider ID&#39;s. Combine this filter with &#x60;watch_region&#x60; in order to filter your results by a specific watch provider in a specific region. | [optional] |
| **watchRegion** | **String**| An ISO 3166-1 code. Combine this filter with &#x60;with_watch_providers&#x60; in order to filter your results by a specific watch provider in a specific region. | [optional] |
| **withWatchMonetizationTypes** | **String**| In combination with &#x60;watch_region&#x60;, you can filter by monetization type. | [optional] [enum: flatrate, free, ads, rent, buy] |
| **withoutCompanies** | **String**| Filter the results to exclude the specific production companies you specify here. &#x60;AND&#x60; / &#x60;OR&#x60; filters are supported. | [optional] |

### Return type

[**GETMoviePopular200Response**](GETMoviePopular200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETDiscoverTv

> GETDiscoverTv200Response gETDiscoverTv(sortBy, airDateGte, airDateLte, firstAirDateGte, firstAirDateLte, firstAirDateYear, language, page, timezone, voteAverageGte, voteCountGte, withGenres, withNetworks, withoutGenres, withRuntimeGte, withRuntimeLte, includeNullFirstAirDates, withOriginalLanguage, withoutKeywords, screenedTheatrically, withCompanies, withKeywords, withWatchProviders, watchRegion, withWatchMonetizationTypes, withStatus, withType, withoutCompanies)

TV Discover

Discover TV shows by different types of data like average rating, number of votes, genres, the network they aired on and air dates.  Discover also supports a nice list of sort options. See below for all of the available options.  Also note that a number of filters support being comma (&#x60;,&#x60;) or pipe (&#x60;|&#x60;) separated. Comma&#39;s are treated like an &#x60;AND&#x60; and query while pipe&#39;s are an &#x60;OR&#x60;.   Some examples of what can be done with discover can be found [here](https://www.themoviedb.org/documentation/api/discover).  #### Recent Changes  | **Date** | **Change** | | - | - | | November 18, 2021 | Some new filters are available: &#x60;with_status&#x60;, &#x60;with_type&#x60; and &#x60;without_companies&#x60;.| | April 13, 2021 | A new &#x60;with_watch_monetization_types&#x60; filter is available to use with &#x60;watch_region&#x60;.| | January 2, 2021 | A new set of filters are available for watch provider filtering. Check out &#x60;with_watch_providers&#x60; and &#x60;watch_region&#x60;.|

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String sortBy = ""; // String | Choose from one of the many available sort options.
        LocalDate airDateGte = LocalDate.now(); // LocalDate | Filter and only include TV shows that have a air date (by looking at all episodes) that is greater or equal to the specified value.
        LocalDate airDateLte = LocalDate.now(); // LocalDate | Filter and only include TV shows that have a air date (by looking at all episodes) that is less than or equal to the specified value.
        LocalDate firstAirDateGte = LocalDate.now(); // LocalDate | Filter and only include TV shows that have a original air date that is greater or equal to the specified value. Can be used in conjunction with the \"include_null_first_air_dates\" filter if you want to include items with no air date.
        LocalDate firstAirDateLte = LocalDate.now(); // LocalDate | Filter and only include TV shows that have a original air date that is less than or equal to the specified value. Can be used in conjunction with the \"include_null_first_air_dates\" filter if you want to include items with no air date.
        Integer firstAirDateYear = 56; // Integer | Filter and only include TV shows that have a original air date year that equal to the specified value. Can be used in conjunction with the \"include_null_first_air_dates\" filter if you want to include items with no air date.
        String language = "en-US"; // String | Specify a language to query translatable fields with.
        Integer page = 1; // Integer | Specify the page of results to query.
        String timezone = "America/New_York"; // String | Used in conjunction with the air_date.gte/lte filter to calculate the proper UTC offset.
        BigDecimal voteAverageGte = new BigDecimal(78); // BigDecimal | Filter and only include movies that have a rating that is greater or equal to the specified value.
        Integer voteCountGte = 56; // Integer | Filter and only include movies that have a rating that is less than or equal to the specified value.
        String withGenres = "withGenres_example"; // String | Comma separated value of genre ids that you want to include in the results.
        String withNetworks = "withNetworks_example"; // String | Comma separated value of network ids that you want to include in the results.
        String withoutGenres = "withoutGenres_example"; // String | Comma separated value of genre ids that you want to exclude from the results.
        Integer withRuntimeGte = 56; // Integer | Filter and only include TV shows with an episode runtime that is greater than or equal to a value.
        Integer withRuntimeLte = 56; // Integer | Filter and only include TV shows with an episode runtime that is less than or equal to a value.
        Boolean includeNullFirstAirDates = false; // Boolean | Use this filter to include TV shows that don't have an air date while using any of the \"first_air_date\" filters.
        String withOriginalLanguage = "withOriginalLanguage_example"; // String | Specify an ISO 639-1 string to filter results by their original language value.
        String withoutKeywords = "withoutKeywords_example"; // String | Exclude items with certain keywords. You can comma and pipe seperate these values to create an 'AND' or 'OR' logic.
        Boolean screenedTheatrically = true; // Boolean | Filter results to include items that have been screened theatrically.
        String withCompanies = "withCompanies_example"; // String | A comma separated list of production company ID's. Only include movies that have one of the ID's added as a production company.
        String withKeywords = "withKeywords_example"; // String | A comma separated list of keyword ID's. Only includes TV shows that have one of the ID's added as a keyword.
        String withWatchProviders = "withWatchProviders_example"; // String | A comma or pipe separated list of watch provider ID's. Combine this filter with `watch_region` in order to filter your results by a specific watch provider in a specific region.
        String watchRegion = "watchRegion_example"; // String | An ISO 3166-1 code. Combine this filter with `with_watch_providers` in order to filter your results by a specific watch provider in a specific region.
        String withWatchMonetizationTypes = "flatrate"; // String | In combination with `watch_region`, you can filter by monetization type.
        String withStatus = "0"; // String | Filter TV shows by their status.  Returning Series: 0 Planned: 1 In Production: 2 Ended: 3 Cancelled: 4 Pilot: 5
        String withType = "0"; // String | Filter TV shows by their type.  Documentary: 0 News: 1 Miniseries: 2 Reality: 3 Scripted: 4 Talk Show: 5 Video: 6
        String withoutCompanies = "withoutCompanies_example"; // String | Filter the results to exclude the specific production companies you specify here. `AND` / `OR` filters are supported.
        try {
            GETDiscoverTv200Response result = apiInstance.gETDiscoverTv(sortBy, airDateGte, airDateLte, firstAirDateGte, firstAirDateLte, firstAirDateYear, language, page, timezone, voteAverageGte, voteCountGte, withGenres, withNetworks, withoutGenres, withRuntimeGte, withRuntimeLte, includeNullFirstAirDates, withOriginalLanguage, withoutKeywords, screenedTheatrically, withCompanies, withKeywords, withWatchProviders, watchRegion, withWatchMonetizationTypes, withStatus, withType, withoutCompanies);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETDiscoverTv");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sortBy** | **String**| Choose from one of the many available sort options. | [optional] [default to popularity.desc] [enum: , vote_average.desc, vote_average.asc, first_air_date.desc, first_air_date.asc, popularity.desc, popularity.asc] |
| **airDateGte** | **LocalDate**| Filter and only include TV shows that have a air date (by looking at all episodes) that is greater or equal to the specified value. | [optional] |
| **airDateLte** | **LocalDate**| Filter and only include TV shows that have a air date (by looking at all episodes) that is less than or equal to the specified value. | [optional] |
| **firstAirDateGte** | **LocalDate**| Filter and only include TV shows that have a original air date that is greater or equal to the specified value. Can be used in conjunction with the \&quot;include_null_first_air_dates\&quot; filter if you want to include items with no air date. | [optional] |
| **firstAirDateLte** | **LocalDate**| Filter and only include TV shows that have a original air date that is less than or equal to the specified value. Can be used in conjunction with the \&quot;include_null_first_air_dates\&quot; filter if you want to include items with no air date. | [optional] |
| **firstAirDateYear** | **Integer**| Filter and only include TV shows that have a original air date year that equal to the specified value. Can be used in conjunction with the \&quot;include_null_first_air_dates\&quot; filter if you want to include items with no air date. | [optional] |
| **language** | **String**| Specify a language to query translatable fields with. | [optional] [default to en-US] |
| **page** | **Integer**| Specify the page of results to query. | [optional] [default to 1] |
| **timezone** | **String**| Used in conjunction with the air_date.gte/lte filter to calculate the proper UTC offset. | [optional] [default to America/New_York] |
| **voteAverageGte** | **BigDecimal**| Filter and only include movies that have a rating that is greater or equal to the specified value. | [optional] |
| **voteCountGte** | **Integer**| Filter and only include movies that have a rating that is less than or equal to the specified value. | [optional] |
| **withGenres** | **String**| Comma separated value of genre ids that you want to include in the results. | [optional] |
| **withNetworks** | **String**| Comma separated value of network ids that you want to include in the results. | [optional] |
| **withoutGenres** | **String**| Comma separated value of genre ids that you want to exclude from the results. | [optional] |
| **withRuntimeGte** | **Integer**| Filter and only include TV shows with an episode runtime that is greater than or equal to a value. | [optional] |
| **withRuntimeLte** | **Integer**| Filter and only include TV shows with an episode runtime that is less than or equal to a value. | [optional] |
| **includeNullFirstAirDates** | **Boolean**| Use this filter to include TV shows that don&#39;t have an air date while using any of the \&quot;first_air_date\&quot; filters. | [optional] [default to false] |
| **withOriginalLanguage** | **String**| Specify an ISO 639-1 string to filter results by their original language value. | [optional] |
| **withoutKeywords** | **String**| Exclude items with certain keywords. You can comma and pipe seperate these values to create an &#39;AND&#39; or &#39;OR&#39; logic. | [optional] |
| **screenedTheatrically** | **Boolean**| Filter results to include items that have been screened theatrically. | [optional] |
| **withCompanies** | **String**| A comma separated list of production company ID&#39;s. Only include movies that have one of the ID&#39;s added as a production company. | [optional] |
| **withKeywords** | **String**| A comma separated list of keyword ID&#39;s. Only includes TV shows that have one of the ID&#39;s added as a keyword. | [optional] |
| **withWatchProviders** | **String**| A comma or pipe separated list of watch provider ID&#39;s. Combine this filter with &#x60;watch_region&#x60; in order to filter your results by a specific watch provider in a specific region. | [optional] |
| **watchRegion** | **String**| An ISO 3166-1 code. Combine this filter with &#x60;with_watch_providers&#x60; in order to filter your results by a specific watch provider in a specific region. | [optional] |
| **withWatchMonetizationTypes** | **String**| In combination with &#x60;watch_region&#x60;, you can filter by monetization type. | [optional] [enum: flatrate, free, ads, rent, buy] |
| **withStatus** | **String**| Filter TV shows by their status.  Returning Series: 0 Planned: 1 In Production: 2 Ended: 3 Cancelled: 4 Pilot: 5 | [optional] [enum: 0, 1, 2, 3, 4, 5] |
| **withType** | **String**| Filter TV shows by their type.  Documentary: 0 News: 1 Miniseries: 2 Reality: 3 Scripted: 4 Talk Show: 5 Video: 6 | [optional] [enum: 0, 1, 2, 3, 4, 5, 6] |
| **withoutCompanies** | **String**| Filter the results to exclude the specific production companies you specify here. &#x60;AND&#x60; / &#x60;OR&#x60; filters are supported. | [optional] |

### Return type

[**GETDiscoverTv200Response**](GETDiscoverTv200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETFindExternalId

> GETFindExternalId200Response gETFindExternalId(externalId, externalSource)

Find by ID

The find method makes it easy to search for objects in our database by an external id.  This method will search all objects (movies, TV shows and people) and return the results in a single response.  The supported external sources for each object are as follows.  #### Media Databases  |              | Movies | TV Shows | TV Seasons | TV Episodes | People | | ------------ | ------ | -------- | ---------- | ----------- | ------ | | IMDb ID      | ✓      | ✓        | ✗          | ✓           | ✓      | | TVDB ID      | ✗      | ✓        | ✓          | ✓           | ✗      | | Freebase MID*| ✗      | ✓        | ✓          | ✓           | ✓      | | Freebase ID* | ✗      | ✓        | ✓          | ✓           | ✓      | | TVRage ID*   | ✗      | ✓        | ✓          | ✓           | ✓      |  #### Social IDs  |              | Movies | TV Shows | TV Seasons | TV Episodes | People | | ------------ | ------ | -------- | ---------- | ----------- | ------ | | Facebook     | ✓      | ✓        | ✗          | ✗           | ✓      | | Instagram    | ✓      | ✓        | ✗          | ✗           | ✓      | | Twitter      | ✓      | ✓        | ✗          | ✗           | ✓      |  *Defunct or no longer available as a service.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String externalId = "externalId_example"; // String | 
        String externalSource = "imdb_id"; // String | 
        try {
            GETFindExternalId200Response result = apiInstance.gETFindExternalId(externalId, externalSource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETFindExternalId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **externalId** | **String**|  | |
| **externalSource** | **String**|  | [enum: imdb_id, freebase_mid, freebase_id, tvdb_id, tvrage_id, facebook_id, twitter_id, instagram_id] |

### Return type

[**GETFindExternalId200Response**](GETFindExternalId200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETGenreMovieList

> GETGenreTvList200Response gETGenreMovieList(language)

Get Movie List

Get the list of official genres for movies.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String language = "language_example"; // String | 
        try {
            GETGenreTvList200Response result = apiInstance.gETGenreMovieList(language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETGenreMovieList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **language** | **String**|  | [optional] |

### Return type

[**GETGenreTvList200Response**](GETGenreTvList200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETGenreTvList

> GETGenreTvList200Response gETGenreTvList()

Get TV List

Get the list of official genres for TV shows.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETGenreTvList200Response result = apiInstance.gETGenreTvList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETGenreTvList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETGenreTvList200Response**](GETGenreTvList200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETGuestSessionGuestSessionIdRatedMovies

> GETGuestSessionGuestSessionIdRatedMovies200Response gETGuestSessionGuestSessionIdRatedMovies(guestSessionId)

Get Rated Movies

Get the rated movies for a guest session.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String guestSessionId = "guestSessionId_example"; // String | 
        try {
            GETGuestSessionGuestSessionIdRatedMovies200Response result = apiInstance.gETGuestSessionGuestSessionIdRatedMovies(guestSessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETGuestSessionGuestSessionIdRatedMovies");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **guestSessionId** | **String**|  | |

### Return type

[**GETGuestSessionGuestSessionIdRatedMovies200Response**](GETGuestSessionGuestSessionIdRatedMovies200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETGuestSessionGuestSessionIdRatedTv

> GETGuestSessionGuestSessionIdRatedTv200Response gETGuestSessionGuestSessionIdRatedTv(guestSessionId)

Get Rated TV Shows

Get the rated TV shows for a guest session.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String guestSessionId = "guestSessionId_example"; // String | 
        try {
            GETGuestSessionGuestSessionIdRatedTv200Response result = apiInstance.gETGuestSessionGuestSessionIdRatedTv(guestSessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETGuestSessionGuestSessionIdRatedTv");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **guestSessionId** | **String**|  | |

### Return type

[**GETGuestSessionGuestSessionIdRatedTv200Response**](GETGuestSessionGuestSessionIdRatedTv200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETGuestSessionGuestSessionIdRatedTvEpisodes

> GETGuestSessionGuestSessionIdRatedTvEpisodes200Response gETGuestSessionGuestSessionIdRatedTvEpisodes(guestSessionId)

Get Rated TV Episodes

Get the rated TV episodes for a guest session.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String guestSessionId = "guestSessionId_example"; // String | 
        try {
            GETGuestSessionGuestSessionIdRatedTvEpisodes200Response result = apiInstance.gETGuestSessionGuestSessionIdRatedTvEpisodes(guestSessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETGuestSessionGuestSessionIdRatedTvEpisodes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **guestSessionId** | **String**|  | |

### Return type

[**GETGuestSessionGuestSessionIdRatedTvEpisodes200Response**](GETGuestSessionGuestSessionIdRatedTvEpisodes200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETKeywordKeywordId

> GETSearchKeyword200ResponseResultsInner gETKeywordKeywordId(keywordId)

Get Details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer keywordId = 56; // Integer | 
        try {
            GETSearchKeyword200ResponseResultsInner result = apiInstance.gETKeywordKeywordId(keywordId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETKeywordKeywordId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keywordId** | **Integer**|  | |

### Return type

[**GETSearchKeyword200ResponseResultsInner**](GETSearchKeyword200ResponseResultsInner.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETKeywordKeywordIdMovies

> GETKeywordKeywordIdMovies200Response gETKeywordKeywordIdMovies(keywordId)

Get Movies

Get the movies that belong to a keyword.  We **highly recommend** using [movie discover](#endpoint:p5NyoR7dM842S8G9j) instead of this method as it is much more flexible.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer keywordId = 56; // Integer | 
        try {
            GETKeywordKeywordIdMovies200Response result = apiInstance.gETKeywordKeywordIdMovies(keywordId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETKeywordKeywordIdMovies");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keywordId** | **Integer**|  | |

### Return type

[**GETKeywordKeywordIdMovies200Response**](GETKeywordKeywordIdMovies200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETListListId

> GETListListId200Response gETListListId(listId)

Get Details

Get the details of a list.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String listId = "listId_example"; // String | 
        try {
            GETListListId200Response result = apiInstance.gETListListId(listId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETListListId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**|  | |

### Return type

[**GETListListId200Response**](GETListListId200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETListListIdItemStatus

> GETListListIdItemStatus200Response gETListListIdItemStatus(listId, movieId)

Check Item Status

You can use this method to check if a movie has already been added to the list.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String listId = "listId_example"; // String | 
        Integer movieId = 56; // Integer | 
        try {
            GETListListIdItemStatus200Response result = apiInstance.gETListListIdItemStatus(listId, movieId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETListListIdItemStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**|  | |
| **movieId** | **Integer**|  | |

### Return type

[**GETListListIdItemStatus200Response**](GETListListIdItemStatus200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieChanges

> GETPersonChanges200Response gETMovieChanges()

Get Movie Change List

Get  a list of all of the movie ids that have been changed in the past 24 hours.  You can query it for up to 14 days worth of changed IDs at a time with the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters. 100 items are returned per page.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETPersonChanges200Response result = apiInstance.gETMovieChanges();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieChanges");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETPersonChanges200Response**](GETPersonChanges200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieLatest

> GETMovieLatest200Response gETMovieLatest()

Get Latest

Get the most newly created movie. This is a live response and will continuously change.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETMovieLatest200Response result = apiInstance.gETMovieLatest();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieLatest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETMovieLatest200Response**](GETMovieLatest200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieMovieId

> GETMovieMovieId200Response gETMovieMovieId(movieId)

Get Details

Get the primary information about a movie.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).  #### Recent Changes  | **Date** | **Change** | | - | - | | November 20, 2020 | A &#x60;watch/providers&#x60; method has been added to show what providers (eg. streaming) are available and where.|

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer movieId = 56; // Integer | 
        try {
            GETMovieMovieId200Response result = apiInstance.gETMovieMovieId(movieId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieMovieId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **movieId** | **Integer**|  | |

### Return type

[**GETMovieMovieId200Response**](GETMovieMovieId200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieMovieIdAccountStates

> GETMovieMovieIdAccountStates200Response gETMovieMovieIdAccountStates(movieId, sessionId, guestSessionId)

Get Account States

Grab the following account states for a session:  - Movie rating - If it belongs to your watchlist - If it belongs to your favourite list

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer movieId = 56; // Integer | 
        String sessionId = "sessionId_example"; // String | 
        String guestSessionId = "guestSessionId_example"; // String | 
        try {
            GETMovieMovieIdAccountStates200Response result = apiInstance.gETMovieMovieIdAccountStates(movieId, sessionId, guestSessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieMovieIdAccountStates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **movieId** | **Integer**|  | |
| **sessionId** | **String**|  | [optional] |
| **guestSessionId** | **String**|  | [optional] |

### Return type

[**GETMovieMovieIdAccountStates200Response**](GETMovieMovieIdAccountStates200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieMovieIdAlternativeTitles

> GETMovieMovieIdAlternativeTitles200Response gETMovieMovieIdAlternativeTitles(movieId, country)

Get Alternative Titles

Get all of the alternative titles for a movie.  #### Recent Changes  | **Date** | **Change** | | - | - | | March 16, 2018 | Added the &#x60;type&#x60; field. |

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer movieId = 56; // Integer | 
        String country = "country_example"; // String | 
        try {
            GETMovieMovieIdAlternativeTitles200Response result = apiInstance.gETMovieMovieIdAlternativeTitles(movieId, country);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieMovieIdAlternativeTitles");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **movieId** | **Integer**|  | |
| **country** | **String**|  | [optional] |

### Return type

[**GETMovieMovieIdAlternativeTitles200Response**](GETMovieMovieIdAlternativeTitles200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieMovieIdChanges

> GETMovieMovieIdChanges200Response gETMovieMovieIdChanges(movieId)

Get Changes

Get the changes for a movie. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer movieId = 56; // Integer | 
        try {
            GETMovieMovieIdChanges200Response result = apiInstance.gETMovieMovieIdChanges(movieId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieMovieIdChanges");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **movieId** | **Integer**|  | |

### Return type

[**GETMovieMovieIdChanges200Response**](GETMovieMovieIdChanges200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieMovieIdCredits

> GETMovieMovieIdCredits200Response gETMovieMovieIdCredits(movieId)

Get Credits

Get the cast and crew for a movie.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer movieId = 56; // Integer | 
        try {
            GETMovieMovieIdCredits200Response result = apiInstance.gETMovieMovieIdCredits(movieId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieMovieIdCredits");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **movieId** | **Integer**|  | |

### Return type

[**GETMovieMovieIdCredits200Response**](GETMovieMovieIdCredits200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieMovieIdExternalIds

> GETMovieMovieIdExternalIds200Response gETMovieMovieIdExternalIds(movieId, apiKey)

Get External IDs

Get the external ids for a movie. We currently support the following external sources.  | **Media Databases** | **Social IDs** | | ------------------- | -------------- | | IMDb ID             | Facebook       | |                     | Instagram      | |                     | Twitter        |

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer movieId = 56; // Integer | 
        String apiKey = "apiKey_example"; // String | 
        try {
            GETMovieMovieIdExternalIds200Response result = apiInstance.gETMovieMovieIdExternalIds(movieId, apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieMovieIdExternalIds");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **movieId** | **Integer**|  | |
| **apiKey** | **String**|  | [optional] |

### Return type

[**GETMovieMovieIdExternalIds200Response**](GETMovieMovieIdExternalIds200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieMovieIdImages

> GETMovieMovieIdImages200Response gETMovieMovieIdImages(movieId, includeImageLanguage)

Get Images

Get the images that belong to a movie.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer movieId = 56; // Integer | 
        String includeImageLanguage = "includeImageLanguage_example"; // String | 
        try {
            GETMovieMovieIdImages200Response result = apiInstance.gETMovieMovieIdImages(movieId, includeImageLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieMovieIdImages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **movieId** | **Integer**|  | |
| **includeImageLanguage** | **String**|  | [optional] |

### Return type

[**GETMovieMovieIdImages200Response**](GETMovieMovieIdImages200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieMovieIdKeywords

> GETMovieMovieIdKeywords200Response gETMovieMovieIdKeywords(movieId, apiKey)

Get Keywords

Get the keywords that have been added to a movie.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer movieId = 56; // Integer | 
        String apiKey = "apiKey_example"; // String | 
        try {
            GETMovieMovieIdKeywords200Response result = apiInstance.gETMovieMovieIdKeywords(movieId, apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieMovieIdKeywords");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **movieId** | **Integer**|  | |
| **apiKey** | **String**|  | [optional] |

### Return type

[**GETMovieMovieIdKeywords200Response**](GETMovieMovieIdKeywords200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieMovieIdLists

> GETMovieMovieIdLists200Response gETMovieMovieIdLists(movieId, apiKey)

Get Lists

Get a list of lists that this movie belongs to.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer movieId = 56; // Integer | 
        String apiKey = "apiKey_example"; // String | 
        try {
            GETMovieMovieIdLists200Response result = apiInstance.gETMovieMovieIdLists(movieId, apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieMovieIdLists");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **movieId** | **Integer**|  | |
| **apiKey** | **String**|  | [optional] |

### Return type

[**GETMovieMovieIdLists200Response**](GETMovieMovieIdLists200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieMovieIdRecommendations

> GETMovieMovieIdRecommendations200Response gETMovieMovieIdRecommendations(movieId, apiKey)

Get Recommendations

Get a list of recommended movies for a movie.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer movieId = 56; // Integer | 
        String apiKey = "apiKey_example"; // String | 
        try {
            GETMovieMovieIdRecommendations200Response result = apiInstance.gETMovieMovieIdRecommendations(movieId, apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieMovieIdRecommendations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **movieId** | **Integer**|  | |
| **apiKey** | **String**|  | [optional] |

### Return type

[**GETMovieMovieIdRecommendations200Response**](GETMovieMovieIdRecommendations200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieMovieIdReleaseDates

> GETMovieMovieIdReleaseDates200Response gETMovieMovieIdReleaseDates(movieId, apiKey)

Get Release Dates

Get the release date along with the certification for a movie.  Release dates support different types:  1. Premiere 2. Theatrical (limited) 3. Theatrical 4. Digital 5. Physical 6. TV

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer movieId = 56; // Integer | 
        String apiKey = "apiKey_example"; // String | 
        try {
            GETMovieMovieIdReleaseDates200Response result = apiInstance.gETMovieMovieIdReleaseDates(movieId, apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieMovieIdReleaseDates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **movieId** | **Integer**|  | |
| **apiKey** | **String**|  | [optional] |

### Return type

[**GETMovieMovieIdReleaseDates200Response**](GETMovieMovieIdReleaseDates200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieMovieIdReviews

> GETMovieMovieIdReviews200Response gETMovieMovieIdReviews(movieId, apiKey)

Get Reviews

Get the user reviews for a movie.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer movieId = 56; // Integer | 
        String apiKey = "apiKey_example"; // String | 
        try {
            GETMovieMovieIdReviews200Response result = apiInstance.gETMovieMovieIdReviews(movieId, apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieMovieIdReviews");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **movieId** | **Integer**|  | |
| **apiKey** | **String**|  | [optional] |

### Return type

[**GETMovieMovieIdReviews200Response**](GETMovieMovieIdReviews200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieMovieIdSimilar

> GETMovieMovieIdRecommendations200Response gETMovieMovieIdSimilar(movieId, apiKey)

Get Similar Movies

Get a list of similar movies. This is **not** the same as the \&quot;Recommendation\&quot; system you see on the website.  These items are assembled by looking at keywords and genres.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer movieId = 56; // Integer | 
        String apiKey = "apiKey_example"; // String | 
        try {
            GETMovieMovieIdRecommendations200Response result = apiInstance.gETMovieMovieIdSimilar(movieId, apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieMovieIdSimilar");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **movieId** | **Integer**|  | |
| **apiKey** | **String**|  | [optional] |

### Return type

[**GETMovieMovieIdRecommendations200Response**](GETMovieMovieIdRecommendations200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieMovieIdTranslations

> GETMovieMovieIdTranslations200Response gETMovieMovieIdTranslations(movieId, apiKey)

Get Translations

Get a list of translations that have been created for a movie.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer movieId = 56; // Integer | 
        String apiKey = "apiKey_example"; // String | 
        try {
            GETMovieMovieIdTranslations200Response result = apiInstance.gETMovieMovieIdTranslations(movieId, apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieMovieIdTranslations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **movieId** | **Integer**|  | |
| **apiKey** | **String**|  | [optional] |

### Return type

[**GETMovieMovieIdTranslations200Response**](GETMovieMovieIdTranslations200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieMovieIdVideos

> GETMovieMovieIdVideos200Response gETMovieMovieIdVideos(movieId, apiKey)

Get Videos

Get the videos that have been added to a movie.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 28, 2021 | A new &#x60;include_video_language&#x60; filter is now available. You can use this filter the same way you use &#x60;include_image_language&#x60; on image calls. We also added two new fields, &#x60;official&#x60; and &#x60;published_at&#x60; to the video response. | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot; and \&quot;Bloopers\&quot; were added as valid video types. |

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer movieId = 56; // Integer | 
        String apiKey = "apiKey_example"; // String | 
        try {
            GETMovieMovieIdVideos200Response result = apiInstance.gETMovieMovieIdVideos(movieId, apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieMovieIdVideos");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **movieId** | **Integer**|  | |
| **apiKey** | **String**|  | [optional] |

### Return type

[**GETMovieMovieIdVideos200Response**](GETMovieMovieIdVideos200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieMovieIdWatchProviders

> GETMovieMovieIdWatchProviders200Response gETMovieMovieIdWatchProviders(movieId, apiKey)

Get Watch Providers

Powered by our partnership with JustWatch, you can query this method to get a list of the availabilities per country by provider.  This is **not** going to return full deep links, but rather, it&#39;s just enough information to display what&#39;s available where.  You can link to the provided TMDB URL to help support TMDB and provide the actual deep links to the content.  **Please note**: In order to use this data **you must** attribute the source of the data as JustWatch. If we find any usage not complying with these terms we will revoke access to the API.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer movieId = 56; // Integer | 
        String apiKey = "apiKey_example"; // String | 
        try {
            GETMovieMovieIdWatchProviders200Response result = apiInstance.gETMovieMovieIdWatchProviders(movieId, apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieMovieIdWatchProviders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **movieId** | **Integer**|  | |
| **apiKey** | **String**|  | [optional] |

### Return type

[**GETMovieMovieIdWatchProviders200Response**](GETMovieMovieIdWatchProviders200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieNowPlaying

> GETMovieNowPlaying200Response gETMovieNowPlaying()

Get Now Playing

Get a list of movies in theatres. This is a release type query that looks for all movies that have a release type of 2 or 3 within the specified date range.  You can optionally specify a &#x60;region&#x60; prameter which will narrow the search to only look for theatrical release dates within the specified country.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETMovieNowPlaying200Response result = apiInstance.gETMovieNowPlaying();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieNowPlaying");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETMovieNowPlaying200Response**](GETMovieNowPlaying200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMoviePopular

> GETMoviePopular200Response gETMoviePopular()

Get Popular

Get a list of the current popular movies on TMDB. This list updates daily.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETMoviePopular200Response result = apiInstance.gETMoviePopular();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMoviePopular");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETMoviePopular200Response**](GETMoviePopular200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieTopRated

> GETMoviePopular200Response gETMovieTopRated()

Get Top Rated

Get the top rated movies on TMDB.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETMoviePopular200Response result = apiInstance.gETMovieTopRated();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieTopRated");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETMoviePopular200Response**](GETMoviePopular200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETMovieUpcoming

> GETMovieUpcoming200Response gETMovieUpcoming()

Get Upcoming

Get a list of upcoming movies in theatres. This is a release type query that looks for all movies that have a release type of 2 or 3 within the specified date range.  You can optionally specify a &#x60;region&#x60; prameter which will narrow the search to only look for theatrical release dates within the specified country.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETMovieUpcoming200Response result = apiInstance.gETMovieUpcoming();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETMovieUpcoming");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETMovieUpcoming200Response**](GETMovieUpcoming200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETNetworkNetworkId

> GETNetworkNetworkId200Response gETNetworkNetworkId(networkId)

Get Details

Get the details of a network.  #### Recent Changes  | **Date** | **Change** | | - | - | | November 14, 2020 | The &#x60;logo_path&#x60; has been added to the default response. |

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer networkId = 56; // Integer | 
        try {
            GETNetworkNetworkId200Response result = apiInstance.gETNetworkNetworkId(networkId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETNetworkNetworkId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **networkId** | **Integer**|  | |

### Return type

[**GETNetworkNetworkId200Response**](GETNetworkNetworkId200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETNetworkNetworkIdAlternativeNames

> GETCompanyCompanyIdAlternativeNames200Response gETNetworkNetworkIdAlternativeNames(networkId)

Get Alternative Names

Get the alternative names of a network.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer networkId = 56; // Integer | 
        try {
            GETCompanyCompanyIdAlternativeNames200Response result = apiInstance.gETNetworkNetworkIdAlternativeNames(networkId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETNetworkNetworkIdAlternativeNames");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **networkId** | **Integer**|  | |

### Return type

[**GETCompanyCompanyIdAlternativeNames200Response**](GETCompanyCompanyIdAlternativeNames200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETNetworkNetworkIdImages

> GETCompanyCompanyIdImages200Response gETNetworkNetworkIdImages(networkId)

Get Images

Get the TV network logos by id.  There are two image formats that are supported for networks, PNG&#39;s and SVG&#39;s. You can see which type the original file is by looking at the &#x60;file_type&#x60; field. We prefer SVG&#39;s as they are resolution independent and as such, the width and height are only there to reflect the original asset that was uploaded. An SVG can be scaled properly beyond those dimensions if you call them as a PNG.  For more information about how SVG&#39;s and PNG&#39;s can be used, take a read through [this document](#docTextSection:mXP9B2uzoDJFguDZv).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer networkId = 56; // Integer | 
        try {
            GETCompanyCompanyIdImages200Response result = apiInstance.gETNetworkNetworkIdImages(networkId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETNetworkNetworkIdImages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **networkId** | **Integer**|  | |

### Return type

[**GETCompanyCompanyIdImages200Response**](GETCompanyCompanyIdImages200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETPersonChanges

> GETPersonChanges200Response gETPersonChanges()

Get Person Change List

Get a list of all of the person ids that have been changed in the past 24 hours.  You can query it for up to 14 days worth of changed IDs at a time with the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters. 100 items are returned per page.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETPersonChanges200Response result = apiInstance.gETPersonChanges();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETPersonChanges");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETPersonChanges200Response**](GETPersonChanges200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETPersonLatest

> GETPersonLatest200Response gETPersonLatest()

Get Latest

Get the most newly created person. This is a live response and will continuously change.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETPersonLatest200Response result = apiInstance.gETPersonLatest();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETPersonLatest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETPersonLatest200Response**](GETPersonLatest200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETPersonPersonId

> GETPersonPersonId200Response gETPersonPersonId(personId)

Get Details

Get the primary person details by id.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).  #### Recent Changes  | **Date** | **Change** | | - | - | | July 17, 2018 | Added the &#x60;known_for_department&#x60; field. | | April 26, 2018 | Added the [translations](#endpoint:CSaMjCxXAtGpxNGfS) method. | | November 9, 2016 | Biographies are now translatable on TMDB. This means you can query person details with a language parameter. |

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer personId = 56; // Integer | 
        try {
            GETPersonPersonId200Response result = apiInstance.gETPersonPersonId(personId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETPersonPersonId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **personId** | **Integer**|  | |

### Return type

[**GETPersonPersonId200Response**](GETPersonPersonId200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETPersonPersonIdChanges

> GETPersonPersonIdChanges200Response gETPersonPersonIdChanges(personId)

Get Changes

Get the changes for a person. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer personId = 56; // Integer | 
        try {
            GETPersonPersonIdChanges200Response result = apiInstance.gETPersonPersonIdChanges(personId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETPersonPersonIdChanges");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **personId** | **Integer**|  | |

### Return type

[**GETPersonPersonIdChanges200Response**](GETPersonPersonIdChanges200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETPersonPersonIdCombinedCredits

> GETPersonPersonIdCombinedCredits200Response gETPersonPersonIdCombinedCredits(personId)

Get Combined Credits

Get the movie and TV credits together in a single response.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer personId = 56; // Integer | 
        try {
            GETPersonPersonIdCombinedCredits200Response result = apiInstance.gETPersonPersonIdCombinedCredits(personId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETPersonPersonIdCombinedCredits");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **personId** | **Integer**|  | |

### Return type

[**GETPersonPersonIdCombinedCredits200Response**](GETPersonPersonIdCombinedCredits200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETPersonPersonIdExternalIds

> GETPersonPersonIdExternalIds200Response gETPersonPersonIdExternalIds(personId)

Get External IDs

Get the external ids for a person. We currently support the following external sources.  | **External Sources** | | ------------     | | IMDB ID          | | Facebook         | | Freebase MID     | | Freebase ID      | | Instagram        | | TVRage ID        | | Twitter          |

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer personId = 56; // Integer | 
        try {
            GETPersonPersonIdExternalIds200Response result = apiInstance.gETPersonPersonIdExternalIds(personId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETPersonPersonIdExternalIds");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **personId** | **Integer**|  | |

### Return type

[**GETPersonPersonIdExternalIds200Response**](GETPersonPersonIdExternalIds200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETPersonPersonIdImages

> GETPersonPersonIdImages200Response gETPersonPersonIdImages(personId)

Get Images

Get the images for a person.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer personId = 56; // Integer | 
        try {
            GETPersonPersonIdImages200Response result = apiInstance.gETPersonPersonIdImages(personId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETPersonPersonIdImages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **personId** | **Integer**|  | |

### Return type

[**GETPersonPersonIdImages200Response**](GETPersonPersonIdImages200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETPersonPersonIdMovieCredits

> GETPersonPersonIdMovieCredits200Response gETPersonPersonIdMovieCredits(personId)

Get Movie Credits

Get the movie credits for a person.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer personId = 56; // Integer | 
        try {
            GETPersonPersonIdMovieCredits200Response result = apiInstance.gETPersonPersonIdMovieCredits(personId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETPersonPersonIdMovieCredits");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **personId** | **Integer**|  | |

### Return type

[**GETPersonPersonIdMovieCredits200Response**](GETPersonPersonIdMovieCredits200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETPersonPersonIdTaggedImages

> GETPersonPersonIdTaggedImages200Response gETPersonPersonIdTaggedImages(personId)

Get Tagged Images

Get the images that this person has been tagged in.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer personId = 56; // Integer | 
        try {
            GETPersonPersonIdTaggedImages200Response result = apiInstance.gETPersonPersonIdTaggedImages(personId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETPersonPersonIdTaggedImages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **personId** | **Integer**|  | |

### Return type

[**GETPersonPersonIdTaggedImages200Response**](GETPersonPersonIdTaggedImages200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETPersonPersonIdTranslations

> GETPersonPersonIdTranslations200Response gETPersonPersonIdTranslations(personId)

Get Translations

Get a list of translations that have been created for a person.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer personId = 56; // Integer | 
        try {
            GETPersonPersonIdTranslations200Response result = apiInstance.gETPersonPersonIdTranslations(personId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETPersonPersonIdTranslations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **personId** | **Integer**|  | |

### Return type

[**GETPersonPersonIdTranslations200Response**](GETPersonPersonIdTranslations200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETPersonPersonIdTvCredits

> GETPersonPersonIdTvCredits200Response gETPersonPersonIdTvCredits(personId)

Get TV Credits

Get the TV show credits for a person.  You can query for some extra details about the credit with the [credit method](#endpoint:xPWdEBLkvCNZSicLN).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer personId = 56; // Integer | 
        try {
            GETPersonPersonIdTvCredits200Response result = apiInstance.gETPersonPersonIdTvCredits(personId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETPersonPersonIdTvCredits");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **personId** | **Integer**|  | |

### Return type

[**GETPersonPersonIdTvCredits200Response**](GETPersonPersonIdTvCredits200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETPersonPopular

> GETPersonPopular200Response gETPersonPopular()

Get Popular

Get the list of popular people on TMDB. This list updates daily.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETPersonPopular200Response result = apiInstance.gETPersonPopular();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETPersonPopular");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETPersonPopular200Response**](GETPersonPopular200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETReviewReviewId

> GETReviewReviewId200Response gETReviewReviewId(reviewId)

Get Details

Retrieve the details of a movie or TV show review.  #### Recent Changes  | **Date** | **Change** | | - | - | | November 14, 2020 | A &#x60;author_details&#x60; field has been added to the default response, which includes an &#x60;avatar_path&#x60; and &#x60;rating&#x60; value. |

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String reviewId = "reviewId_example"; // String | 
        try {
            GETReviewReviewId200Response result = apiInstance.gETReviewReviewId(reviewId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETReviewReviewId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reviewId** | **String**|  | |

### Return type

[**GETReviewReviewId200Response**](GETReviewReviewId200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETSearchCollection

> GETSearchCollection200Response gETSearchCollection()

Search Collections

Search for collections.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETSearchCollection200Response result = apiInstance.gETSearchCollection();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETSearchCollection");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETSearchCollection200Response**](GETSearchCollection200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETSearchCompany

> GETSearchKeyword200Response gETSearchCompany()

Search Companies

Search for companies.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETSearchKeyword200Response result = apiInstance.gETSearchCompany();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETSearchCompany");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETSearchKeyword200Response**](GETSearchKeyword200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETSearchKeyword

> GETSearchKeyword200Response gETSearchKeyword()

Search Keywords

Search for keywords.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETSearchKeyword200Response result = apiInstance.gETSearchKeyword();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETSearchKeyword");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETSearchKeyword200Response**](GETSearchKeyword200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETSearchMovie

> GETMoviePopular200Response gETSearchMovie(year, primaryReleaseYear)

Search Movies

Search for movies.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer year = 56; // Integer | 
        Integer primaryReleaseYear = 56; // Integer | 
        try {
            GETMoviePopular200Response result = apiInstance.gETSearchMovie(year, primaryReleaseYear);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETSearchMovie");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **year** | **Integer**|  | [optional] |
| **primaryReleaseYear** | **Integer**|  | [optional] |

### Return type

[**GETMoviePopular200Response**](GETMoviePopular200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETSearchMulti

> GETSearchMulti200Response gETSearchMulti()

Multi Search

Search multiple models in a single request. Multi search currently supports searching for movies, tv shows and people in a single request.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETSearchMulti200Response result = apiInstance.gETSearchMulti();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETSearchMulti");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETSearchMulti200Response**](GETSearchMulti200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETSearchPerson

> GETSearchPerson200Response gETSearchPerson()

Search People

Search for people.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETSearchPerson200Response result = apiInstance.gETSearchPerson();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETSearchPerson");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETSearchPerson200Response**](GETSearchPerson200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETSearchTv

> GETDiscoverTv200Response gETSearchTv(firstAirDateYear)

Search TV Shows

Search for a TV show.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer firstAirDateYear = 56; // Integer | 
        try {
            GETDiscoverTv200Response result = apiInstance.gETSearchTv(firstAirDateYear);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETSearchTv");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **firstAirDateYear** | **Integer**|  | [optional] |

### Return type

[**GETDiscoverTv200Response**](GETDiscoverTv200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvAiringToday

> GETDiscoverTv200Response gETTvAiringToday()

Get TV Airing Today

Get a list of TV shows that are airing today. This query is purely day based as we do not currently support airing times.  You can specify a [timezone](endpoint:KQ4CDdEoWKJYLkrhS) to offset the day calculation. Without a specified timezone, this query defaults to EST (Eastern Time UTC-05:00).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETDiscoverTv200Response result = apiInstance.gETTvAiringToday();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvAiringToday");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETDiscoverTv200Response**](GETDiscoverTv200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvChanges

> GETPersonChanges200Response gETTvChanges()

Get TV Change List

Get a list of all of the TV show ids that have been changed in the past 24 hours.  You can query it for up to 14 days worth of changed IDs at a time with the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters. 100 items are returned per page.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETPersonChanges200Response result = apiInstance.gETTvChanges();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvChanges");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETPersonChanges200Response**](GETPersonChanges200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvEpisodeEpisodeIdChanges

> GETTvEpisodeEpisodeIdChanges200Response gETTvEpisodeEpisodeIdChanges(episodeId)

Get Changes

Get the changes for a TV episode. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer episodeId = 56; // Integer | 
        try {
            GETTvEpisodeEpisodeIdChanges200Response result = apiInstance.gETTvEpisodeEpisodeIdChanges(episodeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvEpisodeEpisodeIdChanges");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **episodeId** | **Integer**|  | |

### Return type

[**GETTvEpisodeEpisodeIdChanges200Response**](GETTvEpisodeEpisodeIdChanges200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvEpisodeGroupId

> GETTvEpisodeGroupId200Response gETTvEpisodeGroupId(id)

Get Details

Get the details of a TV episode group. Groups support 7 different types which are enumerated as the following:  1. Original air date 2. Absolute 3. DVD 4. Digital 5. Story arc 6. Production 7. TV

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            GETTvEpisodeGroupId200Response result = apiInstance.gETTvEpisodeGroupId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvEpisodeGroupId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**GETTvEpisodeGroupId200Response**](GETTvEpisodeGroupId200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvLatest

> GETTvLatest200Response gETTvLatest()

Get Latest

Get the most newly created TV show. This is a live response and will continuously change.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETTvLatest200Response result = apiInstance.gETTvLatest();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvLatest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETTvLatest200Response**](GETTvLatest200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvOnTheAir

> GETDiscoverTv200Response gETTvOnTheAir()

Get TV On The Air

Get a list of shows that are currently on the air.  This query looks for any TV show that has an episode with an air date in the next 7 days.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETDiscoverTv200Response result = apiInstance.gETTvOnTheAir();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvOnTheAir");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETDiscoverTv200Response**](GETDiscoverTv200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvPopular

> GETDiscoverTv200Response gETTvPopular()

Get Popular

Get a list of the current popular TV shows on TMDB. This list updates daily.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETDiscoverTv200Response result = apiInstance.gETTvPopular();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvPopular");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETDiscoverTv200Response**](GETDiscoverTv200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvSeasonSeasonIdChanges

> GETTvSeasonSeasonIdChanges200Response gETTvSeasonSeasonIdChanges(seasonId)

Get  Changes

Get the changes for a TV season. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer seasonId = 56; // Integer | 
        try {
            GETTvSeasonSeasonIdChanges200Response result = apiInstance.gETTvSeasonSeasonIdChanges(seasonId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvSeasonSeasonIdChanges");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **seasonId** | **Integer**|  | |

### Return type

[**GETTvSeasonSeasonIdChanges200Response**](GETTvSeasonSeasonIdChanges200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTopRated

> GETDiscoverTv200Response gETTvTopRated()

Get Top Rated

Get a list of the top rated TV shows on TMDB.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETDiscoverTv200Response result = apiInstance.gETTvTopRated();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTopRated");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETDiscoverTv200Response**](GETDiscoverTv200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvId

> GETTvTvId200Response gETTvTvId(tvId)

Get Details

Get the primary TV show details by id.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).  #### Recent Changes  | **Date** | **Change** | | - | - | | November 20, 2020 | A &#x60;watch/providers&#x60; method has been added to show what providers (eg. streaming) are available and where.| | November 14, 2020 | The &#x60;tagline&#x60; has been added to the default response, and is also available as part of the translations method. | | July 17, 2018 | We now return &#x60;last_episode_to_air&#x60; and &#x60;next_episode_to_air&#x60; fields. | | March 12, 2018 | Networks return proper logos and we introduced SVG support. | | March 8, 2018 | The &#x60;seasons&#x60; field now returns the translated names and overviews. |

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        try {
            GETTvTvId200Response result = apiInstance.gETTvTvId(tvId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |

### Return type

[**GETTvTvId200Response**](GETTvTvId200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdAccountStates

> GETMovieMovieIdAccountStates200Response gETTvTvIdAccountStates(tvId, guestSessionId, sessionId)

Get Account States

Grab the following account states for a session:  - TV show rating - If it belongs to your watchlist - If it belongs to your favourite list

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        String guestSessionId = "guestSessionId_example"; // String | 
        String sessionId = "sessionId_example"; // String | 
        try {
            GETMovieMovieIdAccountStates200Response result = apiInstance.gETTvTvIdAccountStates(tvId, guestSessionId, sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdAccountStates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |
| **guestSessionId** | **String**|  | [optional] |
| **sessionId** | **String**|  | [optional] |

### Return type

[**GETMovieMovieIdAccountStates200Response**](GETMovieMovieIdAccountStates200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdAlternativeTitles

> GETTvTvIdAlternativeTitles200Response gETTvTvIdAlternativeTitles(tvId)

Get Alternative Titles

Returns all of the alternative titles for a TV show.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        try {
            GETTvTvIdAlternativeTitles200Response result = apiInstance.gETTvTvIdAlternativeTitles(tvId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdAlternativeTitles");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |

### Return type

[**GETTvTvIdAlternativeTitles200Response**](GETTvTvIdAlternativeTitles200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdChanges

> GETTvTvIdChanges200Response gETTvTvIdChanges(tvId)

Get Changes

Get the changes for a TV show. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.  TV show changes are different than movie changes in that there are some edits on seasons and episodes that will create a change entry at the show level. These can be found under the season and episode keys. These keys will contain a &#x60;series_id&#x60; and &#x60;episode_id&#x60;. You can use the [season changes](#endpoint:ZqhtyQbJ4YXz8RSya) and [episode changes](#endpoint:FpqrhBzgf2RJv4bHC) methods to look these up individually.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        try {
            GETTvTvIdChanges200Response result = apiInstance.gETTvTvIdChanges(tvId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdChanges");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |

### Return type

[**GETTvTvIdChanges200Response**](GETTvTvIdChanges200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdContentRatings

> GETTvTvIdContentRatings200Response gETTvTvIdContentRatings(tvId)

Get Content Ratings

Get the list of content ratings (certifications) that have been added to a TV show.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        try {
            GETTvTvIdContentRatings200Response result = apiInstance.gETTvTvIdContentRatings(tvId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdContentRatings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |

### Return type

[**GETTvTvIdContentRatings200Response**](GETTvTvIdContentRatings200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdEpisodeGroups

> GETTvTvIdEpisodeGroups200Response gETTvTvIdEpisodeGroups(tvId)

Get Episode Groups

Get all of the episode groups that have been created for a TV show. With a group ID you can call the [get TV episode group details](#endpoint:yCouThc88qs7DGHY5) method.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        try {
            GETTvTvIdEpisodeGroups200Response result = apiInstance.gETTvTvIdEpisodeGroups(tvId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdEpisodeGroups");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |

### Return type

[**GETTvTvIdEpisodeGroups200Response**](GETTvTvIdEpisodeGroups200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdExternalIds

> GETMovieMovieIdExternalIds200Response gETTvTvIdExternalIds(tvId)

Get External IDs

Get the external ids for a TV show. We currently support the following external sources.  | **Media Databases** | **Social IDs** | | ------------------- | -------------- | | IMDb ID             | Facebook       | | TVDB ID             | Instagram      | | Freebase MID*       | Twitter        | | Freebase ID*        |                | | TVRage ID*          |                |  *Defunct or no longer available as a service.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        try {
            GETMovieMovieIdExternalIds200Response result = apiInstance.gETTvTvIdExternalIds(tvId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdExternalIds");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |

### Return type

[**GETMovieMovieIdExternalIds200Response**](GETMovieMovieIdExternalIds200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdImages

> GETTvTvIdImages200Response gETTvTvIdImages(tvId)

Get Images

Get the images that belong to a TV show.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        try {
            GETTvTvIdImages200Response result = apiInstance.gETTvTvIdImages(tvId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdImages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |

### Return type

[**GETTvTvIdImages200Response**](GETTvTvIdImages200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdKeywords

> GETTvTvIdKeywords200Response gETTvTvIdKeywords(tvId)

Get Keywords

Get the keywords that have been added to a TV show.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        try {
            GETTvTvIdKeywords200Response result = apiInstance.gETTvTvIdKeywords(tvId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdKeywords");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |

### Return type

[**GETTvTvIdKeywords200Response**](GETTvTvIdKeywords200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdRecommendations

> GETAccountAccountIdWatchlistTv200Response gETTvTvIdRecommendations(tvId)

Get Recommendations

Get the list of TV show recommendations for this item.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        try {
            GETAccountAccountIdWatchlistTv200Response result = apiInstance.gETTvTvIdRecommendations(tvId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdRecommendations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |

### Return type

[**GETAccountAccountIdWatchlistTv200Response**](GETAccountAccountIdWatchlistTv200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdReviews

> GETTvTvIdReviews200Response gETTvTvIdReviews(tvId)

Get Reviews

Get the reviews for a TV show.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        try {
            GETTvTvIdReviews200Response result = apiInstance.gETTvTvIdReviews(tvId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdReviews");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |

### Return type

[**GETTvTvIdReviews200Response**](GETTvTvIdReviews200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdScreenedTheatrically

> GETTvTvIdScreenedTheatrically200Response gETTvTvIdScreenedTheatrically(tvId)

Get Screened Theatrically

Get a list of seasons or episodes that have been screened in a film festival or theatre.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        try {
            GETTvTvIdScreenedTheatrically200Response result = apiInstance.gETTvTvIdScreenedTheatrically(tvId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdScreenedTheatrically");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |

### Return type

[**GETTvTvIdScreenedTheatrically200Response**](GETTvTvIdScreenedTheatrically200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdSeasonSeasonNumberAccountStates

> GETTvTvIdSeasonSeasonNumberAccountStates200Response gETTvTvIdSeasonSeasonNumberAccountStates(tvId, seasonNumber, guestSessionId, sessionId)

Get Account States

Returns all of the user ratings for the season&#39;s episodes.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        Integer seasonNumber = 56; // Integer | 
        String guestSessionId = "guestSessionId_example"; // String | 
        String sessionId = "sessionId_example"; // String | 
        try {
            GETTvTvIdSeasonSeasonNumberAccountStates200Response result = apiInstance.gETTvTvIdSeasonSeasonNumberAccountStates(tvId, seasonNumber, guestSessionId, sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberAccountStates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |
| **seasonNumber** | **Integer**|  | |
| **guestSessionId** | **String**|  | [optional] |
| **sessionId** | **String**|  | [optional] |

### Return type

[**GETTvTvIdSeasonSeasonNumberAccountStates200Response**](GETTvTvIdSeasonSeasonNumberAccountStates200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdSeasonSeasonNumberCredits

> GETTvTvIdSeasonSeasonNumberCredits200Response gETTvTvIdSeasonSeasonNumberCredits(tvId, seasonNumber)

Get Credits

Get the credits for TV season.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        Integer seasonNumber = 56; // Integer | 
        try {
            GETTvTvIdSeasonSeasonNumberCredits200Response result = apiInstance.gETTvTvIdSeasonSeasonNumberCredits(tvId, seasonNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberCredits");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |
| **seasonNumber** | **Integer**|  | |

### Return type

[**GETTvTvIdSeasonSeasonNumberCredits200Response**](GETTvTvIdSeasonSeasonNumberCredits200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber

> GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber(tvId, seasonNumber, episodeNumber)

Get Details

Get the TV episode details by id.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).  #### Recent Changes  | **Date** | **Change** | | - | - | | June 1, 2018 | Added the [translations](#endpoint:5SFwZar3LkP99QMp7) method. |

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        Integer seasonNumber = 56; // Integer | 
        Integer episodeNumber = 56; // Integer | 
        try {
            GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response result = apiInstance.gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber(tvId, seasonNumber, episodeNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |
| **seasonNumber** | **Integer**|  | |
| **episodeNumber** | **Integer**|  | |

### Return type

[**GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response**](GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates

> GETMovieMovieIdExternalIds200Response gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates(tvId, seasonNumber, episodeNumber, guestSessionId, sessionId)

Get Account States

Get your rating for a episode.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        Integer seasonNumber = 56; // Integer | 
        Integer episodeNumber = 56; // Integer | 
        String guestSessionId = "guestSessionId_example"; // String | 
        String sessionId = "sessionId_example"; // String | 
        try {
            GETMovieMovieIdExternalIds200Response result = apiInstance.gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates(tvId, seasonNumber, episodeNumber, guestSessionId, sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |
| **seasonNumber** | **Integer**|  | |
| **episodeNumber** | **Integer**|  | |
| **guestSessionId** | **String**|  | [optional] |
| **sessionId** | **String**|  | [optional] |

### Return type

[**GETMovieMovieIdExternalIds200Response**](GETMovieMovieIdExternalIds200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds

> GETMovieMovieIdExternalIds200Response gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds(tvId, seasonNumber, episodeNumber)

Get External IDs

Get the external ids for a TV episode. We currently support the following external sources.  | **External Sources** | | -------------------- | | IMDb ID              | | TVDB ID              | | Freebase MID*        | | Freebase ID*         | | TVRage ID*           |  *Defunct or no longer available as a service.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        Integer seasonNumber = 56; // Integer | 
        Integer episodeNumber = 56; // Integer | 
        try {
            GETMovieMovieIdExternalIds200Response result = apiInstance.gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds(tvId, seasonNumber, episodeNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |
| **seasonNumber** | **Integer**|  | |
| **episodeNumber** | **Integer**|  | |

### Return type

[**GETMovieMovieIdExternalIds200Response**](GETMovieMovieIdExternalIds200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages

> GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages200Response gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages(tvId, seasonNumber, episodeNumber)

Get Images

Get the images that belong to a TV episode.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        Integer seasonNumber = 56; // Integer | 
        Integer episodeNumber = 56; // Integer | 
        try {
            GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages200Response result = apiInstance.gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages(tvId, seasonNumber, episodeNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |
| **seasonNumber** | **Integer**|  | |
| **episodeNumber** | **Integer**|  | |

### Return type

[**GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages200Response**](GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations

> GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations(tvId, seasonNumber, episodeNumber)

Get Translations

Get the translation data for an episode.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        Integer seasonNumber = 56; // Integer | 
        Integer episodeNumber = 56; // Integer | 
        try {
            GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response result = apiInstance.gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations(tvId, seasonNumber, episodeNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |
| **seasonNumber** | **Integer**|  | |
| **episodeNumber** | **Integer**|  | |

### Return type

[**GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response**](GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos

> GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos(tvId, seasonNumber, episodeNumber)

Get  Videos

Get the videos that have been added to a TV episode.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 28, 2021 | A new &#x60;include_video_language&#x60; filter is now available. You can use this filter the same way you use &#x60;include_image_language&#x60; on image calls. We also added two new fields, &#x60;official&#x60; and &#x60;published_at&#x60; to the video response. | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot;, \&quot;Bloopers\&quot; and \&quot;Recap\&quot; were added as valid video types. |

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        Integer seasonNumber = 56; // Integer | 
        Integer episodeNumber = 56; // Integer | 
        try {
            GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response result = apiInstance.gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos(tvId, seasonNumber, episodeNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |
| **seasonNumber** | **Integer**|  | |
| **episodeNumber** | **Integer**|  | |

### Return type

[**GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response**](GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdSeasonSeasonNumberExternalIds

> GETMovieMovieIdExternalIds200Response gETTvTvIdSeasonSeasonNumberExternalIds(tvId, seasonNumber)

Get External IDs

Get the external ids for a TV season. We currently support the following external sources.  | **Media Databases** | | ------------------- | | TVDB ID             | | Freebase MID*       | | Freebase ID*        | | TVRage ID*          |  *Defunct or no longer available as a service.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        Integer seasonNumber = 56; // Integer | 
        try {
            GETMovieMovieIdExternalIds200Response result = apiInstance.gETTvTvIdSeasonSeasonNumberExternalIds(tvId, seasonNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberExternalIds");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |
| **seasonNumber** | **Integer**|  | |

### Return type

[**GETMovieMovieIdExternalIds200Response**](GETMovieMovieIdExternalIds200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdSeasonSeasonNumberImages

> GETTvTvIdSeasonSeasonNumberImages200Response gETTvTvIdSeasonSeasonNumberImages(tvId, seasonNumber)

Get Images

Get the images that belong to a TV season.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        Integer seasonNumber = 56; // Integer | 
        try {
            GETTvTvIdSeasonSeasonNumberImages200Response result = apiInstance.gETTvTvIdSeasonSeasonNumberImages(tvId, seasonNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberImages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |
| **seasonNumber** | **Integer**|  | |

### Return type

[**GETTvTvIdSeasonSeasonNumberImages200Response**](GETTvTvIdSeasonSeasonNumberImages200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdSeasonSeasonNumberTranslations

> GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response gETTvTvIdSeasonSeasonNumberTranslations(tvId, seasonNumber)

Get Translations

Get the credits for TV season.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        Integer seasonNumber = 56; // Integer | 
        try {
            GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response result = apiInstance.gETTvTvIdSeasonSeasonNumberTranslations(tvId, seasonNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberTranslations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |
| **seasonNumber** | **Integer**|  | |

### Return type

[**GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response**](GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdSeasonSeasonNumberVideos

> GETMovieMovieIdVideos200Response gETTvTvIdSeasonSeasonNumberVideos(tvId, seasonNumber)

Get Videos

Get the videos that have been added to a TV season.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 28, 2021 | A new &#x60;include_video_language&#x60; filter is now available. You can use this filter the same way you use &#x60;include_image_language&#x60; on image calls. We also added two new fields, &#x60;official&#x60; and &#x60;published_at&#x60; to the video response. | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot; and \&quot;Bloopers\&quot; and \&quot;Recap\&quot; were added as valid video types. |

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        Integer seasonNumber = 56; // Integer | 
        try {
            GETMovieMovieIdVideos200Response result = apiInstance.gETTvTvIdSeasonSeasonNumberVideos(tvId, seasonNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberVideos");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |
| **seasonNumber** | **Integer**|  | |

### Return type

[**GETMovieMovieIdVideos200Response**](GETMovieMovieIdVideos200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdSimilar

> GETAccountAccountIdWatchlistTv200Response gETTvTvIdSimilar(tvId)

Get Similar TV Shows

Get a list of similar TV shows. These items are assembled by looking at keywords and genres.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        try {
            GETAccountAccountIdWatchlistTv200Response result = apiInstance.gETTvTvIdSimilar(tvId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdSimilar");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |

### Return type

[**GETAccountAccountIdWatchlistTv200Response**](GETAccountAccountIdWatchlistTv200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdTranslations

> GETTvTvIdTranslations200Response gETTvTvIdTranslations(tvId)

Get Translations

Get a list of the translations that exist for a TV show.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        try {
            GETTvTvIdTranslations200Response result = apiInstance.gETTvTvIdTranslations(tvId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdTranslations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |

### Return type

[**GETTvTvIdTranslations200Response**](GETTvTvIdTranslations200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdVideos

> GETMovieMovieIdVideos200Response gETTvTvIdVideos(tvId)

Get Videos

Get the videos that have been added to a TV show.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 28, 2021 | A new &#x60;include_video_language&#x60; filter is now available. You can use this filter the same way you use &#x60;include_image_language&#x60; on image calls. We also added two new fields, &#x60;official&#x60; and &#x60;published_at&#x60; to the video response. | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot; and \&quot;Bloopers\&quot; were added as valid video types. |

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        try {
            GETMovieMovieIdVideos200Response result = apiInstance.gETTvTvIdVideos(tvId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdVideos");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |

### Return type

[**GETMovieMovieIdVideos200Response**](GETMovieMovieIdVideos200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETTvTvIdWatchProviders

> GETTvTvIdWatchProviders200Response gETTvTvIdWatchProviders(tvId)

Get Watch Providers

Powered by our partnership with JustWatch, you can query this method to get a list of the availabilities per country by provider.  This is **not** going to return full deep links, but rather, it&#39;s just enough information to display what&#39;s available where.  You can link to the provided TMDB URL to help support TMDB and provide the actual deep links to the content.  **Please note**: In order to use this data **you must** attribute the source of the data as JustWatch. If we find any usage not complying with these terms we will revoke access to the API.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        try {
            GETTvTvIdWatchProviders200Response result = apiInstance.gETTvTvIdWatchProviders(tvId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETTvTvIdWatchProviders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |

### Return type

[**GETTvTvIdWatchProviders200Response**](GETTvTvIdWatchProviders200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETWatchProvidersMovie

> GETWatchProvidersTv200Response gETWatchProvidersMovie(watchRegion)

Get Movie Providers

Returns a list of the watch provider (OTT/streaming) data we have available for movies. You can specify a &#x60;watch_region&#x60; param if you want to further filter the list by country.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String watchRegion = "watchRegion_example"; // String | Use the ISO-3166-1 code to filter the providers that are available in a particular country.
        try {
            GETWatchProvidersTv200Response result = apiInstance.gETWatchProvidersMovie(watchRegion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETWatchProvidersMovie");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **watchRegion** | **String**| Use the ISO-3166-1 code to filter the providers that are available in a particular country. | [optional] |

### Return type

[**GETWatchProvidersTv200Response**](GETWatchProvidersTv200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETWatchProvidersRegions

> GETWatchProvidersRegions200Response gETWatchProvidersRegions()

Get Available Regions

Returns a list of all of the countries we have watch provider (OTT/streaming) data for.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            GETWatchProvidersRegions200Response result = apiInstance.gETWatchProvidersRegions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETWatchProvidersRegions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GETWatchProvidersRegions200Response**](GETWatchProvidersRegions200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## gETWatchProvidersTv

> GETWatchProvidersTv200Response gETWatchProvidersTv(watchRegion)

Get TV Providers

Returns a list of the watch provider (OTT/streaming) data we have available for TV series. You can specify a &#x60;watch_region&#x60; param if you want to further filter the list by country.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String watchRegion = "watchRegion_example"; // String | Use the ISO-3166-1 code to filter the providers that are available in a particular country.
        try {
            GETWatchProvidersTv200Response result = apiInstance.gETWatchProvidersTv(watchRegion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETWatchProvidersTv");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **watchRegion** | **String**| Use the ISO-3166-1 code to filter the providers that are available in a particular country. | [optional] |

### Return type

[**GETWatchProvidersTv200Response**](GETWatchProvidersTv200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## pOSTAccountAccountIdFavorite

> POSTAuthenticationSessionConvert4401Response pOSTAccountAccountIdFavorite(accountId, sessionId, contentType, body)

Mark as Favorite

This method allows you to mark a movie or TV show as a favorite item.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer accountId = 56; // Integer | 
        String sessionId = "sessionId_example"; // String | 
        String contentType = "application/json;charset=utf-8"; // String | 
        POSTAccountAccountIdFavoriteRequest body = new POSTAccountAccountIdFavoriteRequest(); // POSTAccountAccountIdFavoriteRequest | 
        try {
            POSTAuthenticationSessionConvert4401Response result = apiInstance.pOSTAccountAccountIdFavorite(accountId, sessionId, contentType, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#pOSTAccountAccountIdFavorite");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **Integer**|  | |
| **sessionId** | **String**|  | |
| **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8] |
| **body** | [**POSTAccountAccountIdFavoriteRequest**](POSTAccountAccountIdFavoriteRequest.md)|  | [optional] |

### Return type

[**POSTAuthenticationSessionConvert4401Response**](POSTAuthenticationSessionConvert4401Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## pOSTAccountAccountIdWatchlist

> POSTAuthenticationSessionConvert4401Response pOSTAccountAccountIdWatchlist(accountId, contentType, sessionId, body)

Add to Watchlist

Add a movie or TV show to your watchlist.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer accountId = 56; // Integer | 
        String contentType = "application/json;charset=utf-8"; // String | 
        String sessionId = "sessionId_example"; // String | 
        POSTAccountAccountIdWatchlistRequest body = new POSTAccountAccountIdWatchlistRequest(); // POSTAccountAccountIdWatchlistRequest | 
        try {
            POSTAuthenticationSessionConvert4401Response result = apiInstance.pOSTAccountAccountIdWatchlist(accountId, contentType, sessionId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#pOSTAccountAccountIdWatchlist");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **Integer**|  | |
| **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8] |
| **sessionId** | **String**|  | |
| **body** | [**POSTAccountAccountIdWatchlistRequest**](POSTAccountAccountIdWatchlistRequest.md)|  | [optional] |

### Return type

[**POSTAuthenticationSessionConvert4401Response**](POSTAuthenticationSessionConvert4401Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## pOSTAuthenticationSessionConvert4

> POSTAuthenticationSessionConvert4200Response pOSTAuthenticationSessionConvert4(body)

Create Session (from v4 access token)

Use this method to create a v3 session ID if you already have a valid v4 access token. The v4 token needs to be authenticated by the user. Your standard \&quot;read token\&quot; will not validate to create a session ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        POSTAuthenticationSessionConvert4Request body = new POSTAuthenticationSessionConvert4Request(); // POSTAuthenticationSessionConvert4Request | 
        try {
            POSTAuthenticationSessionConvert4200Response result = apiInstance.pOSTAuthenticationSessionConvert4(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#pOSTAuthenticationSessionConvert4");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**POSTAuthenticationSessionConvert4Request**](POSTAuthenticationSessionConvert4Request.md)|  | [optional] |

### Return type

[**POSTAuthenticationSessionConvert4200Response**](POSTAuthenticationSessionConvert4200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## pOSTAuthenticationSessionNew

> POSTAuthenticationSessionConvert4200Response pOSTAuthenticationSessionNew(body)

Create Session

You can use this method to create a fully valid session ID once a user has validated the request token. More information about how this works can be found [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        POSTAuthenticationSessionNewRequest body = new POSTAuthenticationSessionNewRequest(); // POSTAuthenticationSessionNewRequest | 
        try {
            POSTAuthenticationSessionConvert4200Response result = apiInstance.pOSTAuthenticationSessionNew(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#pOSTAuthenticationSessionNew");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**POSTAuthenticationSessionNewRequest**](POSTAuthenticationSessionNewRequest.md)|  | [optional] |

### Return type

[**POSTAuthenticationSessionConvert4200Response**](POSTAuthenticationSessionConvert4200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## pOSTAuthenticationTokenValidateWithLogin

> POSTAuthenticationTokenValidateWithLogin200Response pOSTAuthenticationTokenValidateWithLogin(body)

Create Session With Login

This method allows an application to validate a request token by entering a username and password.  Not all applications have access to a web view so this can be used as a substitute.  Please note, the preferred method of validating a request token is to have a user authenticate the request via the TMDB website. You can read about that method [here](#docTextSection:NSZtgz7zptsiLYxXZ).  If you decide to use this method please **use HTTPS**.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        POSTAuthenticationTokenValidateWithLoginRequest body = new POSTAuthenticationTokenValidateWithLoginRequest(); // POSTAuthenticationTokenValidateWithLoginRequest | 
        try {
            POSTAuthenticationTokenValidateWithLogin200Response result = apiInstance.pOSTAuthenticationTokenValidateWithLogin(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#pOSTAuthenticationTokenValidateWithLogin");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**POSTAuthenticationTokenValidateWithLoginRequest**](POSTAuthenticationTokenValidateWithLoginRequest.md)|  | [optional] |

### Return type

[**POSTAuthenticationTokenValidateWithLogin200Response**](POSTAuthenticationTokenValidateWithLogin200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## pOSTList

> POSTList201Response pOSTList(contentType, sessionId, body)

Create List

Create a list.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String contentType = "application/json;charset=utf-8"; // String | 
        String sessionId = "sessionId_example"; // String | 
        POSTListRequest body = new POSTListRequest(); // POSTListRequest | 
        try {
            POSTList201Response result = apiInstance.pOSTList(contentType, sessionId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#pOSTList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8] |
| **sessionId** | **String**|  | |
| **body** | [**POSTListRequest**](POSTListRequest.md)|  | [optional] |

### Return type

[**POSTList201Response**](POSTList201Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## pOSTListListIdAddItem

> POSTAuthenticationSessionConvert4401Response pOSTListListIdAddItem(listId, contentType, sessionId, body)

Add Movie

Add a movie to a list.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String listId = "listId_example"; // String | 
        String contentType = "application/json;charset=utf-8"; // String | 
        String sessionId = "sessionId_example"; // String | 
        POSTListListIdAddItemRequest body = new POSTListListIdAddItemRequest(); // POSTListListIdAddItemRequest | 
        try {
            POSTAuthenticationSessionConvert4401Response result = apiInstance.pOSTListListIdAddItem(listId, contentType, sessionId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#pOSTListListIdAddItem");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**|  | |
| **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8] |
| **sessionId** | **String**|  | |
| **body** | [**POSTListListIdAddItemRequest**](POSTListListIdAddItemRequest.md)|  | [optional] |

### Return type

[**POSTAuthenticationSessionConvert4401Response**](POSTAuthenticationSessionConvert4401Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## pOSTListListIdClear

> POSTAuthenticationSessionConvert4401Response pOSTListListIdClear(listId, confirm, sessionId)

Clear List

Clear all of the items from a list.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String listId = "listId_example"; // String | 
        Boolean confirm = true; // Boolean | 
        String sessionId = "sessionId_example"; // String | 
        try {
            POSTAuthenticationSessionConvert4401Response result = apiInstance.pOSTListListIdClear(listId, confirm, sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#pOSTListListIdClear");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**|  | |
| **confirm** | **Boolean**|  | |
| **sessionId** | **String**|  | |

### Return type

[**POSTAuthenticationSessionConvert4401Response**](POSTAuthenticationSessionConvert4401Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## pOSTListListIdRemoveItem

> POSTAuthenticationSessionConvert4401Response pOSTListListIdRemoveItem(listId, contentType, sessionId, body)

Remove Movie

Remove a movie from a list.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String listId = "listId_example"; // String | 
        String contentType = "application/json;charset=utf-8"; // String | 
        String sessionId = "sessionId_example"; // String | 
        POSTListListIdRemoveItemRequest body = new POSTListListIdRemoveItemRequest(); // POSTListListIdRemoveItemRequest | 
        try {
            POSTAuthenticationSessionConvert4401Response result = apiInstance.pOSTListListIdRemoveItem(listId, contentType, sessionId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#pOSTListListIdRemoveItem");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**|  | |
| **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8] |
| **sessionId** | **String**|  | |
| **body** | [**POSTListListIdRemoveItemRequest**](POSTListListIdRemoveItemRequest.md)|  | [optional] |

### Return type

[**POSTAuthenticationSessionConvert4401Response**](POSTAuthenticationSessionConvert4401Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## pOSTMovieMovieIdRating

> POSTAuthenticationSessionConvert4401Response pOSTMovieMovieIdRating(movieId, contentType, guestSessionId, sessionId, body)

Rate Movie

Rate a movie.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer movieId = 56; // Integer | 
        String contentType = "application/json;charset=utf-8"; // String | 
        String guestSessionId = "guestSessionId_example"; // String | 
        String sessionId = "sessionId_example"; // String | 
        POSTMovieMovieIdRatingRequest body = new POSTMovieMovieIdRatingRequest(); // POSTMovieMovieIdRatingRequest | 
        try {
            POSTAuthenticationSessionConvert4401Response result = apiInstance.pOSTMovieMovieIdRating(movieId, contentType, guestSessionId, sessionId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#pOSTMovieMovieIdRating");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **movieId** | **Integer**|  | |
| **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8] |
| **guestSessionId** | **String**|  | [optional] |
| **sessionId** | **String**|  | [optional] |
| **body** | [**POSTMovieMovieIdRatingRequest**](POSTMovieMovieIdRatingRequest.md)|  | [optional] |

### Return type

[**POSTAuthenticationSessionConvert4401Response**](POSTAuthenticationSessionConvert4401Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## pOSTTvTvIdRating

> POSTAuthenticationSessionConvert4401Response pOSTTvTvIdRating(tvId, contentType, guestSessionId, sessionId, body)

Rate TV Show

Rate a TV show.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        String contentType = "application/json;charset=utf-8"; // String | 
        String guestSessionId = "guestSessionId_example"; // String | 
        String sessionId = "sessionId_example"; // String | 
        POSTTvTvIdRatingRequest body = new POSTTvTvIdRatingRequest(); // POSTTvTvIdRatingRequest | 
        try {
            POSTAuthenticationSessionConvert4401Response result = apiInstance.pOSTTvTvIdRating(tvId, contentType, guestSessionId, sessionId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#pOSTTvTvIdRating");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |
| **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8] |
| **guestSessionId** | **String**|  | [optional] |
| **sessionId** | **String**|  | [optional] |
| **body** | [**POSTTvTvIdRatingRequest**](POSTTvTvIdRatingRequest.md)|  | [optional] |

### Return type

[**POSTAuthenticationSessionConvert4401Response**](POSTAuthenticationSessionConvert4401Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating

> POSTAuthenticationSessionConvert4401Response pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating(tvId, seasonNumber, episodeNumber, contentType, guestSessionId, sessionId, body)

Rate TV Episode

Rate a TV episode.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.themoviedb.org/3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer tvId = 56; // Integer | 
        Integer seasonNumber = 56; // Integer | 
        Integer episodeNumber = 56; // Integer | 
        String contentType = "application/json;charset=utf-8"; // String | 
        String guestSessionId = "guestSessionId_example"; // String | 
        String sessionId = "sessionId_example"; // String | 
        POSTTvTvIdRatingRequest body = new POSTTvTvIdRatingRequest(); // POSTTvTvIdRatingRequest | 
        try {
            POSTAuthenticationSessionConvert4401Response result = apiInstance.pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating(tvId, seasonNumber, episodeNumber, contentType, guestSessionId, sessionId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tvId** | **Integer**|  | |
| **seasonNumber** | **Integer**|  | |
| **episodeNumber** | **Integer**|  | |
| **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8] |
| **guestSessionId** | **String**|  | [optional] |
| **sessionId** | **String**|  | [optional] |
| **body** | [**POSTTvTvIdRatingRequest**](POSTTvTvIdRatingRequest.md)|  | [optional] |

### Return type

[**POSTAuthenticationSessionConvert4401Response**](POSTAuthenticationSessionConvert4401Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |

