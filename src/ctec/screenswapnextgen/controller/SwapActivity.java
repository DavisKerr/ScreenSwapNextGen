package ctec.screenswapnextgen.controller;

import ctec.screenswapnextgen.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SwapActivity extends Activity
{
	private Button ScreenChanger;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_swap);
		
		ScreenChanger = (Button) findViewById(R.id.HomeButton);
		
		setUpListeners();
	}
	
	private void setUpListeners()
	{
		ScreenChanger.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				Intent myIntent = new Intent(currentView.getContext(), SecondActivity.class);
				startActivityForResult(myIntent, 0);
			}
			
			
		});
	}
}
