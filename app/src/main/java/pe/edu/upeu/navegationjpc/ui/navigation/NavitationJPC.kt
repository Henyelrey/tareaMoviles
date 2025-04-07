package pe.edu.upeu.navegationjpc.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import pe.edu.upeu.navegacionjpc.ui.presentation.screens.BarcodeScanningScreen
import pe.edu.upeu.navegationjpc.ui.presentation.screens.CalclatorScreen
import pe.edu.upeu.navegationjpc.ui.presentation.screens.HomeScreen
import pe.edu.upeu.navegationjpc.ui.presentation.screens.InputExampleScreen
import pe.edu.upeu.navegationjpc.ui.presentation.screens.ProfileScreen
import pe.edu.upeu.navegationjpc.ui.presentation.screens.SettingsScreen
import pe.edu.upeu.navegationjpc.ui.presentation.screens.TimePickerScreen

@Composable
fun NavigationHost(navController: NavHostController) {
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen() }
        composable("profile") { ProfileScreen() }
        composable("settings") { SettingsScreen() }
        composable("barcode") { BarcodeScanningScreen(navController) }
        composable("Calc") { CalclatorScreen() }
        composable("time") { TimePickerScreen() }
        composable("hora") { InputExampleScreen() }
    }
}
