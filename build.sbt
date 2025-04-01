val scala3Version = "3.6.4"

lazy val root = project
  .in(file("."))
  .settings(
    name := "suduku",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,
    scalacOptions ++= Seq(
      "-unchecked",
      "-deprecation",
      "-feature",
      "-language:implicitConversions",
      "-language:existentials",
      "-Werror",
    ),
    libraryDependencies ++= Seq(
      "org.scala-lang.modules" %% "scala-parallel-collections" % "1.0.4",
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )
  )
