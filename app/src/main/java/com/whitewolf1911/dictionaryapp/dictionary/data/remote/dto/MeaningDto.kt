package com.whitewolf1911.dictionaryapp.dictionary.data.remote.dto

data class MeaningDto(
    val antonyms: List<Any>,
    val definitions: List<DefinitionDto>,
    val partOfSpeech: String,
    val synonyms: List<String>
)
