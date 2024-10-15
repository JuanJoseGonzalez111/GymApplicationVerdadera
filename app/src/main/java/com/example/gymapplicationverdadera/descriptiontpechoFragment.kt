package com.example.gymapplicationverdadera

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [descriptiontpechoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class descriptiontpechoFragment : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_descriptiontpecho, container, false)


        val exerciseTitle = arguments?.getString("exerciseTitle")
        val exerciseDescription = arguments?.getString("exerciseDescription")
        val exerciseImage = arguments?.getInt("exerciseImage") ?: R.drawable.img_3 // imagen por defecto si no hay
        val exerciseImage2 = arguments?.getInt("exerciseImage2") ?: R.drawable.img
        // Referencias a los TextViews y ImageView en el layout
        val textViewTitle: TextView = view.findViewById(R.id.textViewTitle)
        val textViewDescription: TextView = view.findViewById(R.id.textViewDescription)
        val imageView: ImageView = view.findViewById(R.id.imageView)
        val imageView2: ImageView = view.findViewById(R.id.imageView2)


        textViewTitle.text = exerciseTitle
        textViewDescription.text = exerciseDescription
        imageView.setImageResource(exerciseImage)
        imageView2.setImageResource(exerciseImage2)

        return view
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment descriptiontpechoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            descriptiontpechoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}