package com.example.pertemuan8.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pertemuan8.model.Siswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SiswaViewModel : ViewModel() {
    private val _statusUI = MutableStateFlow(Siswa())
    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()

    fun setSiswa(data: MutableList<String>) {
        _statusUI.value = Siswa(
            nama = data.getOrElse(0) { "" },
            gender = data.getOrElse(1) { "" },
            alamat = data.getOrElse(2) { "" }
        )
    }
}
