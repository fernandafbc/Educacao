package br.com.ioasys.camp.educao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import androidx.navigation.findNavController
import br.com.ioasys.camp.educao.ui.main.HelpListFragment
import br.com.ioasys.camp.educao.ui.main.MonitorsListFragment
import br.com.ioasys.camp.educao.ui.main.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener{

    private var sexSpinner: Spinner? = null


    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var items: String = parent?.getItemAtPosition(position) as String
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sexSpinner = findViewById(R.id.sexSpinner)
        sexSpinner?.onItemSelectedListener = this

        setSupportActionBar(mainToolbar)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(MonitorsListFragment(), "Aprender")
        adapter.addFragment(HelpListFragment(), "Ensinar")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

    }
}
