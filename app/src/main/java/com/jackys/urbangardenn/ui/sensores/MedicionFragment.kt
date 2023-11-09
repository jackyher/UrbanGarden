package com.jackys.urbangardenn.ui.sensores

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.jackys.urbangardenn.R
import com.jackys.urbangardenn.databinding.FragmentMedicionBinding

class MedicionFragment : Fragment() {

    private var _binding: FragmentMedicionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMedicionBinding.inflate(layoutInflater, container, false)
        val rootView = binding.root

        // Accede al EditText
        val editText = rootView.findViewById<EditText>(R.id.Cambiarnombre)

        // Cambia el texto del EditText cuando sea necesario
        editText.setText("Nuevo nombre")

        return rootView
    }
}