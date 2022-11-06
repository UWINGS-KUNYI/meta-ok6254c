

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRCBRANCH = "lf-5.15.32_2.0.0"
SRC_URI += " \
git://github.com/NXP/imx-firmware.git;protocol=https;branch=${SRCBRANCH};destsuffix=imx-firmware;name=imx-firmware \
"

SRCREV = "653a770f68fc0cb9f9390acdee75b526bc05e459"

do_install:append () {
    # Install NXP Connectivity
    install -d ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/wifi_mod_para.conf    ${D}${nonarch_base_libdir}/firmware/nxp

    # Install NXP Connectivity 88W8987 firmware with combo
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8987/ed_mac_ctrl_V3_8987.conf  ${D}${nonarch_base_libdir}/firmware/nxp
    # install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8987/sd8987_wlan.bin	       ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8987/sdiouart8987_combo_v0.bin ${D}${nonarch_base_libdir}/firmware/nxp
    install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8987/txpwrlimit_cfg_8987.conf  ${D}${nonarch_base_libdir}/firmware/nxp
    # install -m 0644 ${WORKDIR}/imx-firmware/nxp/FwImage_8987/uartuart8987_bt.bin       ${D}${nonarch_base_libdir}/firmware/nxp
}

PACKAGES =+ " ${PN}-nxp89xx"

FILES:${PN}-nxp89xx = " \
       ${nonarch_base_libdir}/firmware/nxp/* \
"
