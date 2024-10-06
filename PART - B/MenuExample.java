import java.awt.*;
import javax.swing.*;
class MenuExample
{
    MenuExample()
    {
        Frame f = new Frame("MenuBar and pullDoen Menu's");
        MenuBar mb =new MenuBar();
        Menu menu = new Menu("Main Menu");
        Menu submenu = new Menu("SubMenu");
        MenuItem i1= new MenuItem("item1");
        MenuItem i2= new MenuItem("item2");
        MenuItem i3= new MenuItem("item3");
        MenuItem i4= new MenuItem("item4");
        MenuItem i5= new MenuItem("item5");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);

        submenu.add(i4);
        submenu.add(i5);

        menu.add(submenu);
        mb.add(menu);

        f.setMenuBar(mb);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void Main(String args[])
    {
        MenuExample obj = new MenuExample();
    }
}