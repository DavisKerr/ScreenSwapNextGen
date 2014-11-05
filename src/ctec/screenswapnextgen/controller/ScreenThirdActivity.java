package ctec.screenswapnextgen.controller;

import ctec.screenswapnextgen.R;
import ctec.screenswapnextgen.R.layout;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class ScreenThirdActivity extends Activity
{
	private Button upButton;
	private Button downButton;
	private Button leftButton;
	private Button rightButton;
	private ImageView blankPaper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_screen_third);
		blankPaper = (ImageView) findViewById(R.id.Paper);
		upButton = (Button) findViewById(R.id.UpButton);
		downButton = (Button) findViewById(R.id.DownButton);
		leftButton = (Button) findViewById(R.id.LeftButton);
		rightButton = (Button) findViewById(R.id.RightButton);
		
		setUpListeners();
		
	}
	
	private void setUpListeners()
	{
		
		upButton.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				blankPaper.setY(blankPaper.getY() - 50);
			}
			
		});
		
		downButton.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				blankPaper.setY(blankPaper.getY() + 50);
			}
			
		});
		
		leftButton.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				blankPaper.setX(blankPaper.getX() + 50);
			}
			
		});
		
		rightButton.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				blankPaper.setX(blankPaper.getX() - 50);
			}
			
		});
		
	}

	
	
}
