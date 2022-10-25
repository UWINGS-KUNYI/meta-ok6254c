Yocto Poky for [Forlinx OK6254-C Dev Board](https://www.forlinx.net/product/132.html)

the repository use [kas](https://github.com/siemens/kas) to create development environment and build image

currently testing on kirkstone(4.0.4) release

use **'kas-contrainer'** instruction to launch Docker image for build

```
kunyi@kunyi-ThinkPad-P53:~/ok6254/yocto$ ./kas-container build ok6254c.yml
2022-10-24 10:03:50 - INFO     - kas 3.1 started
2022-10-24 10:03:50 - INFO     - /repo$ git rev-parse --show-toplevel
2022-10-24 10:03:50 - INFO     - /repo$ git rev-parse --show-toplevel
2022-10-24 10:03:50 - INFO     - /repo$ git rev-parse --show-toplevel
2022-10-24 10:03:50 - INFO     - Using /repo as root for repository meta-ok6254c
2022-10-24 10:03:50 - INFO     - /work/meta-ti$ git remote set-url origin git://git.yoctoproject.org/meta-ti
2022-10-24 10:03:50 - INFO     - /work/meta-arm$ git remote set-url origin git://git.yoctoproject.org/meta-arm
2022-10-24 10:03:50 - INFO     - /work/poky$ git remote set-url origin git://git.yoctoproject.org/poky
2022-10-24 10:03:50 - INFO     - /work/meta-openembedded$ git remote set-url origin https://git.openembedded.org/meta-openembedded
2022-10-24 10:03:50 - INFO     - /work/meta-ti$ git cat-file -t kirkstone
2022-10-24 10:03:50 - INFO     - /work/meta-arm$ git cat-file -t kirkstone
2022-10-24 10:03:50 - INFO     - /work/poky$ git cat-file -t kirkstone
2022-10-24 10:03:50 - INFO     - /work/meta-openembedded$ git cat-file -t kirkstone
2022-10-24 10:03:50 - INFO     - Repository meta-ti already contains kirkstone as commit
2022-10-24 10:03:50 - INFO     - Repository meta-arm already contains kirkstone as commit
2022-10-24 10:03:50 - INFO     - Repository poky already contains kirkstone as commit
2022-10-24 10:03:50 - INFO     - Repository meta-openembedded already contains kirkstone as commit
2022-10-24 10:03:50 - INFO     - /repo$ git rev-parse --show-toplevel
2022-10-24 10:03:50 - INFO     - Using /repo as root for repository meta-ok6254c
2022-10-24 10:03:50 - INFO     - /work/meta-ti$ git status -s
2022-10-24 10:03:50 - INFO     - /work/meta-ti$ git rev-parse --verify -q origin/kirkstone
2022-10-24 10:03:50 - INFO     - 5eb1a669b82bfa58c5fc85ceadab815c6c4a6e61
2022-10-24 10:03:50 - INFO     - /work/meta-ti$ git checkout -q 5eb1a669b82bfa58c5fc85ceadab815c6c4a6e61 -B kirkstone
2022-10-24 10:03:50 - INFO     - /work/meta-arm$ git status -s
2022-10-24 10:03:50 - INFO     - /work/meta-arm$ git rev-parse --verify -q origin/kirkstone
2022-10-24 10:03:50 - INFO     - bafd1d013c2470bcec123ba4eb8232ab879b2660
2022-10-24 10:03:50 - INFO     - /work/meta-arm$ git checkout -q bafd1d013c2470bcec123ba4eb8232ab879b2660 -B kirkstone
2022-10-24 10:03:50 - INFO     - /work/poky$ git status -s
2022-10-24 10:03:50 - INFO     - /work/poky$ git rev-parse --verify -q origin/kirkstone
2022-10-24 10:03:50 - INFO     - 24a3f7b3648185e33133f5d96b184a6cb6524f3d
2022-10-24 10:03:50 - INFO     - /work/poky$ git checkout -q 24a3f7b3648185e33133f5d96b184a6cb6524f3d -B kirkstone
2022-10-24 10:03:50 - INFO     - /work/meta-openembedded$ git status -s
2022-10-24 10:03:50 - INFO     - /work/meta-openembedded$ git rev-parse --verify -q origin/kirkstone
2022-10-24 10:03:50 - INFO     - 744a4b6eda88b9a9ca1cf0df6e18be384d9054e3
2022-10-24 10:03:50 - INFO     - /work/meta-openembedded$ git checkout -q 744a4b6eda88b9a9ca1cf0df6e18be384d9054e3 -B kirkstone
2022-10-24 10:03:50 - INFO     - /repo$ git rev-parse --show-toplevel
2022-10-24 10:03:50 - INFO     - Using /repo as root for repository meta-ok6254c
2022-10-24 10:03:50 - INFO     - /repo$ git rev-parse --show-toplevel
2022-10-24 10:03:50 - INFO     - Using /repo as root for repository meta-ok6254c
2022-10-24 10:03:50 - INFO     - /work/poky$ /tmp/tmporamy7zk/get_bb_env /build
2022-10-24 10:03:50 - INFO     - /repo$ git rev-parse --show-toplevel
2022-10-24 10:03:50 - INFO     - Using /repo as root for repository meta-ok6254c
2022-10-24 10:03:50 - INFO     - /build$ /work/poky/bitbake/bin/bitbake -c build core-image-minimal
Loading cache: 100% |#######################################################################################################################################################################| Time: 0:00:01
Loaded 7574 entries from dependency cache.
Parsing recipes: 100% |#####################################################################################################################################################################| Time: 0:00:01
Parsing of 4732 .bb files complete (4726 cached, 6 parsed). 7574 targets, 441 skipped, 0 masked, 0 errors.
NOTE: Resolving any missing task queue dependencies
NOTE: Resolving any missing task queue dependencies
NOTE: Resolving any missing task queue dependencies
NOTE: Resolving any missing task queue dependencies
NOTE: Resolving any missing task queue dependencies
NOTE: Resolving any missing task queue dependencies

Build Configuration (mc:default):
BB_VERSION           = "2.0.0"
BUILD_SYS            = "x86_64-linux"
NATIVELSBSTRING      = "universal"
TARGET_SYS           = "aarch64-poky-linux"
MACHINE              = "ok6254c"
DISTRO               = "poky"
DISTRO_VERSION       = "4.0.4"
TUNE_FEATURES        = "aarch64"
TARGET_FPU           = ""
meta-ok6254c         = "<unknown>:<unknown>"
meta-arm
meta-arm-bsp
meta-arm-toolchain   = "kirkstone:bafd1d013c2470bcec123ba4eb8232ab879b2660"
meta-oe
meta-python          = "kirkstone:744a4b6eda88b9a9ca1cf0df6e18be384d9054e3"
meta-ti-bsp
meta-ti-extras       = "kirkstone:5eb1a669b82bfa58c5fc85ceadab815c6c4a6e61"
meta
meta-poky
meta-yocto-bsp       = "kirkstone:24a3f7b3648185e33133f5d96b184a6cb6524f3d"


Build Configuration:
BB_VERSION           = "2.0.0"
BUILD_SYS            = "x86_64-linux"
NATIVELSBSTRING      = "universal"
TARGET_SYS           = "arm-poky-linux-gnueabi"
MACHINE              = "ok6254c-k3r5"
DISTRO               = "poky"
DISTRO_VERSION       = "4.0.4"
TUNE_FEATURES        = "arm armv7a vfp thumb callconvention-hard"
TARGET_FPU           = "hard"
meta-ok6254c         = "<unknown>:<unknown>"
meta-arm
meta-arm-bsp
meta-arm-toolchain   = "kirkstone:bafd1d013c2470bcec123ba4eb8232ab879b2660"
meta-oe
meta-python          = "kirkstone:744a4b6eda88b9a9ca1cf0df6e18be384d9054e3"
meta-ti-bsp
meta-ti-extras       = "kirkstone:5eb1a669b82bfa58c5fc85ceadab815c6c4a6e61"
meta
meta-poky
meta-yocto-bsp       = "kirkstone:24a3f7b3648185e33133f5d96b184a6cb6524f3d"

Initialising tasks: 100% |##################################################################################################################################################################| Time: 0:00:03
Currently  1 running tasks (3770 of 3793)  99% |######################################################################################################################################################### |
0: linux-ti-staging-5.10.140+gitAUTOINC+c3b343850c-r0b do_package - 8s (pid 95299)


```

Know Issues:
  when use **dd**/**bmaptool** to flash Image onto SD card will failed boot partitions.
  need re-format the partition and manual copy tiboot3.bin, tispl.bin and u-boot.img into the partitions.

  like the below picture
  ![manual format boot](./docs/imgs/manual%20reformat%20boot.png)
