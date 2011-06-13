organization := "com.example"

name := "$name$"

version := "0.1.0"

libraryDependencies ++= Seq(
   "net.databinder" %% "unfiltered-jetty" % "$unfiltered_version$",
   "net.databinder" %% "unfiltered-filter" % "$unfiltered_version$",
   "net.databinder" %% "unfiltered-json" % "$unfiltered_version$"
)