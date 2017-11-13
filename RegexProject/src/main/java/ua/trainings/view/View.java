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
    public static final String MENU_INPUT = "input.menu";
    public static final String BYE_MSG = "exit.msg";

    public void printObject(Object obj){
        System.out.println(obj);
    }

    public void exit(){
        System.out.println(bundle.getString(BYE_MSG));
    }

    public void welcome(){
        System.out.println(bundle.getString(WELCOME));
    }

    public void addNote(){
        System.out.println(bundle.getString(ADD_NOTE));
    }

    public void menu(){
        System.out.println(bundle.getString(MENU_INPUT));
    }

    public void inputName(){
        System.out.println(bundle.getString(INPUT_MSG) + SPACE
                + bundle.getString(NAME_MSG) + COMMA + SPACE + bundle.getString(PLEASE_MSG));
    }
    public void inputNickName(){
        System.out.println(bundle.getString(INPUT_MSG) + SPACE
                + bundle.getString(NICKNAME_MSG) + COMMA + SPACE + bundle.getString(PLEASE_MSG));
    }

    public void inputMobilePhone(){
        System.out.println(bundle.getString(INPUT_MSG) + SPACE
                + bundle.getString(MOBILE_PHONE_MSG) + COMMA + SPACE + bundle.getString(PLEASE_MSG));
    }

    public void inputHomePhone(){
        System.out.println(bundle.getString(INPUT_MSG) + SPACE
                + bundle.getString(HOME_PHONE_MSG) + COMMA + SPACE + bundle.getString(PLEASE_MSG));
    }

    public void inputEmail(){
        System.out.println(bundle.getString(INPUT_MSG) + SPACE
                + bundle.getString(EMAIL_MSG) + COMMA + SPACE + bundle.getString(PLEASE_MSG));
    }

    public void inputWrong(){
        System.out.println(bundle.getString(INPUT_WRONG_DATA));
    }

    public void thanksForNewNote(){
        System.out.println(bundle.getString(THANKS_FOR_NEW_NOTE));
    }
}
