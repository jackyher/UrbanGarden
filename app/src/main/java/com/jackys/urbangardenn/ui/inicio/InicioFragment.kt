package com.jackys.urbangardenn.ui.inicio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jackys.urbangardenn.databinding.FragmentInicioBinding

class InicioFragment : Fragment() {

    private var _binding:FragmentInicioBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInicioBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}