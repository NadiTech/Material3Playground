package components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun M3Divider() {
    Column {
        Spacer(Modifier.size(16.dp))

        M3OnSurfaceText(
            text = "Divider",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(Modifier.size(16.dp))

        Divider(thickness = 0.5.dp)
    }
}