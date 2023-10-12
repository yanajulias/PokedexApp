package mini.projects.pokedexapp.features.pokemondetail

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import mini.projects.pokedexapp.frameworks.model.PokemonDetail
import mini.projects.pokedexapp.repository.PokemonRepository
import mini.projects.pokedexapp.util.Resource
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {
    suspend fun getPokemonDetail(pokemonName: String): Resource<PokemonDetail> =
        repository.getPokemonDetail(pokemonName)
}