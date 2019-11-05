package com.example.androidjetpacksubmission.utils

import org.junit.Assert.*
import org.junit.Test

class DataHelperTest{
    @Test
    fun convertDurationToHoursAndMinute(){
        val duration = 122

        val convertedDuration = DataHelper.convertDurationToHoursAndMinute(duration)
        assertEquals("2h 2m",convertedDuration)
    }

    @Test
    fun convertDurationToHoursOnly(){
        val duration = 120

        val convertedDuration = DataHelper.convertDurationToHoursAndMinute(duration)
        assertEquals("2h",convertedDuration)
    }

    @Test
    fun convertDurationToMinuteOnly(){
        val duration = 45

        val convertedDuration = DataHelper.convertDurationToHoursAndMinute(duration)
        assertEquals("45m",convertedDuration)
    }

    @Test
    fun convertDurationWithZeroValue(){
        val duration = 0

        val convertedDuration = DataHelper.convertDurationToHoursAndMinute(duration)
        assertEquals("-",convertedDuration)
    }

    @Test
    fun convertLanguageCodeToEnglish(){
        val languageCode = "en"
        val convertedLanguageCode = DataHelper.convertLanguageCode(languageCode)
        assertEquals("English",convertedLanguageCode)
    }

    @Test
    fun convertLanguageCodeToJapanese(){
        val languageCode = "ja"
        val convertedLanguageCode = DataHelper.convertLanguageCode(languageCode)
        assertEquals("Japanese",convertedLanguageCode)
    }

    @Test
    fun convertLanguageCodeToCantonese(){
        val languageCode = "cn"
        val convertedLanguageCode = DataHelper.convertLanguageCode(languageCode)
        assertEquals("Cantonese",convertedLanguageCode)
    }

    @Test
    fun convertLanguageCodeWithUnknownCode(){
        val languageCode = "xxx"
        val convertedLanguageCode = DataHelper.convertLanguageCode(languageCode)
        assertEquals("-",convertedLanguageCode)
    }

    @Test
    fun convertNominalToDollarWithValue(){
        val nominal = 1000L
        val convertedNominal = DataHelper.convertNominalToDollar(nominal)
        assertEquals("$1,000",convertedNominal)
    }

    @Test
    fun convertNominalToDollarWithZeroValue(){
        val nominal = 0L
        val convertedNominal = DataHelper.convertNominalToDollar(nominal)
        assertEquals("-",convertedNominal)
    }

}