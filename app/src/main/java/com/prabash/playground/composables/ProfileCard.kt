package com.prabash.playground.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prabash.playground.R

@Composable
fun ProfileCard(
    name: String,
    role: String,
    location: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
        ,
        contentAlignment = Alignment.Center
    ) {
        Card (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                ,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Profile Pic",
                    modifier = Modifier
                        .size(150.dp)
                        .clip(CircleShape)
                    ,
                    contentScale = ContentScale.Crop
                )

                Spacer(Modifier.height(10.dp))

                Text(
                    name,
                    style = MaterialTheme.typography.headlineMedium
                )

                Text(role)

                Spacer(Modifier.height(10.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        contentDescription = null
                    )

                    Spacer(Modifier.width(4.dp))

                    Text(location)
                }

                Spacer(Modifier.height(10.dp))

                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    StatItem(12, "Posts")
                    StatItem(250, "Followers")
                    StatItem(280, "Following")
                }

                Spacer(Modifier.height(10.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Button(
                        onClick = { }
                    ) {
                        Text("Follow")
                    }

                    OutlinedButton (
                        onClick = { }
                    ) {
                        Text("Message")
                    }
                }
            }

        }
    }
}

@Composable
fun StatItem(
    count: Int,
    label: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(count.toString())
        Text(label)
    }
}
