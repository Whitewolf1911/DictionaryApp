package com.whitewolf1911.dictionaryapp.dictionary.di

import android.app.Application
import androidx.room.Room
import com.google.gson.Gson
import com.whitewolf1911.dictionaryapp.dictionary.data.local.WordInfoDatabase
import com.whitewolf1911.dictionaryapp.dictionary.data.remote.DictionaryApi
import com.whitewolf1911.dictionaryapp.dictionary.data.repository.WordInfoRepositoryImpl
import com.whitewolf1911.dictionaryapp.dictionary.data.util.GsonParser
import com.whitewolf1911.dictionaryapp.dictionary.domain.repository.WordInfoRepository
import com.whitewolf1911.dictionaryapp.dictionary.domain.usecase.GetWordInfo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object WordInfoModule {

    @Provides
    @Singleton
    fun provideGetWordInfoUseCase(
        repository: WordInfoRepository
    ): GetWordInfo {
        return GetWordInfo(repository)
    }

    @Provides
    @Singleton
    fun provideWordInfoRepository(
        api: DictionaryApi,
        db: WordInfoDatabase
    ): WordInfoRepository {
        return WordInfoRepositoryImpl(dao = db.dao, api = api)
    }

    @Provides
    @Singleton
    fun provideWordInfoDatabase(app: Application): WordInfoDatabase {
        return Room.databaseBuilder(
            app,
            WordInfoDatabase::class.java,
            "word_db"
        )
            .addTypeConverter(GsonParser(Gson()))
            .build()
    }

    @Provides
    @Singleton
    fun provideDictionaryApi(): DictionaryApi {
        return Retrofit.Builder()
            .baseUrl(DictionaryApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(DictionaryApi::class.java)
    }
}
