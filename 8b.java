// Ex 8(a): watch the order of the life-cycle methods on the console
import java.applet.Applet;
import java.awt.Graphics;
public class LifeCycle extends Applet {
public void init() { System.out.println("init()"); }
public void start() { System.out.println("start()"); }
public void stop() { System.out.println("stop()"); }
public void destroy() { System.out.println("destroy()"); }
public void paint(Graphics g) {
System.out.println("paint()");
g.drawString("Minimise and restore this window", 20, 30);
}
}
