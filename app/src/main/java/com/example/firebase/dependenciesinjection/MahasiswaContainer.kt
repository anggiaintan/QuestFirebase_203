package com.example.firebase.dependenciesinjection

import com.example.firebase.repository.MahasiswaRepository
import com.example.firebase.repository.NetworkMahasiswaRepository
import com.google.firebase.firestore.FirebaseFirestore


interface AppContainer {
    val mahasiswaRepository: MahasiswaRepository
}

class MahasiswaContainer: AppContainer {
    private val firebase: FirebaseFirestore = FirebaseFirestore.getInstance() // sejajar dengan base url

    override val mahasiswaRepository: MahasiswaRepository by lazy {
        NetworkMahasiswaRepository(firebase)
    }
}