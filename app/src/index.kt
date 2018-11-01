
import kotlinx.css.body
import kotlinx.css.margin
import kotlinx.css.padding
import kotlinx.css.px
import react.dom.render
import styled.StyledComponents
import styled.injectGlobal
import kotlin.browser.document

fun main(args: Array<String>) {
  StyledComponents.injectGlobal {
    body {
      margin(all = 0.px)
      padding(all = 0.px)
      fontFamily = "sans-serif"
    }
  }

  render(document.getElementById("root")) {
    app()
  }
}
