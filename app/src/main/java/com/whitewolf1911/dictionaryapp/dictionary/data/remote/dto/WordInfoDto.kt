package com.whitewolf1911.dictionaryapp.dictionary.data.remote.dto

import com.whitewolf1911.dictionaryapp.dictionary.data.local.entity.WordInfoEntity
import com.whitewolf1911.dictionaryapp.dictionary.domain.model.WordInfo

data class WordInfoDto(
    val license: License,
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val sourceUrls: List<String>,
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
