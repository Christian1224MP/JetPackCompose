package com.example.alltask

import androidx.compose.ui.Alignment
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Top
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import com.example.alltask.ui.theme.AlltaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlltaskTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background)
                {
                    GreetingImage(
                        message = stringResource(R.string.happy_birthday_text),
                        text1 = stringResource(R.string.text_1)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String,text1: String,/*text2: String*/modifier: Modifier= Modifier) {
    Column(
        //verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = message,
            fontSize = 20.sp,
            lineHeight = 20.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 2.dp)
        )

        Text(
            text = text1,
            fontSize = 16.sp,
            textAlign = TextAlign.Center

        )
        /*Text(
            text = text2,
            fontSize = 15.sp,
            //textAlign = TextAlign.Center,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(horizontal = 1.dp, vertical = 16.dp)
            //.align(alignment = Alignment.CenterHorizontally)

        )

         */

    }
}
@Composable
fun GreetingImage(message: String, text1: String,/*text2: String*/ modifier : Modifier = Modifier,/*image: Painter*/) {
    val image = painterResource(R.drawable.ic_task_completed)
    Column(modifier = modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        //verticalAlignment =Alignment.Top
    ) {

        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            //modifier = Modifier.size(imageSize)
            modifier = Modifier//.fillMaxWidth()
                .size(150.dp)

        )

        GreetingText(
            message = message,
            text1 = text1,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp)
                .size(250.dp)
            /*text2 = text2,
            */
            )
    }
}
@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    AlltaskTheme {
        GreetingImage(
            message = stringResource(R.string.happy_birthday_text),
            text1 = stringResource(R.string.text_1)
        )
    }
}