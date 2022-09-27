package com.whitewolf1911.dictionaryapp.dictionary.domain.usecase

import com.whitewolf1911.dictionaryapp.core.util.Resource
import com.whitewolf1911.dictionaryapp.dictionary.domain.model.WordInfo
import com.whitewolf1911.dictionaryapp.dictionary.domain.repository.WordInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetWordInfo(
    private val repository: WordInfoRepository
) {

    operator fun invoke(word: String): Flow<Resource<List<WordInfo>>> {
        if (word.isBlank()) {
            return flow {}
        }
        return repository.getWordInfo(word)
    }
}
