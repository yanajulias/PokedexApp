package mini.projects.pokedexapp.util

import androidx.compose.ui.graphics.Color
import mini.projects.pokedexapp.frameworks.model.PokemonDetail
import mini.projects.pokedexapp.ui.theme.AtkColor
import mini.projects.pokedexapp.ui.theme.DefColor
import mini.projects.pokedexapp.ui.theme.HPColor
import mini.projects.pokedexapp.ui.theme.SpAtkColor
import mini.projects.pokedexapp.ui.theme.SpDefColor
import mini.projects.pokedexapp.ui.theme.SpdColor
import mini.projects.pokedexapp.ui.theme.TypeBug
import mini.projects.pokedexapp.ui.theme.TypeDark
import mini.projects.pokedexapp.ui.theme.TypeDragon
import mini.projects.pokedexapp.ui.theme.TypeElectric
import mini.projects.pokedexapp.ui.theme.TypeFairy
import mini.projects.pokedexapp.ui.theme.TypeFighting
import mini.projects.pokedexapp.ui.theme.TypeFire
import mini.projects.pokedexapp.ui.theme.TypeFlying
import mini.projects.pokedexapp.ui.theme.TypeGhost
import mini.projects.pokedexapp.ui.theme.TypeGrass
import mini.projects.pokedexapp.ui.theme.TypeGround
import mini.projects.pokedexapp.ui.theme.TypeIce
import mini.projects.pokedexapp.ui.theme.TypeNormal
import mini.projects.pokedexapp.ui.theme.TypePoison
import mini.projects.pokedexapp.ui.theme.TypePsychic
import mini.projects.pokedexapp.ui.theme.TypeRock
import mini.projects.pokedexapp.ui.theme.TypeSteel
import mini.projects.pokedexapp.ui.theme.TypeWater

fun parseTypeToColor(type: PokemonDetail.Type): Color {
    return when(type.type?.name?.replaceFirstChar(Char::lowercase)) {
        "normal" -> TypeNormal
        "fire" -> TypeFire
        "water" -> TypeWater
        "electric" -> TypeElectric
        "grass" -> TypeGrass
        "ice" -> TypeIce
        "fighting" -> TypeFighting
        "poison" -> TypePoison
        "ground" -> TypeGround
        "flying" -> TypeFlying
        "psychic" -> TypePsychic
        "bug" -> TypeBug
        "rock" -> TypeRock
        "ghost" -> TypeGhost
        "dragon" -> TypeDragon
        "dark" -> TypeDark
        "steel" -> TypeSteel
        "fairy" -> TypeFairy
        else -> Color.Black
    }
}

fun parseStatToColor(stat: PokemonDetail.Stat.Stat): Color {
    return when(stat.name?.replaceFirstChar(Char::lowercase)) {
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }
}

fun parseStatToAbbr(stat: PokemonDetail.Stat.Stat): String {
    return when(stat.name) {
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }
}