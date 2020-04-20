val ScalatraVersion = "2.7.0"

organization := "br.com.productsregister"

name := "Products Register"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.13.1"

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.4.19.v20190610" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
)

enablePlugins(SbtTwirl)
enablePlugins(ScalatraPlugin)

//import Dependencies._
//
//ThisBuild / scalaVersion     := "2.13.1"
//ThisBuild / version          := "0.1.0-SNAPSHOT"
//ThisBuild / organization     := "br.com.productsregister"
//ThisBuild / organizationName := "productsregister"
//
//lazy val root = (project in file("."))
//  .settings(
//    name := "products-register",
//    libraryDependencies += scalaTest % Test
//  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
