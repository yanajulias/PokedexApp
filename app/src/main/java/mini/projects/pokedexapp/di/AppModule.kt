package mini.projects.pokedexapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import mini.projects.pokedexapp.frameworks.PokeApi
import mini.projects.pokedexapp.repository.PokemonRepository
import mini.projects.pokedexapp.repository.PokemonRepositoryImpl
import mini.projects.pokedexapp.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providePokemonRepository(api: PokeApi) : PokemonRepository = PokemonRepositoryImpl(api)

    @Singleton
    @Provides
    fun providePokeApi(): PokeApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Constants.BASE_URL)
            .build()
            .create(PokeApi::class.java)
    }

}