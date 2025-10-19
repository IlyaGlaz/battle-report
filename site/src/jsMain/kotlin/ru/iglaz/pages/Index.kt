package ru.iglaz.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {
    Div(
        Modifier
            .fillMaxSize()
            .background(color = com.varabyte.kobweb.compose.ui.graphics.Color.rgb(237, 237, 237))
            .toAttrs()
    ) {
        Box(Modifier.height(50.px).background(color = Color.white), Alignment.Center) {
            Row {
                Link("/", "Домашняя страница")
                Link("report/", "Отчеты")
            }
        }
        H1 { Text("Домашняя страница") }
    }
}

