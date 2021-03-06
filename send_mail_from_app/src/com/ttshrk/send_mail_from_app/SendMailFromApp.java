package com.ttshrk.send_mail_from_app;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.ttshrk.mbemoji.Emoji;
import com.ttshrk.mbemoji.EmojiUtility;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.UnknownServiceException;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

public class SendMailFromApp extends Activity {
	// 適切なアドレスを設定してください
	private static final String FROM_ADDRESS = "";
	private static final String SENDER_ADDRESS = "";
	private static final String TO_ADDRESS_01 = "";
	private static final String TO_ADDRESS_02 = "";
	private static final String GMAIL_ACCOUNT = "";
	private static final String GMAIL_PASSWORD = "";
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				buttonClick1();
			}
		});

		Button button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				buttonClick2();
			}
		});

		Button button3 = (Button) findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				buttonClick3();
			}
		});

		Button button4 = (Button) findViewById(R.id.button4);
		button4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				buttonClick4();
			}
		});

		Button button5 = (Button) findViewById(R.id.button5);
		button5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				buttonClick5();
			}
		});
	}

	/**
	 * utf-8 softbank.ne.jp
	 */
	private void buttonClick1() {
		Session session = createSendGMailSession();
		MimeMessage msg = new MimeMessage(session);

		try {
			msg.setSubject("gmailで携帯向けメール送信テスト(utf-8)", "utf-8");
			msg.setFrom(new InternetAddress(FROM_ADDRESS));
			msg.setSender(new InternetAddress(SENDER_ADDRESS));
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress(
					TO_ADDRESS_02));
			msg.setDataHandler(new DataHandler(new TextBinaryDataSource(
					"gmail経由でsoftbank.ne.jp向けメール送信テスト[:1025:][:0105:]"
							.getBytes(), "utf-8", "plain", Emoji.Mode.SOFTBANK)));

			sendGmail(msg, session);
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * utf-8 i.softbank.jp
	 */
	private void buttonClick2() {
		Session session = createSendGMailSession();
		MimeMessage msg = new MimeMessage(session);

		try {
			msg.setSubject("gmailでメール送信テスト(utf-8)", "utf-8");
			msg.setFrom(new InternetAddress(FROM_ADDRESS));
			msg.setSender(new InternetAddress(SENDER_ADDRESS));
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress(
					TO_ADDRESS_01));
			msg.setDataHandler(new DataHandler(new TextBinaryDataSource(
					"gmail経由でi.softbank.np向けメール送信テスト[:1025:][:0105:]"
							.getBytes(), "utf-8", "plain", Emoji.Mode.SOFTBANK)));

			sendGmail(msg, session);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * shift-jis softbank.ne.jp
	 */
	private void buttonClick3() {
		Session session = createSendGMailSession();
		MimeMessage msg = new MimeMessage(session);

		try {
			msg.setSubject("gmailでメール送信テスト(shift-jis)", "shift-jis");
			msg.setFrom(new InternetAddress(FROM_ADDRESS));
			msg.setSender(new InternetAddress(SENDER_ADDRESS));
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress(
					TO_ADDRESS_02));
			msg.setDataHandler(new DataHandler(new TextBinaryDataSource(
					"gmail経由でsoftbank.ne.jp向けメール送信テスト[:1025:][:0105:]"
							.getBytes("shift-jis"), "shift-jis", "plain",
					Emoji.Mode.SOFTBANK)));

			sendGmail(msg, session);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * shift-jis i.softbank.jp
	 */
	private void buttonClick4() {
		Session session = createSendGMailSession();
		MimeMessage msg = new MimeMessage(session);

		try {
			msg.setSubject("gmailでメール送信テスト(shift-jis)", "shift-jis");
			msg.setFrom(new InternetAddress(FROM_ADDRESS));
			msg.setSender(new InternetAddress(SENDER_ADDRESS));
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress(
					TO_ADDRESS_01));
			msg.setDataHandler(new DataHandler(new TextBinaryDataSource(
					"gmail経由でi.softbank.np向けメール送信テスト[:1025:][:0105:]"
							.getBytes("shift-jis"), "shift-jis", "plain",
					Emoji.Mode.SOFTBANK)));

			sendGmail(msg, session);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * utf-8 i.softbank.jp でこめ
	 * multipart/related
	 *  ├ multipart/alternative
 	 *  │ ├ text/plain
 	 *  │ └ text/html
  	 *  └ image　（インライン画像/添付画像）
	 */
	private void buttonClick5() {
		Session session = createSendGMailSession();
		MimeMessage msg = new MimeMessage(session);

		try {
			msg.setSubject("gmailでメール送信テスト(utf-8) でこめ", "utf-8");
			msg.setFrom(new InternetAddress(FROM_ADDRESS));
			msg.setSender(new InternetAddress(SENDER_ADDRESS));
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress(
					TO_ADDRESS_02));
			
			// related
			Multipart relatedPart = new MimeMultipart("related");
			
			// alternative
			MimeBodyPart alternativeBodyPart = new MimeBodyPart();
			Multipart alternativePart = new MimeMultipart("alternative");
			alternativeBodyPart.setContent(alternativePart);
			relatedPart.addBodyPart(alternativeBodyPart);

			// text mail
			MimeBodyPart textBodyPart = new MimeBodyPart();
			textBodyPart.setDataHandler(new DataHandler(new TextBinaryDataSource(
					"gmail経由でsoftbank.ne.jp向けメール送信テスト[:1025:][:0105:]".getBytes(),
					"utf-8", "plain", Emoji.Mode.SOFTBANK)));
			textBodyPart.setHeader("Content-Transfer-Encoding", "base64");
			alternativePart.addBodyPart(textBodyPart);

			// html mail
			MimeBodyPart htmlBodyPart = new MimeBodyPart();
			htmlBodyPart.setDataHandler(new DataHandler(new TextBinaryDataSource(
					"<HTML><BODY>gmail経由でsoftbank.ne.jp向けメール送信テスト[:1025:][:0105:]<IMG src=\"cid:12345@12345\"></BODY></HTML>".getBytes(),
					"utf-8", "html", Emoji.Mode.SOFTBANK)));
			htmlBodyPart.setHeader("Content-Transfer-Encoding", "base64");
			alternativePart.addBodyPart(htmlBodyPart);

			// inline image
			MimeBodyPart imageBodyPart = new MimeBodyPart();
			imageBodyPart.setDataHandler(new DataHandler(new FileDataSource("/sdcard/sample.gif")));
			imageBodyPart.setFileName(MimeUtility.encodeWord("sample.gif"));
			imageBodyPart.setDisposition("inline");	    // inline指定しておく
			imageBodyPart.setContentID("12345@12345");  // CIDを指定
			relatedPart.addBodyPart(imageBodyPart);
			
			// set related
			msg.setContent(relatedPart);
			
			sendGmail(msg, session);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @return
	 */
	private Session createSendGMailSession() {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); // SMTPサーバ名
		props.put("mail.host", "smtp.gmail.com"); // 接続するホスト名
		props.put("mail.smtp.port", "587"); // SMTPサーバポート
		props.put("mail.smtp.auth", "true"); // smtp auth
		props.put("mail.smtp.starttls.enable", "true"); // STTLS

		// セッション
		Session session = Session.getDefaultInstance(props);
		session.setDebug(true);
		return session;
	}

	/**
	 * 
	 * @param msg
	 * @param session
	 * @throws MessagingException
	 */
	private void sendGmail(MimeMessage msg, Session session)
			throws MessagingException {
		Transport t = session.getTransport("smtp");
		t.connect(GMAIL_ACCOUNT, GMAIL_PASSWORD);
		t.sendMessage(msg, msg.getAllRecipients());
	}
}

class TextBinaryDataSource implements DataSource {

	private byte[] text;
	private byte[] convertedText;
	private String charset;
	private String subType;
	private Emoji.Mode emojiMode;

	public TextBinaryDataSource(byte[] text, String charset, String subType,
			Emoji.Mode emojiMode) throws IOException {
		this.text = text;
		this.charset = charset;
		this.subType = subType;
		this.emojiMode = emojiMode;
		initialize();
	}

	public TextBinaryDataSource(String text, String charset, String subType,
			Emoji.Mode emojiMode) throws IOException {
		this(text.getBytes(), charset, subType, emojiMode);
	}

	public byte[] getPlainText() {
		return text;
	}

	private void initialize() throws IOException {
		InputStream dec_in = new ByteArrayInputStream(text);
		ByteArrayOutputStream bo = null;
		OutputStream os = null;

		try {
			bo = new ByteArrayOutputStream();
			os = EmojiUtility.decode(bo, charset, emojiMode);
			byte[] buf = new byte[2048];
			int len;

			while ((len = dec_in.read(buf)) != -1) {
				os.write(buf, 0, len);
			}
		} finally {
			if (os != null) {
				os.close();
			}
		}
		convertedText = bo.toByteArray();
	}

	@Override
	public InputStream getInputStream() throws IOException {
		InputStream is = new ByteArrayInputStream(convertedText);

		return is;
	}

	@Override
	public OutputStream getOutputStream() throws IOException {
		throw new UnknownServiceException();
	}

	@Override
	public String getContentType() {
		return "text/" + subType + "; charset=" + charset;
	}

	@Override
	public String getName() {
		return "";
	}

}