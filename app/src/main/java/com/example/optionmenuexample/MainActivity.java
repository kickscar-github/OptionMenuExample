package com.example.optionmenuexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerForContextMenu( findViewById( android.R.id.content ) );
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate( R.menu.menu_context, menu );
        //super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        menu.add( Menu.NONE, 0, 0, "Menu1");
//        menu.add( Menu.NONE, 1, 1, "Menu2");
//        menu.add( Menu.NONE, 2, 2, "Menu3");
//
//        //sub Menu
//        SubMenu etc = menu.addSubMenu( Menu.NONE, 3, 3, "Etc" );
//        etc.add( Menu.NONE, 4, 0, "SubMenu1");
//        etc.add( Menu.NONE, 5, 1, "SubMenu2");
//        etc.add( Menu.NONE, 6, 2, "SubMenu3");

        getMenuInflater().inflate( R.menu.menu_main, menu );
        return true;
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch( itemId ) {
            case R.id.menu_copy :
                Toast.
                    makeText( this, "Copy Selected", Toast.LENGTH_SHORT ).
                    show();
                break;
            default:
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch( itemId ) {
            case R.id.main_menu1 :
                break;
            case R.id.main_menu2 :
                break;

            default:
                break;
        }
        System.out.println( "menu selected-------->" + itemId);
        return super.onOptionsItemSelected(item);
    }
}
