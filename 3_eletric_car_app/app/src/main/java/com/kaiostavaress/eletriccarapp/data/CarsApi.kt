package com.kaiostavaress.eletriccarapp.data

import com.kaiostavaress.eletriccarapp.domain.Carro
import retrofit2.Call
import retrofit2.http.GET

interface CarsApi {

    @GET("cars")
    fun getAllCars() : Call<List<Carro>>
}