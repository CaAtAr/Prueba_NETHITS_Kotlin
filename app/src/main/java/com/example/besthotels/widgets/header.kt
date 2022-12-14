package com.example.besthotels.widgets

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.besthotels.MainActivity
import com.example.besthotels.R
import com.example.besthotels.experiencias.ExperienciaMenu
import kotlinx.android.synthetic.main.fragment_header.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [header.newInstance] factory method to
 * create an instance of this fragment.
 */
class header : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_header, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btn_back.setOnClickListener{
            getActivity()?.finish()
        }

        btn_home.setOnClickListener{
            val editProfileIntent = Intent(getActivity(), MainActivity::class.java)
            getActivity()?.startActivity(editProfileIntent)
        }
    }


}