package mini.projects.pokedexapp.repository

import mini.projects.pokedexapp.frameworks.PokeApi
import mini.projects.pokedexapp.frameworks.model.PokemonDetail
import mini.projects.pokedexapp.frameworks.model.PokemonList
import mini.projects.pokedexapp.util.Resource
import javax.inject.Inject

class PokemonRepositoryImpl @Inject constructor(
    private val pokeApi: PokeApi
) : PokemonRepository {
    override suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            pokeApi.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occured ")
        }
        return Resource.Success(response)
    }

    override suspend fun getPokemonDetail(pokemonName: String): Resource<PokemonDetail> {
        val response = try {
            pokeApi.getPokemonDetail(pokemonName)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occured ")
        }
        return Resource.Success(response)
    }
}