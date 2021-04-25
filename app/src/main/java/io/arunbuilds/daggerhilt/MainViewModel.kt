package io.arunbuilds.daggerhilt

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class MainViewModel @Inject constructor(
    @Named("Arun")var testString : String
) : ViewModel() {
    init {
        Log.d("Arun", "Test String from ViewModel : $testString")
    }

    fun getTheString() = testString
}

@Module
@InstallIn(ViewModelComponent::class)
object MainViewModelModule{

    @ViewModelScoped
    @Named("Arun")
    @Provides
    fun provideTestString2(
        @Named("String2") testString:String
    ) = "ViewModel $testString"
}