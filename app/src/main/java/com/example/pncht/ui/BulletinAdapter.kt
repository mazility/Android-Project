package com.example.pncht.ui

import Model.Faculty
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_bulletin.view.*
import kotlinx.android.synthetic.main.item_bulletin.view.*
import kotlinx.android.synthetic.main.nav_header_main.view.*
import android.R.attr.bitmap
import android.graphics.BitmapFactory
import android.media.Image
import com.squareup.picasso.Picasso


/**
 * Created by pncht on 11/25/2017.
 */
class BulletinAdapter(context: BulletinFragment,facultyList: ArrayList<Faculty>): BaseAdapter() {

    private val mContext: BulletinFragment
    private var facultyList: ArrayList<Faculty>? = null
    //private val facultyList = arrayListOf<String>("Mr.A","Mr.B","Mr.C","Mr.D","Mr.E")

    init {
        mContext = context
        this.facultyList = facultyList
    }

    /*constructor(facultyList: ArrayList<Faculty>?) : super() {
        this.facultyList = facultyList
    }*/

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val faculty = facultyList!!.get(position)
        val layoutInflater = LayoutInflater.from(parent!!.context)
        val row = layoutInflater.inflate(R.layout.item_bulletin, parent, false)

        val Icon = row.findViewById<ImageView>(R.id.Icon)

        val image =  row.findViewById<ImageView>(R.id.Icon)
        Picasso.with(parent!!.context).load(facultyList!!.get(position).Icon).into(image)
        val Name = row.findViewById<TextView>(R.id.Name)
        Name.text = facultyList!!.get(position).Name

        return row
    }

    override fun getItem(position: Int): Any {
        return facultyList!!.get(position)
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
            return facultyList!!.size
    }

    fun updateFaculty(facultyList: ArrayList<Faculty>) {
        this.facultyList = facultyList
    }
}