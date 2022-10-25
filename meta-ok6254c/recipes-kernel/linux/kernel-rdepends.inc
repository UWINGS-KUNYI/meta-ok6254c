# Pull in the devicetree files into the rootfs
RDEPENDS:${KERNEL_PACKAGE_NAME}-base += "kernel-devicetree"

# Add run-time dependency for TIFS Low Power Module stub
RDEPENDS:${KERNEL_PACKAGE_NAME}-base:append:am62xx-evm = " tifs-lpm-stub"
RDEPENDS:${KERNEL_PACKAGE_NAME}-base:append:ok6254c = " tifs-lpm-stub"

