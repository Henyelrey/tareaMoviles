package pe.edu.upeu.navegationjpc.ui.presentation.screens


import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import pe.edu.upeu.navegationjpc.ui.presentation.component.DialExample


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimePickerScreen() {
    val context = LocalContext.current

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            DialExample(
                onConfirm = {
                    Toast.makeText(context, "Hora confirmada", Toast.LENGTH_SHORT).show()
                },
                onDismiss = {
                    Toast.makeText(context, "Cancelado", Toast.LENGTH_SHORT).show()
                }
            )
        }
    }
}


