Getting Started with Gauge
==========================

This is an executable specification file. This file follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.
To execute this specification, use `mvn test`



QatarAirTest
------------
* "2" saniye kadar bekle
* Tanıtım ekranı geç
* "2" saniye kadar bekle
* "com.m.qr:id/rvmp_home_inspiration_title" id li element "Travel Inspiration" text değerini içeriyor mu  kontrol et
* "com.m.qr:id/nav_menu_book" li elemente tıkla
* "//android.widget.LinearLayout[@content-desc='One-way']" li elemente tıkla
* "com.m.qr:id/rvmp_fragment_rtow_flight_selection_origin_holder" li elemente tıkla
* "com.m.qr:id/textinput_placeholder" li elemente "berlin" text değerini yaz
* "com.m.qr:id/rvmp_item_ond_selection_list_text_view_holder" li elemente tıkla
* "com.m.qr:id/rvmp_fragment_rtow_flight_selection_destination_select_destination_text_view" li elemente "istanbul" text değerini yaz
* "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]" li elemente tıkla
* "com.m.qr:id/rvmp_fragment_rtow_flight_selection_date_holder_date_text_view" li elemente tıkla
* Bugünün tarihi + 7 gün olarak bir gidiş tarihi seç
* "com.m.qr:id/fragment_calendar_confirm_button" li elemente tıkla
* "com.m.qr:id/rvmp_booking_search_flights_button" li elemente tıkla
* "com.m.qr:id/booking_activity_conversational_message" id li element "Select your departure" text değerini içeriyor mu  kontrol et
* "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup" li listede random değer seç "android.widget.TextView[1]" ve "android.widget.TextView[2]" değerlerini tut
* "com.m.qr:id/rvmp_activity_flight_details_select_button" li elemente tıkla
* "//android.view.ViewGroup[1]/android.widget.TextView[@resource-id='com.m.qr:id/rvmp_item_flight_details_start_time']" ile "//android.view.ViewGroup[2]/android.widget.TextView[@resource-id='com.m.qr:id/rvmp_item_flight_details_end_time']" uçuş detayları ekranı değerleri
*  Uçuş seçim ekranındaki uçuş saati kontrolü
