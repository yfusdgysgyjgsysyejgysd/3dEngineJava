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
    }

    public void update()
    {

    }

    public void render()
    {

    }
}
