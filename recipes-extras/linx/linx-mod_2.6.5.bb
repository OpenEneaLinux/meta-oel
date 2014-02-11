SUMMARY = "LINX for Linux fast IPC"
DESCRIPTION = "LINX is a distributed communication protocol stack for transparent inter node and interprocess communication for a heterogeneous mix of systems."
HOMEPAGE = "http://linx.sourceforge.net/"

SECTION = "kernel/modules"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://../../COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

DEPENDS = "linux-libc-headers linx"
RRECOMMENDS_${PN} = "linx kmod"

SRC_URI = "http://linux.enea.com/linx/linx-${PV}.tar.gz \
           file://linx-kernel-modules.patch \
           file://support-for-3.11-kernel-versions.patch \
          "
SRC_URI[md5sum] = "986191fbceff8e15c03dedc5e544e42e"
SRC_URI[sha256sum] = "ee51c905115dbf6e25b5980006994a81732b1c0aac460f16a6f0582bc1114954"

S = "${WORKDIR}/linx-${PV}/net/linx"

inherit module

module_do_compile_prepend () {
        do_make_scripts
}
