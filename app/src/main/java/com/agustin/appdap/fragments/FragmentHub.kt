package com.agustin.appdap.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.agustin.appdap.R
import com.agustin.appdap.viewModel.FragmentHubViewModel

class FragmentHub : Fragment() {

    companion object {
        fun newInstance() = FragmentHub()
    }

    private lateinit var viewModel: FragmentHubViewModel
    lateinit var v:View
    lateinit var TxtMain:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        v =  inflater.inflate(R.layout.fragment_hub_fragment, container, false)
        TxtMain = v.findViewById(R.id.MainTxt)
        val Email = FragmentHubArgs.fromBundle(requireArguments()).email
        TxtMain.text = "Bienvenido \n" + Email
        return v
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentHubViewModel::class.java)
        // TODO: Use the ViewModel
    }

}