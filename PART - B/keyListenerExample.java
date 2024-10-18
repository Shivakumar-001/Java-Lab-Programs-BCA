import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="keyListenerExample" width=350 height=290></applet>*/
public class keyListenerExample extends Applet implements KeyListener
{
    int x1=100, y1=50, x2=250, y2=200;
    public void init()
    {
        addKeyListener(this);
    }
    public void keyPressed(KeyEvent ke)
    {
        int key=ke.getKeyCode();
        switch(key)
        {
            case KeyEvent.VK_LEFT: x1=x1-10;x2=x2-10;break;
            case KeyEvent.VK_RIGHT: x1=x1+10;x2=x2+10;break;
            case KeyEvent.VK_UP: y1=y1-10;y2=y2-10;break;
            case KeyEvent.VK_DOWN: y1=y1+10;y2=y2+10;break;
        }
        repaint();
    }
    public void keyReleased(KeyEvent ke){ }
    public void keyTyped(KeyEvent ke){   repaint();  }

    public void paint(Graphics g)
    {
        g.drawLine(x1,y1,x2,y2);
    }
}