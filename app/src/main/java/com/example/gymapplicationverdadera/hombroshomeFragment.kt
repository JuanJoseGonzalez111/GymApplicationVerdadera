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
 * Use the [hombroshomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class hombroshomeFragment : Fragment() {
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
        var view =inflater.inflate(R.layout.fragment_hombroshome, container, false)
        val buttonNavigatecuadri = view.findViewById<Button>(R.id.shoulderPressButton)

        // Configurar el click listener para navegar
        buttonNavigatecuadri.setOnClickListener {
            // Crear un nuevo fragmento
            val fragment = descriptiontpechoFragment()

            // Crear un Bundle para pasar información
            val bundle = Bundle()
            bundle.putString("exerciseTitle", "Shoulder Press")
            bundle.putString("exerciseDescription", " El press de hombros , también conocido como press estricto o press militar , es un ejercicio de entrenamiento con pesas para la parte superior del cuerpo en el que el practicante levanta una pesa por encima de la cabeza mientras está sentado o de pie. Se utiliza principalmente para desarrollar los músculos deltoides anteriores del hombro. ")
            bundle.putInt("exerciseImage", R.drawable.img_46)
            bundle.putInt("exerciseImage2", R.drawable.img_47)

            // Asignar el Bundle al fragmento
            fragment.arguments = bundle

            // Navegar al nuevo fragmento usando el NavController
            findNavController().navigate(R.id.descriptiontpechoFragment, bundle)
        }
        val buttonNavigateLateral = view.findViewById<Button>(R.id.lateralRaisesButton)

        // Configurar el click listener para navegar
        buttonNavigatecuadri.setOnClickListener {
            // Crear un nuevo fragmento
            val fragment = descriptiontpechoFragment()

            // Crear un Bundle para pasar información
            val bundle = Bundle()
            bundle.putString("exerciseTitle", "Lateral Raises")
            bundle.putString("exerciseDescription", "La Ultra Lateral Raise tonifica y desarrolla los músculos de la parte central del hombro con un diseño tan potente como intuitivo. Las amplias almohadillas de los brazos mejoran el confort para usuarios de cualquier tamaño, mientras que las empuñaduras giratorias permiten un movimiento cómodo y natural. ")
            bundle.putInt("exerciseImage", R.drawable.img_44)
            bundle.putInt("exerciseImage2", R.drawable.img_45)

            // Asignar el Bundle al fragmento
            fragment.arguments = bundle

            // Navegar al nuevo fragmento usando el NavController
            findNavController().navigate(R.id.descriptiontpechoFragment, bundle)
        }
        val buttonNavigatefront = view.findViewById<Button>(R.id.frontRaisesButton)

        // Configurar el click listener para navegar
        buttonNavigatecuadri.setOnClickListener {
            // Crear un nuevo fragmento
            val fragment = descriptiontpechoFragment()

            // Crear un Bundle para pasar información
            val bundle = Bundle()
            bundle.putString("exerciseTitle", "Shoulder Press")
            bundle.putString("exerciseDescription", " Póngase de pie sujentando una mancuerna en cada mano con los brazos estirados. Levante los brazos hacia delante hasta la altura de los hombros con las palmas hacia abajo y los codos rectos. De forma controlada, vuelva a la posición inicial.")
            bundle.putInt("exerciseImage", R.drawable.img_42)
            bundle.putInt("exerciseImage2", R.drawable.img_43)

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
         * @return A new instance of fragment hombroshomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            hombroshomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}