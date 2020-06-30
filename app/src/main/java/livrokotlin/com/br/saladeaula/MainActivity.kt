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
import livrokotlin.com.br.saladeaula.Curso

class MainActivity : Activity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //definindo o arquivo de layout
        setContentView(R.layout.activity_main)
      var listaSemestre  = arrayOf("1º SEMESTRE","2º SEMESTRE", "3º SEMESTRE", "4º SEMESTRE", "5º SEMESTRE","6º SEMESTRE")
      var listaCurso= arrayListOf("TADS","SIS","PEDAGOGIA")

        var semestreSelecionado:String=""
        var cursoSelecionado:String=""

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
        spn_semestre.onItemSelectedListener = object:  AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(parent:AdapterView<*>, view: View, position: Int, id: Long) {
                semestreSelecionado= spn_semestre.getItemAtPosition(position).toString()
            }
        }

        spn_curso.adapter=arrayAdapter
        spn_curso.onItemSelectedListener = object:  AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(parent:AdapterView<*>, view: View, position: Int, id: Long) {
                 cursoSelecionado =spn_curso.getItemAtPosition(position).toString()
            }
        }

        //Ação pesquisar
        val btn_pesquisar = findViewById<TextView>(R.id.btn_pesquisar)
        btn_pesquisar.setOnClickListener {

            var resultado: String
            resultado = "Curso não cadastrado, por favor entrar em contato com CAA."

            if (cursoSelecionado == "TADS" && semestreSelecionado == "1º SEMESTRE") {
                resultado = "BLOCO E, 2º PISO, SALA 38"
            } else if (cursoSelecionado == "TADS" && semestreSelecionado == "2º SEMESTRE"){
                resultado ="LABORATORIO SUBTERRANEO, SALA 03"
            } else if (cursoSelecionado == "TADS" && semestreSelecionado == "3º SEMESTRE"){
                resultado ="BLOCO C, 2º PISO, SALA 16"
            } else if (cursoSelecionado =="TADS" && semestreSelecionado == "4º SEMESTRE"){
                resultado ="BLOCO E, 3º PISO, SALA 44"
            }else if (cursoSelecionado =="TADS" && semestreSelecionado == "5º SEMESTRE"){
                resultado ="LABORATORIO SUBTERRANEO, SALA 06"
            }else if (cursoSelecionado =="TADS" && semestreSelecionado == "6º SEMESTRE"){
                resultado ="CURSO FINALIZADO!"
            } else if (cursoSelecionado == "SIS" && semestreSelecionado == "1º SEMESTRE"){
                resultado="BLOCO E, 2º PISO, SALA 39"
            }else if (cursoSelecionado == "SIS" && semestreSelecionado == "2º SEMESTRE"){
                resultado="BLOCO E, 3º PISO, SALA 44"
            }else if (cursoSelecionado == "SIS" && semestreSelecionado == "3º SEMESTRE"){
                resultado="AUDITORIO"
            }else if (cursoSelecionado == "SIS" && semestreSelecionado == "4º SEMESTRE"){
                resultado="BLOCO E, 1º PISO, SALA 19"
            }else if (cursoSelecionado == "SIS" && semestreSelecionado == "5º SEMESTRE"){
                resultado="BLOCO D, 1º PISO, SALA 4"
            }else if (cursoSelecionado == "SIS" && semestreSelecionado == "6º SEMESTRE"){
                resultado="SALA NÃO IDENTIFICADA ATE O MOMENTO"
            }
            txt_resultado.text=resultado

        }

    }

}

private fun <T> ArrayAdapter<T>.setDropDownViewResource(simpleDropdownItem1line: Int, simpleListItem2: Int) {

}