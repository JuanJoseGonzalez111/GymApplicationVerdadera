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
 * Use the [PechoHomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PechoHomeFragment : Fragment() {
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
        // Inflar el layout del fragmento
        val view = inflater.inflate(R.layout.fragment_pecho_home, container, false)

        // Encontrar el botón en el layout
        val buttonNavigate = view.findViewById<Button>(R.id.Femoralesbutton)

        // Configurar el click listener para navegar
        buttonNavigate.setOnClickListener {
            // Crear un nuevo fragmento
            val fragment = descriptiontpechoFragment()

            // Crear un Bundle para pasar información
            val bundle = Bundle()
            bundle.putString("exerciseTitle", "Press Pecho Inclinado")
            bundle.putString("exerciseDescription", "press de banca inclinado guiado no solo es sobre levantar peso; es sobre hacerlo con precisión. La máquina te permite concentrarte en grupos musculares específicos, especialmente el pecho. Esto facilita la conexión mente-músculo, un aspecto crucial para un desarrollo muscular efectivo y equilibrado.")
            bundle.putInt("exerciseImage", R.drawable.img_3) // ID del recurso de la imagen
            bundle.putInt("exerciseImage2", R.drawable.img_8)

            // Asignar el Bundle al fragmento
            fragment.arguments = bundle

            // Navegar al nuevo fragmento usando el NavController
            findNavController().navigate(R.id.descriptiontpechoFragment, bundle)
        }
        val buttonNavigatePlano = view.findViewById<Button>(R.id.cuadricepsbutton)

        // Configurar el click listener para navegar
        buttonNavigatePlano.setOnClickListener {
            // Crear un nuevo fragmento
            val fragment = descriptiontpechoFragment()

            // Crear un Bundle para pasar información
            val bundle = Bundle()
            bundle.putString("exerciseTitle", "Press plano pecho")
            bundle.putString("exerciseDescription", "EL BANCO PLANO ES UNO DE LOS EJERCICOS DE EMPUJE HORIZONTAL QUE MAYOR CARGA PERMITE DESPLAZAR. SI BIEN trabaja PRINCIPALMENTE el TREN SUPERIOR Y TRONCO, LOS NIVELES DE TENSIÓN Y EL ARCO FORMADO POR EL TRONCO, LO INTEGRAN AL RESTO DEL CUERPO EN UNA UNIDAD DE FUERZA.")
            bundle.putInt("exerciseImage", R.drawable.img_4) // ID del recurso de la imagen
            bundle.putInt("exerciseImage2", R.drawable.img_7)

            // Asignar el Bundle al fragmento
            fragment.arguments = bundle

            // Navegar al nuevo fragmento usando el NavController
            findNavController().navigate(R.id.descriptiontpechoFragment, bundle)
        }
        val buttonNavigateApertura = view.findViewById<Button>(R.id.aductoresbuttom)

        // Configurar el click listener para navegar
        buttonNavigateApertura.setOnClickListener {
            // Crear un nuevo fragmento
            val fragment = descriptiontpechoFragment()

            // Crear un Bundle para pasar información
            val bundle = Bundle()
            bundle.putString("exerciseTitle", "Aperturas")
            bundle.putString("exerciseDescription", "Los ejercicios de aperturas con mancuerna son ejercicios indicados especialmente para trabajar la zona pectoral. Es así que se involucran en dicho movimiento la región clavicular del mismo y también la esternocostal del músculo pectoral.")
            bundle.putInt("exerciseImage", R.drawable.img_5)
            bundle.putInt("exerciseImage2", R.drawable.img_6)

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
         * @return A new instance of fragment PechoHomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PechoHomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}