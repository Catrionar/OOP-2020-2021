package ie.tudublin;

import processing.core.PApplet;

public class Bullet {
    float x, y;
    float dx, dy;
    float rotation = 0;
    float speed = 5;
    
    YASC yasc;

    public Bullet(YASC yasc, float x, float y, float rotation)
    {
        this.x = x;
        this.y = y;
        this.rotation = rotation;
        this.yasc = yasc;
    }


    public void render()
    {
        yasc.stroke(255);
        yasc.pushMatrix();
        yasc.translate(x, y);
        yasc.rotate(rotation);
        yasc.line(0, -5, 0, 5);
        yasc.popMatrix();
    }

    public void update()
    {
        dx = PApplet.sin(rotation);
        dy =  - PApplet.cos(rotation);

        x += dx * speed;
        y += dy * speed;

        if (x < 0)
        {
            x = yasc.width;
        }
        if (x > yasc.width)
        {
            x = 0;
        }

        if (y < 0)
        {
            y = yasc.height;
        }
        if (y > yasc.height)
        {
            y = 0;
        }
    }


}
