package co.jp.rtyairi;

import java.io.File;

import android.util.Log;
import android.widget.TextView;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class UItest extends UiAutomatorTestCase {

	public void testAddition() throws UiObjectNotFoundException,
			InterruptedException {
		// 1. �z�[���{�^���������ăA�v���P�[�V���������`���[��\������B
		getUiDevice().pressHome();

		// �ȉ�FriendsNote
		UiObject friendsNote = new UiObject(
				new UiSelector().text("Friends Note"));
		friendsNote.clickAndWaitForNewWindow();

		// ���񂽂񃍃O�C�����^�b�v
		// getUiDevice().click(577,592);

		// ���e�{�^���i�q�G�����L�����ǂ��Ď擾�j
		// ���j���[�{�^�����^�b�v
		UiObject frame0 = new UiObject(new UiSelector().index(0));
		UiObject liner0 = frame0.getChild(new UiSelector().index(0));
		UiObject frame1 = liner0.getChild(new UiSelector().index(0));
		UiObject relative0 = frame1.getChild(new UiSelector().index(0));
		UiObject frame2 = relative0.getChild(new UiSelector().index(3));
		UiObject liner1 = frame2.getChild(new UiSelector().index(0));
		UiObject relative1 = liner1.getChild(new UiSelector().index(3));
		UiObject liner2 = relative1.getChild(new UiSelector().index(0));
		liner2.clickAndWaitForNewWindow();

		// �A�h���X���o�b�N�A�b�v���^�b�v
		UiObject relative10 = relative0.getChild(new UiSelector().index(0));
		UiObject list10 = relative10.getChild(new UiSelector().index(1));
		UiObject relative11 = list10.getChild(new UiSelector().index(2));
		UiObject text10 = relative11.getChild(new UiSelector().index(0));
		text10.clickAndWaitForNewWindow();

		// �X�}�[�g�t�H���ۑ����^�b�v
		UiObject frame20 = relative0.getChild(new UiSelector().index(2));
		UiObject relative20 = frame20.getChild(new UiSelector().index(0));
		UiObject scroll20 = relative20.getChild(new UiSelector().index(1));
		UiObject linear20 = scroll20.getChild(new UiSelector().index(0));
		UiObject linear21 = linear20.getChild(new UiSelector().index(3));
		UiObject linear22 = linear21.getChild(new UiSelector().index(0));
		linear22.clickAndWaitForNewWindow();

		// �X�}�[�g�t�H���ɕۑ��̃|�b�v�A�b�v�Łu�͂��v��I��
		UiObject frame30 = frame0.getChild(new UiSelector().index(0));
		UiObject frame31 = frame30.getChild(new UiSelector().index(0));
		UiObject linear30 = frame31.getChild(new UiSelector().index(0));
		UiObject linear31 = linear30.getChild(new UiSelector().index(2));
		UiObject linear32 = linear31.getChild(new UiSelector().index(0));
		UiObject button30 = linear32.getChild(new UiSelector().index(0));
		button30.clickAndWaitForNewWindow();

		// notification��\��
		// UiObject notification1 = new UiObject(new UiSelector().index(0));
		getUiDevice().swipe(509, 12, 509, 1752, 10);

		// notification��FriendsNote���^�b�v
		UiObject notificationfriednsnote = new UiObject(
				new UiSelector().packageName("jibe.android.activity"));
		notificationfriednsnote.clickAndWaitForNewWindow();

		// �����܂ő҂�
		UiObject frame40 = relative0.getChild(new UiSelector().index(0));
		UiObject relative40 = frame40.getChild(new UiSelector().index(0));
		UiObject scroll40 = relative40.getChild(new UiSelector().index(1));
		UiObject linear40 = scroll40.getChild(new UiSelector().index(0));
		UiObject relative41 = linear40.getChild(new UiSelector().index(1));
		UiObject button40 = relative41.getChild(new UiSelector().index(0));
		UiObject relative42 = linear40.getChild(new UiSelector().index(0));
		UiObject text40 = relative42.getChild(new UiSelector().index(0));
		String text4 = text40.getText();
		int messageLength1 = text4.length();
		/*
		 *String�̒����̊m�F
		 * if(text4.equals("�A�h���X���ۑ���...")){ System.out.println("111");
		 * System.out.println(messageLength1); } else{
		 * System.out.println(text4); System.out.println("222");
		 * System.out.println(messageLength1); }
		 */

		//sync������������OK�{�^���^�b�v
		int i = 0;
		while (i == 0) {
			if (messageLength1 == 11) {
				System.out.println(messageLength1);
				Thread.sleep(3000); // 3000�~���bSleep����
				text4 = text40.getText();
				messageLength1 = text4.length();
			} else if (messageLength1 == 26) {
				System.out.println(messageLength1);
				UiObject okbutton = new UiObject(new UiSelector().text("OK"));
				okbutton.click();
				i++;
			}
		}
	}
}