package me.acaceres.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.acaceres.tallergitgithubapp.ui.theme.TallerGitGithubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Exercise1()
        }
    }

    @Composable
    fun myPresentation() {
        Column(modifier = Modifier.padding(18.dp)) {

        }
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun Exercise1() {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val painter = painterResource(id = R.drawable.perfil)
            Image(
                painter = painter, contentDescription = "Imagen",
                modifier = Modifier.size(180.dp).padding(16.dp).clip(CircleShape),
                contentScale = ContentScale.Crop

            )
            Text(
                text = "Maria Herrera",
                color = Color.Gray,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp

            )
            Text(
                text = "Desarrollador android ",
                modifier = Modifier.padding(22.dp)
            )

            HorizontalDivider(
                thickness = 1.dp,
                color = Color.Gray,
                modifier = Modifier.padding(25.dp,35.dp,25.dp,15.dp)
            )
            Text(
                text = "Edad ",
                modifier = Modifier.padding(16.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
                color = Color.Gray

            )

            Text(
                text = "22 ",
                modifier = Modifier.padding(1.dp),
                fontSize = 20.sp
            )

            HorizontalDivider(
                thickness = 1.dp,
                color = Color.Gray,
                modifier = Modifier.padding(25.dp,35.dp,25.dp,15.dp)
            )

        }
    }
}