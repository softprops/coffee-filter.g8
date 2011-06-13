
import unfiltered.jetty.Http

import unfiltered.request.Path

object Server {
  def main(args: Array[String]) {
    Http(8080).context("/assets") {
      _.resources(Page.assets)
    }.filter(unfiltered.filter.Planify {
      case Path("/") => Page("home")(Nil)(Nil)(
        <h1>How do you like your <a href="http://jashkenas.github.com/coffee-script/">coffee</a>?</h1>)
    }).run
  }
}
