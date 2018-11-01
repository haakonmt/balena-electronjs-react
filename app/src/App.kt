import react.RBuilder
import react.dom.code
import react.dom.h2
import react.dom.p
import styled.css
import styled.styledDiv
import styled.styledImg

@JsModule("src/logo.svg")
external val logo: dynamic

/*
// https://github.com/electron/electron/issues/7300
// We don't want to bundle electron in the webpack process so we use it's globally exposed require method.
const electron = window.require('electron');
const fs = electron.remote.require('fs');
var files = fs.readdirSync('./');
 */

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
        // TODO: You have access to all node apis. Here is a list of files in this directory.
        /*
        {
            files.map((file, key) => {
              return <pre key={key}>{file}</pre>;
            })
          }
         */
      }
    }
  }
}
