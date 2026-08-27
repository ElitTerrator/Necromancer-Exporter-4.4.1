package elit.magic.playerModelRenderer.test;

import foundry.veil.api.client.necromancer.render.Skin;

public class ModelTestSkin {
    protected static final Skin SKIN;

    static {
        Skin.Builder builder = Skin.builder(64, 64);
        builder.startBone("body");
        builder.addCube(4F, 4F, 2F, -6F, 2F, 3F, 0F, 0F, 0F, 40F, 8F, false);


        builder.startBone("tail");
        builder.addCube(6F, 6F, 2F, -3F, -3F, 7F, 0F, 0F, 0F, 30F, 20F, false);

        builder.addCube(8F, 8F, 7F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 20F, false);

        builder.addCube(4F, 4F, 1F, -2F, -2F, 9F, 0F, 0F, 0F, 0F, 47F, false);


        builder.startBone("head");
        builder.addCube(10F, 10F, 10F, -5F, -4F, -10F, 0F, 0F, 0F, 0F, 0F, false);

        builder.addCube(3F, 5F, 2F, 1F, -5F, -12F, 0F, 0F, 0F, 16F, 40F, false);

        builder.addCube(3F, 5F, 2F, -4F, -5F, -12F, 0F, 0F, 0F, 26F, 40F, false);


        builder.startBone("leg1R");
        builder.addCube(6F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 30F, 28F, false);


        builder.startBone("leg1_2R");
        builder.addCube(4F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 40F, 14F, false);


        builder.startBone("leg1_3R");
        builder.addCube(3F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 10F, 47F, false);


        builder.startBone("leg1_4R");
        builder.addCube(3F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 20F, 47F, false);


        builder.startBone("leg2R");
        builder.addCube(6F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 30F, 32F, false);


        builder.startBone("leg2_2R");
        builder.addCube(4F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 36F, 40F, false);


        builder.startBone("leg2_3R");
        builder.addCube(3F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 30F, 48F, false);


        builder.startBone("leg2_4R");
        builder.addCube(3F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 48F, 34F, false);


        builder.startBone("leg3R");
        builder.addCube(6F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 0F, 35F, false);


        builder.startBone("leg3_2R");
        builder.addCube(4F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 0F, 43F, false);


        builder.startBone("leg3_3R");
        builder.addCube(3F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 48F, 38F, false);


        builder.startBone("leg3_4R");
        builder.addCube(3F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 40F, 48F, false);


        builder.startBone("leg4R");
        builder.addCube(6F, 2F, 2F, 0F, -8F, -1F, 0F, 0F, 0F, 16F, 36F, false);


        builder.startBone("leg4_2R");
        builder.addCube(4F, 2F, 2F, 0F, -8F, -1F, 0F, 0F, 0F, 36F, 44F, false);


        builder.startBone("leg4_3R");
        builder.addCube(3F, 2F, 2F, 0F, -8F, -1F, 0F, 0F, 0F, 48F, 42F, false);


        builder.startBone("leg4_4R");
        builder.addCube(3F, 2F, 2F, 0F, -8F, -1F, 0F, 0F, 0F, 50F, 46F, false);


        builder.startBone("leg1L");
        builder.addCube(6F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 32F, 36F, false);


        builder.startBone("leg1_2L");
        builder.addCube(4F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 46F, 18F, false);


        builder.startBone("leg1_3L");
        builder.addCube(3F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 50F, 50F, false);


        builder.startBone("leg1_4L");
        builder.addCube(3F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 10F, 51F, false);


        builder.startBone("leg2L");
        builder.addCube(6F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 0F, 39F, false);


        builder.startBone("leg2_2L");
        builder.addCube(4F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 46F, 22F, false);


        builder.startBone("leg2_3L");
        builder.addCube(3F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 20F, 51F, false);


        builder.startBone("leg2_4L");
        builder.addCube(3F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 0F, 52F, false);


        builder.startBone("leg3L");
        builder.addCube(6F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 40F, 0F, false);


        builder.startBone("leg3_2L");
        builder.addCube(4F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 46F, 26F, false);


        builder.startBone("leg3_3L");
        builder.addCube(3F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 52F, 8F, false);


        builder.startBone("leg3_4L");
        builder.addCube(3F, 2F, 2F, 0F, -7F, -1F, 0F, 0F, 0F, 52F, 12F, false);


        builder.startBone("leg4L");
        builder.addCube(6F, 2F, 2F, 0F, -8F, -1F, 0F, 0F, 0F, 40F, 4F, false);


        builder.startBone("leg4_2L");
        builder.addCube(4F, 2F, 2F, 0F, -8F, -1F, 0F, 0F, 0F, 46F, 30F, false);


        builder.startBone("leg4_3L");
        builder.addCube(3F, 2F, 2F, 0F, -8F, -1F, 0F, 0F, 0F, 30F, 52F, false);


        builder.startBone("leg4_4L");
        builder.addCube(3F, 2F, 2F, 0F, -8F, -1F, 0F, 0F, 0F, 40F, 52F, false);


        SKIN = builder.build();
    }

    public static Skin getSKIN() { return SKIN; }
}