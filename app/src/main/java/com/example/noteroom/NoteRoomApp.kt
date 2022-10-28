package com.example.noteroom

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class NoteRoomApp: Application() {
    override fun onCreate() {
        super.onCreate()
    }
}