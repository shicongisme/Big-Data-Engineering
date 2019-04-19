name := "Ingestion-StockTwits-Producer"

version := "1.0"

scalaVersion := "2.11.12"

// https://mvnrepository.com/artifact/org.apache.kafka/kafka
libraryDependencies += "org.apache.kafka" %% "kafka" % "2.1.1"

libraryDependencies += "org.scalaj" %% "scalaj-http" % "2.4.1"

libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.10"