/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package textspeech;
package artisan.com.company;

import java.awt.event.KeyEvent;
import java.util.Locale;
import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import static javax.swing.text.html.HTML.Attribute.ID;

public class TextSpeech {

   /* public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.Player) {
                //all the key events for player 1

                if (key == KeyEvent.VK_UP) {
                    tempObject.setVelY(0);
                }
                if (key == KeyEvent.VK_DOWN) {
                    tempObject.setVelY(0);
                }
                if (key == KeyEvent.VK_LEFT) {
                    tempObject.setVelX(0);
                }
                if (key == KeyEvent.VK_RIGHT) {
                    tempObject.setVelX(0);
                }
                //else if(key == KeyEvent.VK_S) tempObject.setY(tempObject.getY() + 10);

            }

        }
    }*/

    public static void main(String[] args) {
        byte limit = 0;
        do {
            try {
                System.setProperty("freetts.voices",
                        "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
                Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
                Synthesizer synthesizer
                        = Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
                synthesizer.allocate();
                synthesizer.resume();
                synthesizer.speakPlainText("Hello john", null);
                synthesizer.speakPlainText("Hello john", null);
                synthesizer.speakPlainText("Data saved successifully", null);
                synthesizer.speakPlainText("wrong details", null);
                synthesizer.speakPlainText("Connection established", null);
                synthesizer.speakPlainText("BUT PROGRAMMING IS FUN", null);
                synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
                synthesizer.allocate();
            } catch (Exception e) {
                e.printStackTrace();
            }
            limit++;
            System.out.println(limit);
        } while (limit <= 5);
        System.exit(0);
    }
}
