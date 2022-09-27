package com.whitewolf1911.dictionaryapp.dictionary.domain.model

data class Definition(
    val antonyms: List<String>,
    val definition: String,
    val example: String?,
    val synonyms: List<String>
) {

}
