// Module script for production
import kotlin.modules.*
fun project() {
    module("kotlin-kt3200") {
        sources += "D:/dseidler/private/kotlin-kt3200/src/kt3200.kt"
        // Classpath
        classpath += "C:/Programme/Java/jdk1.6.0_24/jre/lib/charsets.jar"
        classpath += "C:/Programme/Java/jdk1.6.0_24/jre/lib/deploy.jar"
        classpath += "C:/Programme/Java/jdk1.6.0_24/jre/lib/javaws.jar"
        classpath += "C:/Programme/Java/jdk1.6.0_24/jre/lib/jce.jar"
        classpath += "C:/Programme/Java/jdk1.6.0_24/jre/lib/jsse.jar"
        classpath += "C:/Programme/Java/jdk1.6.0_24/jre/lib/management-agent.jar"
        classpath += "C:/Programme/Java/jdk1.6.0_24/jre/lib/plugin.jar"
        classpath += "C:/Programme/Java/jdk1.6.0_24/jre/lib/resources.jar"
        classpath += "C:/Programme/Java/jdk1.6.0_24/jre/lib/rt.jar"
        classpath += "C:/Programme/Java/jdk1.6.0_24/jre/lib/ext/bcprov-jdk15on-147.jar"
        classpath += "C:/Programme/Java/jdk1.6.0_24/jre/lib/ext/dnsns.jar"
        classpath += "C:/Programme/Java/jdk1.6.0_24/jre/lib/ext/localedata.jar"
        classpath += "C:/Programme/Java/jdk1.6.0_24/jre/lib/ext/sunjce_provider.jar"
        classpath += "C:/Programme/Java/jdk1.6.0_24/jre/lib/ext/sunmscapi.jar"
        classpath += "C:/Programme/Java/jdk1.6.0_24/jre/lib/ext/sunpkcs11.jar"
        // Output directory, commented out
        //         classpath += "D:/dseidler/private/kotlin-kt3200/out/production/kotlin-kt3200"
        classpath += "D:/dseidler/private/kotlin-kt3200/lib/kotlin-runtime.jar"
        // Java Source Roots
        classpath += "D:/dseidler/private/kotlin-kt3200/src"
        // External annotations
        annotationsPath += "D:/dseidler/apps/IntelliJ IDEA Community Edition 12.0/lib/jdkAnnotations.jar"
        annotationsPath += "C:/Dokumente und Einstellungen/M2909/.IdeaIC12/config/plugins/Kotlin/kotlinc/lib/kotlin-jdk-annotations.jar"
    }
}
