package com.example.gitafirstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HalfScreen()
            ProfileScreen()
        }
    }
}

@Composable
fun ProfileScreen() {
    Box(modifier = Modifier.fillMaxSize()) {

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(60.dp))


            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.White, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.man),
                    contentDescription = "Profile Picture",
                    modifier = Modifier.size(150.dp),
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "WILLIAM SNOE",
                color = Color.Cyan,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )


            Box(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(top = 20.dp)
                    .background(Color.LightGray, RoundedCornerShape(16.dp))
                    .padding(vertical = 16.dp),
                contentAlignment = Alignment.Center
            ) {
                Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                    StatCard(title = "Photos", value = "160")
                    StatCard(title = "Followers", value = "2254")
                    StatCard(title = "Following", value = "520")
                }
            }


            Spacer(modifier = Modifier.height(16.dp))

            Column(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                InfoItem(icon = R.drawable.gmail, text = "William@gmail.com")
                InfoItem(icon = R.drawable.smartphone, text = "+222 202 202")
                InfoItem(icon = R.drawable.user, text = "Add to Group")
                InfoItem(icon = R.drawable.comments, text = "Show All Comments")
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = {  },
                    modifier = Modifier
                        .fillMaxWidth(0.7f)
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF03A9F4))
                ) {
                    Text(text = "FOLLOW ME", color = Color.White, fontSize = 16.sp)
                }
            }
        }
    }
}

@Composable
fun StatCard(title: String, value: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(30.dp)
    ) {

        Text(
            text = title,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = value,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color.Black
        )
    }
}

@Composable
fun InfoItem(icon: Int, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable { },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = "Icon",
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = text, fontSize = 16.sp, color = Color.Black)
    }
}
@Composable
fun HalfScreen(){
    Column(Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.3f)
                .background(Color(0xFF0C5DA1))
        )


        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        )
    }
}




