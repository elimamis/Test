package com.example.eladstest;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
	
	
		public class MainActivity extends Activity {

            public static final int BLACK_TAB = Color.BLACK;
            public static final int CYAN_TAB = Color.CYAN;
            public static final int YELLOW_MARK = Color.YELLOW;
            public static final int BACKGROUND_COLOR = Color.WHITE;
            View clickedToChange;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                LinearLayout gameBoard = (LinearLayout) findViewById(R.id.gameBoard);
                gameBoard.setBackgroundColor(BACKGROUND_COLOR);
                int clickedTab;
                View tab;
                
                	for (int i = 0; i < 8; i++) {
                    LinearLayout horizontalTab = new LinearLayout(this);
                    horizontalTab.setOrientation(LinearLayout.HORIZONTAL);
                    gameBoard.addView(horizontalTab, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT));
                
                    for (int j = 0; j < 8; j++) {
                    clickedTab = i * 8 + j;
                    tab = new View(this);
                    tab.setTag(clickedTab);
                    tab.setBackgroundColor((clickedTab + i) % 2 == 0 ? BLACK_TAB : CYAN_TAB);
                    horizontalTab.addView(tab, new LinearLayout.LayoutParams(75, 80));
         
         tab.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view){
        	 if (clickedToChange != null) {
         		int rememberLastClick =  (Integer) clickedToChange.getTag();
         		clickedToChange.setBackgroundColor((rememberLastClick + (rememberLastClick / 8)) % 2 == 0? BLACK_TAB : CYAN_TAB);
  
  }//If Closing
        	 	view.setBackgroundColor(YELLOW_MARK);
        	 	clickedToChange = view;
  }//OnClick Closing
  });//OnClickListener Closing
                   
  }//2-Second ForLoop Closing
 
  }//1-First ForLoop Closing


  }//OnCreate Closing
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}//Main Activity Closing
