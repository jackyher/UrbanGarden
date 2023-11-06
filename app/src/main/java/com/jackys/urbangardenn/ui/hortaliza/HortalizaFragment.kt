package com.jackys.urbangardenn.ui.hortaliza

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jackys.urbangardenn.databinding.FragmentHortalizaBinding

class HortalizaFragment : Fragment() {

    private var _binding: FragmentHortalizaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHortalizaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}