ThisBuild / scalaVersion := "2.13.6"
ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val core = project
  .dependsOn(other)

lazy val other = project
