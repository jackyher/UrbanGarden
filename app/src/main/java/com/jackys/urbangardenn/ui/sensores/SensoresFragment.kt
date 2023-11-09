package com.jackys.urbangardenn.ui.sensores

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.jackys.urbangardenn.R
import com.jackys.urbangardenn.databinding.FragmentSensoresBinding

class SensoresFragment : Fragment() {

    private var _binding: FragmentSensoresBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSensoresBinding.inflate(layoutInflater, container, false)
        val rootView = binding.root

        val linearLayout = rootView.findViewById<LinearLayout>(R.id.NumSensores)

        linearLayout.setOnClickListener {
            val fragment = MedicionFragment()
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.sensoresFragment, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        return rootView
    }
}