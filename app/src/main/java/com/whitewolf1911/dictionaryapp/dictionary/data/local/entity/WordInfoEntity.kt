package com.whitewolf1911.dictionaryapp.dictionary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.whitewolf1911.dictionaryapp.dictionary.data.remote.dto.MeaningDto
import com.whitewolf1911.dictionaryapp.dictionary.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    @PrimaryKey val id: Int? = null,
    val word: String,
    val phonetic: String,
    val meanings: List<MeaningDto>
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            meanings = meanings,
            phonetic = phonetic,
            word = word
        )
    }
}
