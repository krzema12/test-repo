#!/usr/bin/env kotlin

@file:DependsOn("it.krzeminski:github-actions-kotlin-dsl:[0.2.0,)")

import it.krzeminski.githubactions.actions.Checkout
import it.krzeminski.githubactions.domain.RunnerType.UbuntuLatest
import it.krzeminski.githubactions.domain.Trigger.Push
import it.krzeminski.githubactions.dsl.workflow
import it.krzeminski.githubactions.yaml.toYaml
import java.nio.file.Paths

val workflow = workflow(
    name = "Test workflow",
    on = listOf(Push),
) {
    job(
        name = "test_job",
        runsOn = UbuntuLatest,
    ) {
        uses(
            name = "Check out",
            action = Checkout(),
        )

        run(
            name = "Hello world!",
            command = "echo 'hello!'",
        )
    }
}

println(workflow.toYaml(
    sourceFile = Paths.get(".github/workflows/test_workflow.main.kts"),
    targetFile = Paths.get(".github/workflows/test_workflow.yml")
))
