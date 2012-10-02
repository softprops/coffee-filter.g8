addSbtPlugin("me.lessis" % "coffeescripted-sbt" % "$coffeescripted_sbt_version$")

addSbtPlugin("me.lessis" % "less-sbt" % "$less_sbt_version$")

resolvers += "less is" at "http://repo.lessis.me"

resolvers += Resolver.url("sbt-plugin-releases",
  new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(
    Resolver.ivyStylePatterns)
