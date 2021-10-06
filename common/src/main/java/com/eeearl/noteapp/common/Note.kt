package com.eeearl.noteapp.common

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val colot: Int,
    @Promarykey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Viloet, BabyBlue, RedPink)
    }
}
