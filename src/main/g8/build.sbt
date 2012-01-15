organization := "com.example"

name := "$name$"

version := "0.1.0"

seq(coffeeSettings:_*)

seq(lessSettings:_*)

(resourceManaged in (Compile, CoffeeKeys.coffee)) <<= (crossTarget in Compile)(_ / "www" / "js")

(resourceManaged in (Compile, LessKeys.less)) <<= (crossTarget in Compile)(_ / "www" / "css")

libraryDependencies ++= Seq(
   "net.databinder" %% "unfiltered-jetty" % "$unfiltered_version$",
   "net.databinder" %% "unfiltered-filter" % "$unfiltered_version$",
   "net.databinder" %% "unfiltered-json" % "$unfiltered_version$"
)
