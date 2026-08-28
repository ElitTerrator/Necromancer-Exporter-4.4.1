# Necromancer Exporter 4.4.1

This plugin exports your Blockbench model as Java source files compatible with Veil's Necromancer system. It generates:

- A Skeleton class with bone hierarchy and positions
- A Skin class with cube geometry and UV mapping

Supports box UV, per-face UV scaling, and bone rotation.

## Installation
1. Download `necromancer_exporter_4_4_1.js` from the [latest release](https://github.com/ElitTerrator/Necromancer-Exporter-4.4.1/releases/tag/v1.0.1) or this repo.
2. In Blockbench, go to **File > Plugins > Load Plugin from File**.
3. Select the downloaded `.js` file.

Once installed, two new options appear under **File > Export**:
- **Export Bone File** — generates the Skeleton `.java` class
- **Export Skin File** — generates the Skin `.java` class

## How to use it
You need to be very precise with the structure of your proyect:

- When creating a Generic Model set `Default UV Mode` to `Box UV`
- All groups and cubes should be inside a root folder
- Each group will be consider a new Bone
- Any groups inside another group will be linked in motion and rotation, *both in BlockBench and in Minecraft*
- All cubes directly inside a group will be part of its Skin

### This plugin allows to map smaller or bigger uv on cubes, for that:

- First, set all UV to `Box UV`
- Then change the cubes you want to resize UVs to `Per-face UV`
- Dont change the disposition of the squares just the size of all of them, this means that, when selecting all the squares, the top left corner of the selection should not have moved. If it moves, you can revert the changes by changing that cube UVs to `Box UV` again.
- After making the size changes, do not change that cube's UVs to `Box UV` ever again, it will break it
- After making the size changes, you cannot move the location of the cube's UVs
- Making any of this changes might lead to broken UVs

### There are also some limitations:

- Cubes outside any group aren't exporte
- No support for animations, only static bind pose
- Per-face UV must follow box UV conventions or export may be inaccurate, to avoid problems do not change the squares dispositions, just the position of the whole cube

## Credits
- Built for use with [Veil](https://modrinth.com/mod/veil), a rendering framework for Mods.
- Created by Elit_Terrator.
