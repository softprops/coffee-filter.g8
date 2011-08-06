
import unfiltered.jetty.Http

import unfiltered.request.Path

object Server {
  def main(args: Array[String]) {
    Http(8080).context("/assets") {
      _.resources(Page.assets)
    }.filter(unfiltered.filter.Planify {
      case Path("/") => Page("iced venti soy")(Nil)(Nil)(
        <h1>
        <div>How do you like your <a href="http://jashkenas.github.com/coffee-script/">coffee</a>?</div>
        <div>Filtered or <a href="http://unfiltered.databinder.net/Unfiltered.html">unfiltered</a>?</div>
        </h1>)
    }).run
  }
}
