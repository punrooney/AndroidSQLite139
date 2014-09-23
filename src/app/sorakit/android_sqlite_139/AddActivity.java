package app.sorakit.android_sqlite_139;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends Activity {

	private Button btn_add;
	private EditText edt_name, edt_tel;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add);
		btn_add = (Button)findViewById(R.id.btn_add);
		btn_add.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SaveData();
			}
		});

	}

	private void SaveData() {
		edt_name = (EditText) findViewById(R.id.txt_name);
		edt_tel = (EditText) findViewById(R.id.txt_tel);
		MyDBClass myDBClass = new MyDBClass(this);
		long saveStatus = myDBClass.InsertData(edt_name.getText().toString(),
				edt_tel.getText().toString());
		if(saveStatus <= 0){
			Log.d("Error Save","Error!");
			
		}
		Toast.makeText(getBaseContext(), "Add Data Successfully",
				Toast.LENGTH_SHORT).show();
		
	}
}