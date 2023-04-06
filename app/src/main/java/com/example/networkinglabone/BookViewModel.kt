package com.example.networkinglabone

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BookViewModel: ViewModel() {

    private val _response = MutableLiveData<List<Book>>()
    val response: LiveData<List<Book>>
        get() = _response

    fun getBooks(){
        val request = BookAPI.bookApi.getBooksRequest()
        request.enqueue(object: Callback<GoogleBooksResponse> {
            override fun onFailure(call: Call<GoogleBooksResponse>, t: Throwable){
                Log.d("RESPONSE", "Failiure " + t.message)
            }
            override fun onResponse(call: Call<GoogleBooksResponse>, response: Response<GoogleBooksResponse>){
                var listOfBooksFetched = mutableListOf<Book>()

                val booksResponse : GoogleBooksResponse? = response.body()
                val bookItemsList = booksResponse?.booksItemsList ?: listOf()

                for(bookItems in bookItemsList){
                    val bookVolumeInfo = bookItems.googleBooksInfo

                    val title = bookVolumeInfo.title
                    val subtitle = bookVolumeInfo.subtitle
                    val authors = bookVolumeInfo.author

                    val newBook = Book(title, subtitle, authors)
                    listOfBooksFetched.add(newBook)
                }
                _response.value = listOfBooksFetched
            }
        })
    }
}