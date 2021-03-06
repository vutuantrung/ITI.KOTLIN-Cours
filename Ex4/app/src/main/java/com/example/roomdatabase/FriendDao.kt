package com.example.roomdatabase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface FriendDao {

    @Query( "SELECT * FROM friend")
    fun getAllFriends(): List<Friend>

    @Insert
    fun insertFriend( friend : Friend)
}