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
 * Use the [EspaldahomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EspaldahomeFragment : Fragment() {
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
        var view =  inflater.inflate(R.layout.fragment_espaldahome, container, false)

        val buttonNavigate = view.findViewById<Button>(R.id.pullUpsButton)

        // Configurar el click listener para navegar
        buttonNavigate.setOnClickListener {
            // Crear un nuevo fragmento
            val fragment = descriptiontpechoFragment()

            // Crear un Bundle para pasar información
            val bundle = Bundle()
            bundle.putString("exerciseTitle", "Pull Ups")
            bundle.putString("exerciseDescription", "Desde una posición de pie, estírate y coloca las manos en la barra. Sube o salta hasta llegar a la posición de dominada en la barra. Baja lentamente durante cuatro o cinco segundos hasta llegar al suelo.  ")
            bundle.putInt("exerciseImage", R.drawable.img_22) // ID del recurso de la imagen
            bundle.putInt("exerciseImage2", R.drawable.img_52)

            // Asignar el Bundle al fragmento
            fragment.arguments = bundle

            // Navegar al nuevo fragmento usando el NavController
            findNavController().navigate(R.id.descriptiontpechoFragment, bundle)
        }
        val buttonNavigateDea = view.findViewById<Button>(R.id.deadliftButton)

        // Configurar el click listener para navegar
        buttonNavigateDea.setOnClickListener {
            // Crear un nuevo fragmento
            val fragment = descriptiontpechoFragment()

            // Crear un Bundle para pasar información
            val bundle = Bundle()
            bundle.putString("exerciseTitle", "Deadlif")
            bundle.putString("exerciseDescription", "La barra se encuentra en el suelo y el atleta debe asumir una posición erecta, con las rodillas bloqueadas al principio y al final del levantamiento. Éste debe colocarse mirando la barra y, flexionando sus piernas, se agacha hasta tener la barra a una distancia de manos ligeramente mayor a la distancia de los hombros. Luego, siempre mirando hacia el frente, empuja con las caderas adelante y posteriormente tirando con las piernas hasta quedar nuevamente erguido con las piernas trabadas. Los hombros deben quedar hacia atrás y la espalda con una curva hacia dentro. ")
            bundle.putInt("exerciseImage", R.drawable.img_50) // ID del recurso de la imagen
            bundle.putInt("exerciseImage2", R.drawable.img_51)

            // Asignar el Bundle al fragmento
            fragment.arguments = bundle

            // Navegar al nuevo fragmento usando el NavController
            findNavController().navigate(R.id.descriptiontpechoFragment, bundle)
        }
        val buttonNavigateRows = view.findViewById<Button>(R.id.rowsButton)

        // Configurar el click listener para navegar
        buttonNavigateRows.setOnClickListener {
            // Crear un nuevo fragmento
            val fragment = descriptiontpechoFragment()

            // Crear un Bundle para pasar información
            val bundle = Bundle()
            bundle.putString("exerciseTitle", "Rows")
            bundle.putString("exerciseDescription", "Barbell Row o remo con barra se realiza: Sosteniendo una barra con un agarre pronado (palmas hacia abajo), doble sutilmente las rodillas y traiga su torso hacia adelante, doblando la cintura, a medida que preserva la espalda recta hasta que se encuentre casi paralela al piso. ")
            bundle.putInt("exerciseImage", R.drawable.img_48) // ID del recurso de la imagen
            bundle.putInt("exerciseImage2", R.drawable.img_49)

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
         * @return A new instance of fragment EspaldahomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            EspaldahomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}