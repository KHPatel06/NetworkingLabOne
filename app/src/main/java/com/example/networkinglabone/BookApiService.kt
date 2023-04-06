package com.example.networkinglabone

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

private const val QUERY_STRING = "volumes?q=Android&maxResults=10"

private const val BASE_URL = "https://www.googleapis.com/books/v1/"
private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
private val retrofit = Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(moshi)).baseUrl(BASE_URL).build()

interface BookApiService {
    @GET(QUERY_STRING)
    fun getBooksRequest(): Call<GoogleBooksResponse>

}

object BookAPI{
    val bookApi: BookApiService by lazy {
        retrofit.create(BookApiService::class.java)
    }
}