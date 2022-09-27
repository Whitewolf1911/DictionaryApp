package com.whitewolf1911.dictionaryapp.dictionary.data.remote.dto

import com.whitewolf1911.dictionaryapp.dictionary.domain.model.WordInfo

data class WordInfoDto(
    val license: License,
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val sourceUrls: List<String>,
    val word: String
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            meanings = meanings,
            word = word,
            phonetic = phonetic,
        )
    }
}
