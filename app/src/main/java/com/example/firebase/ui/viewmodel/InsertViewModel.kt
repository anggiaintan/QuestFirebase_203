package com.example.firebase.ui.viewmodel

sealed class FormState {
    object Idle : FormState ()
    object Loading : FormState ()
    data class Success (val message: String) : FormState ()
    data class Error (val message: String) : FormState ()
}