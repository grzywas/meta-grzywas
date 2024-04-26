SUMMARY = "rpi4-display-oled-128x64px bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
HOMEPAGE = "https://github.com/grzywas"

#INHERIT += "report-error"

SRCREV = "${AUTOREV}"
PV = "0.1+git${SRCPV}"
SRC_URI = "git://github.com/grzywas/rpi4-display-oled-128x64px;protocol=https;branch=main"


S = "${WORKDIR}/git"

#do_compile() {
#	${CC} ${LDFLAGS} main.c -o test
#}

inherit cmake

EXTRA_OECMAKE = ""

do_install() {
	install -d ${D}${bindir}
	install -m 0755 rpi4-display-oled-128x64px ${D}${bindir}
}
