package com.example.pncht.ui


import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * A simple [Fragment] subclass.
 */
class BulletinFragment : Fragment() {

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

}// Required empty public constructor
