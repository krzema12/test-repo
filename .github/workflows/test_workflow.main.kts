#!/usr/bin/env kotlin

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

println(workflow.toYaml())
