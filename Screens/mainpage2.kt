@Composable
fun StronaGwna(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 800.dp)
                .background(color = Color.White)
        ) {
        Header()
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xffebe8e8))
                        .padding(all = 16.dp)
            ) {
            item {
                Text(
                    text = "Jesteśmy poważną firmą.\nNasza firma jest poważna.",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                                        fontSize = 24.sp,
                                        fontWeight = FontWeight.Bold),
                    modifier = Modifier
                                        .fillMaxWidth()
                                        .wrapContentHeight(align = Alignment.CenterVertically))
                }
            item {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                    modifier = Modifier
                                        .fillMaxWidth()
                    ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                                                .weight(weight = 0.33f)
                                                .clip(shape = RoundedCornerShape(10.dp))
                                                .background(color = Color(0xff5c5c5c))
                        ) {
                        Text(
                            text = "Jakość",
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                                        fontSize = 20.sp,
                                                        fontWeight = FontWeight.Bold),
                            modifier = Modifier
                                                        .requiredWidth(width = 215.dp)
                                                        .requiredHeight(height = 35.dp)
                                                        .wrapContentHeight(align = Alignment.CenterVertically))
                        }
                    Column(
                        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                                                .weight(weight = 0.33f)
                                                .clip(shape = RoundedCornerShape(10.dp))
                                                .background(color = Color(0xff5c5c5c))
                        ) {
                        Text(
                            text = "Pewność",
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                                        fontSize = 20.sp,
                                                        fontWeight = FontWeight.Bold),
                            modifier = Modifier
                                                        .requiredWidth(width = 215.dp)
                                                        .requiredHeight(height = 35.dp)
                                                        .wrapContentHeight(align = Alignment.CenterVertically))
                        }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                                                .weight(weight = 0.33f)
                                                .clip(shape = RoundedCornerShape(10.dp))
                                                .background(color = Color(0xff5c5c5c))
                        ) {
                        Text(
                            text = "Gwarancja",
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                                        fontSize = 20.sp,
                                                        fontWeight = FontWeight.Bold),
                            modifier = Modifier
                                                        .requiredWidth(width = 215.dp)
                                                        .requiredHeight(height = 35.dp)
                                                        .wrapContentHeight(align = Alignment.CenterVertically))
                        }
                    }
                }
            item {
                Text(
                    text = "Kategorie",
                    color = Color.Black,
                    style = TextStyle(
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold),
                    modifier = Modifier
                                        .fillMaxWidth()
                                        .wrapContentHeight(align = Alignment.CenterVertically))
                }
            item {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                                        .fillMaxWidth()
                    ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(7.dp, Alignment.CenterVertically),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                                                .requiredWidth(width = 158.dp)
                                                .requiredHeight(height = 183.dp)
                                                .clip(shape = RoundedCornerShape(16.dp))
                                                .background(color = Color.White)
                                                .padding(all = 10.dp)
                        ) {
                        Box(
                            modifier = Modifier
                                                        .requiredWidth(width = 117.dp)
                                                        .requiredHeight(height = 116.dp)
                                                        .clip(shape = RoundedCornerShape(10.dp))
                                                        .background(color = Color.Black)
                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.image1),
                                contentDescription = "image 1",
                                modifier = Modifier
                                                                .align(alignment = Alignment.TopStart)
                                                                .offset(x = (-10).dp,
                                                                                                y = 0.dp)
                                                                .requiredWidth(width = 137.dp)
                                                                .requiredHeight(height = 116.dp))
                            }
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                                        .requiredWidth(width = 138.dp)
                                                        .requiredHeight(height = 26.dp)
                            ) {
                            Text(
                                text = "Drukarki",
                                color = Color.Black,
                                textAlign = TextAlign.Center,
                                style = TextStyle(
                                                                fontSize = 16.sp,
                                                                fontWeight = FontWeight.Bold),
                                modifier = Modifier
                                                                .requiredWidth(width = 179.dp)
                                                                .requiredHeight(height = 42.dp)
                                                                .wrapContentHeight(align = Alignment.CenterVertically))
                            }
                        }
                    Column(
                        verticalArrangement = Arrangement.spacedBy(7.dp, Alignment.CenterVertically),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                                                .requiredWidth(width = 158.dp)
                                                .requiredHeight(height = 183.dp)
                                                .clip(shape = RoundedCornerShape(16.dp))
                                                .background(color = Color.White)
                                                .padding(all = 10.dp)
                        ) {
                        Box(
                            modifier = Modifier
                                                        .requiredWidth(width = 117.dp)
                                                        .requiredHeight(height = 116.dp)
                                                        .clip(shape = RoundedCornerShape(10.dp))
                                                        .background(color = Color.Black)
                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.image1),
                                contentDescription = "image 1",
                                modifier = Modifier
                                                                .align(alignment = Alignment.TopStart)
                                                                .offset(x = (-10).dp,
                                                                                                y = 0.dp)
                                                                .requiredWidth(width = 137.dp)
                                                                .requiredHeight(height = 116.dp))
                            }
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                                        .requiredWidth(width = 138.dp)
                                                        .requiredHeight(height = 26.dp)
                            ) {
                            Text(
                                text = "Skanery",
                                color = Color.Black,
                                textAlign = TextAlign.Center,
                                style = TextStyle(
                                                                fontSize = 16.sp,
                                                                fontWeight = FontWeight.Bold),
                                modifier = Modifier
                                                                .requiredWidth(width = 179.dp)
                                                                .requiredHeight(height = 42.dp)
                                                                .wrapContentHeight(align = Alignment.CenterVertically))
                            }
                        }
                    Column(
                        verticalArrangement = Arrangement.spacedBy(7.dp, Alignment.CenterVertically),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                                                .requiredWidth(width = 158.dp)
                                                .requiredHeight(height = 183.dp)
                                                .clip(shape = RoundedCornerShape(16.dp))
                                                .background(color = Color.White)
                                                .padding(all = 10.dp)
                        ) {
                        Box(
                            modifier = Modifier
                                                        .requiredWidth(width = 117.dp)
                                                        .requiredHeight(height = 116.dp)
                                                        .clip(shape = RoundedCornerShape(10.dp))
                                                        .background(color = Color.Black)
                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.image1),
                                contentDescription = "image 1",
                                modifier = Modifier
                                                                .align(alignment = Alignment.TopStart)
                                                                .offset(x = (-10).dp,
                                                                                                y = 0.dp)
                                                                .requiredWidth(width = 137.dp)
                                                                .requiredHeight(height = 116.dp))
                            }
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                                        .requiredWidth(width = 138.dp)
                                                        .requiredHeight(height = 26.dp)
                            ) {
                            Text(
                                text = "Tonery",
                                color = Color.Black,
                                textAlign = TextAlign.Center,
                                style = TextStyle(
                                                                fontSize = 16.sp,
                                                                fontWeight = FontWeight.Bold),
                                modifier = Modifier
                                                                .requiredWidth(width = 179.dp)
                                                                .requiredHeight(height = 42.dp)
                                                                .wrapContentHeight(align = Alignment.CenterVertically))
                            }
                        }
                    Column(
                        verticalArrangement = Arrangement.spacedBy(7.dp, Alignment.CenterVertically),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                                                .requiredWidth(width = 158.dp)
                                                .requiredHeight(height = 183.dp)
                                                .clip(shape = RoundedCornerShape(16.dp))
                                                .background(color = Color.White)
                                                .padding(all = 10.dp)
                        ) {
                        Box(
                            modifier = Modifier
                                                        .requiredWidth(width = 117.dp)
                                                        .requiredHeight(height = 116.dp)
                                                        .clip(shape = RoundedCornerShape(10.dp))
                                                        .background(color = Color.Black)
                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.image1),
                                contentDescription = "image 1",
                                modifier = Modifier
                                                                .align(alignment = Alignment.TopStart)
                                                                .offset(x = (-10).dp,
                                                                                                y = 0.dp)
                                                                .requiredWidth(width = 137.dp)
                                                                .requiredHeight(height = 116.dp))
                            }
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                                        .requiredWidth(width = 138.dp)
                                                        .requiredHeight(height = 26.dp)
                            ) {
                            Text(
                                text = "Inne",
                                color = Color.Black,
                                textAlign = TextAlign.Center,
                                style = TextStyle(
                                                                fontSize = 16.sp,
                                                                fontWeight = FontWeight.Bold),
                                modifier = Modifier
                                                                .requiredWidth(width = 179.dp)
                                                                .requiredHeight(height = 42.dp)
                                                                .wrapContentHeight(align = Alignment.CenterVertically))
                            }
                        }
                    }
                }
            item {
                Text(
                    text = "Oferta dnia",
                    color = Color.Black,
                    style = TextStyle(
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold),
                    modifier = Modifier
                                        .fillMaxWidth()
                                        .wrapContentHeight(align = Alignment.CenterVertically))
                }
            item {
                ProduktCard()
                }
            }
        }
 }

@Composable
fun Header(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
                .fillMaxWidth()
                .requiredHeight(height = 59.dp)
                .background(color = Color(0xffd8d8d8))
                .padding(all = 10.dp)
        ) {
        Logo()
        Text(
            text = "Poważna firma",
            color = Color.Black,
            style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold),
            modifier = Modifier
                        .fillMaxSize()
                        .weight(weight = 1f)
                        .wrapContentHeight(align = Alignment.CenterVertically))
        Image(
            painter = painterResource(id = R.drawable.menu),
            contentDescription = "Menu",
            contentScale = ContentScale.Inside,
            modifier = Modifier
                        .requiredWidth(width = 39.dp)
                        .requiredHeight(height = 36.dp))
        }
 }

@Composable
fun Logo(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
                .requiredWidth(width = 45.dp)
                .requiredHeight(height = 44.dp)
        ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                        .fillMaxSize())
        }
 }

@Composable
fun ProduktCard(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(7.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
                .fillMaxWidth()
                .requiredHeight(height = 140.dp)
                .clip(shape = RoundedCornerShape(16.dp))
                .background(color = Color.White)
                .padding(all = 10.dp)
        ) {
        Box(
            modifier = Modifier
                        .requiredWidth(width = 117.dp)
                        .requiredHeight(height = 116.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.Black)
            ) {
            Image(
                painter = painterResource(id = R.drawable.image1),
                contentDescription = "image 1",
                modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = (-10).dp,
                                                y = 0.dp)
                                .requiredWidth(width = 137.dp)
                                .requiredHeight(height = 116.dp))
            }
        Box(
            modifier = Modifier
                        .fillMaxSize()
            ) {
            Text(
                text = "Drukarka z interfejsem w kodzie morsa",
                color = Color.Black,
                style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold),
                modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 0.dp,
                                                y = (-1).dp)
                                .requiredWidth(width = 179.dp)
                                .requiredHeight(height = 42.dp))
            Text(
                text = "Wśród drukarek jak combi - gra i trąbi",
                color = Color.Black,
                style = TextStyle(
                                fontSize = 13.sp),
                modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 4.dp,
                                                y = 57.dp)
                                .requiredWidth(width = 170.dp)
                                .requiredHeight(height = 36.dp))
            Text(
                text = "niecałe 300zł",
                color = Color.Black,
                style = TextStyle(
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold),
                modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 95.dp,
                                                y = 105.dp)
                                .requiredWidth(width = 96.dp)
                                .requiredHeight(height = 21.dp))
            }
        }
 }

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun StronaGwnaPreview() {
    StronaGwna(Modifier)
 }

