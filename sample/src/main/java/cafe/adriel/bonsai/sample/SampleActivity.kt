package cafe.adriel.bonsai.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import cafe.adriel.bonsai.sample.tree.BonsaiContent
import cafe.adriel.bonsai.sample.tree.composeTree

class SampleActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                BonsaiContent(
                    tree = composeTree(),
                )
            }
        }
    }
}
