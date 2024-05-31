@Composable
fun SzczegyProduktu(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 800.dp)
                .background(color = Color.White)
        ) {
        Header()
        Column(
            verticalArrangement = Arrangement.spacedBy(15.dp, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xffe9e9e9))
                        .padding(horizontal = 10.dp,
                                    vertical = 13.dp)
            ) {
            Text(
                text = "Drukarka z interfejsem w kodzie morsa",
                color = Color.Black,
                style = TextStyle(
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold),
                modifier = Modifier
                                .requiredWidth(width = 342.dp)
                                .requiredHeight(height = 56.dp))
            Image(
                painter = painterResource(id = R.drawable.image1),
                contentDescription = "image 1",
                modifier = Modifier
                                .fillMaxWidth()
                                .requiredHeight(height = 231.dp))
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
private fun SzczegyProduktuPreview() {
    SzczegyProduktu(Modifier)
 }

