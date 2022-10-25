
DTSI_LIST = ""

do_setup_uio() {
    if [ "${ENABLE_TI_UIO_DEVICES}" == "1" ]
    then
        for dtsi in ${DTSI_LIST}
        do
            cp ${WORKDIR}/${dtsi} ${S}/arch/arm/boot/dts/
            for dtb in ${KERNEL_DEVICETREE}
            do
                dts=`echo $dtb | sed -e 's|dtb$|dts|'`
                echo "#include \"${dtsi}\"" >> ${S}/arch/arm/boot/dts/$dts
            done
        done
    fi
}

do_patch[postfuncs] += "do_setup_uio"
