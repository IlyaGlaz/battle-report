package ru.iglaz.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.percent
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
            .toAttrs()
    ) {
        Box(
            Modifier
                .height(56.px)
                .boxShadow(spreadRadius = 1.px, color = Color.rgba(17, 17, 17, 0.2f)),
            contentAlignment = Alignment.Center
        ) {
            Row(
                Modifier
                    .fillMaxWidth(90.percent)
                    .fontSize(1.5.cssRem),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Link(
                    "https://github.com/IlyaGlaz/battle-report",
                    Modifier.margin(right = 32.px)
                ) {
                    FaGithub()
                }

                Link(
                    "/user", "Мои отчеты",
                    Modifier.margin(left = 1.em, right = 1.em)
                )
                Link(
                    "/battle", "Поле битвы",
                    Modifier.margin(left = 1.em, right = 1.em)
                )
            }
        }

        H1 { Text("Домашняя страница") }
    }
}


