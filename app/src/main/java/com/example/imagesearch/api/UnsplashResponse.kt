package com.example.imagesearch.api

import com.example.imagesearch.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)