
import kotlinx.css.Color
import kotlinx.css.TextAlign
import kotlinx.css.padding
import kotlinx.css.properties.*
import kotlinx.css.px
import styled.StyleSheet
import styled.animation
import styled.keyframes

object AppStyles : StyleSheet("app", isStatic = true) {
  val root by css {
    textAlign = TextAlign.center
  }

  val header by css {
    backgroundColor = Color("#222")
    height = 150.px
    padding(all = 20.px)
    color = Color.white
  }

  val intro by css {
    // TODO fontSize = FontSize.large
  }

  val logo by css {
    height = 80.px
    animation(
      iterationCount = IterationCount.infinite,
      duration = 20.s,
      timing = Timing.linear
    ) {
      keyframes {
        from {
          transform { rotate(0.deg) }
        }
        to {
          transform { rotate(360.deg) }
        }
      }
    }
  }
}
