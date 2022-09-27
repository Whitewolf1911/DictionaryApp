package com.whitewolf1911.dictionaryapp.dictionary.domain.model

import com.whitewolf1911.dictionaryapp.dictionary.data.local.entity.WordInfoEntity

data class WordInfo(
    val meanings: List<Meaning>,
    val phonetic: String,
    val word: String
) {
    fun toWordInfoEntity(): WordInfoEntity {
        return WordInfoEntity(
            meanings = meanings,
            word = word,
            phonetic = phonetic,
        )
    }
}
