package br.com.ioasys.camp.educao

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        registrateTxt.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainFragment_to_registerFragment)
        }

        forgottenPsswTxt.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainFragment_to_forgottenPasswordFragment)
        }
    }

}
