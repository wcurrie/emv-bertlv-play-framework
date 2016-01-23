name := "bertlv-play-ebean"

version := "1.0"

resolvers += Resolver.mavenLocal

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)

scalaVersion := "2.11.6"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  ws,
  "mysql" % "mysql-connector-java" % "5.1.36",
  "org.json" % "json" % "20151123",
  "io.github.binaryfoo" % "emv-bertlv" % "0.1.6-SNAPSHOT"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

fork in run := true
