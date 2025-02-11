
# RequestHighlight

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prefix** | **String** | The string used to mark the start of a highlight in a fragment. |  [optional]
**postfix** | **String** | The string used to mark the end of a highlight in a fragment. |  [optional]
**snippetCount** | **Integer** | The maximum number of distinct highlight snippets to return for each highlight field. |  [optional]
**fragmentSize** | **Integer** | The character length of each snippet. |  [optional]
**maxAnalyzedChars** | **Integer** | The number of characters to be considered for highlighting. Matches after this count will not be shown. |  [optional]
**mergeContiguous** | **Boolean** | If fragments over lap they can be  merged into one larger fragment |  [optional]
**usePhraseHighlighter** | **Boolean** | Should phrases be identified. |  [optional]
**fields** | [**List&lt;RequestHighlightFields&gt;**](RequestHighlightFields.md) | The fields to highlight and field specific configuration properties for each field |  [optional]



