package ctec.screenswapnextgen.controller;

import ctec.screenswapnextgen.R;
import ctec.screenswapnextgen.R.layout;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends ActionBarActivity
{
	private Button HomeButton;
	private Button NextButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		HomeButton = (Button) findViewById(R.id.HomeButton);
		NextButton = (Button) findViewById(R.id.NextButton);
		
		setupListeners();
		
	}
	
	private void setupListeners()
	{
		
		HomeButton.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				Intent currentIntent = new Intent();
				setResult(RESULT_OK, currentIntent);
				finish();
			}
			
		});
		
		NextButton.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				Intent currentIntent = new Intent();
				setResult(RESULT_OK, currentIntent);
				Intent myIntent = new Intent(currentView.getContext(), ScreenThirdActivity.class);
				startActivityForResult(myIntent, 0);
				finish();
			}
			
		});
		
		
	}
}
