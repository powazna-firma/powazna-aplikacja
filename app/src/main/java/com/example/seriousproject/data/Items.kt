package com.example.seriousproject.data

import android.content.res.Resources
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.seriousproject.R
import com.example.seriousproject.interfaces.Item
import kotlin.coroutines.coroutineContext

val PeryferiaList = listOf(
    Item(
        title = R.string.wired_headphones,
        image = R.drawable.sluchawki,
        price = 40.99f,
        description = R.string.wired_headphones_desc,
        video = R.raw.sluchawki,
        details = R.string.wired_headphones_det
    ), Item(
        title = R.string.console_controller,
        image = R.drawable.kontroler,
        price = 80.99f,
        description = R.string.console_controller_desc,
        video = R.raw.kontroler,
        details = R.string.console_controller_det
    ), Item(
        title = R.string.scanner,
        image = R.drawable.skaner,
        price = 299.99f,
        description = R.string.scanner_desc,
        video = R.raw.skaner,
        details = R.string.scanner_det
    ), Item(
        title = R.string.usb_cover,
        image = R.drawable.zaslepka,
        price = 12.5f,
        description = R.string.usb_cover_desc,
        video = R.raw.zaslepka1,
        details = R.string.usb_cover_det
    ), Item(
        title = R.string.audio_wave_adapter,
        image = R.drawable.przejsciowkaaudiojack,
        price = 1.99f,
        description = R.string.audio_wave_adapter_desc,
        video = R.raw.audio_jack,
        details = R.string.audio_wave_adapter_det
    ), Item(
        title = R.string.radio_pcie_adapter,
        image = R.drawable.network,
        price = 10f,
        description = R.string.radio_pcie_adapter_desc,
        video = R.raw.pcie,
        details = R.string.radio_pcie_adapter_det
    )
)

val KableList = listOf(
    Item(
        title = R.string.universal_cable_x,
        image = R.drawable.kabelx,
        price = 400f,
        description = R.string.universal_cable_x_desc,
        video = R.raw.kabel_x,
        details = R.string.universal_cable_x_det
    ), Item(
        title = R.string.usb_b_cable,
        image = R.drawable.usbb,
        price = 20f,
        description = R.string.usb_b_cable_desc,
        video = R.raw.usb_b,
        details = R.string.usb_b_cable_det
    ), Item(
        title = R.string.usb,
        image = R.drawable.doubleusb,
        price = 40f,
        description = R.string.usb_desc,
        video = R.raw.double_usb,
        details = R.string.usb_det
    ), Item(
        title = R.string.vga,
        description = R.string.vga_desc,
        image = R.drawable.kabelbialy,
        price = 15f,
        video = R.raw.vga,
        details = R.string.vga_det
    )
)

val GadzetyList = listOf(
    Item(
        title = R.string.radio_alarm,
        image = R.drawable.budzikmanta,
        price = 150.01f,
        description = R.string.radio_alarm_desc,
        video = R.raw.budzik_radio,
        details = R.string.radio_alarm_det
    ), Item(
        title = R.string.thermal_paste_spatula,
        image = R.drawable.szpachla,
        price = 66f,
        description = R.string.thermal_paste_spatula_desc,
        video = R.raw.szpachla,
        details = R.string.thermal_paste_spatula_det
    ), Item(
        title = R.string.laptop_battery,
        image = R.drawable.paka_bateryjna,
        price = 110f,
        description = R.string.laptop_battery_desc,
        video = R.raw.bateria,
        details = R.string.laptop_battery_det
    ), Item(
        title = R.string.stylus,
        image = R.drawable.rysik,
        price = 670.99f,
        description = R.string.stylus_desc,
        video = R.raw.rysik,
        details = R.string.stylus_det
    )
)