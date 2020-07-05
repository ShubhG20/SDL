package com.example.climatenews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Category extends AppCompatActivity {

    Button b1,b2,b3;
    //private FirebaseDatabase mFirebaseDatabase;
    //private DatabaseReference myRef;

     //Data d1,d2,d3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        final String continent= getIntent().getStringExtra("content");


        b1=(Button)findViewById(R.id.img);

        b2=(Button)findViewById(R.id.img2);
        b3=(Button)findViewById(R.id.img3);
       // mFirebaseDatabase= FirebaseDatabase.getInstance();

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(continent.equals("Africa")){


                    Intent i= new Intent(Category.this,Africa.class);

                    startActivity(i);

                }

               else if(continent.equals("Americas")){


                    Intent i= new Intent(Category.this,Americas.class);

                    startActivity(i);

                }
                else if(continent.equals("Europe")){


                    Intent i= new Intent(Category.this,Europe.class);

                    startActivity(i);

                }
                else if(continent.equals("Pacific")){


                    Intent i= new Intent(Category.this,Pacific.class);

                    startActivity(i);

                }
                else if(continent.equals("Asia")){


                    Intent i= new Intent(Category.this,Asia.class);

                    startActivity(i);

                }
                else if(continent.equals("Middle East")){


                    Intent i= new Intent(Category.this,MiddleEast.class);

                    startActivity(i);

                }

                else{
                    ;
                }

            }
        });





        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(continent.equals("Africa")){


                    Intent i= new Intent(Category.this,Africa2.class);

                    startActivity(i);

                }

                if(continent.equals("Americas")){


                    Intent i= new Intent(Category.this,Americas2.class);

                    startActivity(i);

                }
                if(continent.equals("Europe")){


                    Intent i= new Intent(Category.this,Europe2.class);

                    startActivity(i);

                }
                if(continent.equals("Pacific")){


                    Intent i= new Intent(Category.this,Pacific2.class);

                    startActivity(i);

                }
                if(continent.equals("Asia")){


                    Intent i= new Intent(Category.this,Asia2.class);

                    startActivity(i);

                }
                if(continent.equals("Middle East")){


                    Intent i= new Intent(Category.this,MiddleEast2.class);

                    startActivity(i);

                }

            }
        });




        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(continent.equals("Africa")){


                    Intent i= new Intent(Category.this,Africa3.class);

                    startActivity(i);

                }

                if(continent.equals("Americas")){


                    Intent i= new Intent(Category.this,Americas3.class);

                    startActivity(i);

                }
                if(continent.equals("Europe")){


                    Intent i= new Intent(Category.this,Europe3.class);

                    startActivity(i);

                }
                if(continent.equals("Pacific")){


                    Intent i= new Intent(Category.this,Pacific3.class);

                    startActivity(i);

                }
                if(continent.equals("Asia")){


                    Intent i= new Intent(Category.this,Asia3.class);

                    startActivity(i);

                }
                if(continent.equals("Middle East")){


                    Intent i= new Intent(Category.this,MiddleEast3.class);

                    startActivity(i);

                }

            }
        });



    }








}
