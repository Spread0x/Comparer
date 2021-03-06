organization := "com.phasmidsoftware"

name := "Comparer"

version := "1.0.8"

scalaVersion := "2.13.1"

val scalaTestVersion = "3.1.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % scalaTestVersion % "test"
)
