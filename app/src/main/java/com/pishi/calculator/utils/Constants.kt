package com.pishi.calculator.utils

object Constants {

    const val PLUS = "plus"
    const val MULTIPLY = "multiply"
    const val MODULUS = "modulus"
    const val MINUS = "minus"
    const val DIVIDE = "divide"
    const val EQUALS = "equals"
    const val PERCENT = "percent"


    fun operationTypes() :ArrayList<String>{

        val list = ArrayList<String>()

        list.add("plus")
        list.add("multiply")
        list.add("modulus")
        list.add("minus")
        list.add("divide")
        list.add("equals")
        list.add("percent")

        return list
    }
}