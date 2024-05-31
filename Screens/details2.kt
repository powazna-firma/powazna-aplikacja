@Composable
fun SzczegyProduktu(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 800.dp)
                .background(color = Color.White)
        ) {
        Header()
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(15.dp, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xffe9e9e9))
                        .padding(horizontal = 10.dp,
                                    vertical = 13.dp)
            ) {
            item {
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(shape = RoundedCornerShape(10.dp))
                                        .background(color = Color(0xff5c5c5c))
                                        .padding(all = 1.dp)
                    ) {
                    Image(
                        painter = painterResource(id = R.drawable.image1),
                        contentDescription = "image 1",
                        modifier = Modifier
                                                .fillMaxWidth()
                                                .requiredHeight(height = 231.dp)
                                                .clip(shape = RoundedCornerShape(10.dp)))
                    }
                }
            item {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                                        .fillMaxWidth()
                    ) {
                    Text(
                        text = "Drukarka z interfejsem w kodzie morsa",
                        color = Color.Black,
                        style = TextStyle(
                                                fontSize = 20.sp,
                                                fontWeight = FontWeight.Bold,
                                                shadow = Shadow(color = Color.Black.copy(alpha = 0.25f), offset = Offset(0f, 4f), blurRadius = 4f)),
                        modifier = Modifier
                                                .weight(weight = 1f))
                    Column(
                        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                        modifier = Modifier
                                                .clip(shape = RoundedCornerShape(32.dp))
                                                .background(color = Color(0xff5c5c5c))
                                                .padding(all = 10.dp)
                        ) {
                        Text(
                            text = "299,99 zł",
                            color = Color(0xfff5f5f5),
                            fontStyle = FontStyle.Italic,
                            textAlign = TextAlign.End,
                            style = TextStyle(
                                                        fontSize = 20.sp,
                                                        fontWeight = FontWeight.Bold),
                            modifier = Modifier
                                                        .fillMaxWidth())
                        }
                    }
                }
            item {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(5.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(shape = RoundedCornerShape(10.dp))
                                        .background(color = Color(0xff5c5c5c))
                                        .padding(all = 1.dp)
                    ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                                                .fillMaxWidth()
                                                .clip(shape = RoundedCornerShape(10.dp))
                                                .background(color = Color(0xff21a700))
                        ) {
                        Text(
                            text = "Do koszyka",
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
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(shape = RoundedCornerShape(10.dp))
                                        .background(color = Color.White)
                                        .padding(all = 10.dp)
                    ) {
                    Text(
                        text = "Opis Produktu",
                        color = Color.Black,
                        style = TextStyle(
                                                fontSize = 14.sp,
                                                fontWeight = FontWeight.Bold))
                    Text(
                        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                        color = Color.Black,
                        style = TextStyle(
                                                fontSize = 15.sp),
                        modifier = Modifier
                                                .fillMaxWidth())
                    }
                }
            item {
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(shape = RoundedCornerShape(10.dp))
                                        .background(color = Color.White)
                                        .padding(all = 10.dp)
                    ) {
                    Text(
                        text = "Opis Produktu",
                        color = Color.Black,
                        style = TextStyle(
                                                fontSize = 14.sp,
                                                fontWeight = FontWeight.Bold))
                    Text(
                        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                        color = Color.Black,
                        style = TextStyle(
                                                fontSize = 15.sp),
                        modifier = Modifier
                                                .fillMaxWidth())
                    }
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

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun SzczegyProduktuPreview() {
    SzczegyProduktu(Modifier)
 }

