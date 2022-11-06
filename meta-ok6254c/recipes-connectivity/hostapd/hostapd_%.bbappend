

do_install:append()  {
    # change defaultinterface to uap0 from wlan0
    sed -i -e 's,=wlan0,=uap0,g' ${D}${sysconfdir}/hostapd.conf
}
