fun main() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val  requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("support for $requested: $isSupported")
}