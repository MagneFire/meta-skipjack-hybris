inherit gettext

SUMMARY = "Downloads the qcom nonfree drivers to make Venus run"
LICENSE = "CLOSED"
SRC_URI = "file://firmware-qcom-media.tar.xz"
SRC_URI[md5sum] = "ab8afafe7cb16e0f45b6d31449cf529e"
SRC_URI[sha256sum] = "21304ae2ab7de743c0f783513e717e5c11cd4a25cc426456e9af2cff6f914c3a"
PV = "oreo"

PACKAGE_ARCH = "${MACHINE_ARCH}"
INHIBIT_PACKAGE_STRIP = "1"
COMPATIBLE_MACHINE = "skipjack"
INSANE_SKIP_${PN} = "already-stripped"
S = "${WORKDIR}"
B = "${S}"

do_install() {
    install -d ${D}/lib
    cp -r lib/* ${D}/lib

}

do_package_qa() {
}

FILES_${PN} += "lib/*"
