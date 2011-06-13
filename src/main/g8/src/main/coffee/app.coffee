# any *.coffee file under where will resolve to the a path relative to assets/js in your html
this.requireIf = (src, defined, callback) ->
  if defined() then callback() else
    s = document.createElement('script')
    s.type = 'text/javascript'
    s.src = src
    document.getElementsByTagName('head')[0].appendChild(s)
    unless s.attachEvent then s.onload = callback
    else
      s.onreadystatechange = () ->
        if @readyState in ['loaded', 'complete']
          @onreadystatechange = null
          callback()
        return
   return

this.requireIf(
  "https://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js",
  () -> jQuery?,
  () ->
    j = jQuery.noConflict()
    j(() ->
      # jquery is available here referenced by `j`
      j("h1").fadeIn("slow").animate(
        "margin-top": "0"
      , 500)
      return
    )
    return
)
