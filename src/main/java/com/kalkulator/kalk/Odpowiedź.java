package com.kalkulator.kalk;

public class Odpowiedź
{
    private int x;
    private int y;
    private int result;

    public Odpowiedź(int x, int y, int result)
    {
        this.x = x;
        this.y = y;
        this.result = result;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getResult()
    {
        return result;
    }
}
