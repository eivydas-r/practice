// for TIS/TSM error: https://github.com/processing/processing/commit/f512457c6e6034a1230161a01080ede5f431eebb


import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.awt.Robot;

public class Main {
    public static void main(String args[]){
        try{
            Robot bot = new Robot();
            bot.delay(3000);
            // hey boys
            bot.keyPress(KeyEvent.VK_H);
            bot.keyPress(KeyEvent.VK_E);
            bot.keyPress(KeyEvent.VK_Y);
            bot.keyPress(KeyEvent.VK_SPACE);
            bot.delay(500);
            bot.keyPress(KeyEvent.VK_B);
            bot.keyPress(KeyEvent.VK_O);
            bot.keyPress(KeyEvent.VK_Y);
            bot.keyPress(KeyEvent.VK_S);
            bot.mouseMove(600,500);
            bot.mousePress(KeyEvent.VK_2);

            bot.keyPress(KeyEvent.VK_SPACE);

            /*for(int i = 0; i<100;i++){
                bot.keyPress(KeyEvent.VK_A);
                bot.delay(200);
            }*/

        } catch(Exception e){}
    }
}
