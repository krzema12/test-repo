#!/usr/bin/env kotlin

@file:DependsOn("it.krzeminski:github-actions-kotlin-dsl:0.15.0")

import it.krzeminski.githubactions.actions.actions.CheckoutV3
import it.krzeminski.githubactions.domain.RunnerType.UbuntuLatest
import it.krzeminski.githubactions.domain.triggers.Push
import it.krzeminski.githubactions.dsl.workflow
import it.krzeminski.githubactions.yaml.writeToFile
import java.nio.file.Paths


workflow(
    name = "Test workflow",
    on = listOf(Push()),
    sourceFile = Paths.get(".github/workflows/build.main.kts"),
    targetFile = Paths.get(".github/workflows/build.yaml")
) {
    job(id = "test_job", runsOn = UbuntuLatest) {
        uses(name = "Check out", action = CheckoutV3())
        run(name = "Print greeting", command = "echo 'Hello world!'")
    }
}.writeToFile()