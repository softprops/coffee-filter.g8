organization := "com.example"

name := "$name$"

version := "0.1.0"

seq(coffeeSettings:_*)

seq(lessSettings:_*)

targetDirectory in Coffee <<= (resourceManaged in Compile) { _ / "www" / "js" }

libraryDependencies ++= Seq(
   "net.databinder" %% "unfiltered-jetty" % "$unfiltered_version$",
   "net.databinder" %% "unfiltered-filter" % "$unfiltered_version$",
   "net.databinder" %% "unfiltered-json" % "$unfiltered_version$"
)
