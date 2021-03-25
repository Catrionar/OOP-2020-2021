package ie.tudublin;

import processing.core.PApplet;

public class Health {

    YASC yasc;
    Player player;
    int value;
    float w = 10;
    float dw = w * 2;
    float x, y;
    float dx, dy;
    float rotation;

    public Health(YASC yasc, Player player)
    {
        this.yasc = yasc;
        this.player = player;
        value = (int) yasc.random(100);
        rotation = 0;
    }
    
    void healthValue()
    {
        yasc.text("Health: " + value, player.x + 20, player.y);
    }

    void render()
    {
        yasc.pushMatrix();
        yasc.translate(x, y);
        yasc.rotate(rotation);
        yasc.stroke(225);
        yasc.line(0, 0, 0, dw);
        yasc.line(0, 0, dw, 0);
        yasc.line(dw, 0, dw, dw);
        yasc.line(0, dw, dw, dw);
        yasc.line(dw / 2.0f, 0, dw / 2.0f, dw);
        yasc.line(0, dw / 2.0f, dw, dw / 2.0f);
        yasc.popMatrix();
    }

    void update()
    {
        dx = PApplet.sin(rotation);
        dy =  - PApplet.cos(rotation);
        
        if (yasc.checkKey(PApplet.UP))
        {
            x += dx;
            y += dy;
        }
        if (yasc.checkKey(PApplet.DOWN))
        {
            x -= dx;
            y -= dy;
        }
        if (yasc.checkKey(PApplet.LEFT))
        {
            rotation -= 0.1f;
        }
        if (yasc.checkKey(PApplet.RIGHT))
        {
            rotation += 0.1f;
        }     
          
    }
}
