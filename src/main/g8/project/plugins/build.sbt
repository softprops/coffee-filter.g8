libraryDependencies <++= sbtVersion(v => Seq(
  "me.lessis" %% "coffeescripted-sbt" % "$coffeescripted_sbt_version$-%s".format(v)
))

resolvers += "less is" at "http://repo.lessis.me"
