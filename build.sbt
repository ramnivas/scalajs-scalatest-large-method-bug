enablePlugins(ScalaJSPlugin)

organization := "example"
name := "test-example"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.6"

libraryDependencies ++= {
  Seq(
    "org.scalatest" %%% "scalatest" % "3.0.0-M1" % Test
  )
}

skip in packageJSDependencies := false
