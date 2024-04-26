require recipes-core/images/rpi-test-image.bb

DESCRIPTION = "My customized version of rpi-test-image"

IMAGE_INSTALL += "rpi4-display-oled-128x64px"
