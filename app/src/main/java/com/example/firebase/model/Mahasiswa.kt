package com.example.firebase.model

data class Mahasiswa(
    val nim: String,
    val nama: String,
    val alamat: String,
    val jenis_kelamin: String,
    val kelas: String,
    val angkatan: String
)

// konstruktor untuk nilai default
{
    constructor(

    ):this(nim = "", nama = "", alamat = "", jenis_kelamin = "", kelas = "", angkatan = "")
}
