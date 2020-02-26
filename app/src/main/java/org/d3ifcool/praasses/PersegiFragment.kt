package org.d3ifcool.praasses


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_persegi.*
import kotlinx.android.synthetic.main.fragment_persegi.view.*
import org.d3ifcool.praasses.databinding.FragmentPersegiBinding

/**
 * A simple [Fragment] subclass.
 */
class PersegiFragment : Fragment() {

    var luas = 0
    var keliling = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var binding: FragmentPersegiBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_persegi, container, false)
        var panjang = binding.inputPanjang.toString()
        var lebar = binding.inputLebar.toString()

        binding.hitungPersegi.setOnClickListener {
            luas = (panjang.toInt()) * (lebar.toInt())
            keliling = ((panjang.toInt()) * 2) + ((lebar.toInt()) * 2)
            binding.hasilLuas = luas
        }

        binding.hasilLuas
        return binding.root
    }



}
