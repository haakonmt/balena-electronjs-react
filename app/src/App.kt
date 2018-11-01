import react.RBuilder
import react.dom.code
import react.dom.h2
import react.dom.p
import styled.css
import styled.styledDiv
import styled.styledImg

@JsModule("src/logo.svg")
external val logo: dynamic

fun RBuilder.app() {
  styledDiv {
    css { +AppStyles.root }
    styledDiv {
      css { +AppStyles.header }

      styledImg(src = logo as? String) {
        css { +AppStyles.logo }
      }
      h2 { +"Welcome to resin-electronjs-kotlin-react" }
    }
    styledDiv {
      css { +AppStyles.intro }

      p {
        +"To get started, edit "
        code { +"src/App.kt" }
        +" and save to reload."
      }
    }
  }
}
