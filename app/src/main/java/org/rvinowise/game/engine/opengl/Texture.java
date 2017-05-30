package org.rvinowise.game.engine.opengl;


import static android.opengl.GLES20.GL_TEXTURE_2D;
import static android.opengl.GLES20.glBindTexture;


public class Texture {
    private int handle[] = new int[1];

    //private Point essential_texture_size;


    public Texture() {

    }

    public int[] getHandleRef() {
        return handle;
    }
    public int getHandle() {
        return handle[0];
    }

    public void bind() {
        glBindTexture(GL_TEXTURE_2D, this.getHandle());
    }

    /*public Point getEssential_texture_size() {
        return essential_texture_size;
    }*/
}
