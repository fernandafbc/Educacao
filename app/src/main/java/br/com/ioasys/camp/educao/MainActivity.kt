package br.com.ioasys.camp.educao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import br.com.ioasys.camp.educao.ui.main.HelpListFragment
import br.com.ioasys.camp.educao.ui.main.MonitorsListFragment
import br.com.ioasys.camp.educao.ui.main.ViewPagerAdapter
import br.com.ioasys.camp.educao.ui.profile.ProfileActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toolbar.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener{

    private var sexSpinner: Spinner? = null
    //VEI VOU TESTAR ESSE BAGUIO
    private var aloha = 1


    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var items: String = parent?.getItemAtPosition(position) as String
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(mainToolbar)


        sexSpinner = findViewById(R.id.sexSpinner)
        sexSpinner?.onItemSelectedListener = this


        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(MonitorsListFragment(), "Aprender")
        adapter.addFragment(HelpListFragment(), "Ensinar")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

    }

    override fun onStart() {
        super.onStart()

        profilePicture.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }

}
