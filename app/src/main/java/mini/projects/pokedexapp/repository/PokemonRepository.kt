package mini.projects.pokedexapp.repository

import mini.projects.pokedexapp.frameworks.model.PokemonDetail
import mini.projects.pokedexapp.frameworks.model.PokemonList
import mini.projects.pokedexapp.util.Resource

interface PokemonRepository {

    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList>

    suspend fun getPokemonDetail(pokemonName: String): Resource<PokemonDetail>
}