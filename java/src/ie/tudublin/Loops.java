package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

    public void settings() {
        size(500, 500);
        cx = width / 2;
        cy = height / 2;        
    }

    int mode = 0;

    float cx;
    float cy;

    public void keyPressed() {
        // the value of mode will be the number of the 
        // number key pressed
        if (keyCode >= '0' && keyCode <= '9')
            mode = keyCode - '0';
    }

    public void setup() {
        colorMode(HSB);
    }

    public void draw() {
        background(0);
        noStroke();
        switch (mode)
        {
            case 0:
                fill(50, 255, 255);                    
                if (mouseX < cx)
                {
                    rect(0, 0, cx, height);
                }
                else
                {
                    rect(cx, 0, cx, height);
                }
                break;
            case 1:
                fill(50, 255, 255);                                    
                if (mouseX < cx && mouseY < cy)
                {
                    rect(0, 0, cx, cy);
                }
                else if (mouseX > cx && mouseY < cy)
                {
                    rect(cx, 0, cx, cy);
                }
                else if (mouseX < cx && mouseY > cy)
                {
                    rect(0, cy, cx, cy);
                }
                else
                {
                    rect(cx, cy, cx, cy);
                }
                break;
            case 2:
            {
                int numRects = (int)(mouseX / 10.0f);
                float w = width / (float) numRects;
                float cgap = 255 / (float) numRects;
                for(int i = 0 ; i < numRects ; i ++)
                {
                    fill(i * cgap, 255, 255);
                    rect(i * w, 0, w, height);
                }
                break;
            }
            case 3:
            {
                int numCircles = (int)(mouseX / 10.0f);
                float w = width / (float) numCircles;
                float cgap = 255 / (float) numCircles;
                for(int i = 0 ; i < numCircles ; i ++)
                {
                    fill(cgap * i, 255, 255);
                    ellipse(w / 2 + (i * w), cy, w, w);
                }
                break;
            }
            case 4:
            {
                int numSquares = (int)(mouseX / 10.0f);
                float w = width / (float) numSquares;
                float cgap = 255 / (float) numSquares;
                for(int i = 0 ; i < numSquares ; i ++)
                {
                    fill(cgap * i, 255, 255);
                    rect(i * w, i * w, w, w);
                }
                break;
            }
            case 5:
            {
                int numSquares = (int)(mouseX / 10.0f);
                float w = width / (float) numSquares;
                float h = height / (float) numSquares;
                float cgap = 255 / (float) numSquares;
                for(int i = 0 ; i < numSquares ; i ++)
                {
                    fill(cgap * i, 255, 255);
                    rect(i * w, i * h, w, h);
                    rect(width - ((i + 1) * w), (i * h), w, w);
                }
                break;
            }
            case 6:
            {
                int numCircles = (int)(mouseX / 10.0f);
                float cgap = 500 / (float) numCircles;
                for(int i = 0 ; i < numCircles ; i ++)
                {
                    fill(cgap * i, 255, 255);
                    ellipse(cx, cy, (width - (cgap * i)), (height - (cgap * i)));
                }
                break;
            }
            case 7:
            {
                int numCircles = (int)(mouseX / 10.0f);
                float w = width / (float) numCircles;
                float cgap = 255 / (float) (numCircles + numCircles);
                for(int i = 0 ; i < numCircles ; i ++)
                {
                    for(int j = 0 ; j < numCircles ; j ++)
                    {
                        fill(cgap * (i+j), 255, 255);
                        ellipse(w / 2 + (i * w), w / 2 + (j * w), w, w);
                    }
                }
                break;
            }
            case 8:
            {
                int sides = (mouseX / 50);
                float theta = TWO_PI / (float) sides;
                float radius = 200;
                stroke(255);
                for(int i = 1; i <= sides; i++)
                {
                    float x1 = sin(theta * (i - 1)) * radius;
                    float y1 = cos(theta * (i - 1)) * radius;
                    float x2 = sin(theta * i) * radius;
                    float y2 = cos(theta * i) * radius;
                    line(cx + x1, cy + y1, cx + x2, cy + y2);
                }
                break;
            }
            case 9: 
            {
                int numLines = 5;
                float theta = TWO_PI / (float) numLines;
                float radius = 100;
                for(int i = 0; i < numLines; i++)
                {
                    float angle = theta + i;
                    float x = sin(angle) * radius;
                    float y = cos(angle) * radius;
                    fill(255, 255, 255);
                    stroke(255);
                    line(cx, cy, cx + x, cy + y);
                }
                break;
            }
            
        }
    }
}
