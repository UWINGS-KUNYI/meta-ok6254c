
require u-boot-ti.inc

LIC_FILES_CHKSUM = "file://Licenses/README;md5=5a7450c57ffe5ae63fd732446b988025"

PR = "r32"

SRCREV = "6c60769028bb0441582000d53ef47db07d6a98fd"
BRANCH = "ok6254c"
UBOOT_GIT_URI = "git://github.com/UWINGS-KUNYI/ti-u-boot.git"
UBOOT_GIT_PROTOCOL = "https"
SRC_URI = "${UBOOT_GIT_URI};protocol=${UBOOT_GIT_PROTOCOL};branch=${BRANCH}"

SPL_UART_BINARY:ok6254c-k3r5 = "u-boot-spl.bin"
