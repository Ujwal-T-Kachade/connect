package com.example.mytweeter.models

data class Post (
        val text: String = "",
        val createdBy: User = User(),
        val createdAt: Long = 0L,//store long
        val likedBy: ArrayList<String> = ArrayList()) // store user id of the people who have loked the post