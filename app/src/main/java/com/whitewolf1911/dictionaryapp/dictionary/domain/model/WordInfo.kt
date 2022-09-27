package com.whitewolf1911.dictionaryapp.dictionary.domain.model

import com.whitewolf1911.dictionaryapp.dictionary.data.remote.dto.MeaningDto

data class WordInfo(
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val word: String
)
