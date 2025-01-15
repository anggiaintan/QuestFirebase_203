package com.example.firebase.model

data class Mahasiswa(
    val nim: String,
    val nama: String,
    val jenis_kelamin: String,
    val alamat: String,
    val kelas: String,
    val angkatan: String,
    val judul_skripsi: String,
    val dospem_satu: String,
    val dospem_dua: String
)




// konstruktor untuk nilai default
{
    constructor(

    ):this("", "", "", "", "", "", "", "", "")
}
