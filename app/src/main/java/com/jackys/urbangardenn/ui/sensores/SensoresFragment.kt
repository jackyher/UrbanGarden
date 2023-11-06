package com.jackys.urbangardenn.ui.sensores

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jackys.urbangardenn.databinding.FragmentSensoresBinding

class SensoresFragment : Fragment() {

    private var _binding: FragmentSensoresBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSensoresBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}