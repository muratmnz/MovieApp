package com.muratmnz.movieapp.model

data class Movie(
    val id: Int,
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int
)