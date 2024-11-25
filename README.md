# sbt project with 2 sub-projects compiled with Scala 3

## Usage

This is a normal sbt project. You can compile code with `sbt compile`, run it with `sbt run`, and `sbt console` will start a Scala 3 REPL.

For more information on the sbt-dotty plugin, see the
[scala3-example-project](https://github.com/scala/scala3-example-project/blob/main/README.md).

## Prerequisites
`sbt`: https://www.scala-sbt.org.

## Bloop
Initialize with `sbt bloopInstall`, and then:
1. `bloop run one`: run the project `one`
1. `bloop run two` run the project `two`
1. `bloop test one`: test the project `one`
1. `bloop test two`: test the project `two`
1. `bloop test root --include-dependencies`: test the both projects
1. `bloop compile root --cascade`: compile the whole project
1. `bloop test one --only Test`: test only `Test` class
1. `bloop test two --only Test`: test only `Test` class
1. `bloop test root --only Test`: test only `Test` class
1. `bloop projects`: list projects (`one`, `one-test`, `two`, `two-test`, `root`, `root-test`)
