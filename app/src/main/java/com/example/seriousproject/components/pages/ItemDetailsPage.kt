package com.example.seriousproject.components.pages

import android.icu.text.NumberFormat
import android.icu.util.Currency
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.seriousproject.R
import com.example.seriousproject.components.VideoDialog
import com.example.seriousproject.interfaces.Item
import com.example.seriousproject.ui.theme.Montserrat
import java.util.Locale

@Composable
fun ItemDetailsPage(item: Item, modifier: Modifier = Modifier) {
    val format = NumberFormat.getCurrencyInstance()
    val multiplier = if (format.currency.currencyCode == "USD") 0.25f else 1f
//    format.currency = Currency.getInstance("PLN")
    val title = stringResource(id = item.title)
    val description = stringResource(id = item.description)
    val price = format.format(item.price * multiplier)

    val openDialog = remember { mutableStateOf(false) }
    Column(
        verticalArrangement = Arrangement.spacedBy(15.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .padding(8.dp)
    ) {
        Box(modifier = Modifier.clickable { openDialog.value = true }) {
            Image(
                painter = painterResource(id = item.image),
                contentDescription = title,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .shadow(elevation = 4.dp, RoundedCornerShape(10.dp))
            )
            Icon(
                imageVector = Icons.Default.Menu,
                tint = Color.White,
                contentDescription = stringResource(id = R.string.more_info),
                modifier = Modifier
                    .size(50.dp)
                    .align(Alignment.BottomEnd)
                    .padding(8.dp)
            )
        }

        when {
            openDialog.value -> VideoDialog(
                onDismissRequest = { openDialog.value = false }, item.video
            )
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = title, color = Color.Black, style = TextStyle(
                    fontSize = 20.sp, fontWeight = FontWeight.Bold, shadow = Shadow(
                        color = Color.Black.copy(alpha = 0.25f),
                        offset = Offset(0f, 4f),
                        blurRadius = 2f
                    ), fontFamily = Montserrat
                ), modifier = Modifier.weight(weight = 1f)
            )

            Text(
                text = price,
                color = Color(0xfff5f5f5),
                fontStyle = FontStyle.Italic,
                fontFamily = Montserrat,
                textAlign = TextAlign.End,
                style = TextStyle(
                    fontSize = 20.sp, fontWeight = FontWeight.Bold, fontFamily = Montserrat
                ),
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(32.dp))
                    .background(color = Color(0xff5c5c5c))
                    .padding(8.dp)
            )
        }

        Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = stringResource(id = R.string.add_to_cart), style = TextStyle(
                    fontSize = 20.sp, fontWeight = FontWeight.Bold, fontFamily = Montserrat
                )
            )
        }

        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(10.dp))
                .background(color = Color.White)
                .padding(all = 10.dp)
        ) {
            Text(
                text = stringResource(id = R.string.product_desc),
                color = Color.Black,
                style = TextStyle(
                    fontSize = 14.sp, fontWeight = FontWeight.Bold, fontFamily = Montserrat
                )
            )
            Text(
                text = stringResource(id = item.details),
                color = Color.Black,
                style = TextStyle(
                    fontSize = 15.sp, fontFamily = Montserrat
                ),
                modifier = Modifier.fillMaxWidth()
            )
        }

        /*
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(10.dp))
                .background(color = Color.White)
                .padding(all = 10.dp)
        ) {
            Text(
                text = stringResource(id = R.string.product_desc),
                color = Color.Black,
                style = TextStyle(
                    fontSize = 14.sp, fontWeight = FontWeight.Bold, fontFamily = Montserrat
                )
            )
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 15.sp, fontFamily = Montserrat
                ),
                modifier = Modifier.fillMaxWidth()
            )
        }*/
    }
}