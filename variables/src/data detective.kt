fun main() {
    println("Welcome, detective! A mystery awaits your expertise...")

    // The Mutable Suspect
    var suspiciousEvidence = "The butler did it." // Intentionally declared as var
    println("Initial evidence: $suspiciousEvidence")

    // TODO: Question the evidence (Experiment with suspiciousEvidence)
    suspiciousEvidence = "The dog took it"

    // The Unchanging Witness
    val reliableAccount = "The first alibi holds true."
    println("Reliable account: $reliableAccount")

    // TODO: Attempt to tamper with reliableAccount and observe the consequences

    suspiciousEvidence = "$%% is this right? !@#4dka3"

    // Crack the Case!
    println("Your task, detective: Ensure the evidence remains untampered with.")
    println("Find the correct keyword to make the evidence immutable (unchangable).")

    // Test Your Skills
    if (isEvidenceSecure(suspiciousEvidence)) {
        println("Congratulations, detective! You've preserved the integrity of the evidence.")
        println("The truth prevails!")
    } else {
        println("The evidence remains vulnerable to manipulation.")
        println("Keep investigating, detective!")
    }
}

fun isEvidenceSecure(suspiciousEvidence: String): Boolean {
    // Check to see if suspiciousEvidence is now immutable
    // TODO: Replace "?" with the correct check
    return suspiciousEvidence == "?"
}