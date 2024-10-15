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
 * Use the [gluteoshomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class gluteoshomeFragment : Fragment() {
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
        var view =inflater.inflate(R.layout.fragment_gluteoshome, container, false)

        val buttonNavigate = view.findViewById<Button>(R.id.hipThrustButton)

        // Configurar el click listener para navegar
        buttonNavigate.setOnClickListener {
            // Crear un nuevo fragmento
            val fragment = descriptiontpechoFragment()

            // Crear un Bundle para pasar información
            val bundle = Bundle()
            bundle.putString("exerciseTitle", "Hip Thrust")
            bundle.putString("exerciseDescription", "En estas rutinas los músculos que reciben mayor impacto durante el movimiento son: glúteo mayor, menor y medio. Sin embargo, no podemos olvidar que también nos ayuda a mantener la buena postura de la espalda, fortalece el core y refuerza los cuádriceps y los isquiosurales.  ")
            bundle.putInt("exerciseImage", R.drawable.img_25) // ID del recurso de la imagen
            bundle.putInt("exerciseImage2", R.drawable.img_53)

            // Asignar el Bundle al fragmento
            fragment.arguments = bundle

            // Navegar al nuevo fragmento usando el NavController
            findNavController().navigate(R.id.descriptiontpechoFragment, bundle)
        }
        val buttonNavigateLon = view.findViewById<Button>(R.id.lungesButton)

        // Configurar el click listener para navegar
        buttonNavigateLon.setOnClickListener {
            // Crear un nuevo fragmento
            val fragment = descriptiontpechoFragment()

            // Crear un Bundle para pasar información
            val bundle = Bundle()
            bundle.putString("exerciseTitle", "Lunges")
            bundle.putString("exerciseDescription", " \n" +
                    "Lleva una pierna hacia atrás haciendo una zancada con una flexión de rodilla. Baja la parte superior del cuerpo manteniendo el equilibrio. Utilizando principalmente el talón del pie, empuje hacia arriba y regresa a la posición inicial. Repite el ejercicio con la pierna contraria.   ")
            bundle.putInt("exerciseImage", R.drawable.img_26) // ID del recurso de la imagen
            bundle.putInt("exerciseImage2", R.drawable.img_54)

            // Asignar el Bundle al fragmento
            fragment.arguments = bundle

            // Navegar al nuevo fragmento usando el NavController
            findNavController().navigate(R.id.descriptiontpechoFragment, bundle)
        }

        val buttonNavigateSqu = view.findViewById<Button>(R.id.squatsButton)

        // Configurar el click listener para navegar
        buttonNavigateSqu.setOnClickListener {
            // Crear un nuevo fragmento
            val fragment = descriptiontpechoFragment()

            // Crear un Bundle para pasar información
            val bundle = Bundle()
            bundle.putString("exerciseTitle", "Squats")
            bundle.putString("exerciseDescription", " \n" +
                    "  De pie, con los pies separados a la anchura de los hombros, coge una mancuerna en cada mano. Desciende lentamente flexionando las caderas, hasta que los cuádriceps estén aproximadamente paralelos al suelo. Espalda recta con los glúteos hacia atrás. Y baja y sube tan lento como puedas. ")
            bundle.putInt("exerciseImage", R.drawable.img_27) // ID del recurso de la imagen
            bundle.putInt("exerciseImage2", R.drawable.img_55)

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
         * @return A new instance of fragment gluteoshomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            gluteoshomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}