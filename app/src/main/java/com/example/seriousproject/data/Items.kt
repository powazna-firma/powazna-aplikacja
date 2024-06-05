package com.example.seriousproject.data

import android.content.res.Resources
import androidx.compose.ui.res.painterResource
import com.example.seriousproject.R
import com.example.seriousproject.interfaces.Item
import kotlin.coroutines.coroutineContext

val PeryferiaList = listOf(Item(
    title = Resources.getSystem().getString(R.string.wired_headphones),
    image = R.drawable.sluchawki,
    price = 40.99f,
    description = Resources.getSystem().getString(R.string.wired_headphones_desc)
), Item(
    title= Resources.getSystem().getString(R.string.console_controller),
    image = R.drawable.kontroler,
    price = 80.99f,
    description = Resources.getSystem().getString(R.string.console_controller_desc)
), Item(
    title = Resources.getSystem().getString(R.string.scanner),
    image = R.drawable.skaner,
    price = 299.99f,
    description = Resources.getSystem().getString(R.string.scanner_desc)
), Item(
    title = Resources.getSystem().getString(R.string.usb_cover),
    image = R.drawable.zaslepka,
    price = 12.5f,
    description = Resources.getSystem().getString(R.string.usb_cover_desc)
), Item(
    title = Resources.getSystem().getString(R.string.audio_wave_adapter),
    image = R.drawable.przejsciowkaaudiojack,
    price = 1.99f,
    description = Resources.getSystem().getString(R.string.audio_wave_adapter_desc)
), Item(
    title = Resources.getSystem().getString(R.string.radio_pcie_adapter),
    image = R.drawable.network,
    price = 10f,
    description = Resources.getSystem().getString(R.string.radio_pcie_adapter_desc)
))

val KableList = listOf(Item(
    title = Resources.getSystem().getString(R.string.universal_cable_x),
    image = R.drawable.kabelx,
    price = 400f,
    description = Resources.getSystem().getString(R.string.universal_cable_x_desc)
), Item(
    title = Resources.getSystem().getString(R.string.usb_b_cable),
    image = R.drawable.usbb,
    price = 20f,
    description = Resources.getSystem().getString(R.string.usb_b_cable_desc)
), Item(
    title = Resources.getSystem().getString(R.string.usb),
    image = R.drawable.doubleusb,
    price = 40f,
    description = Resources.getSystem().getString(R.string.usb_desc)
), Item(
    title = Resources.getSystem().getString(R.string.vga),
    description = Resources.getSystem().getString(R.string.vga_desc),
    image = R.drawable.kabelbialy,
    price = 15f
))

val GadzetyList = listOf(Item(
    title = Resources.getSystem().getString(R.string.radio_alarm),
    image = R.drawable.budzikmanta,
    price = 150.01f,
    description = Resources.getSystem().getString(R.string.radio_alarm_desc)
), Item(
    title = Resources.getSystem().getString(R.string.thermal_paste_spatula),
    image = R.drawable.szpachla,
    price = 66f,
    description = Resources.getSystem().getString(R.string.thermal_paste_spatula_desc)
), Item(
    title = Resources.getSystem().getString(R.string.laptop_battery),
    image = R.drawable.paka_bateryjna,
    price = 110f,
    description = Resources.getSystem().getString(R.string.laptop_battery_desc)
), Item(
    title = Resources.getSystem().getString(R.string.stylus),
    image = R.drawable.rysik,
    price = 670.99f,
    description = Resources.getSystem().getString(R.string.stylus_desc)
))