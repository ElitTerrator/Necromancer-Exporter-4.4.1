package elit.example.entity;

import foundry.veil.api.client.necromancer.Bone;
import foundry.veil.api.client.necromancer.Skeleton;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModelTestSkeleton extends Skeleton {
    private static final Logger log = LoggerFactory.getLogger(ModelTestSkeleton.class);
    protected Bone root	, body	, tail	, head	, leg1R	, leg1_2R	, leg1_3R	, leg1_4R	, leg2R	, leg2_2R	, leg2_3R	, leg2_4R	, leg3R	, leg3_2R	, leg3_3R	, leg3_4R	, leg4R	, leg4_2R	, leg4_3R	, leg4_4R	, leg1L	, leg1_2L	, leg1_3L	, leg1_4L	, leg2L	, leg2_2L	, leg2_3L	, leg2_4L	, leg3L	, leg3_2L	, leg3_3L	, leg3_4L	, leg4L	, leg4_2L	, leg4_3L	, leg4_4L	;

    public ModelTestSkeleton() {
        super();
        Bone rootBone = new Bone("root");
        rootBone.setBaseAttributes(new Vector3f(4F, 1F, -8F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(rootBone);
        this.root = rootBone;

        Bone bodyBone = new Bone("body");
        bodyBone.setBaseAttributes(new Vector3f(0F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(bodyBone);
        this.body = bodyBone;

        Bone tailBone = new Bone("tail");
        tailBone.setBaseAttributes(new Vector3f(-4F, 4F, 5F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(tailBone);
        this.tail = tailBone;

        Bone headBone = new Bone("head");
        headBone.setBaseAttributes(new Vector3f(-4F, 4F, 3F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(headBone);
        this.head = headBone;

        Bone leg1RBone = new Bone("leg1R");
        leg1RBone.setBaseAttributes(new Vector3f(4F, 3F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg1RBone);
        this.leg1R = leg1RBone;

        Bone leg1_2RBone = new Bone("leg1_2R");
        leg1_2RBone.setBaseAttributes(new Vector3f(6F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg1_2RBone);
        this.leg1_2R = leg1_2RBone;

        Bone leg1_3RBone = new Bone("leg1_3R");
        leg1_3RBone.setBaseAttributes(new Vector3f(4F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg1_3RBone);
        this.leg1_3R = leg1_3RBone;

        Bone leg1_4RBone = new Bone("leg1_4R");
        leg1_4RBone.setBaseAttributes(new Vector3f(3F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg1_4RBone);
        this.leg1_4R = leg1_4RBone;

        Bone leg2RBone = new Bone("leg2R");
        leg2RBone.setBaseAttributes(new Vector3f(4F, 3F, 3F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg2RBone);
        this.leg2R = leg2RBone;

        Bone leg2_2RBone = new Bone("leg2_2R");
        leg2_2RBone.setBaseAttributes(new Vector3f(6F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg2_2RBone);
        this.leg2_2R = leg2_2RBone;

        Bone leg2_3RBone = new Bone("leg2_3R");
        leg2_3RBone.setBaseAttributes(new Vector3f(4F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg2_3RBone);
        this.leg2_3R = leg2_3RBone;

        Bone leg2_4RBone = new Bone("leg2_4R");
        leg2_4RBone.setBaseAttributes(new Vector3f(3F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg2_4RBone);
        this.leg2_4R = leg2_4RBone;

        Bone leg3RBone = new Bone("leg3R");
        leg3RBone.setBaseAttributes(new Vector3f(4F, 3F, 6F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg3RBone);
        this.leg3R = leg3RBone;

        Bone leg3_2RBone = new Bone("leg3_2R");
        leg3_2RBone.setBaseAttributes(new Vector3f(6F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg3_2RBone);
        this.leg3_2R = leg3_2RBone;

        Bone leg3_3RBone = new Bone("leg3_3R");
        leg3_3RBone.setBaseAttributes(new Vector3f(4F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg3_3RBone);
        this.leg3_3R = leg3_3RBone;

        Bone leg3_4RBone = new Bone("leg3_4R");
        leg3_4RBone.setBaseAttributes(new Vector3f(3F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg3_4RBone);
        this.leg3_4R = leg3_4RBone;

        Bone leg4RBone = new Bone("leg4R");
        leg4RBone.setBaseAttributes(new Vector3f(3F, 5F, 9F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg4RBone);
        this.leg4R = leg4RBone;

        Bone leg4_2RBone = new Bone("leg4_2R");
        leg4_2RBone.setBaseAttributes(new Vector3f(6F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg4_2RBone);
        this.leg4_2R = leg4_2RBone;

        Bone leg4_3RBone = new Bone("leg4_3R");
        leg4_3RBone.setBaseAttributes(new Vector3f(4F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg4_3RBone);
        this.leg4_3R = leg4_3RBone;

        Bone leg4_4RBone = new Bone("leg4_4R");
        leg4_4RBone.setBaseAttributes(new Vector3f(3F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg4_4RBone);
        this.leg4_4R = leg4_4RBone;

        Bone leg1LBone = new Bone("leg1L");
        leg1LBone.setBaseAttributes(new Vector3f(-4F, 3F, 0F), new Quaternionf().rotateY(-3.141592653589793F), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg1LBone);
        this.leg1L = leg1LBone;

        Bone leg1_2LBone = new Bone("leg1_2L");
        leg1_2LBone.setBaseAttributes(new Vector3f(6F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg1_2LBone);
        this.leg1_2L = leg1_2LBone;

        Bone leg1_3LBone = new Bone("leg1_3L");
        leg1_3LBone.setBaseAttributes(new Vector3f(4F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg1_3LBone);
        this.leg1_3L = leg1_3LBone;

        Bone leg1_4LBone = new Bone("leg1_4L");
        leg1_4LBone.setBaseAttributes(new Vector3f(3F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg1_4LBone);
        this.leg1_4L = leg1_4LBone;

        Bone leg2LBone = new Bone("leg2L");
        leg2LBone.setBaseAttributes(new Vector3f(-4F, 3F, 3F), new Quaternionf().rotateY(-3.141592653589793F), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg2LBone);
        this.leg2L = leg2LBone;

        Bone leg2_2LBone = new Bone("leg2_2L");
        leg2_2LBone.setBaseAttributes(new Vector3f(6F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg2_2LBone);
        this.leg2_2L = leg2_2LBone;

        Bone leg2_3LBone = new Bone("leg2_3L");
        leg2_3LBone.setBaseAttributes(new Vector3f(4F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg2_3LBone);
        this.leg2_3L = leg2_3LBone;

        Bone leg2_4LBone = new Bone("leg2_4L");
        leg2_4LBone.setBaseAttributes(new Vector3f(3F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg2_4LBone);
        this.leg2_4L = leg2_4LBone;

        Bone leg3LBone = new Bone("leg3L");
        leg3LBone.setBaseAttributes(new Vector3f(-4F, 3F, 6F), new Quaternionf().rotateY(-3.141592653589793F), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg3LBone);
        this.leg3L = leg3LBone;

        Bone leg3_2LBone = new Bone("leg3_2L");
        leg3_2LBone.setBaseAttributes(new Vector3f(6F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg3_2LBone);
        this.leg3_2L = leg3_2LBone;

        Bone leg3_3LBone = new Bone("leg3_3L");
        leg3_3LBone.setBaseAttributes(new Vector3f(4F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg3_3LBone);
        this.leg3_3L = leg3_3LBone;

        Bone leg3_4LBone = new Bone("leg3_4L");
        leg3_4LBone.setBaseAttributes(new Vector3f(3F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg3_4LBone);
        this.leg3_4L = leg3_4LBone;

        Bone leg4LBone = new Bone("leg4L");
        leg4LBone.setBaseAttributes(new Vector3f(-3F, 5F, 9F), new Quaternionf().rotateY(-3.141592653589793F), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg4LBone);
        this.leg4L = leg4LBone;

        Bone leg4_2LBone = new Bone("leg4_2L");
        leg4_2LBone.setBaseAttributes(new Vector3f(6F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg4_2LBone);
        this.leg4_2L = leg4_2LBone;

        Bone leg4_3LBone = new Bone("leg4_3L");
        leg4_3LBone.setBaseAttributes(new Vector3f(4F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg4_3LBone);
        this.leg4_3L = leg4_3LBone;

        Bone leg4_4LBone = new Bone("leg4_4L");
        leg4_4LBone.setBaseAttributes(new Vector3f(3F, 0F, 0F), new Quaternionf(), new Vector3f(), new Vector3f(1.0F), new Vector4f(1.0F));
        this.addBone(leg4_4LBone);
        this.leg4_4L = leg4_4LBone;


        rootBone.addChild(bodyBone);
        bodyBone.addChild(tailBone);
        bodyBone.addChild(headBone);
        tailBone.addChild(leg1RBone);
        leg1RBone.addChild(leg1_2RBone);
        leg1_2RBone.addChild(leg1_3RBone);
        leg1_3RBone.addChild(leg1_4RBone);
        tailBone.addChild(leg2RBone);
        leg2RBone.addChild(leg2_2RBone);
        leg2_2RBone.addChild(leg2_3RBone);
        leg2_3RBone.addChild(leg2_4RBone);
        tailBone.addChild(leg3RBone);
        leg3RBone.addChild(leg3_2RBone);
        leg3_2RBone.addChild(leg3_3RBone);
        leg3_3RBone.addChild(leg3_4RBone);
        tailBone.addChild(leg4RBone);
        leg4RBone.addChild(leg4_2RBone);
        leg4_2RBone.addChild(leg4_3RBone);
        leg4_3RBone.addChild(leg4_4RBone);
        tailBone.addChild(leg1LBone);
        leg1LBone.addChild(leg1_2LBone);
        leg1_2LBone.addChild(leg1_3LBone);
        leg1_3LBone.addChild(leg1_4LBone);
        tailBone.addChild(leg2LBone);
        leg2LBone.addChild(leg2_2LBone);
        leg2_2LBone.addChild(leg2_3LBone);
        leg2_3LBone.addChild(leg2_4LBone);
        tailBone.addChild(leg3LBone);
        leg3LBone.addChild(leg3_2LBone);
        leg3_2LBone.addChild(leg3_3LBone);
        leg3_3LBone.addChild(leg3_4LBone);
        tailBone.addChild(leg4LBone);
        leg4LBone.addChild(leg4_2LBone);
        leg4_2LBone.addChild(leg4_3LBone);
        leg4_3LBone.addChild(leg4_4LBone);

        this.buildRoots();
    }
}