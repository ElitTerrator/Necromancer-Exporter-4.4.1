# Necromancer Exporter 4.4.1

This plugin exports your Blockbench model as Java source files compatible with Veil's Necromancer system. It generates:

- A Skeleton class with bone hierarchy and positions
- A Skin class with cube geometry and UV mapping

Supports box UV, per-face UV scaling, and bone rotation.

## Installation
1. Download `necromancer_exporter_4_4_1.js` from the [latest release](link) or this repo.
2. In Blockbench, go to **File > Plugins > Load Plugin from File**.
3. Select the downloaded `.js` file.

Once installed, two new options appear under **File > Export**:
- **Export Bone File** — generates the Skeleton `.java` class
- **Export Skin File** — generates the Skin `.java` class

## How to use it
You need to be very precise with the structure of your proyect:

- All groups and cubes should be inside a root folder
- Each group will be consider a new Bone
- Any groups inside another group will be linked in motion and rotation, *both in BlockBench and in Minecraft*
- All cubes directly inside a group will be part of its Skin


