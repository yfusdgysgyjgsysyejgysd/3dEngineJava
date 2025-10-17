package com.base.engine;

import org.lwjgl.input.Keyboard;

public class Game
{
    private Mesh mesh;
    private Shader shader;

    public Game()
    {
        mesh = new Mesh();
        shader = new Shader();

        Vertex[] data = new Vertex[] {new Vertex(new Vector3f(-1, -1, 0)),
                                      new Vertex(new Vector3f(0, 1, 0)),
                                      new Vertex(new Vector3f(1, -1, 0))};

        mesh.addVertices(data);

        shader.addVertexShader(ResourceLoader.loadShader("basicVertex.vert"));
        shader.addFragmentShader(ResourceLoader.loadShader("basicFragment.frag"));
        shader.compileShader();
    }

    public void input()
    {
        if(Input.getKeyDown(Keyboard.KEY_UP))
            System.out.println("u press up ! ! !");
        if(Input.getKeyUp(Keyboard.KEY_UP))
            System.out.println("y u release up me sad :(");

        if(Input.getMouseDown(1))
            System.out.println("u press rmb ! ! ! at " + Input.getMousePosition().toString());
        if(Input.getMouseUp(1))
            System.out.println("y u release rmb me sad :( at " + Input.getMousePosition().toString());
    }

    public void update()
    {

    }

    public void render()
    {
        shader.bind();
        mesh.draw();
    }
}
