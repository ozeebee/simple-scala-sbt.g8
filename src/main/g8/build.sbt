organization := "$organization$"

name := "$name$"

version := "$version$"

scalaVersion := "$scala_version$"

resolvers ++= Seq(
	"Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
	// logging
	"org.slf4j" %  "slf4j-api" % "1.7.+",
	"ch.qos.logback" % "logback-classic" % "$logback_version$"
)

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")
