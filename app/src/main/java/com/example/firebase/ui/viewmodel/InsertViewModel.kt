package com.example.firebase.ui.viewmodel

import androidx.lifecycle.Lifecycle
import com.example.firebase.model.Mahasiswa

sealed class FormState {
    object Idle : FormState ()
    object Loading : FormState ()
    data class Success (val message: String) : FormState ()
    data class Error (val message: String) : FormState ()
}

data class MahasiswaEvent (
    val nim: String = "",
    val nama: String = "",
    val jenisKelamin: String = "",
    val alamat: String = "",
    val kelas: String = "",
    val angkatan: String = ""
)