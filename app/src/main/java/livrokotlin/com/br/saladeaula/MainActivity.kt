package livrokotlin.com.br.saladeaula

import android.R.layout.simple_spinner_item
import android.annotation.SuppressLint
import android.app.Activity
import android.widget.ArrayAdapter
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //definindo o arquivo de layout
        setContentView(R.layout.activity_main)
        var listaSemestre  = arrayOf("1 Semestre","2 Semestre", "3 Semestre", "4 Semestre")
        var listaCurso= arrayListOf("TADS","SIS")
        val arrayAdapter = ArrayAdapter( this,
            android.R.layout.simple_spinner_dropdown_item, listaCurso)
        val adapter = ArrayAdapter(this, // Context
            simple_spinner_item, // Layout
            listaSemestre
        )
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line,
            android.R.layout.simple_spinner_dropdown_item
        )

        spn_semestre.adapter=adapter
        spn_curso.adapter=arrayAdapter
        spn_semestre.onItemSelectedListener = object:  AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(parent:AdapterView<*>, view: View, position: Int, id: Long) {
                spn_semestre.getItemAtPosition(position).toString()
            }
        }
        var curso: String="0"
        spn_curso.onItemSelectedListener = object:  AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(parent:AdapterView<*>, view: View, position: Int, id: Long) {
                spn_curso.getItemAtPosition(position).toString()
            }
        }


        val btn_pesquisar = findViewById<TextView>(R.id.btn_pesquisar)
        btn_pesquisar.setOnClickListener {

            val resultado: String
            var curso =spn_semestre

            var cursoInt = curso.toString().toInt()

            when (curso) {

            }
        }

    }
}

private fun <T> ArrayAdapter<T>.setDropDownViewResource(simpleDropdownItem1line: Int, simpleListItem2: Int) {

}