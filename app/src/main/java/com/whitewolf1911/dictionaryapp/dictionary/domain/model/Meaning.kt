package com.whitewolf1911.dictionaryapp.dictionary.domain.model

data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech: String,
) {
    fun toMeaning(): Meaning {
        return Meaning(
            definitions = definitions.map { it.toDefinition() },
            partOfSpeech = partOfSpeech
        )
    }
}
