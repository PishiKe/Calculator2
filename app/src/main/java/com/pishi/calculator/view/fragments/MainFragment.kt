package com.pishi.calculator.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pishi.calculator.R
import com.pishi.calculator.databinding.FragmentMainBinding
import kotlin.properties.Delegates

class MainFragment : Fragment() {

    private lateinit var binding : FragmentMainBinding
    private var baseValue = 0.0f
    private var secondValue = 0.0f
    private var isPlus = false
    private var isMinus = false
    private var isMultiply = false
    private var isDivide = false


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        buttons()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    private fun buttons (){
        binding.btnClear.setOnClickListener {
            binding.etIo.text.clear()
        }
        binding.btnMod.setOnClickListener { }
        binding.btnPercentage.setOnClickListener {}
        binding.btnNine.setOnClickListener {
            numberClicked(9)
        }
        binding.btnEight.setOnClickListener {
            numberClicked(8)
        }
        binding.btnSeven.setOnClickListener {
            numberClicked(7)
        }
        binding.btnMultiply.setOnClickListener {
        }
        binding.btnFour.setOnClickListener {
            numberClicked(4)
        }
        binding.btnFive.setOnClickListener {
            numberClicked(5)
        }
        binding.btnSix.setOnClickListener {
            numberClicked(6)
        }
        binding.btnDivide.setOnClickListener { }
        binding.btnOne.setOnClickListener {
            numberClicked(1)
        }
        binding.btnTwo.setOnClickListener {
            numberClicked(2)
        }
        binding.btnThree.setOnClickListener {
            numberClicked(3)
        }
        binding.btnPlus.setOnClickListener {
            additionClicked()
        }
        binding.btnDoubleZero.setOnClickListener { }
        binding.btnZero.setOnClickListener { }
        binding.btnEquals.setOnClickListener {
            equalClicked()
        }
    }

    private fun numberClicked (numberClicked : Int){
        val number = binding.etIo.text.toString() + numberClicked.toString()
        binding.etIo.setText(number)
    }

    private fun additionClicked (){
        isPlus = true
        baseValue = binding.etIo.text.toString().toFloat()
        binding.etIo.text.clear()
    }

    private fun multiplyClicked (){
        isMultiply = true
        baseValue = binding.etIo.text.toString().toFloat()
        binding.etIo.text.clear()
    }

    private fun divideClicked(){
        isDivide = true
        baseValue = binding.etIo.text.toString().toFloat()
        binding.etIo.text.clear()
    }

    private fun minusClicked(){
        isMinus = true
        baseValue = binding.etIo.text.toString().toFloat()
        binding.etIo.text.clear()

        if (numberClicked())
    }

    private fun addition (){
        secondValue = binding.etIo.text.toString().toFloat()
        var result = baseValue + secondValue
        binding.etIo.setText(result.toString())
        isPlus = false
    }

    private fun multiply(){
        secondValue = binding.etIo.text.toString().toFloat()
        val result = secondValue * baseValue
        binding.etIo.setText(result.toString())
    }




    private fun equalClicked (){
        when {
            isPlus -> {
                addition()
            }
            isMultiply ->{
                multiply()

            } else ->{
                binding.etIo.text.clear()
            }

        }
    }
}