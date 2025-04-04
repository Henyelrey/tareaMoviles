package pe.edu.upeu.navegationjpc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.upeu.navegationjpc.ui.presentation.component.MyAppDrawer
import pe.edu.upeu.navegationjpc.ui.theme.DarkColorScheme
import pe.edu.upeu.navegationjpc.ui.theme.LightColorScheme
import pe.edu.upeu.navegationjpc.ui.theme.NavegationJPCTheme
import pe.edu.upeu.navegationjpc.ui.theme.ThemeType
import pe.edu.upeu.navegationjpc.ui.theme.sGreenDarkScheme
import pe.edu.upeu.navegationjpc.ui.theme.sGreenLightScheme
import pe.edu.upeu.navegationjpc.utils.conttexto
import pe.edu.upeu.navegationjpc.utils.isNight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val themeType= remember { mutableStateOf(ThemeType.RED) }
            val darkThemeX= isNight()
            val darkTheme= remember { mutableStateOf(darkThemeX) }
            conttexto.CONTEXTO_APPX=this
            val colorScheme=when(themeType.value){
                ThemeType.RED -> { if(darkTheme.value) DarkColorScheme else LightColorScheme }
                ThemeType.GREEN -> { if(darkTheme.value) sGreenDarkScheme else sGreenLightScheme }
                else -> {sGreenLightScheme}
            }


            NavegationJPCTheme(colorScheme = colorScheme) {
                MyAppDrawer(darkMode = darkTheme, themeType = themeType)
                /*
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android Henyel paso por aqui",
                        modifier = Modifier.padding(innerPadding)
                    )
                }*/
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NavegationJPCTheme(colorScheme = sGreenLightScheme)  {
        Greeting("Android")
    }
}