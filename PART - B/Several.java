import java.applet.Applet;
import java.awt.*;
/* <applet code="Several" width=350 height=250></applet>*/
public class Several extends Applet{
    Font f1;
    public void init()
    {
        f1=new Font("Georgia",Font.BOLD,22);
    }
    public void paint(Graphics g)
    {
        g.setFont(f1);
        g.setColor(Color.GREEN);
        g.drawString("different shapes",10,20);

        g.setColor(Color.BLACK);
        g.drawLine(50,60,150,60);
    
        g.setColor(Color.BLUE);
        g.drawOval(90,80,60,70);

        g.setColor(Color.GREEN);
        g.drawRect(40,100,40,80);
    }
}