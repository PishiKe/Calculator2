package com.pishi.calculator.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pishi.calculator.R
import com.pishi.calculator.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding : FragmentMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentMainBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnClear.setOnClickListener {

        }
        binding.btnMod.setOnClickListener {  }
        binding.btnPercentage.setOnClickListener{}
        binding.btnNine.setOnClickListener {
        }
        binding.btnEight.setOnClickListener {  }
        binding.btnSeven.setOnClickListener {  }
        binding.btnMultiply.setOnClickListener {  }
        binding.btnFour.setOnClickListener {
            numberClicked(4)
        }
        binding.btnFive.setOnClickListener {  }
        binding.btnSix.setOnClickListener {  }
        binding.btnDivide.setOnClickListener {  }
        binding.btnOne.setOnClickListener {  }
        binding.btnTwo.setOnClickListener {  }
        binding.btnThree.setOnClickListener {  }
        binding.btnPlus.setOnClickListener {  }
        binding.btnDoubleZero.setOnClickListener {  }
        binding.btnZero.setOnClickListener {  }
        binding.btnEquals.setOnClickListener {  }
    }

    private fun numberClicked (numberClicked : Int){
        val number = binding.etIo.text.toString() + numberClicked.toString()
        binding.etIo.setText(number)
    }
}