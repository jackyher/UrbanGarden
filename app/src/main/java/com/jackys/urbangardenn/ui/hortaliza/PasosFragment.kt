package com.jackys.urbangardenn.ui.hortaliza

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jackys.urbangardenn.databinding.FragmentPasosBinding

class PasosFragment : Fragment() {

    private var _binding: FragmentPasosBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPasosBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}