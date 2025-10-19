package com.base.engine;

import org.lwjgl.input.Keyboard;

public class Game
{
    private Mesh mesh;
    private Shader shader;
    private Transform transform;

    public Game()
    {
        mesh = new Mesh();
        shader = new Shader();

        Vertex[] data = new Vertex[] {new Vertex(new Vector3f(-1, -1, 0)),
                                      new Vertex(new Vector3f(0, 1, 0)),
                                      new Vertex(new Vector3f(1, -1, 0))};

        mesh.addVertices(data);

        transform = new Transform();

        shader.addVertexShader(ResourceLoader.loadShader("basicVertex.vert"));
        shader.addFragmentShader(ResourceLoader.loadShader("basicFragment.frag"));
        shader.compileShader();

        shader.addUniform("transform");
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

    float temp = 0.0f;

    public void update()
    {
        temp += Time.getDelta();

        transform.setTranslation((float)Math.sin(temp), 0, 0);
    }

    public void render()
    {
        shader.bind();
        shader.setUniform("transform", transform.getTransformation());
        mesh.draw();
    }
}
