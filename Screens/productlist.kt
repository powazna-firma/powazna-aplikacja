@Composable
fun ListaProduktw(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 800.dp)
                .background(color = Color.White)
        ) {
        Header()
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xffebebeb))
                        .padding(horizontal = 10.dp,
                                    vertical = 15.dp)
            ) {
            items(7) {
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
private fun ListaProduktwPreview() {
    ListaProduktw(Modifier)
 }

