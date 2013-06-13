package jp.co.example.AutoAddressRegister;


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.ContentProviderOperation;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;


//à»â∫Ç…Ç¬Ç¢ÇƒÇÕèCê≥Ç∑ÇÈïKóvÇ†Ç†ÇÈ
@SuppressLint("SimpleDateFormat")
public class insertAddress extends Service {

		ArrayList<ContentProviderOperation> ops = new ArrayList<ContentProviderOperation>();
		int rawContactInsertIndex = ops.size();
		// raw_contactÉfÅ[É^ÇçÏê¨
		ops.add(ContentProviderOperation.newInsert(RawContacts.CONTENT_URI)
				.withValue(RawContacts.ACCOUNT_TYPE, "com.htc.android.pcsc")
				.withValue(RawContacts.ACCOUNT_NAME, "pcsc")
				.withValue(RawContacts.STARRED, 1)
				.withValue(RawContacts.AGGREGATION_MODE, RawContacts.AGGREGATION_MODE_DISABLED)
				.withValue(RawContacts.SEND_TO_VOICEMAIL, 1).build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, StructuredName.CONTENT_ITEM_TYPE)
				.withValue(StructuredName.DISPLAY_NAME,
						"Mike Sullivan_" + i).build());
		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(
						ContactsContract.Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Phone.CONTENT_ITEM_TYPE)
				.withValue(Phone.NUMBER, "9999999999") // Number of the
														// person
				.withValue(Phone.TYPE, Phone.TYPE_MOBILE).build()); // Type
																	// of
																	// mobile
																	// number
		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(
						ContactsContract.Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Phone.CONTENT_ITEM_TYPE)
				.withValue(Phone.NUMBER, "09011111111") // Number of the
														// person
				.withValue(Phone.TYPE, Phone.TYPE_MOBILE).build()); // Type
																	// of
																	// mobile
																	// number
		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(
						ContactsContract.Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Phone.CONTENT_ITEM_TYPE)
				.withValue(Phone.NUMBER, "09022222222") // Number of the
														// person
				.withValue(Phone.TYPE, Phone.TYPE_MOBILE).build()); // Type
																	// of
																	// mobile
																	// number
		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(
						ContactsContract.Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Phone.CONTENT_ITEM_TYPE)
				.withValue(Phone.NUMBER, "09033333333") // Number of the
														// person
				.withValue(Phone.TYPE, Phone.TYPE_MOBILE).build()); // Type
																	// of
																	// mobile
																	// number
		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(
						ContactsContract.Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Phone.CONTENT_ITEM_TYPE)
				.withValue(Phone.NUMBER, "09044444444") // Number of the
														// person
				.withValue(Phone.TYPE, Phone.TYPE_MOBILE).build()); // Type
																	// of
																	// mobile
																	// number
		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(
						ContactsContract.Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Phone.CONTENT_ITEM_TYPE)
				.withValue(Phone.NUMBER, "09055555555") // Number of the
														// person
				.withValue(Phone.TYPE, Phone.TYPE_MOBILE).build()); // Type
																	// of
																	// mobile
																	// number
		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(
						ContactsContract.Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Phone.CONTENT_ITEM_TYPE)
				.withValue(Phone.NUMBER, "09066666666") // Number of the
														// person
				.withValue(Phone.TYPE, Phone.TYPE_MOBILE).build()); // Type
																	// of
																	// mobile
																	// number
		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(
						ContactsContract.Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Phone.CONTENT_ITEM_TYPE)
				.withValue(Phone.NUMBER, "09077777777") // Number of the
														// person
				.withValue(Phone.TYPE, Phone.TYPE_MOBILE).build()); // Type
																	// of
																	// mobile
																	// number
		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(
						ContactsContract.Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Phone.CONTENT_ITEM_TYPE)
				.withValue(Phone.NUMBER, "09088888888") // Number of the
														// person
				.withValue(Phone.TYPE, Phone.TYPE_MOBILE).build()); // Type
																	// of
																	// mobile
																	// number
		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(
						ContactsContract.Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Phone.CONTENT_ITEM_TYPE)
				.withValue(Phone.NUMBER, "09099999999") // Number of the
														// person
				.withValue(Phone.TYPE, Phone.TYPE_MOBILE).build()); // Type
																	// of
																	// mobile
																	// number

		/*
		 * Email
		 */
		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(ContactsContract.Data.MIMETYPE,
						Email.CONTENT_ITEM_TYPE)
				.withValue(Email.DATA, "a@a")
				.withValue(Email.TYPE, Email.TYPE_WORK).build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(ContactsContract.Data.MIMETYPE,
						Email.CONTENT_ITEM_TYPE)
				.withValue(Email.DATA, "b@b")
				.withValue(Email.TYPE, Email.TYPE_WORK).build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(ContactsContract.Data.MIMETYPE,
						Email.CONTENT_ITEM_TYPE)
				.withValue(Email.DATA, "c@c")
				.withValue(Email.TYPE, Email.TYPE_WORK).build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(ContactsContract.Data.MIMETYPE,
						Email.CONTENT_ITEM_TYPE)
				.withValue(Email.DATA, "d@d")
				.withValue(Email.TYPE, Email.TYPE_WORK).build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(ContactsContract.Data.MIMETYPE,
						Email.CONTENT_ITEM_TYPE)
				.withValue(Email.DATA, "e@e")
				.withValue(Email.TYPE, Email.TYPE_WORK).build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(ContactsContract.Data.MIMETYPE,
						Email.CONTENT_ITEM_TYPE)
				.withValue(Email.DATA, "f@f")
				.withValue(Email.TYPE, Email.TYPE_WORK).build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(ContactsContract.Data.MIMETYPE,
						Email.CONTENT_ITEM_TYPE)
				.withValue(Email.DATA, "g@g")
				.withValue(Email.TYPE, Email.TYPE_WORK).build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(ContactsContract.Data.MIMETYPE,
						Email.CONTENT_ITEM_TYPE)
				.withValue(Email.DATA, "h@h")
				.withValue(Email.TYPE, Email.TYPE_WORK).build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(ContactsContract.Data.MIMETYPE,
						Email.CONTENT_ITEM_TYPE)
				.withValue(Email.DATA, "i@i")
				.withValue(Email.TYPE, Email.TYPE_WORK).build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(ContactsContract.Data.MIMETYPE,
						Email.CONTENT_ITEM_TYPE)
				.withValue(Email.DATA, "j@j")
				.withValue(Email.TYPE, Email.TYPE_WORK).build());

		/*
		 * èZèä
		 */
		/*
		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE,
						StructuredPostal.CONTENT_ITEM_TYPE)
				.withValue(StructuredPostal.POSTCODE, "123-4567")
				.withValue(StructuredPostal.STREET, "îLí ÇË1-23-45")
				.withValue(StructuredPostal.CITY, "îLç„és")
				.withValue(StructuredPostal.REGION, "îLç„ï{")
				.withValue(StructuredPostal.COUNTRY, "ì˙ñ{")
				.withValue(StructuredPostal.TYPE,
						StructuredPostal.TYPE_HOME).build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE,
						StructuredPostal.CONTENT_ITEM_TYPE)
				.withValue(StructuredPostal.POSTCODE, "023-4567")
				.withValue(StructuredPostal.STREET, "îLí ÇË1-23-45")
				.withValue(StructuredPostal.CITY, "îLç„és")
				.withValue(StructuredPostal.REGION, "îLç„ï{")
				.withValue(StructuredPostal.COUNTRY, "ì˙ñ{")
				.withValue(StructuredPostal.TYPE,
						StructuredPostal.TYPE_HOME).build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE,
						StructuredPostal.CONTENT_ITEM_TYPE)
				.withValue(StructuredPostal.POSTCODE, "113-4567")
				.withValue(StructuredPostal.STREET, "îLí ÇË1-23-45")
				.withValue(StructuredPostal.CITY, "îLç„és")
				.withValue(StructuredPostal.REGION, "îLç„ï{")
				.withValue(StructuredPostal.COUNTRY, "ì˙ñ{")
				.withValue(StructuredPostal.TYPE,
						StructuredPostal.TYPE_HOME).build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE,
						StructuredPostal.CONTENT_ITEM_TYPE)
				.withValue(StructuredPostal.POSTCODE, "223-4567")
				.withValue(StructuredPostal.STREET, "îLí ÇË1-23-45")
				.withValue(StructuredPostal.CITY, "îLç„és")
				.withValue(StructuredPostal.REGION, "îLç„ï{")
				.withValue(StructuredPostal.COUNTRY, "ì˙ñ{")
				.withValue(StructuredPostal.TYPE,
						StructuredPostal.TYPE_HOME).build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE,
						StructuredPostal.CONTENT_ITEM_TYPE)
				.withValue(StructuredPostal.POSTCODE, "323-4567")
				.withValue(StructuredPostal.STREET, "îLí ÇË1-23-45")
				.withValue(StructuredPostal.CITY, "îLç„és")
				.withValue(StructuredPostal.REGION, "îLç„ï{")
				.withValue(StructuredPostal.COUNTRY, "ì˙ñ{")
				.withValue(StructuredPostal.TYPE,
						StructuredPostal.TYPE_HOME).build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE,
						StructuredPostal.CONTENT_ITEM_TYPE)
				.withValue(StructuredPostal.POSTCODE, "423-4567")
				.withValue(StructuredPostal.STREET, "îLí ÇË1-23-45")
				.withValue(StructuredPostal.CITY, "îLç„és")
				.withValue(StructuredPostal.REGION, "îLç„ï{")
				.withValue(StructuredPostal.COUNTRY, "ì˙ñ{")
				.withValue(StructuredPostal.TYPE,
						StructuredPostal.TYPE_HOME).build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE,
						StructuredPostal.CONTENT_ITEM_TYPE)
				.withValue(StructuredPostal.POSTCODE, "523-4567")
				.withValue(StructuredPostal.STREET, "îLí ÇË1-23-45")
				.withValue(StructuredPostal.CITY, "îLç„és")
				.withValue(StructuredPostal.REGION, "îLç„ï{")
				.withValue(StructuredPostal.COUNTRY, "ì˙ñ{")
				.withValue(StructuredPostal.TYPE,
						StructuredPostal.TYPE_HOME).build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE,
						StructuredPostal.CONTENT_ITEM_TYPE)
				.withValue(StructuredPostal.POSTCODE, "623-4567")
				.withValue(StructuredPostal.STREET, "îLí ÇË1-23-45")
				.withValue(StructuredPostal.CITY, "îLç„és")
				.withValue(StructuredPostal.REGION, "îLç„ï{")
				.withValue(StructuredPostal.COUNTRY, "ì˙ñ{")
				.withValue(StructuredPostal.TYPE,
						StructuredPostal.TYPE_HOME).build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE,
						StructuredPostal.CONTENT_ITEM_TYPE)
				.withValue(StructuredPostal.POSTCODE, "723-4567")
				.withValue(StructuredPostal.STREET, "îLí ÇË1-23-45")
				.withValue(StructuredPostal.CITY, "îLç„és")
				.withValue(StructuredPostal.REGION, "îLç„ï{")
				.withValue(StructuredPostal.COUNTRY, "ì˙ñ{")
				.withValue(StructuredPostal.TYPE,
						StructuredPostal.TYPE_HOME).build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE,
						StructuredPostal.CONTENT_ITEM_TYPE)
				.withValue(StructuredPostal.POSTCODE, "823-4567")
				.withValue(StructuredPostal.STREET, "îLí ÇË1-23-45")
				.withValue(StructuredPostal.CITY, "îLç„és")
				.withValue(StructuredPostal.REGION, "îLç„ï{")
				.withValue(StructuredPostal.COUNTRY, "ì˙ñ{")
				.withValue(StructuredPostal.TYPE,
						StructuredPostal.TYPE_HOME).build());
*/
		/*
		 * ÉÅÉÇ

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Note.CONTENT_ITEM_TYPE)
				.withValue(Note.NOTE, "â¥ÅAîL").build());
*/
		/*
		 * ÉCÉxÉìÉg

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Event.CONTENT_ITEM_TYPE)
				.withValue(Event.START_DATE, "19861121")
				.withValue(Event.TYPE, "TYPE_ANNIVERSARY").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Event.CONTENT_ITEM_TYPE)
				.withValue(Event.START_DATE, "19861101")
				.withValue(Event.TYPE, "TYPE_ANNIVERSARY").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Event.CONTENT_ITEM_TYPE)
				.withValue(Event.START_DATE, "19861102")
				.withValue(Event.TYPE, "TYPE_ANNIVERSARY").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Event.CONTENT_ITEM_TYPE)
				.withValue(Event.START_DATE, "19861103")
				.withValue(Event.TYPE, "TYPE_ANNIVERSARY").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Event.CONTENT_ITEM_TYPE)
				.withValue(Event.START_DATE, "19861104")
				.withValue(Event.TYPE, "TYPE_ANNIVERSARY").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Event.CONTENT_ITEM_TYPE)
				.withValue(Event.START_DATE, "19861105")
				.withValue(Event.TYPE, "TYPE_ANNIVERSARY").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Event.CONTENT_ITEM_TYPE)
				.withValue(Event.START_DATE, "19861106")
				.withValue(Event.TYPE, "TYPE_ANNIVERSARY").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Event.CONTENT_ITEM_TYPE)
				.withValue(Event.START_DATE, "19861107")
				.withValue(Event.TYPE, "TYPE_ANNIVERSARY").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Event.CONTENT_ITEM_TYPE)
				.withValue(Event.START_DATE, "19861108")
				.withValue(Event.TYPE, "TYPE_ANNIVERSARY").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Event.CONTENT_ITEM_TYPE)
				.withValue(Event.START_DATE, "19861109")
				.withValue(Event.TYPE, "TYPE_ANNIVERSARY").build());
*/
		/*
		 * webÉTÉCÉg


		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Website.CONTENT_ITEM_TYPE)
				.withValue(Website.URL, "www.test.www")
				.withValue(Website.TYPE, "TYPE_HOMEPAGE").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Website.CONTENT_ITEM_TYPE)
				.withValue(Website.URL, "www1.test.www")
				.withValue(Website.TYPE, "TYPE_HOMEPAGE").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Website.CONTENT_ITEM_TYPE)
				.withValue(Website.URL, "www2.test.www")
				.withValue(Website.TYPE, "TYPE_HOMEPAGE").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Website.CONTENT_ITEM_TYPE)
				.withValue(Website.URL, "www3.test.www")
				.withValue(Website.TYPE, "TYPE_HOMEPAGE").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Website.CONTENT_ITEM_TYPE)
				.withValue(Website.URL, "www4.test.www")
				.withValue(Website.TYPE, "TYPE_HOMEPAGE").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Website.CONTENT_ITEM_TYPE)
				.withValue(Website.URL, "www5.test.www")
				.withValue(Website.TYPE, "TYPE_HOMEPAGE").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Website.CONTENT_ITEM_TYPE)
				.withValue(Website.URL, "www6.test.www")
				.withValue(Website.TYPE, "TYPE_HOMEPAGE").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Website.CONTENT_ITEM_TYPE)
				.withValue(Website.URL, "www7.test.www")
				.withValue(Website.TYPE, "TYPE_HOMEPAGE").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Website.CONTENT_ITEM_TYPE)
				.withValue(Website.URL, "www8.test.www")
				.withValue(Website.TYPE, "TYPE_HOMEPAGE").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, Website.CONTENT_ITEM_TYPE)
				.withValue(Website.URL, "www9.test.www")
				.withValue(Website.TYPE, "TYPE_HOMEPAGE").build());
*/
		/*
		 * ÉOÉãÅ[Év
		 */
		/*
		 * ÉOÉãÅ[Év

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, GroupMembership.CONTENT_ITEM_TYPE)
				.withValue(GroupMembership.GROUP_ROW_ID, "2338").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, GroupMembership.CONTENT_ITEM_TYPE)
				.withValue(GroupMembership.GROUP_ROW_ID, "2339").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, GroupMembership.CONTENT_ITEM_TYPE)
				.withValue(GroupMembership.GROUP_ROW_ID, "2340").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, GroupMembership.CONTENT_ITEM_TYPE)
				.withValue(GroupMembership.GROUP_ROW_ID, "2341").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, GroupMembership.CONTENT_ITEM_TYPE)
				.withValue(GroupMembership.GROUP_ROW_ID, "2342").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, GroupMembership.CONTENT_ITEM_TYPE)
				.withValue(GroupMembership.GROUP_ROW_ID, "2343").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, GroupMembership.CONTENT_ITEM_TYPE)
				.withValue(GroupMembership.GROUP_ROW_ID, "2344").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, GroupMembership.CONTENT_ITEM_TYPE)
				.withValue(GroupMembership.GROUP_ROW_ID, "2345").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, GroupMembership.CONTENT_ITEM_TYPE)
				.withValue(GroupMembership.GROUP_ROW_ID, "2346").build());

		ops.add(ContentProviderOperation
				.newInsert(Data.CONTENT_URI)
				.withValueBackReference(Data.RAW_CONTACT_ID,
						rawContactInsertIndex)
				.withValue(Data.MIMETYPE, GroupMembership.CONTENT_ITEM_TYPE)
				.withValue(GroupMembership.GROUP_ROW_ID, "2347").build());
				*/





  final static String TAG = "MyService";
  final int INTERVAL_PERIOD = 60000;
  Timer timer = new Timer();

  @Override
  public IBinder onBind(Intent intent) {
    return null;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    Log.d(TAG, "onCreate");
  }

  @Override
  public int onStartCommand(Intent intent, int flags, int startId) {

	  Log.d(TAG, "onStartCommand");

    timer.scheduleAtFixedRate(new TimerTask(){


	@Override
      public void run() {

		 Log.e(TAG, Integer.toString(i));
	//	Toast.makeText(MyService.this, "ÇµÇ∞", Toast.LENGTH_LONG).show();

    	  try
    	    {
    		  long startTime = System.currentTimeMillis();
    		  Date date = new Date(startTime);
    		  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HHmmss");//
    		  //Log.e("É^ÉO", simpleDateFormat.format(date));//2011.11.17.02:53:38 217

    		  String date2 = simpleDateFormat.format(date);

    		  Log.e(TAG,date2);

    	        HttpGet method = new HttpGet("http://ec2-54-244-212-108.us-west-2.compute.amazonaws.com/?"+date2+"times="+i);

    	        DefaultHttpClient client = new DefaultHttpClient();

    	        // ÉwÉbÉ_Çê›íËÇ∑ÇÈ
    	        method.setHeader( "Cache-Control", "no-cache" );

    	        HttpResponse response = client.execute( method );
    	        int status = response.getStatusLine().getStatusCode();
    	        if ( status != HttpStatus.SC_OK )
    	            throw new Exception( "" );
    	        Log.d(TAG,EntityUtils.toString( response.getEntity(), "UTF-8" ));

    		  }
    	    catch ( Exception e )
    	    {
    	        e.toString();
    	    }
    	  i++;
    	  Log.d(TAG, "Hello!");

      }
    }, 0, INTERVAL_PERIOD);

    return START_STICKY;
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
    if(timer != null){
      timer.cancel();
    }
    Log.d(TAG, "onDestroy");
  }
}
