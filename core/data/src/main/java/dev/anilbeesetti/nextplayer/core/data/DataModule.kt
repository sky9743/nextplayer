package dev.anilbeesetti.nextplayer.core.data

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.anilbeesetti.nextplayer.core.data.medialibrary.LocalMediaSource
import dev.anilbeesetti.nextplayer.core.data.medialibrary.MediaSource
import dev.anilbeesetti.nextplayer.core.data.repository.VideoRepository
import dev.anilbeesetti.nextplayer.core.data.repository.VideoRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @Binds
    fun bindsVideoRepository(
        videoRepository: VideoRepositoryImpl
    ): VideoRepository

    @Binds
    fun bindsMediaSource(
        mediaSource: LocalMediaSource
    ): MediaSource
}