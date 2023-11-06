package com.jackys.urbangardenn.ui.explora

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jackys.urbangardenn.databinding.FragmentExploraBinding

class ExploraFragment : Fragment() {

    private var _binding: FragmentExploraBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentExploraBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}