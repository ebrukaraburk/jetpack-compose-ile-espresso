package com.example.projeodevi2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projeodevi2.ui.theme.Anarenk
import com.example.projeodevi2.ui.theme.ProjeOdevi2Theme
import com.example.projeodevi2.ui.theme.Yazirenk1
import com.example.projeodevi2.ui.theme.Yazirenk2
import com.example.projeodevi2.ui.theme.Yazirenk3
import com.example.projeodevi2.ui.theme.pasifico

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjeOdevi2Theme {

                    Anasayfa()

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Anasayfa() {
Scaffold (
    topBar = {
       CenterAlignedTopAppBar(
            title = { Text(text = "Espresso", fontFamily = pasifico)},
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Anarenk,
                titleContentColor = Yazirenk1
            )
        )
    }

){
    paddingValues ->
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(paddingValues),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
           Text(text = "Detail",
               color = Anarenk,
               fontWeight = FontWeight.Bold,
               fontSize = 36.sp)

        Image(painter = painterResource(id = R.drawable.bizim),
            contentDescription = " ")

        Text(text = "Hot Espresso",
            color = Yazirenk1,
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp)

        Text(text = "Avaliable multi size",
            color = Yazirenk1,
            fontWeight = FontWeight.Normal,
            fontSize = 22.sp)


        Text(text = "Discover the rich and bold flavor of our espresso, crafted to perfection for a truly exceptional coffee experience",
            color = Anarenk,
            fontWeight = FontWeight.Normal,
            fontSize = 22.sp)

        Text(text = "Select Type",
            color = Yazirenk1,
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp)
      Row( modifier = Modifier
          .fillMaxWidth()
          .padding(horizontal = 8.dp),
          horizontalArrangement = Arrangement.SpaceEvenly

      ) {
Button(onClick = { },
colors = ButtonDefaults.buttonColors(
    containerColor = Anarenk,
    contentColor = Yazirenk1
)
    ) {
    Text(text = "Big Hot espresso")

}

          Button(onClick = { },
              colors = ButtonDefaults.buttonColors(
                  containerColor = Anarenk,
                  contentColor = Yazirenk1
              )
          ) {
              Text(text = "Small Hot espresso")

          }

      }



        Row( modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly

        ) {
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Anarenk,
                    contentColor = Yazirenk1
                )
            ) {
                Text(text = "Extra Hot espresso")

            }

            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Anarenk,
                    contentColor = Yazirenk1
                )
            ) {
                Text(text = "Mini Hot espresso")

            }

        }



        Row( modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly

        ) {
            Text(text = "-------------------------------------",
                color = Yazirenk1,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp)


        }
        Row( modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly

        ) {
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Anarenk,
                    contentColor = Yazirenk2
                )
            ) {
                Text(text = "Order")

            }


            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Anarenk,
                    contentColor = Yazirenk2
                )
            ) {
                Text(text = "payment by credit card")

            }



        }








    }
}

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProjeOdevi2Theme {
        Anasayfa()
    }
}