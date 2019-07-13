package demo.i18n;

import act.Act;
import act.controller.Controller;
import act.inject.DefaultValue;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.osgl.mvc.annotation.GetAction;

import java.util.Date;

/**
 * A simple hello world app entry
 *
 * Run this app, try to update some of the code, then
 * press F5 in the browser to watch the immediate change
 * in the browser!
 */
@SuppressWarnings("unused")
public class AppEntry extends Controller.Util {

    @GetAction
    public void home(@DefaultValue("World") String who) {
        Date javaDate = new Date();
        DateTime dateTime = DateTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        render(who, javaDate, dateTime, localDateTime, localDate, localTime);
    }

    @GetAction("beetl")
    public void beetlHome(@DefaultValue("World") String who) {
        Date javaDate = new Date();
        DateTime dateTime = DateTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        render("beetlHome", who, javaDate, dateTime, localDateTime, localDate, localTime);
    }

    public static void main(String[] args) throws Exception {
        Act.start();
    }

}
