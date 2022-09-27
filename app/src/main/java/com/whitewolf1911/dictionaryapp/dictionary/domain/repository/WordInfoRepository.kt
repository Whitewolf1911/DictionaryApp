package com.whitewolf1911.dictionaryapp.dictionary.domain.repository

import com.whitewolf1911.dictionaryapp.core.util.Resource
import com.whitewolf1911.dictionaryapp.dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}
