package br.com.ioasys.camp.educao.ui.authentication.forgot_password


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.ioasys.camp.educao.R

/**
 * A simple [Fragment] subclass.
 */
class ForgottenPasswordFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forgotten_password, container, false)
    }


}
