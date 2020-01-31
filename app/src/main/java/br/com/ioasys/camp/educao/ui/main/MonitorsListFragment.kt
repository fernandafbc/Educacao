package br.com.ioasys.camp.educao.ui.main


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.ioasys.camp.educao.MainActivity

import br.com.ioasys.camp.educao.R
import kotlinx.android.synthetic.main.fragment_monitors_list.*

/**
 * A simple [Fragment] subclass.
 */
class MonitorsListFragment : Fragment() {

    lateinit var monitorAdapter: MonitorAdapter

    private val monitors = ArrayList<Monitor>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_monitors_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        (activity as MainActivity).updateToolbar(title = "")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        monitorAdapter = MonitorAdapter(monitors)

        recyclerMonitor.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = monitorAdapter
        }


        val monitor1: Monitor = Monitor("Fernanda Braga", "23 anos", "PUC Minas - Coração Eucarístico")
        val monitor2: Monitor = Monitor("Fernanda Braga", "23 anos", "PUC Minas - Coração Eucarístico")
        val monitor3: Monitor = Monitor("Fernanda Braga", "23 anos", "PUC Minas - Coração Eucarístico")
        monitors.add(monitor1)
        monitors.add(monitor2)
        monitors.add(monitor3)


    }

}
