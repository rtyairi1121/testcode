package uiaMonitor_2;

import java.io.File;

import android.util.Log;
import android.widget.TextView;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class CalculatorTest extends UiAutomatorTestCase {

    public void testAddition() throws UiObjectNotFoundException {
    	int i = 0;
        // 1. ホームボタンを押してアプリケーションランチャーを表示する。
        getUiDevice().pressHome();

        //以下FriendsNote
        UiObject friendsNote = new UiObject(new UiSelector().text("Friends Note"));
        friendsNote.clickAndWaitForNewWindow();

        //かんたんログインをタップ
        //getUiDevice().click(577,592);

        // 投稿ボタン（ヒエラルキをたどって取得）
        //メニューボタンをタップ
        UiObject frame0 = new UiObject(new UiSelector().index(0));
        UiObject liner0 = frame0.getChild(new UiSelector().index(0));
        UiObject frame1 = liner0.getChild(new UiSelector().index(0));
        UiObject relative0 = frame1.getChild(new UiSelector().index(0));
        UiObject frame2 = relative0.getChild(new UiSelector().index(3));
        UiObject liner1 = frame2.getChild(new UiSelector().index(0));
        UiObject relative1 = liner1.getChild(new UiSelector().index(3));
        UiObject liner2 = relative1.getChild(new UiSelector().index(0));
        liner2.clickAndWaitForNewWindow();

//        File storePath = new File("/mnt/sdcard/Pictures/test.png");
//        getUiDevice().takeScreenshot(storePath);
//        i++;


        //アドレス帳バックアップをタップ
        UiObject relative10 = relative0.getChild(new UiSelector().index(0));
        UiObject list10 = relative10.getChild(new UiSelector().index(1));
        UiObject relative11 = list10.getChild(new UiSelector().index(2));
        UiObject text10 = relative11.getChild(new UiSelector().index(0));
        text10.clickAndWaitForNewWindow();

//        File storePath_1 = new File("/mnt/sdcard/Pictures/test2.png");
//        getUiDevice().takeScreenshot(storePath_1);
//        i++;
    }

}