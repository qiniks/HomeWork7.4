package com.example.homework71.domain.model

class Note(
    val id: Int = DEFAULT_ID,
    val title: String,
    val desc: String,
    val createdAd: Long
) {

    companion object {
        const val DEFAULT_ID = 0
    }
}