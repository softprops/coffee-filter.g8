libraryDependencies <++= sbtVersion(v => Seq(
  "me.lessis" %% "coffeescripted-sbt" % "0.1.2-%s".format(v),
  "org.jcoffeescript" % "jcoffeescript" % "1.1" from "http://cloud.github.com/downloads/yeungda/jcoffeescript/jcoffeescript-1.1.jar"
))

resolvers += "less is" at "http://repo.lessis.me"
