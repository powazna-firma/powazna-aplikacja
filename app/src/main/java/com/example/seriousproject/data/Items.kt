package com.example.seriousproject.data

import android.content.res.Resources
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.seriousproject.R
import com.example.seriousproject.interfaces.Item
import kotlin.coroutines.coroutineContext

val PeryferiaList = listOf(Item(
    title = R.string.wired_headphones,
    image = R.drawable.sluchawki,
    price = 40.99f,
    description = R.string.wired_headphones_desc
), Item(
    title= R.string.console_controller,
    image = R.drawable.kontroler,
    price = 80.99f,
    description = R.string.console_controller_desc
), Item(
    title = R.string.scanner,
    image = R.drawable.skaner,
    price = 299.99f,
    description = R.string.scanner_desc
), Item(
    title = R.string.usb_cover,
    image = R.drawable.zaslepka,
    price = 12.5f,
    description = R.string.usb_cover_desc
), Item(
    title = R.string.audio_wave_adapter,
    image = R.drawable.przejsciowkaaudiojack,
    price = 1.99f,
    description = R.string.audio_wave_adapter_desc
), Item(
    title = R.string.radio_pcie_adapter,
    image = R.drawable.network,
    price = 10f,
    description = R.string.radio_pcie_adapter_desc
))

val KableList = listOf(Item(
    title = R.string.universal_cable_x,
    image = R.drawable.kabelx,
    price = 400f,
    description = R.string.universal_cable_x_desc
), Item(
    title = R.string.usb_b_cable,
    image = R.drawable.usbb,
    price = 20f,
    description = R.string.usb_b_cable_desc
), Item(
    title = R.string.usb,
    image = R.drawable.doubleusb,
    price = 40f,
    description = R.string.usb_desc
), Item(
    title = R.string.vga,
    description = R.string.vga_desc,
    image = R.drawable.kabelbialy,
    price = 15f
))

val GadzetyList = listOf(Item(
    title = R.string.radio_alarm,
    image = R.drawable.budzikmanta,
    price = 150.01f,
    description = R.string.radio_alarm_desc
), Item(
    title = R.string.thermal_paste_spatula,
    image = R.drawable.szpachla,
    price = 66f,
    description = R.string.thermal_paste_spatula_desc
), Item(
    title = R.string.laptop_battery,
    image = R.drawable.paka_bateryjna,
    price = 110f,
    description = R.string.laptop_battery_desc
), Item(
    title = R.string.stylus,
    image = R.drawable.rysik,
    price = 670.99f,
    description = R.string.stylus_desc
))