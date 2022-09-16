

# GETMovieMovieId200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adult** | **Boolean** |  |  [optional] |
|**backdropPath** | **Object** |  |  [optional] |
|**budget** | **Integer** |  |  [optional] |
|**genres** | [**List&lt;GETSearchKeyword200ResponseResultsInner&gt;**](GETSearchKeyword200ResponseResultsInner.md) |  |  [optional] |
|**id** | **Integer** |  |  [optional] |
|**originalLanguage** | **String** |  |  [optional] |
|**originalTitle** | **String** |  |  [optional] |
|**popularity** | **BigDecimal** |  |  [optional] |
|**posterPath** | **Object** |  |  [optional] |
|**productionCompanies** | [**List&lt;GETMovieMovieId200ResponseProductionCompaniesInner&gt;**](GETMovieMovieId200ResponseProductionCompaniesInner.md) |  |  [optional] |
|**productionCountries** | [**List&lt;GETMovieMovieId200ResponseProductionCountriesInner&gt;**](GETMovieMovieId200ResponseProductionCountriesInner.md) |  |  [optional] |
|**releaseDate** | **LocalDate** |  |  [optional] |
|**revenue** | **Integer** |  |  [optional] |
|**spokenLanguages** | [**List&lt;GETMovieMovieId200ResponseSpokenLanguagesInner&gt;**](GETMovieMovieId200ResponseSpokenLanguagesInner.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**video** | **Boolean** |  |  [optional] |
|**voteAverage** | **BigDecimal** |  |  [optional] |
|**voteCount** | **Integer** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| RUMORED | &quot;Rumored&quot; |
| PLANNED | &quot;Planned&quot; |
| IN_PRODUCTION | &quot;In Production&quot; |
| POST_PRODUCTION | &quot;Post Production&quot; |
| RELEASED | &quot;Released&quot; |
| CANCELED | &quot;Canceled&quot; |



