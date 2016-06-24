name := """add-stop-hook"""

version := "1.0-SNAPSHOT"

scalaVersion in ThisBuild := "2.11.7"

// compile this in SBT as ";project library; publishLocal" before calling run
lazy val library = (project in file("library")).settings(
  libraryDependencies += "com.typesafe.play" %% "play" % "2.4.6"
)

lazy val root = (project in file(".")).enablePlugins(PlayJava).dependsOn(library).aggregate(library)

libraryDependencies ++= Seq(
)

routesGenerator := InjectedRoutesGenerator
