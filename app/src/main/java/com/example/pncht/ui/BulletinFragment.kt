package com.example.pncht.ui

import Model.Faculty
import ResApi.ResApiProvider
import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.SimpleAdapter
import android.widget.ArrayAdapter




/**
 * A simple [Fragment] subclass.
 */
class BulletinFragment : Fragment() {

    var listOfFaculties: ArrayList<Faculty>? = null
    var mListView: ListView? = null

    val rs = ResApiProvider()

    companion object {
        fun newInstance(): BulletinFragment {
            val fragment = BulletinFragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bulletin, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        /*listOfFaculties = rs.getListOfFaculty()

        mListView = R.id.list_faculties as ListView

        val itemsAdapter = SimpleAdapter(this, R.layout.faculty_item, arrayOf<String>("FID", "Name", "Icon"), intArrayOf(R.id.FID, R.id.Name, R.id.Icon))

        SimpleAdapter(this@MainActivity, listOfFaculties, R.layout.faculty_item,
                arrayOf(KEY_VER, KEY_NAME, KEY_API),
                intArrayOf(R.id.version, R.id.name, R.id.api))*/

        super.onCreate(savedInstanceState)
    }



}// Required empty public constructor
