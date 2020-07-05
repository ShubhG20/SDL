package com.example.climatenews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Asia2 extends AppCompatActivity {

    private static final String TAG="Africa";
    Button b;
    ViewPager viewPager;
    List<model> models;
    adapter adapter;
    Integer[] colors=null;
    ArgbEvaluator argbEvaluator= new ArgbEvaluator();
    String src1,summary1,src2,summary2,src3,summary3;
    private FirebaseDatabase mFirebaseDatabase;
    private  DatabaseReference myRef;

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asia2);

        b=(Button)findViewById(R.id.btnMore);


        mFirebaseDatabase = FirebaseDatabase.getInstance("https://sylvan-triumph-254415.firebaseio.com/");

        myRef= mFirebaseDatabase.getReference("continents");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {



                src1= dataSnapshot.child("Asia").child("Environment").child("1").child("src").getValue(String.class);

                summary1=dataSnapshot.child("Asia").child("Environment").child("1").child("summary").getValue(String.class);




                src2= dataSnapshot.child("Asia").child("Environment").child("2").child("src").getValue(String.class);

                summary2=dataSnapshot.child("Asia").child("Environment").child("2").child("summary").getValue(String.class);


                src3= dataSnapshot.child("Asia").child("Environment").child("3").child("src").getValue(String.class);

                summary3=dataSnapshot.child("Asia").child("Environment").child("3").child("summary").getValue(String.class);




            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Log.w(TAG, "Failed to read value ", databaseError.toException());

            }
        });


        context= this.getBaseContext()
        ;//final Context context= this.get

        //String src2=(String) (data.get(1)).getSrc();
        //String summary2=(String) (data.get(1)).getSummary();

        //String src3=(String) (data.get(2)).getSrc();
        //String summary3= (String)(data.get(2)).getSummary();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                models=new ArrayList<>();
                models.add(new model(R.drawable.asia4,src1,summary1));

                models.add(new model(R.drawable.asia5,src2,summary2));

                models.add(new model(R.drawable.asia6,src3,summary3));


                //System.out.println("Test 1- "+ src1);

                //System.out.println("Test 2- " +src2);

                //System.out.println("Test 3- "+src3);
                // models.add(new model(R.drawable.africa2,"https://news.un.org/en/story/2019/09/1045352","Subsistence farmers in Ghana are learning how to hold back the decline in the fertility of the smallholdings they cultivate while revitalizing their soils as desertification increasingly threatens their land and livelihoods. " ));

                //models.add(new model(R.drawable.africa3,"https://news.un.org/en/story/2019/08/1045211","Little undermines development like disaster,” UN Secretary-General António Guterres told attendees at a thematic session on Africa and climate change, on day two of the Tokyo international Conference on African Development (TICAD), now in its seventh year." ));


                adapter= new adapter(models,context);


                viewPager= findViewById(R.id.viewPager);

                viewPager.setAdapter(adapter);

                viewPager.setPadding(130,0,130,0);
                Integer[] colors_temp={
                        getResources().getColor(R.color.color4),

                        getResources().getColor(R.color.color5),
                        getResources().getColor(R.color.color6)




                };
                colors = colors_temp;
                viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                                                      @Override
                                                      public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                                                          if(position<( adapter.getCount() -1 ) && position < (colors.length -1) ){
                                                              viewPager.setBackgroundColor(
                                                                      (Integer) argbEvaluator.evaluate(
                                                                              positionOffset,
                                                                              colors[position],
                                                                              colors[position+1]

                                                                      )

                                                              );
                                                          }
                                                          else{

                                                              viewPager.setBackgroundColor(colors[colors.length-1]);

                                                          }

                                                      }

                                                      @Override
                                                      public void onPageSelected(int position) {

                                                      }

                                                      @Override
                                                      public void onPageScrollStateChanged(int state) {

                                                      }
                                                  }

                );



            }
        });


    }
}
