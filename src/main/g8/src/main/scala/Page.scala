
import unfiltered.response._

import scala.xml

object Page {

  def assets = new java.net.URL(getClass.getResource("/www/robots.txt"), ".")

  def apply(title: String)(styles: xml.NodeSeq)(scripts: xml.NodeSeq)(content: xml.NodeSeq) = Html(
    <html>
      <head>
        <title>{ title }</title>
        <link rel="stylesheet" type="text/css" href="/assets/css/app.css" />
        { styles }
      </head>
      <body>
        <div id="container">
        { content }
        </div>
       <script type="text/javascript" src="/assets/js/app.js"></script> { scripts }
      </body>
    </html>
  )
}
