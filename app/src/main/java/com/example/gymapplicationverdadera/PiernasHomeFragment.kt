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
 * Use the [PiernasHomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PiernasHomeFragment : Fragment() {
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
        //return inflater.inflate(R.layout.fragment_piernas_home, container, false)
        val view = inflater.inflate(R.layout.fragment_piernas_home, container, false)

        // Encontrar el botón en el layout
        val buttonNavigate = view.findViewById<Button>(R.id.Femoralesbutton)

        // Configurar el click listener para navegar
        buttonNavigate.setOnClickListener {
            // Crear un nuevo fragmento
            val fragment = descriptiontpechoFragment()

            // Crear un Bundle para pasar información
            val bundle = Bundle()
            bundle.putString("exerciseTitle", "Femorales")
            bundle.putString("exerciseDescription", "Ajusta el cojín de los pies para que quede a la altura de tus tobillos. ...\n" +
                    "Flexiona las rodillas para llevar los talones hacia los glúteos.\n" +
                    "Vuelve a bajar de forma lenta y controlada las piernas hacia la posición inicial y repite.")
            bundle.putInt("exerciseImage", R.drawable.img_28) // ID del recurso de la imagen
            bundle.putInt("exerciseImage2", R.drawable.img_29)

            // Asignar el Bundle al fragmento
            fragment.arguments = bundle

            // Navegar al nuevo fragmento usando el NavController
            findNavController().navigate(R.id.descriptiontpechoFragment, bundle)
        }
        val buttonNavigatecuadri = view.findViewById<Button>(R.id.cuadricepsbutton)

        // Configurar el click listener para navegar
        buttonNavigatecuadri.setOnClickListener {
            // Crear un nuevo fragmento
            val fragment = descriptiontpechoFragment()

            // Crear un Bundle para pasar información
            val bundle = Bundle()
            bundle.putString("exerciseTitle", "Femorales")
            bundle.putString("exerciseDescription", "Los cuádriceps son un grupo de cuatro músculos en la parte frontal del muslo: recto femoral, vasto lateral, vasto medial y vasto intermedio. Estos músculos son cruciales para la extensión de la pierna en la articulación de la rodilla, lo que implica enderezar la pierna desde una posición doblada.")
            bundle.putInt("exerciseImage", R.drawable.img_30)
            bundle.putInt("exerciseImage2", R.drawable.img_31)

            // Asignar el Bundle al fragmento
            fragment.arguments = bundle

            // Navegar al nuevo fragmento usando el NavController
            findNavController().navigate(R.id.descriptiontpechoFragment, bundle)
        }

        val buttonNavigateaductore = view.findViewById<Button>(R.id.aductoresbuttom)

        // Configurar el click listener para navegar
        buttonNavigateaductore.setOnClickListener {
            // Crear un nuevo fragmento
            val fragment = descriptiontpechoFragment()

            // Crear un Bundle para pasar información
            val bundle = Bundle()
            bundle.putString("exerciseTitle", "Aductores")
            bundle.putString("exerciseDescription", "Se trata de abrir y cerrar las dos piernas de manera simultánea. Puedes probar con varios ángulos y velocidades.")
            bundle.putInt("exerciseImage", R.drawable.img_32)
            bundle.putInt("exerciseImage2", R.drawable.img_33)

            // Asignar el Bundle al fragmento
            fragment.arguments = bundle

            // Navegar al nuevo fragmento usando el NavController
            findNavController().navigate(R.id.descriptiontpechoFragment, bundle)
        }
        val buttonNavigatepantori = view.findViewById<Button>(R.id.pantorrillabutton)

        // Configurar el click listener para navegar
        buttonNavigatepantori.setOnClickListener {
            // Crear un nuevo fragmento
            val fragment = descriptiontpechoFragment()

            // Crear un Bundle para pasar información
            val bundle = Bundle()
            bundle.putString("exerciseTitle", "Pantorrillas")
            bundle.putString("exerciseDescription", "Subidas a escalones : las subidas a escalones son otro gran ejercicio para trabajar las pantorrillas. Para hacer este ejercicio, párese frente a un escalón o una caja y coloque un pie sobre él.")
            bundle.putInt("exerciseImage", R.drawable.img_34)
            bundle.putInt("exerciseImage2", R.drawable.img_35)

            // Asignar el Bundle al fragmento
            fragment.arguments = bundle

            // Navegar al nuevo fragmento usando el NavController
            findNavController().navigate(R.id.descriptiontpechoFragment, bundle)
        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PiernasHomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PiernasHomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}