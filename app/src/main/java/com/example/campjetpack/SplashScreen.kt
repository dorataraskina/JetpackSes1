package com.example.campjetpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.campjetpack.ui.theme.Splash1
import com.example.campjetpack.ui.theme.Splash2
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
    LaunchedEffect(key1 = true)
    {
        delay(2000)

    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Splash1, Splash2)
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier
                .height(200.dp)
                .width(200.dp),
            bitmap = ImageBitmap
                .imageResource(id = R.drawable.splash),
            contentDescription = ""
        )
    }
}
/*
@Preview(showBackground = true)
@Composable
fun SplashPreview() {
    CampJetpackTheme {
        SplashScreen(navController = )
    }
}*/