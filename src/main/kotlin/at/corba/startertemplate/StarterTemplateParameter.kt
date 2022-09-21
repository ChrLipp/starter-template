package at.corba.startertemplate

import org.springframework.stereotype.Component
import picocli.CommandLine

/**
 * Define your options here. Remove the example option.
 */
@CommandLine.Command(
    name = "Template",
    description = ["Description"],
    mixinStandardHelpOptions = true,
    versionProvider = FileVersionProvider::class)
@Component
class StarterTemplateParameter : Runnable {
    @CommandLine.Option(
        names = ["-o", "--option"],
        description = ["Some option."])
    private var option : String = ""

    override fun run() {
        println(option)
    }
}