package com.cronocode.moviecatalog

class CommnClass {
    fun getIntToStar(rating: Int): String? {
        val fillStar = "\u2605"
        val blankStar = "\u2606"
        var star = ""
        for (i in 0 until rating) {
            star = "$star $fillStar"
        }
        for (j in 5 - rating downTo 1) {
            star = "$star $blankStar"
        }
        return star
    }
}