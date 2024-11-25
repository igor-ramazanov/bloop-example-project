val one = project
  .in(file("one"))
  .settings(
    name := "one",
    scalaVersion := "3.5.2",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )

val two = project
  .in(file("two"))
  .dependsOn(one)
  .settings(
    name := "two",
    scalaVersion := "3.5.2",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )

lazy val root = project.in(file(".")).aggregate(one, two)
