package eu.tutorials.oopexample.models.hclc

import android.util.Log

class Receipt {

    var itemNum: Int = 0
    var itemCost: Double = 0.0

    init {
        printReceiptTotal()

    }

    private fun calculateSum(itemNum: Int, itemCost: Double): Double {

        return (itemNum * itemCost)
    }

    private fun calculateSumWithTax(sum: Double): Double {

        return (sum * .26)

    }


    private fun printReceiptTotal() {

        val sum = calculateSum(itemNum, itemCost)
        val sumWithTax = calculateSumWithTax(sum)


        Log.d("Receipt Total is ", sumWithTax.toString())


    }


}