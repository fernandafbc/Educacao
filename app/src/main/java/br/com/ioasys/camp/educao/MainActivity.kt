package br.com.ioasys.camp.educao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import br.com.ioasys.camp.educao.ui.main.HelpListFragment
import br.com.ioasys.camp.educao.ui.main.MonitorsListFragment
import br.com.ioasys.camp.educao.ui.main.ViewPagerAdapter
import br.com.ioasys.camp.educao.ui.profile.ProfileActivity
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

        val navController = findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(navController.graph)

        setSupportActionBar(toolbar)
        toolbar.setupWithNavController(navController, appBarConfiguration)


        sexSpinner = findViewById(R.id.sexSpinner)
        sexSpinner?.onItemSelectedListener = this

        setSupportActionBar(mainToolbar)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(MonitorsListFragment(), "Aprender")
        adapter.addFragment(HelpListFragment(), "Ensinar")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)

        return super.onOptionsItemSelected(item)

    }



    fun updateToolbar(title: String? = null, showToolbar: Boolean = true) {
        title?.let {
            toolbar.title = title
        }

        toolbar.visibility = if (showToolbar) View.VISIBLE else View.GONE
    }
}
