package com.farhan.tanvir.androidcleanarchitecture
import com.farhan.tanvir.androidcleanarchitecture.presentation.navigation.NavGraph
import com.farhan.tanvir.androidcleanarchitecture.ui.theme.AndroidCleanArchitectureTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidCleanArchitectureTheme {
                navController = rememberNavController()
                NavGraph(navController = navController)
            }
        }
    }
}