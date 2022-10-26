#!/bin/bash

SRC=/tmp/ok6254c-rootfs
DEST=/media/$USER/root

#sudo tar xvpf ./build/tmp/deploy/images/ok6254c/core-image-minimal-ok6254c.tar.xz -C $DEST --numeric-owner

mkdir -p $SRC
sudo tar xpf ./build/tmp/deploy/images/ok6254c/core-image-minimal-ok6254c.tar.xz -C $SRC --numeric-owner
sudo rsync -aAXv --delete --progress --exclude="lost+found" $SRC/. $DEST

sudo rm /tmp/ok6254c-rootfs -rf
