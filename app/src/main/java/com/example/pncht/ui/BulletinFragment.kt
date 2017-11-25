package com.example.pncht.ui

import Model.Faculty
import ResApi.ResApiProvider
import android.os.Bundle
import android.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ListView
import com.github.kittinunf.fuel.Fuel
import kotlinx.android.synthetic.main.fragment_bulletin.*

/**
 * A simple [Fragment] subclass.
 */
class BulletinFragment : Fragment() {

    var listOfFaculties: ArrayList<Faculty>? = null
    var ba: BulletinAdapter?=null
    //var mListView: ListView? = null
    val rs = ResApiProvider()

    companion object {
        fun newInstance(): BulletinFragment {
            val fragment = BulletinFragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_bulletin, container, false)

        /*listOfFaculties = rs.getListOfFaculty()

        ba = BulletinAdapter(this, listOfFaculties!!)
        var list_faculties = root.findViewById<ListView>(R.id.list_faculties)
        list_faculties.setAdapter(ba)
        //val redcolor = Color.parseColor("#FF0000")
        //list_faculties.setBackgroundColor(redcolor)
        //list_faculties.adapter = BulletinAdapter(BulletinFragment())

        if(listOfFaculties != null){
            Log.i("Adapter","list not null")
            Log.i("Adapter", listOfFaculties!!.size.toString())
        }else{
            Log.i("Adapter","list is null")
        }*/

        root.findViewById<Button>(R.id.btn_update).setOnClickListener(
                View.OnClickListener {view ->
                    //ba = BulletinAdapter(this, listOfFaculties!!)
                    //var list_faculties = root.findViewById<ListView>(R.id.list_faculties)
                    list_faculties.setAdapter(ba)
                }
        )
        // Inflate the layout for this fragment
        return root
    }


}// Required empty public constructor

