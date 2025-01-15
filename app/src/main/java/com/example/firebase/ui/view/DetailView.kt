package com.example.firebase.ui.view

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.firebase.model.Mahasiswa
import com.example.firebase.ui.viewmodel.DetailUiState
import com.example.firebase.ui.viewmodel.DetailViewModel

@Composable
fun DetailView(viewModel: DetailViewModel) {
    val detailUiState = viewModel.detailUiState.collectAsState()

    when (val state = detailUiState.value) {
        is DetailUiState.Loading -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
        }
        is DetailUiState.Success -> {
            DetailContent(mahasiswa = state.mahasiswa)
        }
        is DetailUiState.Error -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text("Error: Data tidak ditemukan", color = MaterialTheme.colors.error)
            }
        }
    }
}

@Composable
fun DetailContent(mahasiswa: Mahasiswa) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Detail Mahasiswa", style = MaterialTheme.typography.h5, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))
        DetailRow(label = "NIM", value = mahasiswa.nim)
        DetailRow(label = "Nama", value = mahasiswa.nama)
        DetailRow(label = "Jenis Kelamin", value = mahasiswa.jenis_kelamin)
        DetailRow(label = "Alamat", value = mahasiswa.alamat)
        DetailRow(label = "Kelas", value = mahasiswa.kelas)
        DetailRow(label = "Angkatan", value = mahasiswa.angkatan)
        DetailRow(label = "Judul Skripsi", value = mahasiswa.judul_skripsi)
        DetailRow(label = "Dospem 1", value = mahasiswa.dospem_satu)
        DetailRow(label = "Dospem 2", value = mahasiswa.dospem_dua)
    }
}

@Composable
fun DetailRow(label: String, value: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = label, fontWeight = FontWeight.Bold)
        Text(text = value)
    }
}
