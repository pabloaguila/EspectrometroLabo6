package com.example.android.camera2.basic.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.android.camera2.basic.R
/* Este es el fragmento principal. Una vez que diste los permisos y elegiste la camera se abres te menu.
*  Descubri algo buenisimo. En nav_graph.xml podes ver como hacer se relacionan los fragmentos de manera visual.

* */
class MenuFragment: Fragment(){


    /** AndroidX navigation arguments */
    private val args: CameraFragmentArgs by navArgs() //con esto recibo datos de otros fragmentos

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.menu_inicial, container, false)
        val calibIntensidad = view.findViewById(R.id.CalibIntensidad) as Button
        val calibLongOnda = view.findViewById<Button>(R.id.CalibLongOnda)
        val medicion = view.findViewById<Button>(R.id.Medicion)

        calibIntensidad.setOnClickListener(
                {//actionMenu... hay que configurarla en nav_graph, correrlo y recien ahi aparece en este archivo
                    Navigation.findNavController(requireActivity(), R.id.fragment_container)
                            .navigate(MenuFragmentDirections.actionMenuFragmentToCameraFragment(args.cameraId, args.pixelFormat))
                }
        )
        calibLongOnda.setOnClickListener(
                {
                    Navigation.findNavController(requireActivity(), R.id.fragment_container)
                            .navigate(MenuFragmentDirections.actionMenuFragmentToLongOndaFragment(args.cameraId, args.pixelFormat))

                }
        )
        medicion.setOnClickListener(
                {
                    println("hola medido")
                }
        )

        return view
    }



}