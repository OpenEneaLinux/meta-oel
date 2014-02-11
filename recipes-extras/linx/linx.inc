SUMMARY = "LINX for Linux fast IPC"
DESCRIPTION = "LINX is a distributed communication protocol stack for transparent inter node and interprocess communication for a heterogeneous mix of systems."
HOMEPAGE = "http://linx.sourceforge.net/"
SECTION = "system/library"

DEPENDS = "linux-libc-headers virtual/libc"
RRECOMMENDS_${PN} = "linx-mod"

SRC_URI = "http://linux.enea.com/linx/linx-${PV}.tar.gz"

SRC_URI[md5sum] = "986191fbceff8e15c03dedc5e544e42e"
SRC_URI[sha256sum] = "ee51c905115dbf6e25b5980006994a81732b1c0aac460f16a6f0582bc1114954"

S = "${WORKDIR}/linx-${PV}"

inherit autotools

do_install_append () {
        mkdir -p ${D}/etc
        install -m 644 ${S}/linxgw/linxgws/example.conf ${D}/etc/linxgws.conf
}

