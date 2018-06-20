package com.example.pc235.onlineshopping;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    //CLICK 最新消息之後跳到 news頁面
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_news = (Button)findViewById(R.id.btn_news);
        button_news.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                jumpToLayout_news();
            }
        });
        //jumptoitem
        Button button_item = (Button)findViewById(R.id.btn_item);
        button_item.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                jumpToLayout_item();
            }
        });

        Button button_login = (Button)findViewById(R.id.btn_login);
        button_login.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                jumpToLayout_login();
            }
        });

        Button button_registered = (Button)findViewById(R.id.btn_registered);
        button_registered.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                jumpToLayout_registered();
            }
        });


    }




    ///main main main~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void jumpToLayout_main(){
        setContentView(R.layout.activity_main);

        Button button_news = (Button)findViewById(R.id.btn_news);
        button_news.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                jumpToLayout_news();
            }
        });

        Button button_item = (Button)findViewById(R.id.btn_item);
        button_item.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                jumpToLayout_item();
            }
        });

        Button button_login = (Button)findViewById(R.id.btn_login);
        button_login.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                jumpToLayout_login();
            }
        });

        Button button_registered = (Button)findViewById(R.id.btn_registered);
        button_registered.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                jumpToLayout_registered();
            }
        });
    }
    //~~~~~~~news~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void jumpToLayout_news(){
        setContentView(R.layout.activity_news);
        Button button_news_back = (Button)findViewById(R.id.btn_news_back);
        button_news_back.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                jumpToLayout_main();
            }
        });
    }

    //~~~~item~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void jumpToLayout_item(){
        setContentView(R.layout.activity_item);
        Button button_item_back = (Button)findViewById(R.id.btn_item_back);
        button_item_back.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                jumpToLayout_main();
            }
        });
    //~~~~item~~~切換成shoes
        Button button_shoes = (Button)findViewById(R.id.btn_shoes);
        button_shoes.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                jumpToLayout_shoes();
            }
        });
    }

    //~~~~login~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void jumpToLayout_login(){
        setContentView(R.layout.activity_login);
        Button button_login_back = (Button)findViewById(R.id.btn_login_back);
        button_login_back.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                jumpToLayout_main();
            }
        });
    }

    //~~~~registered~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void jumpToLayout_registered(){
        setContentView(R.layout.activity_registered);
        Button button_registered_back = (Button)findViewById(R.id.btn_registered_back);
        button_registered_back.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                jumpToLayout_main();
            }
        });
    }
    //~~~~shoes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void jumpToLayout_shoes(){
        setContentView(R.layout.activity_shoes);
        Button button_look = (Button)findViewById(R.id.btn_look);
        button_look.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                jumpToLayout_dogshoes();
            }
        });
    }

    //~~~~dogshoes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void jumpToLayout_dogshoes(){
        setContentView(R.layout.activity_dogshoes);
        Button button_dog_back = (Button)findViewById(R.id.btn_dog_back);
        button_dog_back.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                jumpToLayout_shoes();
            }
        });

        Button button_shoppingcar = (Button)findViewById(R.id.btn_shoppingcar);
        button_shoppingcar.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                jumpToLayout_shoppingcar();
            }
        });
    }

    //~~~~shoppingcar~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void jumpToLayout_shoppingcar() {
        setContentView(R.layout.activity_shoppingcar);
        Button button_shop_back = (Button) findViewById(R.id.btn_shop_back);
        button_shop_back.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                jumpToLayout_dogshoes();
            }
        });
    }


}
