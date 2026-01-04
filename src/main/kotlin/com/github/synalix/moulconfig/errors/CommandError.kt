package com.github.synalix.moulconfig.errors

class CommandError(message: String, cause: Throwable) : Error(message, cause)