# CustomCrops

CustomCrops is a configurable crop and farming plugin for modern Minecraft servers. It supports custom crops, pots, sprinklers, watering cans, fertilizers, seasons, greenhouse mechanics, and extensible block and item integrations.

This repository is a maintained fork focused on the current server stack.

## Compatibility

| Component | Supported version |
| --- | --- |
| Minecraft | 26.3 |
| Java | 25 |
| Paper API | 26.3 |
| Folia / Lophine | Supported |
| CraftEngine | 26.9.2-SNAPSHOT |
| CustomFishing | 2.3.26 |

CraftEngine is optional, but this version targets its current API and no longer includes the legacy CraftEngine 0.0.x adapter. Other supported item, season, protection, quest, entity, and world-management integrations remain optional.

The versions above were tested together on Lophine 26.3 with its Folia region scheduler enabled.

## Features

- Custom crops with configurable growth conditions and seasonal behavior
- Pots, sprinklers, watering cans, fertilizers, scarecrows, and greenhouses
- Persistent world and crop data with compressed storage
- Custom item and furniture support through CraftEngine and other integrations
- Extensible API for custom blocks, items, actions, and requirements
- Folia-compatible scheduling

## Building

Install JDK 25, then run:

```shell
./gradlew clean build
```

On Windows:

```powershell
.\gradlew.bat clean build
```

The plugin JAR is generated in `target/`.

## Development API

The API module uses the following coordinates:

```kotlin
dependencies {
    compileOnly("net.momirealms:custom-crops:3.6.57")
}
```

## Credits and license

CustomCrops was originally created by XiaoMoMi. This maintained fork is distributed under the [GNU General Public License v3.0](LICENSE).
