package com.example.android.animals.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.example.android.animals.*

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(com.example.android.animals.R.layout.fragment_list, container, false)
    }

    @Override
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // my invention start
        val buttonDetail: FloatingActionButton
        buttonDetail = view.findViewById(R.id.buttonDetail) as FloatingActionButton
        // my invention end

        buttonDetail.setOnClickListener {
            val action: NavDirections = ListFragmentDirections.actionDetail()
            Navigation.findNavController(it).navigate(action)
       }
    }

}