package com.whitewolf1911.dictionaryapp.dictionary.ui

import com.whitewolf1911.dictionaryapp.dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
) {

}
