package com.javieriq.pokeapicompose.data.remote.responses

data class VersionGroupDetail(
    val levelLearnedAt: Int,
    val moveLearnMethod: MoveLearnMethod,
    val versionGroup: VersionGroup
)