#!/usr/bin/env kotlin
@file:DependsOn("it.krzeminski:github-actions-kotlin-dsl:[0.2.0,)")
@file:DependsOn(
  "org.eclipse.jgit:org.eclipse.jgit:[4.6.0.201612231935-r]"
)

@file : DependsOn
  (
  "org.jetbrains.lets-plot:lets-plot-kotlin-jvm:4.0.0"

)
@file : DependsOn
  (
  "org.jetbrains.lets-plot:lets-plot-kotlin-jvm:(,4.0.0]"

)

// ...

println("Hello world")
