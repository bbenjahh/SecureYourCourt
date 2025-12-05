package com.example.secureyourcourt.repository


import com.example.secureyourcourt.model.Cancha
import com.example.secureyourcourt.network.RetrofitClient

class CanchaRepository {

    suspend fun cargarCanchas(): List<Cancha> {
        return RetrofitClient.api.obtenerCanchas()
    }

    suspend fun obtenerCanchaPorId(id: Int): Cancha {
        return RetrofitClient.api.obtenerCanchaPorId(id)
    }
}