package com.example.imagesearch.data

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.imagesearch.data.UnsplashRepository

class UnsplashViewModel @ViewModelInject constructor(
    private val repository: UnsplashRepository
) : ViewModel() {



}