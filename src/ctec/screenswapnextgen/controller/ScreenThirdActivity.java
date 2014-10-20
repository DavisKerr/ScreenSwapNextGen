package ctec.screenswapnextgen.controller;

import ctec.screenswapnextgen.R;
import ctec.screenswapnextgen.R.layout;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class ScreenThirdActivity extends Activity
{
	private Button upButton;
	private Button downButton;
	private Button leftButton;
	private Button rightButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_screen_third);
		upButton = (Button) findViewById(R.id.UpButton);
		downButton = (Button) findViewById(R.id.DownButton);
		leftButton = (Button) findViewById(R.id.LeftButton);
		rightButton = (Button) findViewById(R.id.RightButton);
		
		setUpListeners();
		
	}
	
	private void setUpListeners()
	{
		
	}
}
