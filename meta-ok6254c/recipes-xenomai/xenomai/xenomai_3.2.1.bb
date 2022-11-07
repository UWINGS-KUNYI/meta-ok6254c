
SUMMARY = "Xenomai is a Free Software project in which engineers from a wide background collaborate to build a versatile real-time framework for the Linux© platform. "
HOMEPAGE = "http://www.xenomai.org"
SECTION = "kernel/real-time"

LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://kernel/cobalt/COPYING;md5=073dc31ccb2ebed70db54f1e8aeb4c33"

DEPENDS = "hostperl-runtime-native"
RDEPENDS_${PN} = "libgcc"

SRC_URI = "https://source.denx.de/Xenomai/xenomai/-/archive/v${PV}/xenomai-v${PV}.tar.bz2"
SRC_URI[md5sum] = "ce1bf6f6ec5c01dc17e184003f740321"
SRC_URI[sha256sum] = "6d04d17262746c94290c7e314c11bc5ca6a7f53a204b1509d91a2c0b4d3a36d6"

S = "${WORKDIR}/${PN}-v${PV}"

inherit autotools pkgconfig lib_package

B = "${WORKDIR}/build"
do_configure[cleandirs] = "${B}"

EXTRA_OECONF = "--disable-debug --enable-smp --with-core=cobalt "

inherit useradd

# You must set USERADD_PACKAGES when you inherit useradd. This
# lists which output packages will include the user/group
# creation code.
USERADD_PACKAGES = "${PN}"

# You must also set USERADD_PARAM and/or GROUPADD_PARAM when
# you inherit useradd.
USERADD_PARAM:${PN} = "--no-create-home --system --user-group xenomai"

prefix="/usr/xenomai"
exec_prefix="/usr/xenomai"
libdir="/usr/xenomai/lib"
datarootdir="${prefix}/share"
datadir="/usr/xenomai/share"
pkgdatadir="${datadir}/xenomai"
includedir="/usr/xenomai/include"

#Add directories to package for shipping
FILES:${PN} += "/dev/"
FILES:${PN} += "/etc/"
FILES:${PN} += "/usr/xenomai/"

PACKAGE_DEBUG_SPLIT_STYLE = "debug-file-directory"

INSANE_SKIP:${PN} += "dev-so staticdev libdir ldflags"

SYSROOT_DIRS += "${bindir}"

do_install:append() {
  install -d ${D}/etc/ld.so.conf.d
  echo "/usr/xenomai/lib" > ${S}/xenomai.conf
  install -m 0755 ${S}/xenomai.conf ${D}/etc/ld.so.conf.d/xenomai.conf
}

sysroot_stage_all:append() {
  install -d ${SYSROOT_DESTDIR}${bindir}
  install -m 0755 ${D}${bindir}/xeno-config ${SYSROOT_DESTDIR}${bindir}/xeno-config
}
