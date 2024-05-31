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
        Box(
            modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xffebe8e8))
            ) {
            Text(
                text = "Jesteśmy poważną firmą.\nNasza firma jest poważna.",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold),
                modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 0.dp,
                                                y = 57.dp)
                                .requiredWidth(width = 360.dp)
                                .requiredHeight(height = 136.dp)
                                .wrapContentHeight(align = Alignment.CenterVertically))
            Tab(
                selected = false,
                onClick = {  },
                text = {
                Text(
                text = "Produkty",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold),
                modifier = Modifier
                                .requiredWidth(width = 209.dp)
                                .requiredHeight(height = 22.dp)
                                .wrapContentHeight(align = Alignment.CenterVertically))
                },
                modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 63.dp,
                                                y = 402.dp)
                                .requiredWidth(width = 235.dp)
                                .requiredHeight(height = 47.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                                .background(color = Color(0xff61bbe5)))
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

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun StronaGwnaPreview() {
    StronaGwna(Modifier)
 }

