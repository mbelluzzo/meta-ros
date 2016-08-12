DESCRIPTION = "MAVLink message marshaling library"
DEPENDS = ""
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=54ad3cbe91bebcf6b1823970ff1fb97f"

SRCBRANCH = "release/indigo/mavlink"
SRCREV = "977f7d41d0a4e0afbe67cdb61f0d69eff2c2fd81"
SRC_URI = "git://github.com/mavlink/mavlink-gbp-release.git;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

inherit catkin
