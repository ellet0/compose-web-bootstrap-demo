import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import app.softwork.bootstrapcompose.Alert
import app.softwork.bootstrapcompose.Color
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    var count: Int by mutableStateOf(0)

    app.softwork.bootstrapcompose.require("./custom.scss")

    renderComposable(rootElementId = "root") {
        Div(attrs = {
            style { padding(25.px) }
            classes("container")
        }) {
            Alert(Color.Primary) {
                Text("Hello")
            }
            Button(attrs = {
                onClick { if (count > 0) count-- }
                classes("btn")
            }) {
                Text("-")
            }

            Span({ style { padding(15.px) } }) {
                Text("$count")
            }

            Button(attrs = {
                onClick { count++ }
                classes("btn")
            }) {
                Text("+")
            }
        }
    }
}

