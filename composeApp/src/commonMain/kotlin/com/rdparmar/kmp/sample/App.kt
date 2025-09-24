package com.rdparmar.kmp.sample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.rdparmar.kmp.sample.ui.theme.AppTheme
import com.rdparmar.kmp.sample.ui.theme.DarkPrimaryColor
import com.rdparmar.kmp.sample.utils.WindowSize
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    var windowSize by remember { mutableStateOf(WindowSize.COMPACT) }

    AppTheme {
        val navHostController = rememberNavController()
        var showContent by remember { mutableStateOf(false) }

        BoxWithConstraints(Modifier.fillMaxWidth().background(color = DarkPrimaryColor)) {
            windowSize = WindowSize.basedOnWidth(this.minWidth)
            MyComposable()
        }
    }
}

@Composable
fun MyComposable() {
    Text(text = "Rakesh")
}

@Preview
@Composable
fun previewComposable(){
    MyComposable()
}
