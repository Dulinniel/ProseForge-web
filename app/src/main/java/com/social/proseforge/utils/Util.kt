package com.iut.studhelp.utils

fun ExtractUsernameFromEmailAdresse(emailAddress: String): String
{
    val atIndices: Int = emailAddress.indexOf( "@", 0)
    val extractedDNSFromEmailAddress: String = emailAddress.substring(atIndices, emailAddress.length)
    val extractedFullNameInEmailAddress: String = emailAddress.substring(0, atIndices)
    if ( extractedDNSFromEmailAddress == "@gmail.com" )
    {
        val dotIndices: Int = emailAddress.indexOf( ".", 0, true)
        val extractedUsernameFromExtractedFullNameInEmailAdresse: String = extractedFullNameInEmailAddress.substring(0, dotIndices)
        return extractedUsernameFromExtractedFullNameInEmailAdresse
    } else return ""

}