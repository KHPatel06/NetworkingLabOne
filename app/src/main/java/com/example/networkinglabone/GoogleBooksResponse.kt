package com.example.networkinglabone

import com.squareup.moshi.Json

class GoogleBooksResponse {
    @Json(name = "items")
    lateinit var booksItemsList: List<GoogleBooksItems>
}

class GoogleBooksItems{
    @Json(name = "volumeInfo")
    lateinit var googleBooksInfo: GoogleBooksVolumeInfo
}

class GoogleBooksVolumeInfo{
    @Json(name = "title")
    var title : String = ""

    @Json(name = "subtitle")
    var subtitle : String = ""

    @Json(name = "authors")
    lateinit var author : List<String>

    @Json(name = "infoLink")
    lateinit var url: String

    @Json(name = "imageLinks")
    lateinit var bookImageLinks: imageLinks
}

class imageLinks{
    @Json(name = "smallThumbnail")
    var link : String = ""
}

