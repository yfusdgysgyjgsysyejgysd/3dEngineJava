package com.base.engine;

import org.lwjgl.input.Keyboard;

public class Game
{
    public Game()
    {

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

    }
}
