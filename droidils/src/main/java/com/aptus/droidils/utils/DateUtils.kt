package com.aptus.droidils.utils

import java.text.SimpleDateFormat
import java.util.*

/**
 * @param dateFormat The Date format eg.(yyyy-MM-dd'T'hh:mm).
 * @return Formatted date
 * */
fun Date.toFormatDateTime(dateFormat: String): String = this.let { SimpleDateFormat(dateFormat, Locale.US).format(this) }