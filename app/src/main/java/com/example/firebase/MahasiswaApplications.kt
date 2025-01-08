package com.example.firebase

import android.app.Application
import com.example.firebase.dependenciesinjection.AppContainer
import com.example.firebase.dependenciesinjection.MahasiswaContainer

class MahasiswaApplications : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}