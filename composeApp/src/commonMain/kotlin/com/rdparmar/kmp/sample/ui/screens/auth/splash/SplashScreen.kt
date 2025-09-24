package com.rdparmar.kmp.sample.ui.screens.auth.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.rdparmar.kmp.sample.utils.WindowSize
import kmp_sample.composeapp.generated.resources.Res
import kmp_sample.composeapp.generated.resources.app_icon
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun SplashScreen(
    navigator: NavHostController,
    windowSize: WindowSize = WindowSize.COMPACT,
    mainPaddingValues: PaddingValues
) {
    Scaffold(modifier = Modifier.fillMaxSize().padding(mainPaddingValues)) { paddingValues ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(Res.drawable.app_icon),
                "app_icon", modifier = Modifier.width(100.dp).height(100.dp)
            )
        }

    }
}

@Composable
@Preview
fun previewFunction() {

}