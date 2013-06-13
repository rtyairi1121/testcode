package co.jp.example.sample.contacts;

import android.app.Activity;
import android.content.ContentUris;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.ContactsContract.RawContacts;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.CommonDataKinds.StructuredName;
import android.provider.ContactsContract.Contacts.Data;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContentValues values = new ContentValues();
        Uri rawContactUri = getContentResolver().insert(RawContacts.CONTENT_URI, values);

        long rawContactId = ContentUris.parseId(rawContactUri);
        values.clear();
        values.put(ContactsContract.Data.RAW_CONTACT_ID, rawContactId);
        values.put(ContactsContract.Data.MIMETYPE, StructuredName.CONTENT_ITEM_TYPE);
        values.put(StructuredName.DISPLAY_NAME, "hakamata");
        getContentResolver().insert(ContactsContract.Data.CONTENT_URI, values);

        // ågë—ÇÃìdòbî‘çÜÇìoò^
        Uri mobileUri = Uri.withAppendedPath(rawContactUri, Data.CONTENT_DIRECTORY);
        values.clear();
        values.put(Phone.TYPE, Phone.TYPE_MOBILE);
        values.put(Phone.IS_SUPER_PRIMARY, 1);
        values.put(ContactsContract.Data.MIMETYPE, Phone.CONTENT_ITEM_TYPE);
        values.put(Phone.NUMBER, "09012345678");
        getContentResolver().insert(mobileUri, values);

        // ågë—ÇÃÉÅÉAÉhÇìoò^
        Uri emailUri = Uri.withAppendedPath(rawContactUri, Data.CONTENT_DIRECTORY);
        values.clear();
        values.put(Email.TYPE, Email.TYPE_MOBILE);
        values.put(ContactsContract.Data.MIMETYPE, Email.CONTENT_ITEM_TYPE);
        values.put(Email.DATA1, "test@sample.jp");
        getContentResolver().insert(emailUri, values);
    }
}


/*
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
*/