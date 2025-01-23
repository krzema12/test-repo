#!/usr/bin/env kotlin

@file:DependsOn("it.krzeminski:github-actions-kotlin-dsl:0.4.0")

import it.krzeminski.githubactions.actions.actions.CheckoutV2
import it.krzeminski.githubactions.domain.RunnerType.UbuntuLatest
import it.krzeminski.githubactions.domain.Trigger.Push
import it.krzeminski.githubactions.dsl.workflow
import it.krzeminski.githubactions.yaml.writeToFile
import java.nio.file.Paths


workflow(
    name = "Test workflow",
    on = listOf(Push),
    sourceFile = Paths.get(".github/workflows/build.main.kts"),
    targetFile = Paths.get(".github/workflows/build.yaml")
) {
    job(name = "test_job", runsOn = UbuntuLatest) {
        uses(name = "Check out", action = CheckoutV2())
        run(name = "Print greeting", command = "echo 'Hello world!'")
    }
}.writeToFile()