package com.chris.cards

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chris.cards.ui.theme.CardsTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun Greeting(sender: String, name: String) {
    val image = Image(
        painter = painterResource(id = R.drawable.hbd_bg),
        contentDescription = "",
        contentScale = ContentScale.FillBounds,
        alpha = 0.5F
        )

    Box {
        image
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Happy Birthday \n \n $name!",
                fontSize = 40.sp,
                textAlign = TextAlign.Center,
                letterSpacing = 3.sp,
            )

            Text(
                text = "from $sender",
                modifier = Modifier.align(Alignment.End)
            )
        }
    }
}

@Composable
fun JetPackComposeTutor() {
    Box {
        Column {
            Image(
                painter = painterResource(id = R.drawable.bg_compose),
                contentDescription = "Backgroud",
                contentScale = ContentScale.FillWidth
            )
            Text(
                text = "Jetpack Compose tutorial",
                Modifier.padding(16.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
            Text(
                text = "Jetpack Compose is a modern toolkit for building native Android UI." +
                        " Compose simplifies and accelerates UI development on Android " +
                        "with less code, powerful tools, and intuitive Kotlin APIs.",
                Modifier.padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Justify

            )
            Text(
                text = "In this tutorial, you build a simple UI component with declarative " +
                        "functions. You call Compose functions to say what elements you " +
                        "want and the Compose compiler does the rest. Compose is built " +
                        "around Composable functions. These functions let you define your " +
                        "app\'s UI programmatically because they let you describe how it " +
                        "should look and provide data dependencies, rather than focus on " +
                        "the process of the UI\'s construction, such as initializing an " +
                        "element and then attaching it to a parent. To create a Composable function, " +
                        "you add the @Composable annotation to the function name.",
                Modifier.padding(16.dp),
                textAlign = TextAlign.Justify
            )
        }
    }

}

@Composable
fun TaskComplete() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
       Image(
           painter = painterResource(id = R.drawable.task_completed),
           contentDescription = "Complete"
       )
        Text(
            text = "All tasks completed",
            Modifier.padding(top = 24.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Nice work!",
            fontSize = 16.sp
        )
    }
}

@Composable
fun Grid(){
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            Column(modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .background(Color(0xFFEADDFF))
                .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Text(
                    text = "Text composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                    )
                Text(text = "Displays text and follows the recommended Material Design guidelines.",
                    textAlign = TextAlign.Justify)

            }
            Column(modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .background(Color(0xFFD0BCFF))
                .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Text(
                    text = "Image composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(text = "Creates a composable that lays out and draws a given Painter class object.",
                    textAlign = TextAlign.Justify)

            }

        }

        Row(modifier = Modifier.weight(1f)) {
            Column(modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .background(Color(0xFFB69DF8))
                .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Text(
                    text = "Row composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(text = "A layout composable that places its children in a horizontal sequence.",
                    textAlign = TextAlign.Justify)

            }
            Column(modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .background(Color(0xFFEADDFF))
                .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Text(
                    text = "Column composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp),

                )
                Text(text = "A layout composable that places its children in a vertical sequence.",
                    textAlign = TextAlign.Justify)

            }

        }

    }


}

@Composable
fun ComposeQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = "aaa",
                description = "aaa",
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = "aaa",
                description = "aaa",
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = "aaa",
                description = "aaa",
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = "aaa",
                description = "aaa",
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun BusinessCare() {
    
    Column(
        Modifier
            .fillMaxSize()
            .background(Color(0xFF3ddc84))
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .weight(2f)
                .padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //Icon(painter = painterResource(id = R.mipmap.ic_andro), contentDescription = "Email")
            Box(modifier = Modifier.size(128.dp,128.dp).background(Color.Black)) {
                Image(
                    painter = painterResource(id = R.drawable.android_logo),
                    contentDescription = "Android",
                    contentScale = ContentScale.Fit
                )
            }
            Text(text = "FULL NAME", fontWeight = FontWeight.Bold, fontSize = 24.sp)
            Text(text = "Title", color = Color(0xFF91F7BF))
        }

        Column (
            Modifier
                .weight(1f)
                .padding(8.dp),
            verticalArrangement = Arrangement.Bottom,
        ) {
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(painter = painterResource(id = R.drawable.ic_phone), contentDescription = "Phone")
                Text(text = "010-2565-263")
            }
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(painter = painterResource(id = R.drawable.ic_web), contentDescription = "Web")
                Text(text = "@andro-dev.com")
            }
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(painter = painterResource(id = R.drawable.ic_email), contentDescription = "Email")
                Text(text = "xoxo@gmail.com")
            }
        }
    }
    
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CardsTheme {
    BusinessCare()
    //TaskComplete()
        //JetPackComposeTutor()
        //Greeting("Android", "Sam")
    }
}