package org.rvinowise.game.engine.opengl.primitives;


import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import static org.rvinowise.game.engine.opengl.primitives.Shape.*;
import static org.rvinowise.game.engine.opengl.primitives.Shape.BYTES_PER_FLOAT;

public class Rectangle_shape {

    private static final float scale=0.5f;
    private static final float[] shape = {
            // ver: X, Y
            // tex: X, Y
            -scale, -scale,
            0.0f, 1.0f,

            scale, -scale,
            1.0f, 1.0f,

            scale, scale,
            1.0f, 0.0f,

            -scale, scale,
            0.0f, 0.0f
    };



    private static FloatBuffer vertexBuffer;


    private static float[] getShape() {
        return shape;
    }

    public static void init() {
        vertexBuffer= ByteBuffer.allocateDirect(
                shape.length * BYTES_PER_FLOAT).
                order(ByteOrder.nativeOrder()).asFloatBuffer();
        vertexBuffer.put(shape);
    }

    public static FloatBuffer getVertexBuffer() {
        return vertexBuffer;
    }


}
