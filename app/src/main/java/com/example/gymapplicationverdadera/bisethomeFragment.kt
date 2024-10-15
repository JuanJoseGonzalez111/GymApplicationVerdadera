package com.example.gymapplicationverdadera

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [bisethomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class bisethomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view =inflater.inflate(R.layout.fragment_bisethome, container, false)
        val buttonNavigate = view.findViewById<Button>(R.id.bicepsCurlButton)

        // Configurar el click listener para navegar
        buttonNavigate.setOnClickListener {
            // Crear un nuevo fragmento
            val fragment = descriptiontpechoFragment()

            // Crear un Bundle para pasar información
            val bundle = Bundle()
            bundle.putString("exerciseTitle", "Biceps Curl ")
            bundle.putString("exerciseDescription", "Por lo general, una flexión de bíceps comienza con el brazo completamente extendido con un agarre en supinación (con las palmas hacia arriba) sobre un peso. Una repetición completa consiste en doblar o \"curvar\" el codo hasta que esté completamente flexionado y luego bajar lentamente el peso hasta la posición inicial.")
            bundle.putInt("exerciseImage", R.drawable.img_36)
            bundle.putInt("exerciseImage2", R.drawable.img_37)

            // Asignar el Bundle al fragmento
            fragment.arguments = bundle

            // Navegar al nuevo fragmento usando el NavController
            findNavController().navigate(R.id.descriptiontpechoFragment, bundle)
        }
        val buttonNavigateHammer = view.findViewById<Button>(R.id.hammerCurlButton)

        // Configurar el click listener para navegar
        buttonNavigateHammer.setOnClickListener {
            // Crear un nuevo fragmento
            val fragment = descriptiontpechoFragment()

            // Crear un Bundle para pasar información
            val bundle = Bundle()
            bundle.putString("exerciseTitle", "Hammer Curl ")
            bundle.putString("exerciseDescription", "Un curl de martillo trabaja el bíceps braquial. Este músculo se considera un «músculo de la vanidad» porque es fácilmente visible en la parte frontal del cuerpo. Las personas que buscan tener una apariencia musculosa a menudo se enfocan en los bíceps para presentar una apariencia más atlética.")
            bundle.putInt("exerciseImage", R.drawable.img_38)
            bundle.putInt("exerciseImage2", R.drawable.img_39)

            // Asignar el Bundle al fragmento
            fragment.arguments = bundle

            // Navegar al nuevo fragmento usando el NavController
            findNavController().navigate(R.id.descriptiontpechoFragment, bundle)
        }
        val buttonNavigateCons = view.findViewById<Button>(R.id.concentrationCurlButton)

        // Configurar el click listener para navegar
        buttonNavigateCons.setOnClickListener {
            // Crear un nuevo fragmento
            val fragment = descriptiontpechoFragment()

            // Crear un Bundle para pasar información
            val bundle = Bundle()
            bundle.putString("exerciseTitle", "Concentration Curl ")
            bundle.putString("exerciseDescription", "Los curls de concentración trabajan el bíceps, trabajando tanto la cabeza larga como la corta, los antebrazos y el agarre . ¿Por qué son tan difíciles los curls de concentración? Los curls de concentración pueden resultar más difíciles que otros ejercicios para bíceps porque se elimina el impulso, lo que significa que el bíceps debe hacer todo el trabajo sin el apoyo de otros músculos.")
            bundle.putInt("exerciseImage", R.drawable.img_40)
            bundle.putInt("exerciseImage2", R.drawable.img_41)

            // Asignar el Bundle al fragmento
            fragment.arguments = bundle

            // Navegar al nuevo fragmento usando el NavController
            findNavController().navigate(R.id.descriptiontpechoFragment, bundle)
        }
        return  view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment bisethomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            bisethomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}