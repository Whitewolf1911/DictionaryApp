package com.whitewolf1911.dictionaryapp.dictionary.domain.model

data class WordInfo(
    val meanings: List<Meaning>,
    val phonetic: String,
    val word: String
)
