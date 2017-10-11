/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktoptimer;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JButton;

/**
 *
 * @author rjbr
 */
    public class PlayAlarm {

    JButton btn, btn2;
    AudioClip click;

    public void sonarA() {
        URL urlClick = PlayAlarm.class.getResource("alarma.wav");
        click = Applet.newAudioClip(urlClick);
        click.loop();
    }

    public void silenciar() {
        click.stop();
    }

}
