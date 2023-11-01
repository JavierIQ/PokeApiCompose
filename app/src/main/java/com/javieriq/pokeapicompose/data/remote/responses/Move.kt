package com.javieriq.pokeapicompose.data.remote.responses

data class Move(
    val move: MoveX,
    val versionGroupDetails: List<VersionGroupDetail>
)