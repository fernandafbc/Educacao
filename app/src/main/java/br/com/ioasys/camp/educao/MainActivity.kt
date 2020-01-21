package br.com.ioasys.camp.educao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import androidx.navigation.findNavController

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
    }
}
