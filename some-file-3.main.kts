#!/usr/bin/env kotlin
@file:DependsOn("it.krzeminski:github-actions-kotlin-dsl:[0.2.0,)")
@file:DependsOn(
  "org.eclipse.jgit:org.eclipse.jgit:[6.2.0.202206071550-r]"
)

@file : DependsOn
  (
  "org.jetbrains.lets-plot:lets-plot-kotlin-jvm:3.0.2"

)
@file : DependsOn
  (
  "org.jetbrains.lets-plot:lets-plot-kotlin-jvm:(,3.0.0]"

)

// ...

println("Hello world")
