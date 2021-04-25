package io.arunbuilds.daggerhilt

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Named

@Module
@InstallIn(ActivityRetainedComponent::class)
object MainModule {

    @ActivityRetainedScoped
    @Provides
    @Named("String2")
    fun provideTestString2(
        @ApplicationContext app: Context,
        @Named("String1") testString1 : String
    ) = app.getString(R.string.string_to_inject) + " && " +testString1
}