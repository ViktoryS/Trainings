package ua.trainings.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    private static final String BUNDLE_NAME = "messages";
    private ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_NAME, new Locale("en"));

    public static final String SPACE = " ";
    public static final String COMMA = ",";
    public static final String DOT = ".";
    public static final String WELCOME = "welcome.msg";
    public static final String ADD_NOTE = "add.note.msg";
    public static final String INPUT_MSG = "input.msg";
    public static final String PLEASE_MSG = "please.msg";
    public static final String NAME_MSG = "name.msg";
    public static final String NICKNAME_MSG = "nickname.msg";
    public static final String MOBILE_PHONE_MSG = "mobile.phone.msg";
    public static final String HOME_PHONE_MSG = "home.phone.msg";
    public static final String EMAIL_MSG = "email.msg";
    public static final String THANKS_FOR_NEW_NOTE = "thanks.for.note.msg";
    public static final String INPUT_WRONG_DATA = "input.wrong.data";

    public void welcome(){
        System.out.println(bundle.getString(WELCOME));
    }

    public void addNote(){
        System.out.println(bundle.getString(ADD_NOTE));
    }

    public void inputName(){
        System.out.println(bundle.getString(INPUT_MSG) + SPACE
                + NAME_MSG + COMMA + SPACE + bundle.getString(PLEASE_MSG));
    }

    public void inputNickName(){
        System.out.println(bundle.getString(INPUT_MSG) + SPACE
                + NICKNAME_MSG + COMMA + SPACE + bundle.getString(PLEASE_MSG));
    }

    public void inputMobilePhone(){
        System.out.println(bundle.getString(INPUT_MSG) + SPACE
                + MOBILE_PHONE_MSG + COMMA + SPACE + bundle.getString(PLEASE_MSG));
    }

    public void inputHomePhone(){
        System.out.println(bundle.getString(INPUT_MSG) + SPACE
                + HOME_PHONE_MSG + COMMA + SPACE + bundle.getString(PLEASE_MSG));
    }

    public void inputEmail(){
        System.out.println(bundle.getString(INPUT_MSG) + SPACE
                + EMAIL_MSG + COMMA + SPACE + bundle.getString(PLEASE_MSG));
    }

    public void inputWrong(){
        System.out.println(bundle.getString(INPUT_WRONG_DATA));
    }

    public void thanksForNewNote(){
        System.out.println(bundle.getString(THANKS_FOR_NEW_NOTE));
    }
}
