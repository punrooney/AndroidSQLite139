package app.sorakit.android_sqlite_139;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ShowActivity extends Activity{
	private ListView listView;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show);
		listView = (ListView) findViewById(R.id.listView1);
		MyDBClass myDBClass = new MyDBClass(this);
		ArrayList<HashMap<String, String>> arrayList = myDBClass.SelectAllData();
		
		
		SimpleAdapter adapter;
		adapter = new SimpleAdapter(ShowActivity.this, arrayList, R.layout.show_item, new String[] {"MemberId" , "Name" , "Tel"},
				new int[]{R.id.ColMemberID,R.id.ColName,R.id.ColTel});
		
				listView.setAdapter(adapter);
				
		}
		
		
		
		
	}


