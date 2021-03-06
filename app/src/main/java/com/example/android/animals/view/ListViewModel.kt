package com.example.android.animals.view

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.android.animals.model.Animal

class ListViewModel (application: Application) : AndroidViewModel(application) {

    val animals by lazy { MutableLiveData<List<Animal>>() }
    val loadError by lazy { MutableLiveData<Boolean>() }
    val loading by lazy { MutableLiveData<Boolean>() }

    fun refresh() {

    }

    private fun getAnimals() {
        val a1 = Animal("alligator")
        val a2 = Animal("bee")
        val a3 = Animal("cat")
        val a4 = Animal("dog")
        val a5 = Animal("elephant")
        val a6 = Animal("flamingo")

        var animalList: ArrayList<Animal> = arrayListOf(a1, a2, a3, a4, a5, a6)

        animals.value = animalList
        loadError.value = false
        loading.value = false
    }

}