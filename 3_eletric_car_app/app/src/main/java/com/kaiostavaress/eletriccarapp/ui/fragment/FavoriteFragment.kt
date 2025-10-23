package com.kaiostavaress.eletriccarapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.kaiostavaress.eletriccarapp.R
import com.kaiostavaress.eletriccarapp.data.local.CarRepository
import com.kaiostavaress.eletriccarapp.domain.Carro
import com.kaiostavaress.eletriccarapp.ui.adapter.CarAdapter

class FavoriteFragment : Fragment() {
    lateinit var listaCarrosFavoritos: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.favorite_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView(view)
        setupList()
    }

    private fun getCarsOnLocalDb(): List<Carro> {
        val repository = CarRepository(requireContext())
        val carList = repository.getAll()
        return carList
    }


    fun setupView(view: View) {
        view.apply {
            listaCarrosFavoritos = findViewById(R.id.rv_lista_carros_favoritos)
        }
    }

    fun setupList() {
        val cars = getCarsOnLocalDb()
        val carroAdapter = CarAdapter(cars, isFavoriteScreen = true)
        listaCarrosFavoritos.apply {
            visibility = View.VISIBLE
            adapter = carroAdapter
        }
        carroAdapter.carItemLister = { carro ->
            // @TODO IMPLEMENTAR O DELETE NO BANCO DE DADOS
        }
    }
}