require recipes-connectivity/nxp-wlan-sdk/nxp-wlan-sdk_git.inc

SUMMARY = "NXP Wi-Fi driver for module 88w8997/8987"

inherit module

EXTRA_OEMAKE += "-C ${STAGING_KERNEL_BUILDDIR} M=${S}"

module_conf_mlan = "softdep mlan post: moal"
module_conf_moal = "options moal mod_para=nxp/wifi_mod_para.conf"
KERNEL_MODULE_PROBECONF += "moal mlan "
KERNEL_MODULE_AUTOLOAD += "moal "
