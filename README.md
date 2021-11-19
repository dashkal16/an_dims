# Ars Nouveau: Dimension Addon Mod
Copyright © 2021 Dashkal <dashkal@darksky.ca>

This is the source code repository for the Ars Nouveau: Dimension mod for Minecraft.

All code and assets are licensed under the MIT license.  [Details here](/LICENSE.txt).

This project is an addon for [Ars Nouveau](https://github.com/baileyholl/Ars-Nouveau).
As an addon, it is in no way affiliated with Ars Nouveau itself.  All questions should be directed to Dashkal.

This project is built using Forge Gradle.

## Build Instructions
To generate a mod jar, run `./gradlew build`

When finished the jars will be placed in `build/libs/`:
* `an_dims-${version}.jar`
  * The main mod jar.
* `an_dims-${version}-sources.jar`
  * A jar containing complete mod sources.

`${version}` is defined in `gradle.properties`.
