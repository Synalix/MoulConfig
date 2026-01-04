package com.github.synalix.moulconfig.errors

class ConfigError(message: String, cause: Throwable) : Error(message, cause)