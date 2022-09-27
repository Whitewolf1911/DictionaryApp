package com.whitewolf1911.dictionaryapp.dictionary.data.remote.dto

data class DefinitionDto(
    val antonyms: List<String>,
    val definition: String,
    val example: String,
    val synonyms: List<String>
)
