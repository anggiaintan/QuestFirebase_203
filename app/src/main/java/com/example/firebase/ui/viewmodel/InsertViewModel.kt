package com.example.firebase.ui.viewmodel

import androidx.lifecycle.Lifecycle
import com.example.firebase.model.Mahasiswa

sealed class FormState {
    object Idle : FormState ()
    object Loading : FormState ()
    data class Success (val message: String) : FormState ()
    data class Error (val message: String) : FormState ()
}

data class FormErrorState (
    val nim: String? = null,
    val nama: String? = null,
    val jenisKelamin: String? = null,
    val alamat: String? = null,
    val kelas: String? = null,
    val angkatan: String? = null
) {
    fun isValid(): Boolean {
        return nim == null && nama == null && jenisKelamin == null &&
                alamat == null && kelas == null && angkatan == null
    }
}

data class MahasiswaEvent (
    val nim: String = "",
    val nama: String = "",
    val jenisKelamin: String = "",
    val alamat: String = "",
    val kelas: String = "",
    val angkatan: String = ""
)