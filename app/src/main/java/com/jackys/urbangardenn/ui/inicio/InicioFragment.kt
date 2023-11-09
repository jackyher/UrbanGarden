package com.jackys.urbangardenn.ui.inicio

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.jackys.urbangardenn.R
import com.jackys.urbangardenn.databinding.FragmentInicioBinding
import com.jackys.urbangardenn.ui.RegisterActivity

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val linearLayout = view.findViewById<LinearLayout>(R.id.Usuario) // Reemplaza "Usuario" con el ID de tu LinearLayout

        linearLayout.setOnClickListener {
            val intent = Intent(requireContext(), RegisterActivity::class.java) // Reemplaza "MiActividadDestino" con el nombre de tu actividad de destino
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}