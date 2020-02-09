package br.com.ioasys.camp.educao.ui.profile


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import br.com.ioasys.camp.educao.R
import kotlinx.android.synthetic.main.fragment_profile.*

/**
 * A simple [Fragment] subclass.
 */
class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ProfileViewPagerAdapter(childFragmentManager)
        adapter.addFragment(MyDataFragment(), "MEUS DADOS")
        adapter.addFragment(SolicitationsFragment(), "SOLICITAÇÕES")
        adapter.addFragment(HistoryFragment(), "HISTÓRICO")
        profileViewPager.adapter = adapter
        profileTabLayout.setupWithViewPager(profileViewPager)
    }


}
